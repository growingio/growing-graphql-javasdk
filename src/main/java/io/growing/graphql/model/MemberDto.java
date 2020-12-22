package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MemberDto implements java.io.Serializable {

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

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DepartmentDto getDirectDepartment() {
        return directDepartment;
    }
    public void setDirectDepartment(DepartmentDto directDepartment) {
        this.directDepartment = directDepartment;
    }

    public String getIdentity() {
        return identity;
    }
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public java.util.List<ProjectDto> getEnterableProjects() {
        return enterableProjects;
    }
    public void setEnterableProjects(java.util.List<ProjectDto> enterableProjects) {
        this.enterableProjects = enterableProjects;
    }

    public DataCenterRoleDto getDataCenterRole() {
        return dataCenterRole;
    }
    public void setDataCenterRole(DataCenterRoleDto dataCenterRole) {
        this.dataCenterRole = dataCenterRole;
    }

    public java.time.ZonedDateTime getLastVisitAt() {
        return lastVisitAt;
    }
    public void setLastVisitAt(java.time.ZonedDateTime lastVisitAt) {
        this.lastVisitAt = lastVisitAt;
    }

    public String getCreator() {
        return creator;
    }
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

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSource(String source) {
            this.source = source;
            return this;
        }

        public Builder setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setDirectDepartment(DepartmentDto directDepartment) {
            this.directDepartment = directDepartment;
            return this;
        }

        public Builder setIdentity(String identity) {
            this.identity = identity;
            return this;
        }

        public Builder setEnterableProjects(java.util.List<ProjectDto> enterableProjects) {
            this.enterableProjects = enterableProjects;
            return this;
        }

        public Builder setDataCenterRole(DataCenterRoleDto dataCenterRole) {
            this.dataCenterRole = dataCenterRole;
            return this;
        }

        public Builder setLastVisitAt(java.time.ZonedDateTime lastVisitAt) {
            this.lastVisitAt = lastVisitAt;
            return this;
        }

        public Builder setCreator(String creator) {
            this.creator = creator;
            return this;
        }


        public MemberDto build() {
            return new MemberDto(id, name, source, avatar, email, createdAt, phoneNumber, directDepartment, identity, enterableProjects, dataCenterRole, lastVisitAt, creator);
        }

    }
}
