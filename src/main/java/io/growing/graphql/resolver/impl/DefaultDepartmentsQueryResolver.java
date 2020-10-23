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
    date = "2020-10-23T13:11:58+0800"
)
final public class DefaultDepartmentsQueryResolver implements DepartmentsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultDepartmentsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultDepartmentsQueryResolver() {}

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