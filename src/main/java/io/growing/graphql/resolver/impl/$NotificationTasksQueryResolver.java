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
final public class $NotificationTasksQueryResolver implements NotificationTasksQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $NotificationTasksQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $NotificationTasksQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<NotificationTaskDto> notificationTasks() throws Exception {
        NotificationTasksQueryRequest request = new NotificationTasksQueryRequest();
        NotificationTaskResponseProjection projection = new NotificationTaskResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        NotificationTasksQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, NotificationTasksQueryResponse.class);
        return result.notificationTasks();
    }

}