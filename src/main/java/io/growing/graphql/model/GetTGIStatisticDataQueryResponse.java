package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 获取腾讯分群画像用户信息统计数据, 返回两组数据，第一组为手机号覆盖率，第二组为设备覆盖率
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class GetTGIStatisticDataQueryResponse extends GraphQLResult<Map<String, java.util.List<TGIStatisticDataDto>>> {

    private static final String OPERATION_NAME = "getTGIStatisticData";

    public GetTGIStatisticDataQueryResponse() {
    }

    /**
     * 获取腾讯分群画像用户信息统计数据, 返回两组数据，第一组为手机号覆盖率，第二组为设备覆盖率
     */
    public java.util.List<TGIStatisticDataDto> getTGIStatisticData() {
        Map<String, java.util.List<TGIStatisticDataDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
