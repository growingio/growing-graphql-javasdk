package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class CreateFrequencyDrillDownSegmentSnapshotMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createFrequencyDrillDownSegmentSnapshot";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateFrequencyDrillDownSegmentSnapshotMutationRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setFrequencyDrillDownSegment(FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment) {
        this.input.put("frequencyDrillDownSegment", frequencyDrillDownSegment);
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

        private String projectId;
        private FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setFrequencyDrillDownSegment(FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment) {
            this.frequencyDrillDownSegment = frequencyDrillDownSegment;
            return this;
        }


        public CreateFrequencyDrillDownSegmentSnapshotMutationRequest build() {
            CreateFrequencyDrillDownSegmentSnapshotMutationRequest obj = new CreateFrequencyDrillDownSegmentSnapshotMutationRequest();
            obj.setProjectId(projectId);
            obj.setFrequencyDrillDownSegment(frequencyDrillDownSegment);
            return obj;
        }

    }
}
