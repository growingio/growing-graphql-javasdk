package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createComplexMetric in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateComplexMetricParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private ComplexMetricInputDto complexMetric;

    public MutationCreateComplexMetricParametrizedInput() {
    }

    public MutationCreateComplexMetricParametrizedInput(String projectId, ComplexMetricInputDto complexMetric) {
        this.projectId = projectId;
        this.complexMetric = complexMetric;
    }

    public MutationCreateComplexMetricParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateComplexMetricParametrizedInput complexMetric(ComplexMetricInputDto complexMetric) {
        this.complexMetric = complexMetric;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (complexMetric != null) {
            joiner.add("complexMetric: " + GraphQLRequestSerializer.getEntry(complexMetric));
        }
        return joiner.toString();
    }

}
