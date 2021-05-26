package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 更新水印配置
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateWaterMarkSettingMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateWaterMarkSetting";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateWaterMarkSettingMutationRequest() {
    }

    public void setInput(UpdateWaterMarkSettingInputDto input) {
        this.input.put("input", input);
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

        private UpdateWaterMarkSettingInputDto input;

        public Builder() {
        }

        public Builder setInput(UpdateWaterMarkSettingInputDto input) {
            this.input = input;
            return this;
        }


        public UpdateWaterMarkSettingMutationRequest build() {
            UpdateWaterMarkSettingMutationRequest obj = new UpdateWaterMarkSettingMutationRequest();
            obj.setInput(input);
            return obj;
        }

    }
}
