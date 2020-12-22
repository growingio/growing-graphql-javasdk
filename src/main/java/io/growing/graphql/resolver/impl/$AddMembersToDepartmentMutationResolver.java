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
final public class $AddMembersToDepartmentMutationResolver implements AddMembersToDepartmentMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $AddMembersToDepartmentMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $AddMembersToDepartmentMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean addMembersToDepartment(java.util.List<String> memberIds, String departmentId) throws Exception {
        AddMembersToDepartmentMutationRequest request = new AddMembersToDepartmentMutationRequest();
        List<String> keys = Arrays.asList("memberIds", "departmentId");
        List<?> values = Arrays.asList(memberIds, departmentId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        AddMembersToDepartmentMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, AddMembersToDepartmentMutationResponse.class);
        return result.addMembersToDepartment();
    }

}