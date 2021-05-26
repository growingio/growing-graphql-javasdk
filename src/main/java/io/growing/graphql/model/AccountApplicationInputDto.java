package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String identity;
    @javax.validation.constraints.NotNull
    private String dataCenterRoleId;
    private String departmentId;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectRoleEntryInputDto> projectRoleEntries;
    private String email;
    private String phone;
    private String explain;

    public AccountApplicationInputDto() {
    }

    public AccountApplicationInputDto(String name, String identity, String dataCenterRoleId, String departmentId, java.util.List<ProjectRoleEntryInputDto> projectRoleEntries, String email, String phone, String explain) {
        this.name = name;
        this.identity = identity;
        this.dataCenterRoleId = dataCenterRoleId;
        this.departmentId = departmentId;
        this.projectRoleEntries = projectRoleEntries;
        this.email = email;
        this.phone = phone;
        this.explain = explain;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getDataCenterRoleId() {
        return dataCenterRoleId;
    }
    public void setDataCenterRoleId(String dataCenterRoleId) {
        this.dataCenterRoleId = dataCenterRoleId;
    }

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public java.util.List<ProjectRoleEntryInputDto> getProjectRoleEntries() {
        return projectRoleEntries;
    }
    public void setProjectRoleEntries(java.util.List<ProjectRoleEntryInputDto> projectRoleEntries) {
        this.projectRoleEntries = projectRoleEntries;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExplain() {
        return explain;
    }
    public void setExplain(String explain) {
        this.explain = explain;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (identity != null) {
            joiner.add("identity: " + GraphQLRequestSerializer.getEntry(identity));
        }
        if (dataCenterRoleId != null) {
            joiner.add("dataCenterRoleId: " + GraphQLRequestSerializer.getEntry(dataCenterRoleId));
        }
        if (departmentId != null) {
            joiner.add("departmentId: " + GraphQLRequestSerializer.getEntry(departmentId));
        }
        if (projectRoleEntries != null) {
            joiner.add("projectRoleEntries: " + GraphQLRequestSerializer.getEntry(projectRoleEntries));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (phone != null) {
            joiner.add("phone: " + GraphQLRequestSerializer.getEntry(phone));
        }
        if (explain != null) {
            joiner.add("explain: " + GraphQLRequestSerializer.getEntry(explain));
        }
        return joiner.toString();
    }

    public static AccountApplicationInputDto.Builder builder() {
        return new AccountApplicationInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String identity;
        private String dataCenterRoleId;
        private String departmentId;
        private java.util.List<ProjectRoleEntryInputDto> projectRoleEntries;
        private String email;
        private String phone;
        private String explain;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setIdentity(String identity) {
            this.identity = identity;
            return this;
        }

        public Builder setDataCenterRoleId(String dataCenterRoleId) {
            this.dataCenterRoleId = dataCenterRoleId;
            return this;
        }

        public Builder setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Builder setProjectRoleEntries(java.util.List<ProjectRoleEntryInputDto> projectRoleEntries) {
            this.projectRoleEntries = projectRoleEntries;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setExplain(String explain) {
            this.explain = explain;
            return this;
        }


        public AccountApplicationInputDto build() {
            return new AccountApplicationInputDto(name, identity, dataCenterRoleId, departmentId, projectRoleEntries, email, phone, explain);
        }

    }
}
