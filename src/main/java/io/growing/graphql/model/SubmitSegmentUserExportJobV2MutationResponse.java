package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class SubmitSegmentUserExportJobV2MutationResponse extends GraphQLResult<Map<String, SegmentUserExportJobDto>> {

    private static final String OPERATION_NAME = "submitSegmentUserExportJobV2";

    public SubmitSegmentUserExportJobV2MutationResponse() {
    }

    public SegmentUserExportJobDto submitSegmentUserExportJobV2() {
        Map<String, SegmentUserExportJobDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
