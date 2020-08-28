package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field insightDimensions in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class QueryInsightDimensionsParametrizedInput implements GraphQLParametrizedInput {

    private java.util.List<MeasurementInputDto> measurements;
    private java.util.List<String> targetUsers;

    public QueryInsightDimensionsParametrizedInput() {
    }

    public QueryInsightDimensionsParametrizedInput(java.util.List<MeasurementInputDto> measurements, java.util.List<String> targetUsers) {
        this.measurements = measurements;
        this.targetUsers = targetUsers;
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
        if (measurements != null) {
            joiner.add("measurements: " + GraphQLRequestSerializer.getEntry(measurements));
        }
        if (targetUsers != null) {
            joiner.add("targetUsers: " + GraphQLRequestSerializer.getEntry(targetUsers));
        }
        return joiner.toString();
    }

}
