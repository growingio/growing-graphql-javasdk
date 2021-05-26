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
final public class $AddProjectMembersMutationResolver implements AddProjectMembersMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $AddProjectMembersMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $AddProjectMembersMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean addProjectMembers(AddProjectMembersInputDto input) throws Exception {
        AddProjectMembersMutationRequest request = new AddProjectMembersMutationRequest();
        List<String> keys = Arrays.asList("input");
        List<?> values = Arrays.asList(input);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        AddProjectMembersMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, AddProjectMembersMutationResponse.class);
        return result.addProjectMembers();
    }

}