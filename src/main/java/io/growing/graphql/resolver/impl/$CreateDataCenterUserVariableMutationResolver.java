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
final public class $CreateDataCenterUserVariableMutationResolver implements CreateDataCenterUserVariableMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateDataCenterUserVariableMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateDataCenterUserVariableMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public UserVariableDto createDataCenterUserVariable(VariableInputDto userVariable) throws Exception {
        CreateDataCenterUserVariableMutationRequest request = new CreateDataCenterUserVariableMutationRequest();
        List<String> keys = Arrays.asList("userVariable");
        List<?> values = Arrays.asList(userVariable);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        UserVariableResponseProjection projection = new UserVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateDataCenterUserVariableMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateDataCenterUserVariableMutationResponse.class);
        return result.createDataCenterUserVariable();
    }

}