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
public class UpdateDataCenterInfoMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateDataCenterInfo";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateDataCenterInfoMutationRequest() {
    }

    public void setDataCenterInfo(DataCenterInfoInputDto dataCenterInfo) {
        this.input.put("dataCenterInfo", dataCenterInfo);
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

        private DataCenterInfoInputDto dataCenterInfo;

        public Builder() {
        }

        public Builder setDataCenterInfo(DataCenterInfoInputDto dataCenterInfo) {
            this.dataCenterInfo = dataCenterInfo;
            return this;
        }


        public UpdateDataCenterInfoMutationRequest build() {
            UpdateDataCenterInfoMutationRequest obj = new UpdateDataCenterInfoMutationRequest();
            obj.setDataCenterInfo(dataCenterInfo);
            return obj;
        }

    }
}
