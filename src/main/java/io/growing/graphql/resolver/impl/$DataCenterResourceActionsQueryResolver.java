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
final public class $DataCenterResourceActionsQueryResolver implements DataCenterResourceActionsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterResourceActionsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterResourceActionsQueryResolver() {}

    @Override
    public java.util.List<String> dataCenterResourceActions(String resourceType, java.lang.Long resourceId) throws Exception {
        DataCenterResourceActionsQueryRequest request = new DataCenterResourceActionsQueryRequest();
        List<String> keys = Arrays.asList("resourceType", "resourceId");
        List<?> values = Arrays.asList(resourceType, resourceId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DataCenterResourceActionsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterResourceActionsQueryResponse.class);
        return result.dataCenterResourceActions();
    }

}