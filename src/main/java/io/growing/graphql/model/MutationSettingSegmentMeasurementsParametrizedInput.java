package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field settingSegmentMeasurements in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class MutationSettingSegmentMeasurementsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private SettingSegmentMeasurementPolicyDto policy;
    @javax.validation.constraints.NotNull
    private java.util.List<MeasurementInputDto> measurements;
    private String id;

    public MutationSettingSegmentMeasurementsParametrizedInput() {
    }

    public MutationSettingSegmentMeasurementsParametrizedInput(SettingSegmentMeasurementPolicyDto policy, java.util.List<MeasurementInputDto> measurements, String id) {
        this.policy = policy;
        this.measurements = measurements;
        this.id = id;
    }

    public MutationSettingSegmentMeasurementsParametrizedInput policy(SettingSegmentMeasurementPolicyDto policy) {
        this.policy = policy;
        return this;
    }

    public MutationSettingSegmentMeasurementsParametrizedInput measurements(java.util.List<MeasurementInputDto> measurements) {
        this.measurements = measurements;
        return this;
    }

    public MutationSettingSegmentMeasurementsParametrizedInput id(String id) {
        this.id = id;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (policy != null) {
            joiner.add("policy: " + GraphQLRequestSerializer.getEntry(policy));
        }
        if (measurements != null) {
            joiner.add("measurements: " + GraphQLRequestSerializer.getEntry(measurements));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        return joiner.toString();
    }

}
