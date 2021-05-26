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
    date = "2021-05-26T15:01:24+0800"
)
final public class $CreateDepartmentMutationResolver implements CreateDepartmentMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateDepartmentMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateDepartmentMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DepartmentDto createDepartment(DepartmentInputDto department) throws Exception {
        CreateDepartmentMutationRequest request = new CreateDepartmentMutationRequest();
        List<String> keys = Arrays.asList("department");
        List<?> values = Arrays.asList(department);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DepartmentResponseProjection projection = new DepartmentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateDepartmentMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateDepartmentMutationResponse.class);
        return result.createDepartment();
    }

}