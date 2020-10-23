package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public interface ActiveUsersQueryResolver {

    @javax.validation.constraints.NotNull
    SlicePaginationDto activeUsers(String timeRange, Integer offset, Integer limit) throws Exception;

}