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
final public class $DepartmentsQueryResolver implements DepartmentsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DepartmentsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DepartmentsQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<DepartmentDto> departments(String parentId) throws Exception {
        DepartmentsQueryRequest request = new DepartmentsQueryRequest();
        List<String> keys = Arrays.asList("parentId");
        List<?> values = Arrays.asList(parentId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DepartmentResponseProjection projection = new DepartmentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DepartmentsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DepartmentsQueryResponse.class);
        return result.departments();
    }

}