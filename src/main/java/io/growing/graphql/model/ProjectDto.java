package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class ProjectDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    private String creator;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String owner;
    @javax.validation.constraints.NotNull
    private String ownerId;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectMemberDto> projectMembers;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectRoleDto> projectRoles;

    public ProjectDto() {
    }

    public ProjectDto(String id, String name, String description, String creator, String creatorId, java.time.ZonedDateTime createdAt, String owner, String ownerId, java.util.List<ProjectMemberDto> projectMembers, java.util.List<ProjectRoleDto> projectRoles) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creator = creator;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.owner = owner;
        this.ownerId = ownerId;
        this.projectMembers = projectMembers;
        this.projectRoles = projectRoles;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public java.util.List<ProjectMemberDto> getProjectMembers() {
        return projectMembers;
    }
    public void setProjectMembers(java.util.List<ProjectMemberDto> projectMembers) {
        this.projectMembers = projectMembers;
    }

    public java.util.List<ProjectRoleDto> getProjectRoles() {
        return projectRoles;
    }
    public void setProjectRoles(java.util.List<ProjectRoleDto> projectRoles) {
        this.projectRoles = projectRoles;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        if (creatorId != null) {
            joiner.add("creatorId: " + GraphQLRequestSerializer.getEntry(creatorId));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (owner != null) {
            joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner));
        }
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId));
        }
        if (projectMembers != null) {
            joiner.add("projectMembers: " + GraphQLRequestSerializer.getEntry(projectMembers));
        }
        if (projectRoles != null) {
            joiner.add("projectRoles: " + GraphQLRequestSerializer.getEntry(projectRoles));
        }
        return joiner.toString();
    }

    public static ProjectDto.Builder builder() {
        return new ProjectDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private String creator;
        private String creatorId;
        private java.time.ZonedDateTime createdAt;
        private String owner;
        private String ownerId;
        private java.util.List<ProjectMemberDto> projectMembers;
        private java.util.List<ProjectRoleDto> projectRoles;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setCreator(String creator) {
            this.creator = creator;
            return this;
        }

        public Builder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setProjectMembers(java.util.List<ProjectMemberDto> projectMembers) {
            this.projectMembers = projectMembers;
            return this;
        }

        public Builder setProjectRoles(java.util.List<ProjectRoleDto> projectRoles) {
            this.projectRoles = projectRoles;
            return this;
        }


        public ProjectDto build() {
            return new ProjectDto(id, name, description, creator, creatorId, createdAt, owner, ownerId, projectMembers, projectRoles);
        }

    }
}
