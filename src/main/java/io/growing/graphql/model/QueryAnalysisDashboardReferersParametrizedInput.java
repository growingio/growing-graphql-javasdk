package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field analysisDashboardReferers in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryAnalysisDashboardReferersParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String resourceType;
    @javax.validation.constraints.NotNull
    private String resourceId;

    public QueryAnalysisDashboardReferersParametrizedInput() {
    }

    public QueryAnalysisDashboardReferersParametrizedInput(String projectId, String resourceType, String resourceId) {
        this.projectId = projectId;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
    }

    public QueryAnalysisDashboardReferersParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryAnalysisDashboardReferersParametrizedInput resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public QueryAnalysisDashboardReferersParametrizedInput resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
        }
        if (resourceId != null) {
            joiner.add("resourceId: " + GraphQLRequestSerializer.getEntry(resourceId));
        }
        return joiner.toString();
    }

}
