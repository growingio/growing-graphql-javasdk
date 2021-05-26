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
final public class $SubmitTagUserExportJobByKeyMutationResolver implements SubmitTagUserExportJobByKeyMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $SubmitTagUserExportJobByKeyMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SubmitTagUserExportJobByKeyMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public TagUserExportJobDto submitTagUserExportJobByKey(TagUserExportJobByKeyInputDto parameter) throws Exception {
        SubmitTagUserExportJobByKeyMutationRequest request = new SubmitTagUserExportJobByKeyMutationRequest();
        List<String> keys = Arrays.asList("parameter");
        List<?> values = Arrays.asList(parameter);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TagUserExportJobResponseProjection projection = new TagUserExportJobResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SubmitTagUserExportJobByKeyMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SubmitTagUserExportJobByKeyMutationResponse.class);
        return result.submitTagUserExportJobByKey();
    }

}