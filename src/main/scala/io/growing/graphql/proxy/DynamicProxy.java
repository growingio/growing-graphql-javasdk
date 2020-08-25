package io.growing.graphql.proxy;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.lang.reflect.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * dynamic proxy for create request
 * <p>
 * this is a experimental implement
 *
 * @author liguobin@growingio.com
 * @version 1.0, 2020/7/28
 */
final public class DynamicProxy implements InvocationHandler, ExecutionGraphql {

    /**
     * this is graphql request need that what response fields.
     */
    private GraphQLResponseProjection projection;

    /**
     * this graphql request that need request params. (if have)
     */
    private GraphQLOperationRequest request;

    /**
     * should limit max depth when invoke method on projection.
     */
    private int maxDepth;

    DynamicProxy(GraphQLResponseProjection projection, GraphQLOperationRequest request, int maxDepth) {
        this.projection = projection;
        this.request = request;
        this.maxDepth = maxDepth;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        if (Object.class.equals(method.getDeclaringClass())) {
            try {
                return method.invoke(this, args);
            } catch (Throwable t) {
                t.printStackTrace();
                return null;
            }
        } else {
            return proxyInvoke(method, args);
        }
    }

    /**
     * proxy invoke
     * <p>
     * when handle projection, we use reflect to invoke method directly
     * but when handle request(need set parameters), we use reflect to get field which is a internal implementation of set method
     *
     * @param parentProjection
     * @param parentProjectionMethod
     * @param currentDepth
     */
    private void invokeOnProjection(String resolverMethodName, GraphQLResponseProjection parentProjection, Method parentProjectionMethod, int currentDepth) {
        try {
            //if this method have no parameter, eg: name()
            //invoke method directly
            if (parentProjectionMethod.getParameterCount() == 0) {
//                System.out.println("method <" + parentMethod.getName() + ">");
                parentProjectionMethod.invoke(parentProjection, null);
                return;
            }

            //if this method have parameters, eg: name(String alias) or friends(CharacterResponseProjection subProjection), friends(CharacterResponseProjection subProjection, String alias),
            //we only handle do not have any alias, like: friends(CharacterResponseProjection subProjection)
            for (Class<?> parameterClazz : parentProjectionMethod.getParameterTypes()) {
                //handler the one parameter method
                if (parentProjectionMethod.getParameterCount() == 1) {
                    if (GraphQLResponseProjection.class.isAssignableFrom(parameterClazz)) {
                        currentDepth++;
                        GraphQLResponseProjection subProjection = (GraphQLResponseProjection) parameterClazz.newInstance();
                        //at now,not support `..on`
                        List<Method> methods = Arrays.stream(parameterClazz.getDeclaredMethods()).filter(m -> !m.getName().startsWith("on")).
                                sorted(Comparator.comparing(Method::getName)).collect(Collectors.toList());
                        for (Method subProjectionMethod : methods) {
                            //if this method have no parameter
                            if (subProjectionMethod.getParameterCount() == 0) {
                                String t = "";
                                for (int i = 0; i < currentDepth; i++) {
                                    t = t.concat("->");
                                }
//                                System.out.println(t + " method <" + subProjectionMethod.getName() + ">");
                                if (!excluded(resolverMethodName, parentProjectionMethod.getName())) {
                                    subProjectionMethod.invoke(subProjection, null);
                                }
                            } else if (subProjectionMethod.getParameterCount() == 1 && GraphQLResponseProjection.class.isAssignableFrom(subProjectionMethod.getParameterTypes()[0])) {
                                //if this method have one parameter and type is GraphQLResponseProjection sub class
                                //recursive continuation call
                                if (currentDepth <= maxDepth) {
                                    invokeOnProjection(resolverMethodName, subProjection, subProjectionMethod, currentDepth);
                                }
                            } else {
                                //TODO getParameterCount == 2, (GraphQLResponseProjection sub and String alias)
                            }
                        }
                        parentProjectionMethod.invoke(parentProjection, subProjection);
                    }
                } else {
                    //TODO getParameterCount == 2, (GraphQLResponseProjection sub and String alias)
                }
            }
        } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }


    /**
     * execute graphql request that need jvm compile parameter `-parameters` and Java8 or above
     * you should clean class, and build again after set -parameters
     * in sbt like this: javacOptions += "-parameters"
     *
     * @param method
     * @param args
     * @return
     */
    private Object proxyInvoke(Method method, Object[] args) {
        int i = 0;
        String entityClazzName;
        //handle List
        Type type = method.getGenericReturnType();
        if (type instanceof ParameterizedType) {
            Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();
            entityClazzName = parameterizedType[0].getTypeName();
        } else {
            entityClazzName = type.getTypeName();
        }
        List<Parameter> parameters = Arrays.stream(method.getParameters()).collect(Collectors.toList());

        //if this method have no parameter, then do not need invoke on request instance
        //other wise, we need append parameters to request field which use hashmap store params
        if (!parameters.isEmpty()) {
            Map<String, Object> params = new LinkedHashMap<>();
            for (Parameter parameter : parameters) {
                Object argsCopy = args[i++];
                request.getInput().put(parameter.getName(), argsCopy);
                params.put(parameter.getName(), argsCopy);
//                    System.out.println("request parameter <" + parameter.getName() + "> and parameter type <" + parameter.getType().getName() + ">");
            }
        }

        //newInstance GraphQLResponseProjection and GraphQLOperationRequest
        if (projection != null) {
            for (Method m : projection.getClass().getDeclaredMethods()) {
                if (!excluded(method.getName(), m.getName())) {
                    invokeOnProjection(method.getName(), projection, m, 1);
                }
            }
        }
        return execute(entityClazzName, request, projection);
    }
}