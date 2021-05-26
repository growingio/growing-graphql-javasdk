package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterRoleDto implements java.io.Serializable {

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

    public DataCenterRoleDto() {
    }

    public DataCenterRoleDto(String id, String name, String description, java.util.List<MemberDto> members, java.util.List<PermissionDto> permissions, Boolean isSystem, Boolean isRoot, Boolean isTechSupport) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.members = members;
        this.permissions = permissions;
        this.isSystem = isSystem;
        this.isRoot = isRoot;
        this.isTechSupport = isTechSupport;
    }

    /**
     * 数据中心角色id
     */
    public String getId() {
        return id;
    }
    /**
     * 数据中心角色id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 角色名称
     */
    public String getName() {
        return name;
    }
    /**
     * 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 角色描述
     */
    public String getDescription() {
        return description;
    }
    /**
     * 角色描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 具备该角色的成员
     */
    public java.util.List<MemberDto> getMembers() {
        return members;
    }
    /**
     * 具备该角色的成员
     */
    public void setMembers(java.util.List<MemberDto> members) {
        this.members = members;
    }

    /**
     * 该角色具有的权限
     */
    public java.util.List<PermissionDto> getPermissions() {
        return permissions;
    }
    /**
     * 该角色具有的权限
     */
    public void setPermissions(java.util.List<PermissionDto> permissions) {
        this.permissions = permissions;
    }

    /**
     * 是否为系统资源
     */
    public Boolean getIsSystem() {
        return isSystem;
    }
    /**
     * 是否为系统资源
     */
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    /**
     * 是否为root角色
     */
    public Boolean getIsRoot() {
        return isRoot;
    }
    /**
     * 是否为root角色
     */
    public void setIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
    }

    /**
     * 是否为技术支持
     */
    public Boolean getIsTechSupport() {
        return isTechSupport;
    }
    /**
     * 是否为技术支持
     */
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

    public static DataCenterRoleDto.Builder builder() {
        return new DataCenterRoleDto.Builder();
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

        /**
         * 数据中心角色id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 角色名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 角色描述
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * 具备该角色的成员
         */
        public Builder setMembers(java.util.List<MemberDto> members) {
            this.members = members;
            return this;
        }

        /**
         * 该角色具有的权限
         */
        public Builder setPermissions(java.util.List<PermissionDto> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * 是否为系统资源
         */
        public Builder setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        /**
         * 是否为root角色
         */
        public Builder setIsRoot(Boolean isRoot) {
            this.isRoot = isRoot;
            return this;
        }

        /**
         * 是否为技术支持
         */
        public Builder setIsTechSupport(Boolean isTechSupport) {
            this.isTechSupport = isTechSupport;
            return this;
        }


        public DataCenterRoleDto build() {
            return new DataCenterRoleDto(id, name, description, members, permissions, isSystem, isRoot, isTechSupport);
        }

    }
}
