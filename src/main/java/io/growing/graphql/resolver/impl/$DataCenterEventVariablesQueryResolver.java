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
 * 数据中心的事件变量列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DataCenterEventVariablesQueryResolver implements DataCenterEventVariablesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterEventVariablesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterEventVariablesQueryResolver() {}

    /**
     * 数据中心的事件变量列表
     */
    @Override
    public java.util.List<EventVariableDto> dataCenterEventVariables() throws Exception {
        DataCenterEventVariablesQueryRequest request = new DataCenterEventVariablesQueryRequest();
        EventVariableResponseProjection projection = new EventVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterEventVariablesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterEventVariablesQueryResponse.class);
        return result.dataCenterEventVariables();
    }

}