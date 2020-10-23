package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public interface UbaUserVariablesQueryResolver {

    java.util.List<UserVariableDto> ubaUserVariables(String tunnelId) throws Exception;

}