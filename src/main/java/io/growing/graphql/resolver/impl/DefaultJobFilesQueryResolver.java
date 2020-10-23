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
final public class DefaultJobFilesQueryResolver implements JobFilesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultJobFilesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultJobFilesQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<FileDescriptorDto> jobFiles(String id) throws Exception {
        JobFilesQueryRequest request = new JobFilesQueryRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        FileDescriptorResponseProjection projection = new FileDescriptorResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        JobFilesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, JobFilesQueryResponse.class);
        return result.jobFiles();
    }

}