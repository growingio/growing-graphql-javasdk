package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public interface UsersQueryResolver {

    @javax.validation.constraints.NotNull
    SlicePaginationDto users(String projectId, UserQueryTypeDto type, String id, Integer offset, Integer limit, java.util.List<String> tags, java.util.List<String> properties) throws Exception;

}