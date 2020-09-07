package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class SubmitSegmentUserExportJobMutationResponse extends GraphQLResult<Map<String, SegmentUserExportJobDto>> {

    private static final String OPERATION_NAME = "submitSegmentUserExportJob";

    public SubmitSegmentUserExportJobMutationResponse() {
    }

    public SegmentUserExportJobDto submitSegmentUserExportJob() {
        Map<String, SegmentUserExportJobDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
