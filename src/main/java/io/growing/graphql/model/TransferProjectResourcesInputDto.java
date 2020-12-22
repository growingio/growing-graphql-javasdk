package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class TransferProjectResourcesInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String transferorId;
    @javax.validation.constraints.NotNull
    private String transfereeId;

    public TransferProjectResourcesInputDto() {
    }

    public TransferProjectResourcesInputDto(String projectId, String transferorId, String transfereeId) {
        this.projectId = projectId;
        this.transferorId = transferorId;
        this.transfereeId = transfereeId;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTransferorId() {
        return transferorId;
    }
    public void setTransferorId(String transferorId) {
        this.transferorId = transferorId;
    }

    public String getTransfereeId() {
        return transfereeId;
    }
    public void setTransfereeId(String transfereeId) {
        this.transfereeId = transfereeId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (transferorId != null) {
            joiner.add("transferorId: " + GraphQLRequestSerializer.getEntry(transferorId));
        }
        if (transfereeId != null) {
            joiner.add("transfereeId: " + GraphQLRequestSerializer.getEntry(transfereeId));
        }
        return joiner.toString();
    }

    public static TransferProjectResourcesInputDto.Builder builder() {
        return new TransferProjectResourcesInputDto.Builder();
    }

    public static class Builder {

        private String projectId;
        private String transferorId;
        private String transfereeId;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setTransferorId(String transferorId) {
            this.transferorId = transferorId;
            return this;
        }

        public Builder setTransfereeId(String transfereeId) {
            this.transfereeId = transfereeId;
            return this;
        }


        public TransferProjectResourcesInputDto build() {
            return new TransferProjectResourcesInputDto(projectId, transferorId, transfereeId);
        }

    }
}
