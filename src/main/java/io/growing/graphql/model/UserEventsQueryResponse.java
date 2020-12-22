package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 用户事件查询，新增filter为过滤条件，小程序无埋点filter中含有appid
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class UserEventsQueryResponse extends GraphQLResult<Map<String, CursorPaginationDto>> {

    private static final String OPERATION_NAME = "userEvents";

    public UserEventsQueryResponse() {
    }

    /**
     * 用户事件查询，新增filter为过滤条件，小程序无埋点filter中含有appid
     */
    public CursorPaginationDto userEvents() {
        Map<String, CursorPaginationDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
