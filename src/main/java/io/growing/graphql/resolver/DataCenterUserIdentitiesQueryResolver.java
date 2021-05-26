package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心的 用户ID - 所有属性均为预置的用户标识符
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterUserIdentitiesQueryResolver {

    /**
     * 数据中心的 用户ID - 所有属性均为预置的用户标识符
     */
    @javax.validation.constraints.NotNull
    java.util.List<UserIdentityDto> dataCenterUserIdentities() throws Exception;

}