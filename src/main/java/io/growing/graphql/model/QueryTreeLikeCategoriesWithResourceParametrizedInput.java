package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field treeLikeCategoriesWithResource in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryTreeLikeCategoriesWithResourceParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String resourceType;

    public QueryTreeLikeCategoriesWithResourceParametrizedInput() {
    }

    public QueryTreeLikeCategoriesWithResourceParametrizedInput(String projectId, String resourceType) {
        this.projectId = projectId;
        this.resourceType = resourceType;
    }

    public QueryTreeLikeCategoriesWithResourceParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryTreeLikeCategoriesWithResourceParametrizedInput resourceType(String resourceType) {
        this.resourceType = resourceType;
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
        return joiner.toString();
    }

}
