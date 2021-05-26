package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 无埋点 单个元素详情
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ElementQueryResponse extends GraphQLResult<Map<String, ElementDto>> {

    private static final String OPERATION_NAME = "element";

    public ElementQueryResponse() {
    }

    /**
     * 无埋点 单个元素详情
     */
    public ElementDto element() {
        Map<String, ElementDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
