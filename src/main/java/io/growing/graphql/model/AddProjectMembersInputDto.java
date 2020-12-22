package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class AddProjectMembersInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> userIds;
    @javax.validation.constraints.NotNull
    private String projectRoleId;

    public AddProjectMembersInputDto() {
    }

    public AddProjectMembersInputDto(String projectId, java.util.List<String> userIds, String projectRoleId) {
        this.projectId = projectId;
        this.userIds = userIds;
        this.projectRoleId = projectRoleId;
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

    public String getProjectRoleId() {
        return projectRoleId;
    }
    public void setProjectRoleId(String projectRoleId) {
        this.projectRoleId = projectRoleId;
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
        if (projectRoleId != null) {
            joiner.add("projectRoleId: " + GraphQLRequestSerializer.getEntry(projectRoleId));
        }
        return joiner.toString();
    }

    public static AddProjectMembersInputDto.Builder builder() {
        return new AddProjectMembersInputDto.Builder();
    }

    public static class Builder {

        private String projectId;
        private java.util.List<String> userIds;
        private String projectRoleId;

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

        public Builder setProjectRoleId(String projectRoleId) {
            this.projectRoleId = projectRoleId;
            return this;
        }


        public AddProjectMembersInputDto build() {
            return new AddProjectMembersInputDto(projectId, userIds, projectRoleId);
        }

    }
}
