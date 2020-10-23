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
final public class DefaultProjectInfoQueryResolver implements ProjectInfoQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultProjectInfoQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultProjectInfoQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public ProjectInfoDto projectInfo() throws Exception {
        ProjectInfoQueryRequest request = new ProjectInfoQueryRequest();
        ProjectInfoResponseProjection projection = new ProjectInfoResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        ProjectInfoQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ProjectInfoQueryResponse.class);
        return result.projectInfo();
    }

}