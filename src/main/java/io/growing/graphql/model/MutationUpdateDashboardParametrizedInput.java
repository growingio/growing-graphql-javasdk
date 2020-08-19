package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateDashboard in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationUpdateDashboardParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private DashboardInputDto dashboard;

    public MutationUpdateDashboardParametrizedInput() {
    }

    public MutationUpdateDashboardParametrizedInput(String id, DashboardInputDto dashboard) {
        this.id = id;
        this.dashboard = dashboard;
    }

    public MutationUpdateDashboardParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateDashboardParametrizedInput dashboard(DashboardInputDto dashboard) {
        this.dashboard = dashboard;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (dashboard != null) {
            joiner.add("dashboard: " + GraphQLRequestSerializer.getEntry(dashboard));
        }
        return joiner.toString();
    }

}
