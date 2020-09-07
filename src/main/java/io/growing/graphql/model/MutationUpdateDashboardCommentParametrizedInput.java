package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateDashboardComment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class MutationUpdateDashboardCommentParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private DashboardCommentInputDto dashboardComment;

    public MutationUpdateDashboardCommentParametrizedInput() {
    }

    public MutationUpdateDashboardCommentParametrizedInput(String id, DashboardCommentInputDto dashboardComment) {
        this.id = id;
        this.dashboardComment = dashboardComment;
    }

    public MutationUpdateDashboardCommentParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateDashboardCommentParametrizedInput dashboardComment(DashboardCommentInputDto dashboardComment) {
        this.dashboardComment = dashboardComment;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (dashboardComment != null) {
            joiner.add("dashboardComment: " + GraphQLRequestSerializer.getEntry(dashboardComment));
        }
        return joiner.toString();
    }

}
