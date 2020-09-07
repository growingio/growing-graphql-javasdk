package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field segmentMeasurements in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class QuerySegmentMeasurementsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private SettingSegmentMeasurementPolicyDto policy;
    private String id;

    public QuerySegmentMeasurementsParametrizedInput() {
    }

    public QuerySegmentMeasurementsParametrizedInput(SettingSegmentMeasurementPolicyDto policy, String id) {
        this.policy = policy;
        this.id = id;
    }

    public QuerySegmentMeasurementsParametrizedInput policy(SettingSegmentMeasurementPolicyDto policy) {
        this.policy = policy;
        return this;
    }

    public QuerySegmentMeasurementsParametrizedInput id(String id) {
        this.id = id;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (policy != null) {
            joiner.add("policy: " + GraphQLRequestSerializer.getEntry(policy));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        return joiner.toString();
    }

}
