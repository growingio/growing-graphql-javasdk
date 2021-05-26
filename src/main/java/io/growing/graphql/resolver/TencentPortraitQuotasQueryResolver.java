package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 查询资源情况
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface TencentPortraitQuotasQueryResolver {

    /**
     * 查询资源情况
     */
    @javax.validation.constraints.NotNull
    TencentPortraitQuotasInfoDto tencentPortraitQuotas() throws Exception;

}