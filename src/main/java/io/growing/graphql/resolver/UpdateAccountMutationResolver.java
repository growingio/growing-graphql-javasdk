package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 更新帐号信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface UpdateAccountMutationResolver {

    /**
     * 更新帐号信息
     */
    @javax.validation.constraints.NotNull
    Boolean updateAccount(String id, UpdateAccountInputDto input) throws Exception;

}