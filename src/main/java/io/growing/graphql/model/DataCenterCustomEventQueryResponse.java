package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心 单个打点事件详情
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterCustomEventQueryResponse extends GraphQLResult<Map<String, CustomEventDto>> {

    private static final String OPERATION_NAME = "dataCenterCustomEvent";

    public DataCenterCustomEventQueryResponse() {
    }

    /**
     * 数据中心 单个打点事件详情
     */
    public CustomEventDto dataCenterCustomEvent() {
        Map<String, CustomEventDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
