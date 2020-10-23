package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createComplexMetric in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class MutationCreateComplexMetricParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private ComplexMetricInputDto complexMetric;

    public MutationCreateComplexMetricParametrizedInput() {
    }

    public MutationCreateComplexMetricParametrizedInput(ComplexMetricInputDto complexMetric) {
        this.complexMetric = complexMetric;
    }

    public MutationCreateComplexMetricParametrizedInput complexMetric(ComplexMetricInputDto complexMetric) {
        this.complexMetric = complexMetric;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (complexMetric != null) {
            joiner.add("complexMetric: " + GraphQLRequestSerializer.getEntry(complexMetric));
        }
        return joiner.toString();
    }

}
