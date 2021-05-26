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
 * 数据中心的事件变量数量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $CountDataCenterEventVariablesQueryResolver implements CountDataCenterEventVariablesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $CountDataCenterEventVariablesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CountDataCenterEventVariablesQueryResolver() {}

    /**
     * 数据中心的事件变量数量
     */
    @Override
    public Integer countDataCenterEventVariables() throws Exception {
        CountDataCenterEventVariablesQueryRequest request = new CountDataCenterEventVariablesQueryRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        CountDataCenterEventVariablesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CountDataCenterEventVariablesQueryResponse.class);
        return result.countDataCenterEventVariables();
    }

}