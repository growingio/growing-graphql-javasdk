package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public interface UpdateCustomEventMutationResolver {

    @javax.validation.constraints.NotNull
    CustomEventDto updateCustomEvent(String id, CustomEventInputDto customEvent) throws Exception;

}