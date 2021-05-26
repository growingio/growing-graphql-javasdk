package io.growing.graphql.resolver.impl;

import com.kobylynskyi.graphql.codegen.extension.GrowingIOConfig;
import com.kobylynskyi.graphql.codegen.extension.utils.JavaCollectionUtils;
import com.kobylynskyi.graphql.codegen.extension.utils.OkHttpUtils;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import io.growing.graphql.resolver.*;
import io.growing.graphql.model.*;

/**
 * * 返回标签分组信息
* @param groupId 非必填,为空 | 查询所有非叶子分组(即⻚面侧边分组),有值 | 查询这个分组的下一级分组及分组下标签信息(即⻚面中部分组及标签)
* @param level   非必填,目前该参数为保留参数,暂时不提供功能
* @return  标签分组信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $TencentPortraitTagInfoQueryResolver implements TencentPortraitTagInfoQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $TencentPortraitTagInfoQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $TencentPortraitTagInfoQueryResolver() {}

    /**
     * * 返回标签分组信息
* @param groupId 非必填,为空 | 查询所有非叶子分组(即⻚面侧边分组),有值 | 查询这个分组的下一级分组及分组下标签信息(即⻚面中部分组及标签)
* @param level   非必填,目前该参数为保留参数,暂时不提供功能
* @return  标签分组信息
     */
    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<TagGroupInfoDto> tencentPortraitTagInfo(String groupId, String level) throws Exception {
        TencentPortraitTagInfoQueryRequest request = new TencentPortraitTagInfoQueryRequest();
        List<String> keys = Arrays.asList("groupId", "level");
        List<?> values = Arrays.asList(groupId, level);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TagGroupInfoResponseProjection projection = new TagGroupInfoResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        TencentPortraitTagInfoQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, TencentPortraitTagInfoQueryResponse.class);
        return result.tencentPortraitTagInfo();
    }

}