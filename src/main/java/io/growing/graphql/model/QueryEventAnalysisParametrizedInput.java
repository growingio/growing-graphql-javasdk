package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field eventAnalysis in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryEventAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;
    private String dashboardId;

    public QueryEventAnalysisParametrizedInput() {
    }

    public QueryEventAnalysisParametrizedInput(String projectId, String id, String dashboardId) {
        this.projectId = projectId;
        this.id = id;
        this.dashboardId = dashboardId;
    }

    public QueryEventAnalysisParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryEventAnalysisParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public QueryEventAnalysisParametrizedInput dashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (dashboardId != null) {
            joiner.add("dashboardId: " + GraphQLRequestSerializer.getEntry(dashboardId));
        }
        return joiner.toString();
    }

}
