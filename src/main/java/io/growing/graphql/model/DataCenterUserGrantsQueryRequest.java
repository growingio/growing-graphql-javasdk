package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterUserGrantsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "dataCenterUserGrants";

    private Map<String, Object> input = new LinkedHashMap<>();

    public DataCenterUserGrantsQueryRequest() {
    }

    public void setResourceType(String resourceType) {
        this.input.put("resourceType", resourceType);
    }

    public void setResourceId(java.lang.Long resourceId) {
        this.input.put("resourceId", resourceId);
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
        private java.lang.Long resourceId;

        public Builder() {
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceId(java.lang.Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }


        public DataCenterUserGrantsQueryRequest build() {
            DataCenterUserGrantsQueryRequest obj = new DataCenterUserGrantsQueryRequest();
            obj.setResourceType(resourceType);
            obj.setResourceId(resourceId);
            return obj;
        }

    }
}
