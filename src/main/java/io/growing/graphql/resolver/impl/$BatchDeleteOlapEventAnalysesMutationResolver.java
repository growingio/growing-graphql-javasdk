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
 * 批量删除新事件分析图
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $BatchDeleteOlapEventAnalysesMutationResolver implements BatchDeleteOlapEventAnalysesMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $BatchDeleteOlapEventAnalysesMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $BatchDeleteOlapEventAnalysesMutationResolver() {}

    /**
     * 批量删除新事件分析图
     */
    @Override
    public Boolean batchDeleteOlapEventAnalyses(String projectId, java.util.List<String> ids) throws Exception {
        BatchDeleteOlapEventAnalysesMutationRequest request = new BatchDeleteOlapEventAnalysesMutationRequest();
        List<String> keys = Arrays.asList("projectId", "ids");
        List<?> values = Arrays.asList(projectId, ids);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchDeleteOlapEventAnalysesMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchDeleteOlapEventAnalysesMutationResponse.class);
        return result.batchDeleteOlapEventAnalyses();
    }

}