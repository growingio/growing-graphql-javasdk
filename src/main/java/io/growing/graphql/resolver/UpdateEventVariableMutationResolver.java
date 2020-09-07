package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public interface UpdateEventVariableMutationResolver {

    @javax.validation.constraints.NotNull
    EventVariableDto updateEventVariable(String id, VariableInputDto eventVariable) throws Exception;

}