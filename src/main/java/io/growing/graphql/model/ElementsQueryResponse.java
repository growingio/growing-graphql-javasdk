package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 无埋点 元素列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ElementsQueryResponse extends GraphQLResult<Map<String, java.util.List<ElementDto>>> {

    private static final String OPERATION_NAME = "elements";

    public ElementsQueryResponse() {
    }

    /**
     * 无埋点 元素列表
     */
    public java.util.List<ElementDto> elements() {
        Map<String, java.util.List<ElementDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
