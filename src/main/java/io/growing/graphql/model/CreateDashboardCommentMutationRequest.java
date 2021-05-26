package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateDashboardCommentMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createDashboardComment";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateDashboardCommentMutationRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setDashboardComment(DashboardCommentInputDto dashboardComment) {
        this.input.put("dashboardComment", dashboardComment);
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
        private DashboardCommentInputDto dashboardComment;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setDashboardComment(DashboardCommentInputDto dashboardComment) {
            this.dashboardComment = dashboardComment;
            return this;
        }


        public CreateDashboardCommentMutationRequest build() {
            CreateDashboardCommentMutationRequest obj = new CreateDashboardCommentMutationRequest();
            obj.setProjectId(projectId);
            obj.setDashboardComment(dashboardComment);
            return obj;
        }

    }
}
