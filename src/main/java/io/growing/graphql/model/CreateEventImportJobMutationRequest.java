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
public class CreateEventImportJobMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createEventImportJob";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateEventImportJobMutationRequest() {
    }

    public void setTunnelId(String tunnelId) {
        this.input.put("tunnelId", tunnelId);
    }

    public void setTimeRange(String timeRange) {
        this.input.put("timeRange", timeRange);
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

        private String tunnelId;
        private String timeRange;

        public Builder() {
        }

        public Builder setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }


        public CreateEventImportJobMutationRequest build() {
            CreateEventImportJobMutationRequest obj = new CreateEventImportJobMutationRequest();
            obj.setTunnelId(tunnelId);
            obj.setTimeRange(timeRange);
            return obj;
        }

    }
}
