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
public class CreateEventAnalysisMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createEventAnalysis";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateEventAnalysisMutationRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setEventAnalysis(EventAnalysisInputDto eventAnalysis) {
        this.input.put("eventAnalysis", eventAnalysis);
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
        private EventAnalysisInputDto eventAnalysis;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setEventAnalysis(EventAnalysisInputDto eventAnalysis) {
            this.eventAnalysis = eventAnalysis;
            return this;
        }


        public CreateEventAnalysisMutationRequest build() {
            CreateEventAnalysisMutationRequest obj = new CreateEventAnalysisMutationRequest();
            obj.setProjectId(projectId);
            obj.setEventAnalysis(eventAnalysis);
            return obj;
        }

    }
}
