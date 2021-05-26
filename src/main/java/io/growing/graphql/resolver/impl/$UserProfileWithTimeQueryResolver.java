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

/**
 * 如果userId在数据端为无效或不存在，则返回空
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
final public class $UserProfileWithTimeQueryResolver implements UserProfileWithTimeQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $UserProfileWithTimeQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UserProfileWithTimeQueryResolver() {}

    /**
     * 如果userId在数据端为无效或不存在，则返回空
     */
    @Override
    public java.util.List<TimeUserProfileDto> userProfileWithTime(String projectId, String userId, java.util.List<String> tags, java.util.List<String> properties) throws Exception {
        UserProfileWithTimeQueryRequest request = new UserProfileWithTimeQueryRequest();
        List<String> keys = Arrays.asList("projectId", "userId", "tags", "properties");
        List<?> values = Arrays.asList(projectId, userId, tags, properties);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TimeUserProfileResponseProjection projection = new TimeUserProfileResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UserProfileWithTimeQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UserProfileWithTimeQueryResponse.class);
        return result.userProfileWithTime();
    }

}