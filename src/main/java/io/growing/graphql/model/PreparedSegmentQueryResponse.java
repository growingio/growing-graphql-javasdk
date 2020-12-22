package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * activeToday: 今日活跃用户
 * activeInThreeWeeks: 近 3 周活跃用户
 * activeNotInTwoWeeks: 近 2 周不活跃用户
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class PreparedSegmentQueryResponse extends GraphQLResult<Map<String, PreparedSegmentDto>> {

    private static final String OPERATION_NAME = "preparedSegment";

    public PreparedSegmentQueryResponse() {
    }

    /**
     * activeToday: 今日活跃用户
     * activeInThreeWeeks: 近 3 周活跃用户
     * activeNotInTwoWeeks: 近 2 周不活跃用户
     */
    public PreparedSegmentDto preparedSegment() {
        Map<String, PreparedSegmentDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
