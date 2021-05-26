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
final public class $DataCenterUserProfileQueryResolver implements DataCenterUserProfileQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterUserProfileQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterUserProfileQueryResolver() {}

    /**
     * 如果userId在数据端为无效或不存在，则返回空
     */
    @Override
    public UserProfileDto dataCenterUserProfile(String userId, java.util.List<String> tags, java.util.List<String> properties) throws Exception {
        DataCenterUserProfileQueryRequest request = new DataCenterUserProfileQueryRequest();
        List<String> keys = Arrays.asList("userId", "tags", "properties");
        List<?> values = Arrays.asList(userId, tags, properties);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        UserProfileResponseProjection projection = new UserProfileResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterUserProfileQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterUserProfileQueryResponse.class);
        return result.dataCenterUserProfile();
    }

}