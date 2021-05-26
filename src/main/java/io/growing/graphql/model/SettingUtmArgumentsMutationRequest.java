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
public class SettingUtmArgumentsMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "settingUtmArguments";

    private Map<String, Object> input = new LinkedHashMap<>();

    public SettingUtmArgumentsMutationRequest() {
    }

    public void setUtmArguments(java.util.List<UtmArgumentInputDto> utmArguments) {
        this.input.put("utmArguments", utmArguments);
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

        private java.util.List<UtmArgumentInputDto> utmArguments;

        public Builder() {
        }

        public Builder setUtmArguments(java.util.List<UtmArgumentInputDto> utmArguments) {
            this.utmArguments = utmArguments;
            return this;
        }


        public SettingUtmArgumentsMutationRequest build() {
            SettingUtmArgumentsMutationRequest obj = new SettingUtmArgumentsMutationRequest();
            obj.setUtmArguments(utmArguments);
            return obj;
        }

    }
}
