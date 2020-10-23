package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class UpdateEventAnalysisMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateEventAnalysis";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateEventAnalysisMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
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

        private String id;
        private EventAnalysisInputDto eventAnalysis;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setEventAnalysis(EventAnalysisInputDto eventAnalysis) {
            this.eventAnalysis = eventAnalysis;
            return this;
        }


        public UpdateEventAnalysisMutationRequest build() {
            UpdateEventAnalysisMutationRequest obj = new UpdateEventAnalysisMutationRequest();
            obj.setId(id);
            obj.setEventAnalysis(eventAnalysis);
            return obj;
        }

    }
}
