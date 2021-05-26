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
 * 数据中心的物品模型变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DataCenterItemVariablesQueryResolver implements DataCenterItemVariablesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterItemVariablesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterItemVariablesQueryResolver() {}

    /**
     * 数据中心的物品模型变量
     */
    @Override
    public java.util.List<ItemVariableDto> dataCenterItemVariables() throws Exception {
        DataCenterItemVariablesQueryRequest request = new DataCenterItemVariablesQueryRequest();
        ItemVariableResponseProjection projection = new ItemVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterItemVariablesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterItemVariablesQueryResponse.class);
        return result.dataCenterItemVariables();
    }

}