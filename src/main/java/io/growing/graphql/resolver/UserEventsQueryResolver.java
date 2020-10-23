package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public interface UserEventsQueryResolver {

    @javax.validation.constraints.NotNull
    CursorPaginationDto userEvents(String id, UserEventTypeDto type, String timeRange, Integer first, String after, Integer last, String before) throws Exception;

}