package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 无埋点 创建元素
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateElementMutationResponse extends GraphQLResult<Map<String, ElementDto>> {

    private static final String OPERATION_NAME = "createElement";

    public CreateElementMutationResponse() {
    }

    /**
     * 无埋点 创建元素
     */
    public ElementDto createElement() {
        Map<String, ElementDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
