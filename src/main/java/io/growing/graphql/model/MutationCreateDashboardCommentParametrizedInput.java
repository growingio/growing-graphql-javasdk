package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createDashboardComment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class MutationCreateDashboardCommentParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private DashboardCommentInputDto dashboardComment;

    public MutationCreateDashboardCommentParametrizedInput() {
    }

    public MutationCreateDashboardCommentParametrizedInput(DashboardCommentInputDto dashboardComment) {
        this.dashboardComment = dashboardComment;
    }

    public MutationCreateDashboardCommentParametrizedInput dashboardComment(DashboardCommentInputDto dashboardComment) {
        this.dashboardComment = dashboardComment;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (dashboardComment != null) {
            joiner.add("dashboardComment: " + GraphQLRequestSerializer.getEntry(dashboardComment));
        }
        return joiner.toString();
    }

}
