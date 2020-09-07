package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field measurements in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class QueryMeasurementsParametrizedInput implements GraphQLParametrizedInput {

    private java.util.List<String> t;
    private String q;
    private String c;

    public QueryMeasurementsParametrizedInput() {
    }

    public QueryMeasurementsParametrizedInput(java.util.List<String> t, String q, String c) {
        this.t = t;
        this.q = q;
        this.c = c;
    }

    public QueryMeasurementsParametrizedInput t(java.util.List<String> t) {
        this.t = t;
        return this;
    }

    public QueryMeasurementsParametrizedInput q(String q) {
        this.q = q;
        return this;
    }

    public QueryMeasurementsParametrizedInput c(String c) {
        this.c = c;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (t != null) {
            joiner.add("t: " + GraphQLRequestSerializer.getEntry(t));
        }
        if (q != null) {
            joiner.add("q: " + GraphQLRequestSerializer.getEntry(q));
        }
        if (c != null) {
            joiner.add("c: " + GraphQLRequestSerializer.getEntry(c));
        }
        return joiner.toString();
    }

}
