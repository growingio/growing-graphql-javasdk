package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field verifyProjectAi in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class QueryVerifyProjectAiParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String ai;

    public QueryVerifyProjectAiParametrizedInput() {
    }

    public QueryVerifyProjectAiParametrizedInput(String ai) {
        this.ai = ai;
    }

    public QueryVerifyProjectAiParametrizedInput ai(String ai) {
        this.ai = ai;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (ai != null) {
            joiner.add("ai: " + GraphQLRequestSerializer.getEntry(ai));
        }
        return joiner.toString();
    }

}
