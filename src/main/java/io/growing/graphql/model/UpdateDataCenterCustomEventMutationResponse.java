package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心 更新打点事件
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateDataCenterCustomEventMutationResponse extends GraphQLResult<Map<String, CustomEventDto>> {

    private static final String OPERATION_NAME = "updateDataCenterCustomEvent";

    public UpdateDataCenterCustomEventMutationResponse() {
    }

    /**
     * 数据中心 更新打点事件
     */
    public CustomEventDto updateDataCenterCustomEvent() {
        Map<String, CustomEventDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
