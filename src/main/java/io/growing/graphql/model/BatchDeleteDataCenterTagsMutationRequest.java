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
public class BatchDeleteDataCenterTagsMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "batchDeleteDataCenterTags";

    private Map<String, Object> input = new LinkedHashMap<>();

    public BatchDeleteDataCenterTagsMutationRequest() {
    }

    public void setIds(java.util.List<String> ids) {
        this.input.put("ids", ids);
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

        private java.util.List<String> ids;

        public Builder() {
        }

        public Builder setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }


        public BatchDeleteDataCenterTagsMutationRequest build() {
            BatchDeleteDataCenterTagsMutationRequest obj = new BatchDeleteDataCenterTagsMutationRequest();
            obj.setIds(ids);
            return obj;
        }

    }
}
