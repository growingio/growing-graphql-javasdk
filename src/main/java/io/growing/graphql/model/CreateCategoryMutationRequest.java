package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建分类
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateCategoryMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createCategory";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateCategoryMutationRequest() {
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

        private CategoryInputDto category;

        public Builder() {
        }

        public Builder setCategory(CategoryInputDto category) {
            this.category = category;
            return this;
        }


        public CreateCategoryMutationRequest build() {
            CreateCategoryMutationRequest obj = new CreateCategoryMutationRequest();
            obj.setCategory(category);
            return obj;
        }

    }
}
