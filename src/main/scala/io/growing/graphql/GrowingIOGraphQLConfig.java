package io.growing.graphql;

/**
 * custom config for sdk
 *
 * @author liguobin@growingio.com
 * @version 1.0, 2020/8/28
 */
public interface GrowingIOGraphQLConfig {

    String getAuthenticateKey();

    String getAuthenticateValue();

    //need javac args: -parameters
    String REFLECT_BY_PARAMETERS = "reflectByParameters";

    //depend on the order of fields in bytecode, it maybe be dangerous.
    String ASM_BY_FIELDS = "asmByFields";

    //depend on the order of fields in bytecode, it maybe be dangerous.
    String REFLECT_BY_FIELDS = "reflectByFields";

    default String getServerHost() {
        return "http://localhost:8086/projects/WlGk4Daj/graphql";
    }

    default Integer getTimeOut() {
        return 1;
    }

    default Integer getCacheSize() {
        return 10000;
    }

    default String withInputParamsType() {
        return REFLECT_BY_PARAMETERS;
    }

}
