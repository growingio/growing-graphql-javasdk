package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateWebHookStatusMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateWebHookStatus";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateWebHookStatusMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setStatus(String status) {
        this.input.put("status", status);
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
        private String status;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }


        public UpdateWebHookStatusMutationRequest build() {
            UpdateWebHookStatusMutationRequest obj = new UpdateWebHookStatusMutationRequest();
            obj.setId(id);
            obj.setStatus(status);
            return obj;
        }

    }
}
