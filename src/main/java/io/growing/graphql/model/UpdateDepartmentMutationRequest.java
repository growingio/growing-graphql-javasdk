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
public class UpdateDepartmentMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateDepartment";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateDepartmentMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setDepartment(DepartmentInputDto department) {
        this.input.put("department", department);
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
        private DepartmentInputDto department;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDepartment(DepartmentInputDto department) {
            this.department = department;
            return this;
        }


        public UpdateDepartmentMutationRequest build() {
            UpdateDepartmentMutationRequest obj = new UpdateDepartmentMutationRequest();
            obj.setId(id);
            obj.setDepartment(department);
            return obj;
        }

    }
}
