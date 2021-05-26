package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field simpleEvents in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QuerySimpleEventsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String elementId;

    public QuerySimpleEventsParametrizedInput() {
    }

    public QuerySimpleEventsParametrizedInput(String projectId, String elementId) {
        this.projectId = projectId;
        this.elementId = elementId;
    }

    public QuerySimpleEventsParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QuerySimpleEventsParametrizedInput elementId(String elementId) {
        this.elementId = elementId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (elementId != null) {
            joiner.add("elementId: " + GraphQLRequestSerializer.getEntry(elementId));
        }
        return joiner.toString();
    }

}
