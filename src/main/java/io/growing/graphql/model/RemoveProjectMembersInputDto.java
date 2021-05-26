package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class RemoveProjectMembersInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> userIds;
    @javax.validation.constraints.NotNull
    private String transfereeId;

    public RemoveProjectMembersInputDto() {
    }

    public RemoveProjectMembersInputDto(String projectId, java.util.List<String> userIds, String transfereeId) {
        this.projectId = projectId;
        this.userIds = userIds;
        this.transfereeId = transfereeId;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public java.util.List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
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
        if (userIds != null) {
            joiner.add("userIds: " + GraphQLRequestSerializer.getEntry(userIds));
        }
        if (transfereeId != null) {
            joiner.add("transfereeId: " + GraphQLRequestSerializer.getEntry(transfereeId));
        }
        return joiner.toString();
    }

    public static RemoveProjectMembersInputDto.Builder builder() {
        return new RemoveProjectMembersInputDto.Builder();
    }

    public static class Builder {

        private String projectId;
        private java.util.List<String> userIds;
        private String transfereeId;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }

        public Builder setTransfereeId(String transfereeId) {
            this.transfereeId = transfereeId;
            return this;
        }


        public RemoveProjectMembersInputDto build() {
            return new RemoveProjectMembersInputDto(projectId, userIds, transfereeId);
        }

    }
}
