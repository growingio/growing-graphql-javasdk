package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MemberDto implements java.io.Serializable, EntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    private String name;
    @javax.validation.constraints.NotNull
    private String source;
    private String avatar;
    private String email;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String phoneNumber;
    private DepartmentDto directDepartment;
    private String identity;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectDto> enterableProjects;
    @javax.validation.constraints.NotNull
    private DataCenterRoleDto dataCenterRole;
    private java.time.ZonedDateTime lastVisitAt;
    private String creator;

    public MemberDto() {
    }

    public MemberDto(String id, String name, String source, String avatar, String email, java.time.ZonedDateTime createdAt, String phoneNumber, DepartmentDto directDepartment, String identity, java.util.List<ProjectDto> enterableProjects, DataCenterRoleDto dataCenterRole, java.time.ZonedDateTime lastVisitAt, String creator) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.avatar = avatar;
        this.email = email;
        this.createdAt = createdAt;
        this.phoneNumber = phoneNumber;
        this.directDepartment = directDepartment;
        this.identity = identity;
        this.enterableProjects = enterableProjects;
        this.dataCenterRole = dataCenterRole;
        this.lastVisitAt = lastVisitAt;
        this.creator = creator;
    }

    /**
     * 成员id
     */
    public String getId() {
        return id;
    }
    /**
     * 成员id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 成员名称
     */
    public String getName() {
        return name;
    }
    /**
     * 成员名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 创建方式：ldap, origin, oauth2, cas
     */
    public String getSource() {
        return source;
    }
    /**
     * 创建方式：ldap, origin, oauth2, cas
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 头像
     */
    public String getAvatar() {
        return avatar;
    }
    /**
     * 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * email地址
     */
    public String getEmail() {
        return email;
    }
    /**
     * email地址
     */
    public void setEmail(String email) {
        this.email = email;
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
     * 手机号码
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * 手机号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 直属部门
     */
    public DepartmentDto getDirectDepartment() {
        return directDepartment;
    }
    /**
     * 直属部门
     */
    public void setDirectDepartment(DepartmentDto directDepartment) {
        this.directDepartment = directDepartment;
    }

    /**
     * 唯一标识
     */
    public String getIdentity() {
        return identity;
    }
    /**
     * 唯一标识
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * 可访问的项目列表
     */
    public java.util.List<ProjectDto> getEnterableProjects() {
        return enterableProjects;
    }
    /**
     * 可访问的项目列表
     */
    public void setEnterableProjects(java.util.List<ProjectDto> enterableProjects) {
        this.enterableProjects = enterableProjects;
    }

    /**
     * 数据中心角色
     */
    public DataCenterRoleDto getDataCenterRole() {
        return dataCenterRole;
    }
    /**
     * 数据中心角色
     */
    public void setDataCenterRole(DataCenterRoleDto dataCenterRole) {
        this.dataCenterRole = dataCenterRole;
    }

    /**
     * 上次访问时间
     */
    public java.time.ZonedDateTime getLastVisitAt() {
        return lastVisitAt;
    }
    /**
     * 上次访问时间
     */
    public void setLastVisitAt(java.time.ZonedDateTime lastVisitAt) {
        this.lastVisitAt = lastVisitAt;
    }

    /**
     * 创建人
     */
    public String getCreator() {
        return creator;
    }
    /**
     * 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
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
        if (source != null) {
            joiner.add("source: " + GraphQLRequestSerializer.getEntry(source));
        }
        if (avatar != null) {
            joiner.add("avatar: " + GraphQLRequestSerializer.getEntry(avatar));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (phoneNumber != null) {
            joiner.add("phoneNumber: " + GraphQLRequestSerializer.getEntry(phoneNumber));
        }
        if (directDepartment != null) {
            joiner.add("directDepartment: " + GraphQLRequestSerializer.getEntry(directDepartment));
        }
        if (identity != null) {
            joiner.add("identity: " + GraphQLRequestSerializer.getEntry(identity));
        }
        if (enterableProjects != null) {
            joiner.add("enterableProjects: " + GraphQLRequestSerializer.getEntry(enterableProjects));
        }
        if (dataCenterRole != null) {
            joiner.add("dataCenterRole: " + GraphQLRequestSerializer.getEntry(dataCenterRole));
        }
        if (lastVisitAt != null) {
            joiner.add("lastVisitAt: " + GraphQLRequestSerializer.getEntry(lastVisitAt));
        }
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        return joiner.toString();
    }

    public static MemberDto.Builder builder() {
        return new MemberDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String source;
        private String avatar;
        private String email;
        private java.time.ZonedDateTime createdAt;
        private String phoneNumber;
        private DepartmentDto directDepartment;
        private String identity;
        private java.util.List<ProjectDto> enterableProjects;
        private DataCenterRoleDto dataCenterRole;
        private java.time.ZonedDateTime lastVisitAt;
        private String creator;

        public Builder() {
        }

        /**
         * 成员id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 成员名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 创建方式：ldap, origin, oauth2, cas
         */
        public Builder setSource(String source) {
            this.source = source;
            return this;
        }

        /**
         * 头像
         */
        public Builder setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * email地址
         */
        public Builder setEmail(String email) {
            this.email = email;
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
         * 手机号码
         */
        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * 直属部门
         */
        public Builder setDirectDepartment(DepartmentDto directDepartment) {
            this.directDepartment = directDepartment;
            return this;
        }

        /**
         * 唯一标识
         */
        public Builder setIdentity(String identity) {
            this.identity = identity;
            return this;
        }

        /**
         * 可访问的项目列表
         */
        public Builder setEnterableProjects(java.util.List<ProjectDto> enterableProjects) {
            this.enterableProjects = enterableProjects;
            return this;
        }

        /**
         * 数据中心角色
         */
        public Builder setDataCenterRole(DataCenterRoleDto dataCenterRole) {
            this.dataCenterRole = dataCenterRole;
            return this;
        }

        /**
         * 上次访问时间
         */
        public Builder setLastVisitAt(java.time.ZonedDateTime lastVisitAt) {
            this.lastVisitAt = lastVisitAt;
            return this;
        }

        /**
         * 创建人
         */
        public Builder setCreator(String creator) {
            this.creator = creator;
            return this;
        }


        public MemberDto build() {
            return new MemberDto(id, name, source, avatar, email, createdAt, phoneNumber, directDepartment, identity, enterableProjects, dataCenterRole, lastVisitAt, creator);
        }

    }
}
