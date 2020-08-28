package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class SegmentQueryResponse extends GraphQLResult<Map<String, SegmentDto>> {

    private static final String OPERATION_NAME = "segment";

    public SegmentQueryResponse() {
    }

    public SegmentDto segment() {
        Map<String, SegmentDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
