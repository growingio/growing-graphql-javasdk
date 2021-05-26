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
final public class $NotificationTaskQueryResolver implements NotificationTaskQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $NotificationTaskQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $NotificationTaskQueryResolver() {}

    @Override
    public NotificationTaskDto notificationTask(String id) throws Exception {
        NotificationTaskQueryRequest request = new NotificationTaskQueryRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        NotificationTaskResponseProjection projection = new NotificationTaskResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        NotificationTaskQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, NotificationTaskQueryResponse.class);
        return result.notificationTask();
    }

}