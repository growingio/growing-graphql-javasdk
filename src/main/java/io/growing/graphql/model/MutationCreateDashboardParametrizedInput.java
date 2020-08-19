package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createDashboard in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationCreateDashboardParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private DashboardInputDto dashboard;

    public MutationCreateDashboardParametrizedInput() {
    }

    public MutationCreateDashboardParametrizedInput(DashboardInputDto dashboard) {
        this.dashboard = dashboard;
    }

    public MutationCreateDashboardParametrizedInput dashboard(DashboardInputDto dashboard) {
        this.dashboard = dashboard;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (dashboard != null) {
            joiner.add("dashboard: " + GraphQLRequestSerializer.getEntry(dashboard));
        }
        return joiner.toString();
    }

}
