package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public interface UserEventsTrendQueryResolver {

    EventTrendDto userEventsTrend(String projectId, String id, UserEventTypeDto type, String timeRange, java.lang.Long interval, java.util.List<String> eventKeys) throws Exception;

}