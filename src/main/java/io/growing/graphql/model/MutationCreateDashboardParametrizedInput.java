package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createDashboard in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateDashboardParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private DashboardInputDto dashboard;

    public MutationCreateDashboardParametrizedInput() {
    }

    public MutationCreateDashboardParametrizedInput(String projectId, DashboardInputDto dashboard) {
        this.projectId = projectId;
        this.dashboard = dashboard;
    }

    public MutationCreateDashboardParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateDashboardParametrizedInput dashboard(DashboardInputDto dashboard) {
        this.dashboard = dashboard;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (dashboard != null) {
            joiner.add("dashboard: " + GraphQLRequestSerializer.getEntry(dashboard));
        }
        return joiner.toString();
    }

}
