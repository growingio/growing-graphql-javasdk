package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateSegmentMutationResponse extends GraphQLResult<Map<String, SegmentDto>> {

    private static final String OPERATION_NAME = "updateSegment";

    public UpdateSegmentMutationResponse() {
    }

    public SegmentDto updateSegment() {
        Map<String, SegmentDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
