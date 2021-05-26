package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field segmentMeasurements in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QuerySegmentMeasurementsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private SettingSegmentMeasurementPolicyDto policy;
    private String id;

    public QuerySegmentMeasurementsParametrizedInput() {
    }

    public QuerySegmentMeasurementsParametrizedInput(String projectId, SettingSegmentMeasurementPolicyDto policy, String id) {
        this.projectId = projectId;
        this.policy = policy;
        this.id = id;
    }

    public QuerySegmentMeasurementsParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
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
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (policy != null) {
            joiner.add("policy: " + GraphQLRequestSerializer.getEntry(policy));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        return joiner.toString();
    }

}
