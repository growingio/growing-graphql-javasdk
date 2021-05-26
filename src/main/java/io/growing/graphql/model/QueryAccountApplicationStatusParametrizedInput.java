package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field accountApplicationStatus in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryAccountApplicationStatusParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String identity;

    public QueryAccountApplicationStatusParametrizedInput() {
    }

    public QueryAccountApplicationStatusParametrizedInput(String identity) {
        this.identity = identity;
    }

    public QueryAccountApplicationStatusParametrizedInput identity(String identity) {
        this.identity = identity;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (identity != null) {
            joiner.add("identity: " + GraphQLRequestSerializer.getEntry(identity));
        }
        return joiner.toString();
    }

}
