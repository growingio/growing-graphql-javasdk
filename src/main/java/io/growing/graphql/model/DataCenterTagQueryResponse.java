package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 通过 id 获取数据中心标签
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterTagQueryResponse extends GraphQLResult<Map<String, TagDto>> {

    private static final String OPERATION_NAME = "dataCenterTag";

    public DataCenterTagQueryResponse() {
    }

    /**
     * 通过 id 获取数据中心标签
     */
    public TagDto dataCenterTag() {
        Map<String, TagDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
