package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 根据关键字查询在dataCenter级别下分类信息, resourceType: tag | userVariable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterSearchCategoriesQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "dataCenterSearchCategories";

    private Map<String, Object> input = new LinkedHashMap<>();

    public DataCenterSearchCategoriesQueryRequest() {
    }

    public void setQ(String q) {
        this.input.put("q", q);
    }

    public void setResourceType(String resourceType) {
        this.input.put("resourceType", resourceType);
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

        private String q;
        private String resourceType;

        public Builder() {
        }

        public Builder setQ(String q) {
            this.q = q;
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }


        public DataCenterSearchCategoriesQueryRequest build() {
            DataCenterSearchCategoriesQueryRequest obj = new DataCenterSearchCategoriesQueryRequest();
            obj.setQ(q);
            obj.setResourceType(resourceType);
            return obj;
        }

    }
}
