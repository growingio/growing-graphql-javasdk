package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public interface SearchUserEventsQueryResolver {

    @javax.validation.constraints.NotNull
    java.util.List<String> searchUserEvents(String id, String q, String timeRange) throws Exception;

}