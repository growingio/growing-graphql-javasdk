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
 * * 通过id查询分组信息
* @param ids id列表
* @return 对应id的标签分组信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $QueryGroupByIdsQueryResolver implements QueryGroupByIdsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $QueryGroupByIdsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $QueryGroupByIdsQueryResolver() {}

    /**
     * * 通过id查询分组信息
* @param ids id列表
* @return 对应id的标签分组信息
     */
    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<TagGroupInfoDto> queryGroupByIds(java.util.List<String> ids) throws Exception {
        QueryGroupByIdsQueryRequest request = new QueryGroupByIdsQueryRequest();
        List<String> keys = Arrays.asList("ids");
        List<?> values = Arrays.asList(ids);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TagGroupInfoResponseProjection projection = new TagGroupInfoResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        QueryGroupByIdsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, QueryGroupByIdsQueryResponse.class);
        return result.queryGroupByIds();
    }

}