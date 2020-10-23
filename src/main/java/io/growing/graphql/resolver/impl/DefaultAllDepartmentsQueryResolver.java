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
final public class DefaultAllDepartmentsQueryResolver implements AllDepartmentsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultAllDepartmentsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultAllDepartmentsQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<DepartmentDto> allDepartments() throws Exception {
        AllDepartmentsQueryRequest request = new AllDepartmentsQueryRequest();
        DepartmentResponseProjection projection = new DepartmentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        AllDepartmentsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, AllDepartmentsQueryResponse.class);
        return result.allDepartments();
    }

}