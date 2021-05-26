package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 根据资源返回其所属分类
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterGetCategoryByResourceQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "dataCenterGetCategoryByResource";

    private Map<String, Object> input = new LinkedHashMap<>();

    public DataCenterGetCategoryByResourceQueryRequest() {
    }

    public void setCategoryResource(CategoryResourceInputDto categoryResource) {
        this.input.put("categoryResource", categoryResource);
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

        private CategoryResourceInputDto categoryResource;

        public Builder() {
        }

        public Builder setCategoryResource(CategoryResourceInputDto categoryResource) {
            this.categoryResource = categoryResource;
            return this;
        }


        public DataCenterGetCategoryByResourceQueryRequest build() {
            DataCenterGetCategoryByResourceQueryRequest obj = new DataCenterGetCategoryByResourceQueryRequest();
            obj.setCategoryResource(categoryResource);
            return obj;
        }

    }
}
