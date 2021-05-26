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
 * 单条删除分析预警
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DeleteAnalysisAlertMutationResolver implements DeleteAnalysisAlertMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $DeleteAnalysisAlertMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DeleteAnalysisAlertMutationResolver() {}

    /**
     * 单条删除分析预警
     */
    @javax.validation.constraints.NotNull
    @Override
    public Boolean deleteAnalysisAlert(String projectId, String id) throws Exception {
        DeleteAnalysisAlertMutationRequest request = new DeleteAnalysisAlertMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id");
        List<?> values = Arrays.asList(projectId, id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DeleteAnalysisAlertMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DeleteAnalysisAlertMutationResponse.class);
        return result.deleteAnalysisAlert();
    }

}