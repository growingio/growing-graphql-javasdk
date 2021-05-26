package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * * 通过id查询分组信息
* @param ids id列表
* @return 对应id的标签分组信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryGroupByIdsQueryResponse extends GraphQLResult<Map<String, java.util.List<TagGroupInfoDto>>> {

    private static final String OPERATION_NAME = "queryGroupByIds";

    public QueryGroupByIdsQueryResponse() {
    }

    /**
     * * 通过id查询分组信息
* @param ids id列表
* @return 对应id的标签分组信息
     */
    public java.util.List<TagGroupInfoDto> queryGroupByIds() {
        Map<String, java.util.List<TagGroupInfoDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
