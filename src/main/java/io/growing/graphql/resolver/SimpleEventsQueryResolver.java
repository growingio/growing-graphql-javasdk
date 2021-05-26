package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 无埋点事件 即圈选事件
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface SimpleEventsQueryResolver {

    /**
     * 无埋点事件 即圈选事件
     */
    java.util.List<SimpleEventDto> simpleEvents(String projectId, String elementId) throws Exception;

}