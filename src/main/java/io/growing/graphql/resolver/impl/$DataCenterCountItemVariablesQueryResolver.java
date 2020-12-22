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
 * 数据中心的物品模型变量数量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
final public class $DataCenterCountItemVariablesQueryResolver implements DataCenterCountItemVariablesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterCountItemVariablesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterCountItemVariablesQueryResolver() {}

    /**
     * 数据中心的物品模型变量数量
     */
    @Override
    public Integer dataCenterCountItemVariables() throws Exception {
        DataCenterCountItemVariablesQueryRequest request = new DataCenterCountItemVariablesQueryRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DataCenterCountItemVariablesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterCountItemVariablesQueryResponse.class);
        return result.dataCenterCountItemVariables();
    }

}