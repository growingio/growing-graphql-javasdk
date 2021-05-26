package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 根据资源类型查询未分类的资源列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DefaultCategoryQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "defaultCategory";

    private Map<String, Object> input = new LinkedHashMap<>();

    public DefaultCategoryQueryRequest() {
    }

    public void setResourceType(String resourceType) {
        this.input.put("resourceType", resourceType);
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
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
        private String projectId;

        public Builder() {
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }


        public DefaultCategoryQueryRequest build() {
            DefaultCategoryQueryRequest obj = new DefaultCategoryQueryRequest();
            obj.setResourceType(resourceType);
            obj.setProjectId(projectId);
            return obj;
        }

    }
}
