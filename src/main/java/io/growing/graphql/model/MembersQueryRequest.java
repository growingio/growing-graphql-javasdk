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
public class MembersQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "members";

    private Map<String, Object> input = new LinkedHashMap<>();

    public MembersQueryRequest() {
    }

    public void setScopeId(String scopeId) {
        this.input.put("scopeId", scopeId);
    }

    public void setScopeType(MemberScopeTypeInputDto scopeType) {
        this.input.put("scopeType", scopeType);
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

        private String scopeId;
        private MemberScopeTypeInputDto scopeType;
        private Integer offset;
        private Integer limit;

        public Builder() {
        }

        public Builder setScopeId(String scopeId) {
            this.scopeId = scopeId;
            return this;
        }

        public Builder setScopeType(MemberScopeTypeInputDto scopeType) {
            this.scopeType = scopeType;
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


        public MembersQueryRequest build() {
            MembersQueryRequest obj = new MembersQueryRequest();
            obj.setScopeId(scopeId);
            obj.setScopeType(scopeType);
            obj.setOffset(offset);
            obj.setLimit(limit);
            return obj;
        }

    }
}
