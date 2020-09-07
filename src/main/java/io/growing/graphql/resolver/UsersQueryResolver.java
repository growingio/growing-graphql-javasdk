package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public interface UsersQueryResolver {

    @javax.validation.constraints.NotNull
    SlicePaginationDto users(UserQueryTypeDto type, String id, Integer offset, Integer limit) throws Exception;

}