package io.growing.graphql.proxy;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import io.growing.graphql.util.Configs;

import java.lang.reflect.Proxy;

/**
 * invoker for proxy
 *
 * @author liguobin@growingio.com
 * @version 1.0, 2020/7/28
 */
final public class ResolverImplClient {

    private Class<?> resolver;
    private GraphQLResponseProjection projection;
    private GraphQLOperationRequest request;
    private int maxDepth;

    /**
     * create proxy object, so we do not need write resolver interface' impl
     * but we need use all response entity'fields on projection
     *
     * @return
     */
    private Object getResolver() {
        DynamicProxy invocationHandler = new DynamicProxy(projection, request, maxDepth);
        return Proxy.newProxyInstance(resolver.getClassLoader(), new Class[]{resolver}, invocationHandler);
    }

    private void setResolver(Class<?> resolver) {
        this.resolver = resolver;
    }

    private void setRequest(GraphQLOperationRequest request) {
        this.request = request;
    }

    private void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    private void setProjection(GraphQLResponseProjection projection) {
        this.projection = projection;
    }


    public static class ResolverImplClientBuilder {
        //if response is primitive type like: int boolean string float.
        private GraphQLResponseProjection projection = null;
        private GraphQLOperationRequest request;
        private int maxDepth = Configs.maxDepth();

        private ResolverImplClientBuilder() {

        }

        /**
         * must set request which maybe contains come input parameters
         *
         * @param request
         * @return
         */
        public ResolverImplClientBuilder setRequest(GraphQLOperationRequest request) {
            this.request = request;
            return this;
        }

        /**
         * default query max depth is 3, so children fields will query until depth is 3
         *
         * @param maxDepth
         * @return
         */
        public ResolverImplClientBuilder setMaxDepth(int maxDepth) {
            this.maxDepth = maxDepth;
            return this;
        }

        /**
         * must set response projection, then the server can know which fields can be return
         *
         * @param projection
         * @return
         */
        public ResolverImplClientBuilder setProjection(GraphQLResponseProjection projection) {
            this.projection = projection;
            return this;
        }

        /**
         * should be invoked at the first to create a builder
         *
         * @return
         */
        public static ResolverImplClientBuilder newBuilder() {
            return new ResolverImplClientBuilder();
        }

        /**
         * Resolver is generic type, if we do not want to cast to real resolver on the user side, we need set resolver when invoker builder method,
         * although this is not in line with the conventional builder model
         *
         * @return R resolver which need for invoke graphql
         */
        @SuppressWarnings(value = "unchecked")
        public <R> R build(Class<R> resolver) {
            ResolverImplClient invoke = new ResolverImplClient();
            assert (projection != null);
            assert (resolver != null);
            assert (request != null);
            invoke.setProjection(projection);
            invoke.setResolver(resolver);
            invoke.setMaxDepth(maxDepth);
            invoke.setRequest(request);
            return (R) invoke.getResolver();
        }
    }

}