package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class ProjectRoleDto implements java.io.Serializable {

    private String id;
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<MemberDto> members;
    @javax.validation.constraints.NotNull
    private java.util.List<PermissionDto> permissions;
    private Boolean isSystem;
    private Boolean isRoot;
    private Boolean isTechSupport;

    public ProjectRoleDto() {
    }

    public ProjectRoleDto(String id, String name, String description, java.util.List<MemberDto> members, java.util.List<PermissionDto> permissions, Boolean isSystem, Boolean isRoot, Boolean isTechSupport) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.members = members;
        this.permissions = permissions;
        this.isSystem = isSystem;
        this.isRoot = isRoot;
        this.isTechSupport = isTechSupport;
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

    public java.util.List<MemberDto> getMembers() {
        return members;
    }
    public void setMembers(java.util.List<MemberDto> members) {
        this.members = members;
    }

    public java.util.List<PermissionDto> getPermissions() {
        return permissions;
    }
    public void setPermissions(java.util.List<PermissionDto> permissions) {
        this.permissions = permissions;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public Boolean getIsRoot() {
        return isRoot;
    }
    public void setIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
    }

    public Boolean getIsTechSupport() {
        return isTechSupport;
    }
    public void setIsTechSupport(Boolean isTechSupport) {
        this.isTechSupport = isTechSupport;
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
        if (members != null) {
            joiner.add("members: " + GraphQLRequestSerializer.getEntry(members));
        }
        if (permissions != null) {
            joiner.add("permissions: " + GraphQLRequestSerializer.getEntry(permissions));
        }
        if (isSystem != null) {
            joiner.add("isSystem: " + GraphQLRequestSerializer.getEntry(isSystem));
        }
        if (isRoot != null) {
            joiner.add("isRoot: " + GraphQLRequestSerializer.getEntry(isRoot));
        }
        if (isTechSupport != null) {
            joiner.add("isTechSupport: " + GraphQLRequestSerializer.getEntry(isTechSupport));
        }
        return joiner.toString();
    }

    public static ProjectRoleDto.Builder builder() {
        return new ProjectRoleDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private java.util.List<MemberDto> members;
        private java.util.List<PermissionDto> permissions;
        private Boolean isSystem;
        private Boolean isRoot;
        private Boolean isTechSupport;

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

        public Builder setMembers(java.util.List<MemberDto> members) {
            this.members = members;
            return this;
        }

        public Builder setPermissions(java.util.List<PermissionDto> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        public Builder setIsRoot(Boolean isRoot) {
            this.isRoot = isRoot;
            return this;
        }

        public Builder setIsTechSupport(Boolean isTechSupport) {
            this.isTechSupport = isTechSupport;
            return this;
        }


        public ProjectRoleDto build() {
            return new ProjectRoleDto(id, name, description, members, permissions, isSystem, isRoot, isTechSupport);
        }

    }
}
