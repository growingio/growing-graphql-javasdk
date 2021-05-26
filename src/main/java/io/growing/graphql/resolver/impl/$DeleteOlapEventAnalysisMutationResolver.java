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
 * 删除新事件分析图
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DeleteOlapEventAnalysisMutationResolver implements DeleteOlapEventAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $DeleteOlapEventAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DeleteOlapEventAnalysisMutationResolver() {}

    /**
     * 删除新事件分析图
     */
    @javax.validation.constraints.NotNull
    @Override
    public Boolean deleteOlapEventAnalysis(String projectId, String id) throws Exception {
        DeleteOlapEventAnalysisMutationRequest request = new DeleteOlapEventAnalysisMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id");
        List<?> values = Arrays.asList(projectId, id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DeleteOlapEventAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DeleteOlapEventAnalysisMutationResponse.class);
        return result.deleteOlapEventAnalysis();
    }

}