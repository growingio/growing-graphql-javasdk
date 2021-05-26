package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 无埋点 更新元素
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateElementMutationResponse extends GraphQLResult<Map<String, ElementDto>> {

    private static final String OPERATION_NAME = "updateElement";

    public UpdateElementMutationResponse() {
    }

    /**
     * 无埋点 更新元素
     */
    public ElementDto updateElement() {
        Map<String, ElementDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
