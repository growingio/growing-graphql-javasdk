package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 查询资源情况
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TencentPortraitQuotasQueryResponse extends GraphQLResult<Map<String, TencentPortraitQuotasInfoDto>> {

    private static final String OPERATION_NAME = "tencentPortraitQuotas";

    public TencentPortraitQuotasQueryResponse() {
    }

    /**
     * 查询资源情况
     */
    public TencentPortraitQuotasInfoDto tencentPortraitQuotas() {
        Map<String, TencentPortraitQuotasInfoDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
