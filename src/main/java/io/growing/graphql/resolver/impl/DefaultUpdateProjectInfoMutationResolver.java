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
final public class DefaultUpdateProjectInfoMutationResolver implements UpdateProjectInfoMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateProjectInfoMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateProjectInfoMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean updateProjectInfo(ProjectInfoInputDto projectInfo) throws Exception {
        UpdateProjectInfoMutationRequest request = new UpdateProjectInfoMutationRequest();
        List<String> keys = Arrays.asList("projectInfo");
        List<?> values = Arrays.asList(projectInfo);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateProjectInfoMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateProjectInfoMutationResponse.class);
        return result.updateProjectInfo();
    }

}