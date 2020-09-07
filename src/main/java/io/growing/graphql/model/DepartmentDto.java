package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class DepartmentDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String parentId;
    @javax.validation.constraints.NotNull
    private java.util.List<DepartmentDto> departments;
    @javax.validation.constraints.NotNull
    private java.util.List<MemberDto> members;
    @javax.validation.constraints.NotNull
    private Integer memberCount;

    public DepartmentDto() {
    }

    public DepartmentDto(String id, String name, String parentId, java.util.List<DepartmentDto> departments, java.util.List<MemberDto> members, Integer memberCount) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.departments = departments;
        this.members = members;
        this.memberCount = memberCount;
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

    public String getParentId() {
        return parentId;
    }
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public java.util.List<DepartmentDto> getDepartments() {
        return departments;
    }
    public void setDepartments(java.util.List<DepartmentDto> departments) {
        this.departments = departments;
    }

    public java.util.List<MemberDto> getMembers() {
        return members;
    }
    public void setMembers(java.util.List<MemberDto> members) {
        this.members = members;
    }

    public Integer getMemberCount() {
        return memberCount;
    }
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
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
        if (parentId != null) {
            joiner.add("parentId: " + GraphQLRequestSerializer.getEntry(parentId));
        }
        if (departments != null) {
            joiner.add("departments: " + GraphQLRequestSerializer.getEntry(departments));
        }
        if (members != null) {
            joiner.add("members: " + GraphQLRequestSerializer.getEntry(members));
        }
        if (memberCount != null) {
            joiner.add("memberCount: " + GraphQLRequestSerializer.getEntry(memberCount));
        }
        return joiner.toString();
    }

    public static DepartmentDto.Builder builder() {
        return new DepartmentDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String parentId;
        private java.util.List<DepartmentDto> departments;
        private java.util.List<MemberDto> members;
        private Integer memberCount;

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

        public Builder setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setDepartments(java.util.List<DepartmentDto> departments) {
            this.departments = departments;
            return this;
        }

        public Builder setMembers(java.util.List<MemberDto> members) {
            this.members = members;
            return this;
        }

        public Builder setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }


        public DepartmentDto build() {
            return new DepartmentDto(id, name, parentId, departments, members, memberCount);
        }

    }
}
