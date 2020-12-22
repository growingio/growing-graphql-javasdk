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

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
final public class $CreateDataCenterEventVariableMutationResolver implements CreateDataCenterEventVariableMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateDataCenterEventVariableMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateDataCenterEventVariableMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public EventVariableDto createDataCenterEventVariable(VariableInputDto eventVariable) throws Exception {
        CreateDataCenterEventVariableMutationRequest request = new CreateDataCenterEventVariableMutationRequest();
        List<String> keys = Arrays.asList("eventVariable");
        List<?> values = Arrays.asList(eventVariable);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventVariableResponseProjection projection = new EventVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateDataCenterEventVariableMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateDataCenterEventVariableMutationResponse.class);
        return result.createDataCenterEventVariable();
    }

}