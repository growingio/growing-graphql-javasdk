package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field simpleEvents in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class QuerySimpleEventsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String elementId;

    public QuerySimpleEventsParametrizedInput() {
    }

    public QuerySimpleEventsParametrizedInput(String elementId) {
        this.elementId = elementId;
    }

    public QuerySimpleEventsParametrizedInput elementId(String elementId) {
        this.elementId = elementId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (elementId != null) {
            joiner.add("elementId: " + GraphQLRequestSerializer.getEntry(elementId));
        }
        return joiner.toString();
    }

}
