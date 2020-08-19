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
public class CreateDepartmentMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createDepartment";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateDepartmentMutationRequest() {
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

        private DepartmentInputDto department;

        public Builder() {
        }

        public Builder setDepartment(DepartmentInputDto department) {
            this.department = department;
            return this;
        }


        public CreateDepartmentMutationRequest build() {
            CreateDepartmentMutationRequest obj = new CreateDepartmentMutationRequest();
            obj.setDepartment(department);
            return obj;
        }

    }
}
