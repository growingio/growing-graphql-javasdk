package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public interface ActiveUsersQueryResolver {

    @javax.validation.constraints.NotNull
    SlicePaginationDto activeUsers(String projectId, String timeRange, Integer offset, Integer limit) throws Exception;

}