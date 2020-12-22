package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MemberInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private String password;
    @javax.validation.constraints.NotNull
    private String role;
    private String department;
    private String phoneNumber;
    private String identity;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectRoleEntryInputDto> projectRoleEntries;

    public MemberInputDto() {
    }

    public MemberInputDto(String name, String email, String password, String role, String department, String phoneNumber, String identity, java.util.List<ProjectRoleEntryInputDto> projectRoleEntries) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.identity = identity;
        this.projectRoleEntries = projectRoleEntries;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentity() {
        return identity;
    }
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public java.util.List<ProjectRoleEntryInputDto> getProjectRoleEntries() {
        return projectRoleEntries;
    }
    public void setProjectRoleEntries(java.util.List<ProjectRoleEntryInputDto> projectRoleEntries) {
        this.projectRoleEntries = projectRoleEntries;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (password != null) {
            joiner.add("password: " + GraphQLRequestSerializer.getEntry(password));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        if (department != null) {
            joiner.add("department: " + GraphQLRequestSerializer.getEntry(department));
        }
        if (phoneNumber != null) {
            joiner.add("phoneNumber: " + GraphQLRequestSerializer.getEntry(phoneNumber));
        }
        if (identity != null) {
            joiner.add("identity: " + GraphQLRequestSerializer.getEntry(identity));
        }
        if (projectRoleEntries != null) {
            joiner.add("projectRoleEntries: " + GraphQLRequestSerializer.getEntry(projectRoleEntries));
        }
        return joiner.toString();
    }

    public static MemberInputDto.Builder builder() {
        return new MemberInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String email;
        private String password;
        private String role;
        private String department;
        private String phoneNumber;
        private String identity;
        private java.util.List<ProjectRoleEntryInputDto> projectRoleEntries;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setIdentity(String identity) {
            this.identity = identity;
            return this;
        }

        public Builder setProjectRoleEntries(java.util.List<ProjectRoleEntryInputDto> projectRoleEntries) {
            this.projectRoleEntries = projectRoleEntries;
            return this;
        }


        public MemberInputDto build() {
            return new MemberInputDto(name, email, password, role, department, phoneNumber, identity, projectRoleEntries);
        }

    }
}
