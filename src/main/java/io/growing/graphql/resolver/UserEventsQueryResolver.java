package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 用户事件查询，新增filter为过滤条件，小程序无埋点filter中含有appid
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public interface UserEventsQueryResolver {

    /**
     * 用户事件查询，新增filter为过滤条件，小程序无埋点filter中含有appid
     */
    @javax.validation.constraints.NotNull
    CursorPaginationDto userEvents(String projectId, String id, java.util.List<UserEventTypeDto> types, String timeRange, Integer first, String after, Integer last, String before, Integer limit, FilterInputDto filter) throws Exception;

}