package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class AddMembersToDepartmentMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "addMembersToDepartment";

    private Map<String, Object> input = new LinkedHashMap<>();

    public AddMembersToDepartmentMutationRequest() {
    }

    public void setMemberIds(java.util.List<String> memberIds) {
        this.input.put("memberIds", memberIds);
    }

    public void setDepartmentId(String departmentId) {
        this.input.put("departmentId", departmentId);
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

        private java.util.List<String> memberIds;
        private String departmentId;

        public Builder() {
        }

        public Builder setMemberIds(java.util.List<String> memberIds) {
            this.memberIds = memberIds;
            return this;
        }

        public Builder setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        public AddMembersToDepartmentMutationRequest build() {
            AddMembersToDepartmentMutationRequest obj = new AddMembersToDepartmentMutationRequest();
            obj.setMemberIds(memberIds);
            obj.setDepartmentId(departmentId);
            return obj;
        }

    }
}
