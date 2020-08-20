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
public class UsersQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "users";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UsersQueryRequest() {
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

        private UserQueryTypeDto type;
        private String id;
        private Integer offset;
        private Integer limit;

        public Builder() {
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


        public UsersQueryRequest build() {
            UsersQueryRequest obj = new UsersQueryRequest();
            obj.setType(type);
            obj.setId(id);
            obj.setOffset(offset);
            obj.setLimit(limit);
            return obj;
        }

    }
}
