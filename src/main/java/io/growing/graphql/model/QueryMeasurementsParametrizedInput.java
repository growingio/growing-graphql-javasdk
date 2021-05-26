package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field measurements in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryMeasurementsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    private java.util.List<String> t;
    private String q;
    private String c;
    private String f;

    public QueryMeasurementsParametrizedInput() {
    }

    public QueryMeasurementsParametrizedInput(String projectId, java.util.List<String> t, String q, String c, String f) {
        this.projectId = projectId;
        this.t = t;
        this.q = q;
        this.c = c;
        this.f = f;
    }

    public QueryMeasurementsParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
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

    public QueryMeasurementsParametrizedInput f(String f) {
        this.f = f;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (t != null) {
            joiner.add("t: " + GraphQLRequestSerializer.getEntry(t));
        }
        if (q != null) {
            joiner.add("q: " + GraphQLRequestSerializer.getEntry(q));
        }
        if (c != null) {
            joiner.add("c: " + GraphQLRequestSerializer.getEntry(c));
        }
        if (f != null) {
            joiner.add("f: " + GraphQLRequestSerializer.getEntry(f));
        }
        return joiner.toString();
    }

}
