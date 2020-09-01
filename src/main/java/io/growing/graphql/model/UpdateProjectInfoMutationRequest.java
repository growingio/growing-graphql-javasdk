package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class UpdateProjectInfoMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateProjectInfo";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateProjectInfoMutationRequest() {
    }

    public void setProjectInfo(ProjectInfoInputDto projectInfo) {
        this.input.put("projectInfo", projectInfo);
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

        private ProjectInfoInputDto projectInfo;

        public Builder() {
        }

        public Builder setProjectInfo(ProjectInfoInputDto projectInfo) {
            this.projectInfo = projectInfo;
            return this;
        }


        public UpdateProjectInfoMutationRequest build() {
            UpdateProjectInfoMutationRequest obj = new UpdateProjectInfoMutationRequest();
            obj.setProjectInfo(projectInfo);
            return obj;
        }

    }
}
