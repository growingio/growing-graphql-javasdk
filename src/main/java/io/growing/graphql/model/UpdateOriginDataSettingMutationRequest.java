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
public class UpdateOriginDataSettingMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateOriginDataSetting";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateOriginDataSettingMutationRequest() {
    }

    public void setOriginDatas(java.util.List<OriginDataSettingInputDto> originDatas) {
        this.input.put("originDatas", originDatas);
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

        private java.util.List<OriginDataSettingInputDto> originDatas;

        public Builder() {
        }

        public Builder setOriginDatas(java.util.List<OriginDataSettingInputDto> originDatas) {
            this.originDatas = originDatas;
            return this;
        }


        public UpdateOriginDataSettingMutationRequest build() {
            UpdateOriginDataSettingMutationRequest obj = new UpdateOriginDataSettingMutationRequest();
            obj.setOriginDatas(originDatas);
            return obj;
        }

    }
}
