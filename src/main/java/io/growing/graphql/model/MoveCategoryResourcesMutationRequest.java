package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 向指定分类移动资源
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class MoveCategoryResourcesMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "moveCategoryResources";

    private Map<String, Object> input = new LinkedHashMap<>();

    public MoveCategoryResourcesMutationRequest() {
    }

    public void setCategoryId(String categoryId) {
        this.input.put("categoryId", categoryId);
    }

    public void setCategoryResources(java.util.List<CategoryResourceInputDto> categoryResources) {
        this.input.put("categoryResources", categoryResources);
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

        private String categoryId;
        private java.util.List<CategoryResourceInputDto> categoryResources;

        public Builder() {
        }

        public Builder setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setCategoryResources(java.util.List<CategoryResourceInputDto> categoryResources) {
            this.categoryResources = categoryResources;
            return this;
        }


        public MoveCategoryResourcesMutationRequest build() {
            MoveCategoryResourcesMutationRequest obj = new MoveCategoryResourcesMutationRequest();
            obj.setCategoryId(categoryId);
            obj.setCategoryResources(categoryResources);
            return obj;
        }

    }
}
