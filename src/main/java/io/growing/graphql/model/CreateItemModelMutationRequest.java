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
public class CreateItemModelMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createItemModel";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateItemModelMutationRequest() {
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

        private ItemModelInputDto itemModel;

        public Builder() {
        }

        public Builder setItemModel(ItemModelInputDto itemModel) {
            this.itemModel = itemModel;
            return this;
        }


        public CreateItemModelMutationRequest build() {
            CreateItemModelMutationRequest obj = new CreateItemModelMutationRequest();
            obj.setItemModel(itemModel);
            return obj;
        }

    }
}
