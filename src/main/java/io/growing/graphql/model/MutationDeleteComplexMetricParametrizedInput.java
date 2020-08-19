package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field deleteComplexMetric in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationDeleteComplexMetricParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;

    public MutationDeleteComplexMetricParametrizedInput() {
    }

    public MutationDeleteComplexMetricParametrizedInput(String id) {
        this.id = id;
    }

    public MutationDeleteComplexMetricParametrizedInput id(String id) {
        this.id = id;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        return joiner.toString();
    }

}
