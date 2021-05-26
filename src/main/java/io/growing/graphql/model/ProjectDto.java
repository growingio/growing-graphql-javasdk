package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
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
    @javax.validation.constraints.NotNull
    private Integer projectMemberCount;

    public ProjectDto() {
    }

    public ProjectDto(String id, String name, String description, String creator, String creatorId, java.time.ZonedDateTime createdAt, String owner, String ownerId, java.util.List<ProjectMemberDto> projectMembers, java.util.List<ProjectRoleDto> projectRoles, Integer projectMemberCount) {
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
        this.projectMemberCount = projectMemberCount;
    }

    /**
     * 项目id
     */
    public String getId() {
        return id;
    }
    /**
     * 项目id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 项目名称
     */
    public String getName() {
        return name;
    }
    /**
     * 项目名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 项目描述信息
     */
    public String getDescription() {
        return description;
    }
    /**
     * 项目描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 创建者
     */
    public String getCreator() {
        return creator;
    }
    /**
     * 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 创建者id
     */
    public String getCreatorId() {
        return creatorId;
    }
    /**
     * 创建者id
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 创建时间
     */
    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    /**
     * 创建时间
     */
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 项目拥有者
     */
    public String getOwner() {
        return owner;
    }
    /**
     * 项目拥有者
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * 项目拥有者id
     */
    public String getOwnerId() {
        return ownerId;
    }
    /**
     * 项目拥有者id
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * 项目成员列表
     */
    public java.util.List<ProjectMemberDto> getProjectMembers() {
        return projectMembers;
    }
    /**
     * 项目成员列表
     */
    public void setProjectMembers(java.util.List<ProjectMemberDto> projectMembers) {
        this.projectMembers = projectMembers;
    }

    /**
     * 项目角色列表
     */
    public java.util.List<ProjectRoleDto> getProjectRoles() {
        return projectRoles;
    }
    /**
     * 项目角色列表
     */
    public void setProjectRoles(java.util.List<ProjectRoleDto> projectRoles) {
        this.projectRoles = projectRoles;
    }

    /**
     * 项目成员数量
     */
    public Integer getProjectMemberCount() {
        return projectMemberCount;
    }
    /**
     * 项目成员数量
     */
    public void setProjectMemberCount(Integer projectMemberCount) {
        this.projectMemberCount = projectMemberCount;
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
        if (projectMemberCount != null) {
            joiner.add("projectMemberCount: " + GraphQLRequestSerializer.getEntry(projectMemberCount));
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
        private Integer projectMemberCount;

        public Builder() {
        }

        /**
         * 项目id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 项目名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 项目描述信息
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * 创建者
         */
        public Builder setCreator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * 创建者id
         */
        public Builder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * 项目拥有者
         */
        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * 项目拥有者id
         */
        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * 项目成员列表
         */
        public Builder setProjectMembers(java.util.List<ProjectMemberDto> projectMembers) {
            this.projectMembers = projectMembers;
            return this;
        }

        /**
         * 项目角色列表
         */
        public Builder setProjectRoles(java.util.List<ProjectRoleDto> projectRoles) {
            this.projectRoles = projectRoles;
            return this;
        }

        /**
         * 项目成员数量
         */
        public Builder setProjectMemberCount(Integer projectMemberCount) {
            this.projectMemberCount = projectMemberCount;
            return this;
        }


        public ProjectDto build() {
            return new ProjectDto(id, name, description, creator, creatorId, createdAt, owner, ownerId, projectMembers, projectRoles, projectMemberCount);
        }

    }
}
