package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 请求日志导出
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class SubmitLogExportJobMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "submitLogExportJob";

    private Map<String, Object> input = new LinkedHashMap<>();

    public SubmitLogExportJobMutationRequest() {
    }

    public void setQ(AuditLogQueryInputDto q) {
        this.input.put("q", q);
    }

    public void setTimeRange(String timeRange) {
        this.input.put("timeRange", timeRange);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private AuditLogQueryInputDto q;
        private String timeRange;

        public Builder() {
        }

        public Builder setQ(AuditLogQueryInputDto q) {
            this.q = q;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }


        public SubmitLogExportJobMutationRequest build() {
            SubmitLogExportJobMutationRequest obj = new SubmitLogExportJobMutationRequest();
            obj.setQ(q);
            obj.setTimeRange(timeRange);
            return obj;
        }

    }
}
