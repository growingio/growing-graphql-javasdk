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
final public class $UpdateDepartmentMutationResolver implements UpdateDepartmentMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateDepartmentMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateDepartmentMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DepartmentDto updateDepartment(String id, DepartmentInputDto department) throws Exception {
        UpdateDepartmentMutationRequest request = new UpdateDepartmentMutationRequest();
        List<String> keys = Arrays.asList("id", "department");
        List<?> values = Arrays.asList(id, department);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DepartmentResponseProjection projection = new DepartmentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateDepartmentMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateDepartmentMutationResponse.class);
        return result.updateDepartment();
    }

}