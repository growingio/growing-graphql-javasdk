package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field analysisDashboardReferers in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:35+0800"
)
public class QueryAnalysisDashboardReferersParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String resourceType;
    @javax.validation.constraints.NotNull
    private String resourceId;

    public QueryAnalysisDashboardReferersParametrizedInput() {
    }

    public QueryAnalysisDashboardReferersParametrizedInput(String resourceType, String resourceId) {
        this.resourceType = resourceType;
        this.resourceId = resourceId;
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
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
        }
        if (resourceId != null) {
            joiner.add("resourceId: " + GraphQLRequestSerializer.getEntry(resourceId));
        }
        return joiner.toString();
    }

}
