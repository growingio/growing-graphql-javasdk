package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class SegmentMeasurementsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "segmentMeasurements";

    private Map<String, Object> input = new LinkedHashMap<>();

    public SegmentMeasurementsQueryRequest() {
    }

    public void setPolicy(SettingSegmentMeasurementPolicyDto policy) {
        this.input.put("policy", policy);
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private SettingSegmentMeasurementPolicyDto policy;
        private String id;

        public Builder() {
        }

        public Builder setPolicy(SettingSegmentMeasurementPolicyDto policy) {
            this.policy = policy;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }


        public SegmentMeasurementsQueryRequest build() {
            SegmentMeasurementsQueryRequest obj = new SegmentMeasurementsQueryRequest();
            obj.setPolicy(policy);
            obj.setId(id);
            return obj;
        }

    }
}
