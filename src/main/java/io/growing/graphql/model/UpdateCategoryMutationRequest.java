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
public class UpdateCategoryMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateCategory";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateCategoryMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setCategory(CategoryInputDto category) {
        this.input.put("category", category);
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
        private CategoryInputDto category;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setCategory(CategoryInputDto category) {
            this.category = category;
            return this;
        }


        public UpdateCategoryMutationRequest build() {
            UpdateCategoryMutationRequest obj = new UpdateCategoryMutationRequest();
            obj.setId(id);
            obj.setCategory(category);
            return obj;
        }

    }
}
