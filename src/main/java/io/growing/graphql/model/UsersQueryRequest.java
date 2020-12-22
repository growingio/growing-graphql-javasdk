package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class UsersQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "users";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UsersQueryRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setType(UserQueryTypeDto type) {
        this.input.put("type", type);
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setOffset(Integer offset) {
        this.input.put("offset", offset);
    }

    public void setLimit(Integer limit) {
        this.input.put("limit", limit);
    }

    public void setTags(java.util.List<String> tags) {
        this.input.put("tags", tags);
    }

    public void setProperties(java.util.List<String> properties) {
        this.input.put("properties", properties);
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
        private UserQueryTypeDto type;
        private String id;
        private Integer offset;
        private Integer limit;
        private java.util.List<String> tags;
        private java.util.List<String> properties;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setType(UserQueryTypeDto type) {
            this.type = type;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
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

        public Builder setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setProperties(java.util.List<String> properties) {
            this.properties = properties;
            return this;
        }


        public UsersQueryRequest build() {
            UsersQueryRequest obj = new UsersQueryRequest();
            obj.setProjectId(projectId);
            obj.setType(type);
            obj.setId(id);
            obj.setOffset(offset);
            obj.setLimit(limit);
            obj.setTags(tags);
            obj.setProperties(properties);
            return obj;
        }

    }
}
