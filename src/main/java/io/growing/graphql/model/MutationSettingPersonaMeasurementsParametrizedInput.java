package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field settingPersonaMeasurements in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationSettingPersonaMeasurementsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private java.util.List<MeasurementInputDto> measurements;

    public MutationSettingPersonaMeasurementsParametrizedInput() {
    }

    public MutationSettingPersonaMeasurementsParametrizedInput(java.util.List<MeasurementInputDto> measurements) {
        this.measurements = measurements;
    }

    public MutationSettingPersonaMeasurementsParametrizedInput measurements(java.util.List<MeasurementInputDto> measurements) {
        this.measurements = measurements;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (measurements != null) {
            joiner.add("measurements: " + GraphQLRequestSerializer.getEntry(measurements));
        }
        return joiner.toString();
    }

}
