package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class CreateFunnelDrillDownSegmentSnapshotMutationResponse extends GraphQLResult<Map<String, DrillDownSegmentSnapshotReplyDto>> {

    private static final String OPERATION_NAME = "createFunnelDrillDownSegmentSnapshot";

    public CreateFunnelDrillDownSegmentSnapshotMutationResponse() {
    }

    public DrillDownSegmentSnapshotReplyDto createFunnelDrillDownSegmentSnapshot() {
        Map<String, DrillDownSegmentSnapshotReplyDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
