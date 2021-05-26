package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * * 返回标签分组信息
* @param groupId 非必填,为空 | 查询所有非叶子分组(即⻚面侧边分组),有值 | 查询这个分组的下一级分组及分组下标签信息(即⻚面中部分组及标签)
* @param level   非必填,目前该参数为保留参数,暂时不提供功能
* @return  标签分组信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TencentPortraitTagInfoQueryResponse extends GraphQLResult<Map<String, java.util.List<TagGroupInfoDto>>> {

    private static final String OPERATION_NAME = "tencentPortraitTagInfo";

    public TencentPortraitTagInfoQueryResponse() {
    }

    /**
     * * 返回标签分组信息
* @param groupId 非必填,为空 | 查询所有非叶子分组(即⻚面侧边分组),有值 | 查询这个分组的下一级分组及分组下标签信息(即⻚面中部分组及标签)
* @param level   非必填,目前该参数为保留参数,暂时不提供功能
* @return  标签分组信息
     */
    public java.util.List<TagGroupInfoDto> tencentPortraitTagInfo() {
        Map<String, java.util.List<TagGroupInfoDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
