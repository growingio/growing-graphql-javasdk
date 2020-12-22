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
public class DeleteSubscriptionMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "deleteSubscription";

    private Map<String, Object> input = new LinkedHashMap<>();

    public DeleteSubscriptionMutationRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setType(SubscriptionTypeDto type) {
        this.input.put("type", type);
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

        private String projectId;
        private SubscriptionTypeDto type;
        private String id;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setType(SubscriptionTypeDto type) {
            this.type = type;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }


        public DeleteSubscriptionMutationRequest build() {
            DeleteSubscriptionMutationRequest obj = new DeleteSubscriptionMutationRequest();
            obj.setProjectId(projectId);
            obj.setType(type);
            obj.setId(id);
            return obj;
        }

    }
}
