package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class UpdateDashboardCommentMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateDashboardComment";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateDashboardCommentMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
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

        private String id;
        private DashboardCommentInputDto dashboardComment;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDashboardComment(DashboardCommentInputDto dashboardComment) {
            this.dashboardComment = dashboardComment;
            return this;
        }


        public UpdateDashboardCommentMutationRequest build() {
            UpdateDashboardCommentMutationRequest obj = new UpdateDashboardCommentMutationRequest();
            obj.setId(id);
            obj.setDashboardComment(dashboardComment);
            return obj;
        }

    }
}
