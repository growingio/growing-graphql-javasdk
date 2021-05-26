package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dataCenterInsightDimensions in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryDataCenterInsightDimensionsParametrizedInput implements GraphQLParametrizedInput {

    private java.util.List<MeasurementInputDto> measurements;
    private java.util.List<String> targetUsers;

    public QueryDataCenterInsightDimensionsParametrizedInput() {
    }

    public QueryDataCenterInsightDimensionsParametrizedInput(java.util.List<MeasurementInputDto> measurements, java.util.List<String> targetUsers) {
        this.measurements = measurements;
        this.targetUsers = targetUsers;
    }

    public QueryDataCenterInsightDimensionsParametrizedInput measurements(java.util.List<MeasurementInputDto> measurements) {
        this.measurements = measurements;
        return this;
    }

    public QueryDataCenterInsightDimensionsParametrizedInput targetUsers(java.util.List<String> targetUsers) {
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
