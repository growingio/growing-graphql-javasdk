package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 返回dataCenter级别未分类资源
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterDefaultCategoryQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "dataCenterDefaultCategory";

    private Map<String, Object> input = new LinkedHashMap<>();

    public DataCenterDefaultCategoryQueryRequest() {
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

        private String resourceType;

        public Builder() {
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }


        public DataCenterDefaultCategoryQueryRequest build() {
            DataCenterDefaultCategoryQueryRequest obj = new DataCenterDefaultCategoryQueryRequest();
            obj.setResourceType(resourceType);
            return obj;
        }

    }
}
