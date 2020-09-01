package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class UpdateResourceAclsMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateResourceAcls";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateResourceAclsMutationRequest() {
    }

    public void setResourceType(String resourceType) {
        this.input.put("resourceType", resourceType);
    }

    public void setResourceId(String resourceId) {
        this.input.put("resourceId", resourceId);
    }

    public void setAccessEntry(AccessEntryInputDto accessEntry) {
        this.input.put("accessEntry", accessEntry);
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
        private String resourceId;
        private AccessEntryInputDto accessEntry;

        public Builder() {
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setAccessEntry(AccessEntryInputDto accessEntry) {
            this.accessEntry = accessEntry;
            return this;
        }


        public UpdateResourceAclsMutationRequest build() {
            UpdateResourceAclsMutationRequest obj = new UpdateResourceAclsMutationRequest();
            obj.setResourceType(resourceType);
            obj.setResourceId(resourceId);
            obj.setAccessEntry(accessEntry);
            return obj;
        }

    }
}
