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
 * 用户事件查询，新增filter为过滤条件，小程序无埋点filter中含有appid
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
final public class $UserEventsQueryResolver implements UserEventsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $UserEventsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UserEventsQueryResolver() {}

    /**
     * 用户事件查询，新增filter为过滤条件，小程序无埋点filter中含有appid
     */
    @javax.validation.constraints.NotNull
    @Override
    public CursorPaginationDto userEvents(String projectId, String id, java.util.List<UserEventTypeDto> types, String timeRange, Integer first, String after, Integer last, String before, Integer limit, FilterInputDto filter) throws Exception {
        UserEventsQueryRequest request = new UserEventsQueryRequest();
        List<String> keys = Arrays.asList("projectId", "id", "types", "timeRange", "first", "after", "last", "before", "limit", "filter");
        List<?> values = Arrays.asList(projectId, id, types, timeRange, first, after, last, before, limit, filter);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CursorPaginationResponseProjection projection = new CursorPaginationResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UserEventsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UserEventsQueryResponse.class);
        return result.userEvents();
    }

}