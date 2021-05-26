package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UserEventCountQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "userEventCount";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UserEventCountQueryRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setTimeRange(String timeRange) {
        this.input.put("timeRange", timeRange);
    }

    public void setEventKeys(java.util.List<String> eventKeys) {
        this.input.put("eventKeys", eventKeys);
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

        private String projectId;
        private String id;
        private String timeRange;
        private java.util.List<String> eventKeys;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setEventKeys(java.util.List<String> eventKeys) {
            this.eventKeys = eventKeys;
            return this;
        }


        public UserEventCountQueryRequest build() {
            UserEventCountQueryRequest obj = new UserEventCountQueryRequest();
            obj.setProjectId(projectId);
            obj.setId(id);
            obj.setTimeRange(timeRange);
            obj.setEventKeys(eventKeys);
            return obj;
        }

    }
}
