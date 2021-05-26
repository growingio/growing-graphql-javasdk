package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据中心 创建打点事件
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateDataCenterCustomEventMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createDataCenterCustomEvent";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateDataCenterCustomEventMutationRequest() {
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


        public CreateDataCenterCustomEventMutationRequest build() {
            CreateDataCenterCustomEventMutationRequest obj = new CreateDataCenterCustomEventMutationRequest();
            obj.setCustomEvent(customEvent);
            return obj;
        }

    }
}
