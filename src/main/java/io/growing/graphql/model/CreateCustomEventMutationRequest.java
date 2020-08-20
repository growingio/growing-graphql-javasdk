package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class CreateCustomEventMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createCustomEvent";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateCustomEventMutationRequest() {
    }

    public void setCustomEvent(CustomEventInputDto customEvent) {
        this.input.put("customEvent", customEvent);
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

        private CustomEventInputDto customEvent;

        public Builder() {
        }

        public Builder setCustomEvent(CustomEventInputDto customEvent) {
            this.customEvent = customEvent;
            return this;
        }


        public CreateCustomEventMutationRequest build() {
            CreateCustomEventMutationRequest obj = new CreateCustomEventMutationRequest();
            obj.setCustomEvent(customEvent);
            return obj;
        }

    }
}
