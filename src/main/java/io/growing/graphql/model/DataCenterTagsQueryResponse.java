package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心标签列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterTagsQueryResponse extends GraphQLResult<Map<String, java.util.List<TagDto>>> {

    private static final String OPERATION_NAME = "dataCenterTags";

    public DataCenterTagsQueryResponse() {
    }

    /**
     * 数据中心标签列表
     */
    public java.util.List<TagDto> dataCenterTags() {
        Map<String, java.util.List<TagDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
