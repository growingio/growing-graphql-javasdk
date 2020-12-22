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
public class CreateProjectMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createProject";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateProjectMutationRequest() {
    }

    public void setProject(ProjectInputDto project) {
        this.input.put("project", project);
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

        private ProjectInputDto project;

        public Builder() {
        }

        public Builder setProject(ProjectInputDto project) {
            this.project = project;
            return this;
        }


        public CreateProjectMutationRequest build() {
            CreateProjectMutationRequest obj = new CreateProjectMutationRequest();
            obj.setProject(project);
            return obj;
        }

    }
}
