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
    date = "2020-12-22T15:45:58+0800"
)
final public class $DataCenterCountUserVariablesQueryResolver implements DataCenterCountUserVariablesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterCountUserVariablesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterCountUserVariablesQueryResolver() {}

    /**
     * 数据中心的用户变量数量
     */
    @Override
    public Integer dataCenterCountUserVariables() throws Exception {
        DataCenterCountUserVariablesQueryRequest request = new DataCenterCountUserVariablesQueryRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DataCenterCountUserVariablesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterCountUserVariablesQueryResponse.class);
        return result.dataCenterCountUserVariables();
    }

}