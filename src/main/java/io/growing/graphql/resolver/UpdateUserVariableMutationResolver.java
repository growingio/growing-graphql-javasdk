package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public interface UpdateUserVariableMutationResolver {

    @javax.validation.constraints.NotNull
    UserVariableDto updateUserVariable(String id, VariableInputDto userVariable) throws Exception;

}