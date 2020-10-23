package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class CreateRetentionDrillDownSegmentMutationResponse extends GraphQLResult<Map<String, DrillDownSegmentReplyDto>> {

    private static final String OPERATION_NAME = "createRetentionDrillDownSegment";

    public CreateRetentionDrillDownSegmentMutationResponse() {
    }

    public DrillDownSegmentReplyDto createRetentionDrillDownSegment() {
        Map<String, DrillDownSegmentReplyDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
