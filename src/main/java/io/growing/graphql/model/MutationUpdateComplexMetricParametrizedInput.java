package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateComplexMetric in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationUpdateComplexMetricParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private ComplexMetricInputDto complexMetric;

    public MutationUpdateComplexMetricParametrizedInput() {
    }

    public MutationUpdateComplexMetricParametrizedInput(String projectId, String id, ComplexMetricInputDto complexMetric) {
        this.projectId = projectId;
        this.id = id;
        this.complexMetric = complexMetric;
    }

    public MutationUpdateComplexMetricParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationUpdateComplexMetricParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateComplexMetricParametrizedInput complexMetric(ComplexMetricInputDto complexMetric) {
        this.complexMetric = complexMetric;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (complexMetric != null) {
            joiner.add("complexMetric: " + GraphQLRequestSerializer.getEntry(complexMetric));
        }
        return joiner.toString();
    }

}
