package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 查询日志
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class LogsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "logs";

    private Map<String, Object> input = new LinkedHashMap<>();

    public LogsQueryRequest() {
    }

    public void setQ(AuditLogQueryInputDto q) {
        this.input.put("q", q);
    }

    public void setTimeRange(String timeRange) {
        this.input.put("timeRange", timeRange);
    }

    public void setOffset(Integer offset) {
        this.input.put("offset", offset);
    }

    public void setLimit(Integer limit) {
        this.input.put("limit", limit);
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
        private Integer offset;
        private Integer limit;

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

        public Builder setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }


        public LogsQueryRequest build() {
            LogsQueryRequest obj = new LogsQueryRequest();
            obj.setQ(q);
            obj.setTimeRange(timeRange);
            obj.setOffset(offset);
            obj.setLimit(limit);
            return obj;
        }

    }
}
