package io.growing.graphql.proxy;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import io.growing.graphql.GrowingIOGraphQLConfig;

import java.lang.reflect.Proxy;

/**
 * invoker for proxy
 *
 * @author liguobin@growingio.com
 * @version 1.0, 2020/7/28
 */
final public class GrowingIOGraphQLClient {

    private Class<?> resolver;
    private GraphQLResponseProjection projection;
    private GraphQLOperationRequest request;
    private GrowingIOGraphQLConfig growingIOGraphQLConfig;

    /**
     * create proxy object, so we do not need write resolver interface' impl
     * but we need use all response entity'fields on projection
     *
     * @return
     */
    private Object getResolver() {
        DynamicProxy invocationHandler = new DynamicProxy(projection, request, growingIOGraphQLConfig);
        return Proxy.newProxyInstance(resolver.getClassLoader(), new Class[]{resolver}, invocationHandler);
    }

    public void setGrowingIOGraphQLConfig(GrowingIOGraphQLConfig growingIOGraphQLConfig) {
        this.growingIOGraphQLConfig = growingIOGraphQLConfig;
    }

    private void setResolver(Class<?> resolver) {
        this.resolver = resolver;
    }

    private void setRequest(GraphQLOperationRequest request) {
        this.request = request;
    }

    private void setProjection(GraphQLResponseProjection projection) {
        this.projection = projection;
    }


    public static class GrowingIOGraphQLClientBuilder {
        //if response is primitive type like: int boolean string float.
        private GraphQLResponseProjection projection = null;
        private GraphQLOperationRequest request;
        private GrowingIOGraphQLConfig growingIOGraphQLConfig;

        private GrowingIOGraphQLClientBuilder() {
        }

        /**
         * custom config
         *
         * @param growingIOGraphQLConfig
         */
        public void setGrowingIOGraphQLConfig(GrowingIOGraphQLConfig growingIOGraphQLConfig) {
            assert growingIOGraphQLConfig != null;
            this.growingIOGraphQLConfig = growingIOGraphQLConfig;
        }

        /**
         * must set request which maybe contains come input parameters
         *
         * @param request
         * @return
         */
        public GrowingIOGraphQLClientBuilder setRequest(GraphQLOperationRequest request) {
            this.request = request;
            return this;
        }

        /**
         * must set response projection, then the server can know which fields can be return
         *
         * @param projection
         * @return
         */
        public GrowingIOGraphQLClientBuilder setProjection(GraphQLResponseProjection projection) {
            this.projection = projection;
            return this;
        }

        /**
         * should be invoked at the first to create a builder
         *
         * @return
         */
        public static GrowingIOGraphQLClientBuilder newBuilder() {
            return new GrowingIOGraphQLClientBuilder();
        }

        /**
         * Resolver is generic type, if we do not want to cast to real resolver on the user side, we need set resolver when invoker builder method,
         * although this is not in line with the conventional builder model
         *
         * @return R resolver which need for invoke graphql
         */
        @SuppressWarnings(value = "unchecked")
        public <R> R build(Class<R> resolver) {
            GrowingIOGraphQLClient invoke = new GrowingIOGraphQLClient();
            assert (projection != null);
            assert (resolver != null);
            assert (request != null);
            invoke.setProjection(projection);
            invoke.setResolver(resolver);
            if (growingIOGraphQLConfig == null) {
                invoke.setGrowingIOGraphQLConfig(new GrowingIOGraphQLConfig() {
                    @Override
                    public String getAuthenticateKey() {
                        return null;
                    }

                    @Override
                    public String getAuthenticateValue() {
                        return null;
                    }
                });
            } else {
                invoke.setGrowingIOGraphQLConfig(growingIOGraphQLConfig);
            }
            invoke.setRequest(request);
            return (R) invoke.getResolver();
        }
    }

}