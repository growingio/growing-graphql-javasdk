package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class TransferProjectOwnerInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String oldOwnerId;
    @javax.validation.constraints.NotNull
    private String newOwnerId;

    public TransferProjectOwnerInputDto() {
    }

    public TransferProjectOwnerInputDto(String projectId, String oldOwnerId, String newOwnerId) {
        this.projectId = projectId;
        this.oldOwnerId = oldOwnerId;
        this.newOwnerId = newOwnerId;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getOldOwnerId() {
        return oldOwnerId;
    }
    public void setOldOwnerId(String oldOwnerId) {
        this.oldOwnerId = oldOwnerId;
    }

    public String getNewOwnerId() {
        return newOwnerId;
    }
    public void setNewOwnerId(String newOwnerId) {
        this.newOwnerId = newOwnerId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (oldOwnerId != null) {
            joiner.add("oldOwnerId: " + GraphQLRequestSerializer.getEntry(oldOwnerId));
        }
        if (newOwnerId != null) {
            joiner.add("newOwnerId: " + GraphQLRequestSerializer.getEntry(newOwnerId));
        }
        return joiner.toString();
    }

    public static TransferProjectOwnerInputDto.Builder builder() {
        return new TransferProjectOwnerInputDto.Builder();
    }

    public static class Builder {

        private String projectId;
        private String oldOwnerId;
        private String newOwnerId;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setOldOwnerId(String oldOwnerId) {
            this.oldOwnerId = oldOwnerId;
            return this;
        }

        public Builder setNewOwnerId(String newOwnerId) {
            this.newOwnerId = newOwnerId;
            return this;
        }


        public TransferProjectOwnerInputDto build() {
            return new TransferProjectOwnerInputDto(projectId, oldOwnerId, newOwnerId);
        }

    }
}
