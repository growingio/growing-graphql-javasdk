package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class BatchUpdateDataCenterResourceAclMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "batchUpdateDataCenterResourceAcl";

    private Map<String, Object> input = new LinkedHashMap<>();

    public BatchUpdateDataCenterResourceAclMutationRequest() {
    }

    public void setResourceType(String resourceType) {
        this.input.put("resourceType", resourceType);
    }

    public void setResourceIds(java.util.List<String> resourceIds) {
        this.input.put("resourceIds", resourceIds);
    }

    public void setReaders(java.util.List<String> readers) {
        this.input.put("readers", readers);
    }

    public void setEditors(java.util.List<String> editors) {
        this.input.put("editors", editors);
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
        private java.util.List<String> resourceIds;
        private java.util.List<String> readers;
        private java.util.List<String> editors;
        private String projectId;

        public Builder() {
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }

        public Builder setReaders(java.util.List<String> readers) {
            this.readers = readers;
            return this;
        }

        public Builder setEditors(java.util.List<String> editors) {
            this.editors = editors;
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }


        public BatchUpdateDataCenterResourceAclMutationRequest build() {
            BatchUpdateDataCenterResourceAclMutationRequest obj = new BatchUpdateDataCenterResourceAclMutationRequest();
            obj.setResourceType(resourceType);
            obj.setResourceIds(resourceIds);
            obj.setReaders(readers);
            obj.setEditors(editors);
            obj.setProjectId(projectId);
            return obj;
        }

    }
}
