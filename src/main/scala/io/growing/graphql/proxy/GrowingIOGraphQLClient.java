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
     * @return R resolver which be need for invoking graphql
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
            if (growingIOGraphQLConfig == null) {
                System.err.println("Custom Config is null, will use default config(usually, it only be used in debug/test).");
            } else {
                this.growingIOGraphQLConfig = growingIOGraphQLConfig;
            }
        }

        /**
         * must set request which maybe contains come input parameters
         *
         * @param request
         * @return GrowingIOGraphQLClientBuilder
         */
        public GrowingIOGraphQLClientBuilder setRequest(GraphQLOperationRequest request) {
            this.request = request;
            return this;
        }

        /**
         * must set response projection, then the server can know which fields can be return
         *
         * @param projection
         * @return GrowingIOGraphQLClientBuilder
         */
        public GrowingIOGraphQLClientBuilder setProjection(GraphQLResponseProjection projection) {
            this.projection = projection;
            return this;
        }

        /**
         * should be invoked at the first to create a builder
         *
         * @return GrowingIOGraphQLClientBuilder
         */
        public static GrowingIOGraphQLClientBuilder newBuilder() {
            return new GrowingIOGraphQLClientBuilder();
        }

        /**
         * Resolver is generic type, if we do not want to cast to real resolver on the user side, we need set resolver when invoker builder method,
         * although this is not in line with the conventional builder model
         *
         * @return R resolver which be need for invoking graphql
         */
        @SuppressWarnings(value = "unchecked")
        public <R> R build(Class<R> resolver) {
            GrowingIOGraphQLClient invoke = new GrowingIOGraphQLClient();
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

    /**
     * a helper method, support return a graphql client instance to use proxy.
     *
     * @return GrowingIOGraphQLClient GrowingIOGraphQLClientBuilder
     */
    public static GrowingIOGraphQLClient.GrowingIOGraphQLClientBuilder graphQLClient() {
        return GrowingIOGraphQLClient.GrowingIOGraphQLClientBuilder.newBuilder();
    }

}