package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field insightDimensions in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QueryInsightDimensionsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    private java.util.List<MeasurementInputDto> measurements;
    private java.util.List<String> targetUsers;

    public QueryInsightDimensionsParametrizedInput() {
    }

    public QueryInsightDimensionsParametrizedInput(String projectId, java.util.List<MeasurementInputDto> measurements, java.util.List<String> targetUsers) {
        this.projectId = projectId;
        this.measurements = measurements;
        this.targetUsers = targetUsers;
    }

    public QueryInsightDimensionsParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryInsightDimensionsParametrizedInput measurements(java.util.List<MeasurementInputDto> measurements) {
        this.measurements = measurements;
        return this;
    }

    public QueryInsightDimensionsParametrizedInput targetUsers(java.util.List<String> targetUsers) {
        this.targetUsers = targetUsers;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (measurements != null) {
            joiner.add("measurements: " + GraphQLRequestSerializer.getEntry(measurements));
        }
        if (targetUsers != null) {
            joiner.add("targetUsers: " + GraphQLRequestSerializer.getEntry(targetUsers));
        }
        return joiner.toString();
    }

}
