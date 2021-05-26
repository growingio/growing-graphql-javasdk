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
 * 通过 id 获取数据中心标签
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
final public class $DataCenterTagQueryResolver implements DataCenterTagQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterTagQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterTagQueryResolver() {}

    /**
     * 通过 id 获取数据中心标签
     */
    @Override
    public TagDto dataCenterTag(String id) throws Exception {
        DataCenterTagQueryRequest request = new DataCenterTagQueryRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TagResponseProjection projection = new TagResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterTagQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterTagQueryResponse.class);
        return result.dataCenterTag();
    }

}