package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class UserEventsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "userEvents";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UserEventsQueryRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setType(UserEventTypeDto type) {
        this.input.put("type", type);
    }

    public void setTimeRange(String timeRange) {
        this.input.put("timeRange", timeRange);
    }

    public void setFirst(Integer first) {
        this.input.put("first", first);
    }

    public void setAfter(String after) {
        this.input.put("after", after);
    }

    public void setLast(Integer last) {
        this.input.put("last", last);
    }

    public void setBefore(String before) {
        this.input.put("before", before);
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
        private UserEventTypeDto type;
        private String timeRange;
        private Integer first;
        private String after;
        private Integer last;
        private String before;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setType(UserEventTypeDto type) {
            this.type = type;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setFirst(Integer first) {
            this.first = first;
            return this;
        }

        public Builder setAfter(String after) {
            this.after = after;
            return this;
        }

        public Builder setLast(Integer last) {
            this.last = last;
            return this;
        }

        public Builder setBefore(String before) {
            this.before = before;
            return this;
        }


        public UserEventsQueryRequest build() {
            UserEventsQueryRequest obj = new UserEventsQueryRequest();
            obj.setId(id);
            obj.setType(type);
            obj.setTimeRange(timeRange);
            obj.setFirst(first);
            obj.setAfter(after);
            obj.setLast(last);
            obj.setBefore(before);
            return obj;
        }

    }
}
