package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field settingPersonaMeasurements in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationSettingPersonaMeasurementsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private java.util.List<MeasurementInputDto> measurements;

    public MutationSettingPersonaMeasurementsParametrizedInput() {
    }

    public MutationSettingPersonaMeasurementsParametrizedInput(String projectId, java.util.List<MeasurementInputDto> measurements) {
        this.projectId = projectId;
        this.measurements = measurements;
    }

    public MutationSettingPersonaMeasurementsParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationSettingPersonaMeasurementsParametrizedInput measurements(java.util.List<MeasurementInputDto> measurements) {
        this.measurements = measurements;
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
        return joiner.toString();
    }

}
