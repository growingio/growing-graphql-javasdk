package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createDashboardComment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateDashboardCommentParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private DashboardCommentInputDto dashboardComment;

    public MutationCreateDashboardCommentParametrizedInput() {
    }

    public MutationCreateDashboardCommentParametrizedInput(String projectId, DashboardCommentInputDto dashboardComment) {
        this.projectId = projectId;
        this.dashboardComment = dashboardComment;
    }

    public MutationCreateDashboardCommentParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateDashboardCommentParametrizedInput dashboardComment(DashboardCommentInputDto dashboardComment) {
        this.dashboardComment = dashboardComment;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (dashboardComment != null) {
            joiner.add("dashboardComment: " + GraphQLRequestSerializer.getEntry(dashboardComment));
        }
        return joiner.toString();
    }

}
