package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class SearchUserEventsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "searchUserEvents";

    private Map<String, Object> input = new LinkedHashMap<>();

    public SearchUserEventsQueryRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setQ(String q) {
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

        private String id;
        private String q;
        private String timeRange;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setQ(String q) {
            this.q = q;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }


        public SearchUserEventsQueryRequest build() {
            SearchUserEventsQueryRequest obj = new SearchUserEventsQueryRequest();
            obj.setId(id);
            obj.setQ(q);
            obj.setTimeRange(timeRange);
            return obj;
        }

    }
}
