package io.growing.graphql;

/**
 * custom config for sdk
 *
 * @author liguobin@growingio.com
 * @version 1.0, 2020/8/28
 */
public interface GrowingIOGraphQLConfig {

    default String getServerHost() {
        return "http://localhost:8086/projects/WlGk4Daj/graphql";
    }

    default Integer getTimeOut() {
        return 1;
    }

    String getAuthenticateKey();

    String getAuthenticateValue();

    default Integer getCacheSize() {
        return 10000;
    }
}
