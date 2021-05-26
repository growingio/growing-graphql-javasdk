package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据中心 更新物品模型
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateDataCenterItemModelMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateDataCenterItemModel";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateDataCenterItemModelMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setItemModel(ItemModelInputDto itemModel) {
        this.input.put("itemModel", itemModel);
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
        private ItemModelInputDto itemModel;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setItemModel(ItemModelInputDto itemModel) {
            this.itemModel = itemModel;
            return this;
        }


        public UpdateDataCenterItemModelMutationRequest build() {
            UpdateDataCenterItemModelMutationRequest obj = new UpdateDataCenterItemModelMutationRequest();
            obj.setId(id);
            obj.setItemModel(itemModel);
            return obj;
        }

    }
}
