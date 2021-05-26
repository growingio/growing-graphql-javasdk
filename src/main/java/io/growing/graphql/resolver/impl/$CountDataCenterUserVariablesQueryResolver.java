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
 * 数据中心的用户变量数量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $CountDataCenterUserVariablesQueryResolver implements CountDataCenterUserVariablesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $CountDataCenterUserVariablesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CountDataCenterUserVariablesQueryResolver() {}

    /**
     * 数据中心的用户变量数量
     */
    @Override
    public Integer countDataCenterUserVariables() throws Exception {
        CountDataCenterUserVariablesQueryRequest request = new CountDataCenterUserVariablesQueryRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        CountDataCenterUserVariablesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CountDataCenterUserVariablesQueryResponse.class);
        return result.countDataCenterUserVariables();
    }

}