package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
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

    /**
     * 部门id
     */
    public String getId() {
        return id;
    }
    /**
     * 部门id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 部门名称
     */
    public String getName() {
        return name;
    }
    /**
     * 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 父部门id
     */
    public String getParentId() {
        return parentId;
    }
    /**
     * 父部门id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 子部门列表
     */
    public java.util.List<DepartmentDto> getDepartments() {
        return departments;
    }
    /**
     * 子部门列表
     */
    public void setDepartments(java.util.List<DepartmentDto> departments) {
        this.departments = departments;
    }

    /**
     * 部门成员列表
     */
    public java.util.List<MemberDto> getMembers() {
        return members;
    }
    /**
     * 部门成员列表
     */
    public void setMembers(java.util.List<MemberDto> members) {
        this.members = members;
    }

    /**
     * 部门成员数量
     */
    public Integer getMemberCount() {
        return memberCount;
    }
    /**
     * 部门成员数量
     */
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

        /**
         * 部门id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 部门名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 父部门id
         */
        public Builder setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * 子部门列表
         */
        public Builder setDepartments(java.util.List<DepartmentDto> departments) {
            this.departments = departments;
            return this;
        }

        /**
         * 部门成员列表
         */
        public Builder setMembers(java.util.List<MemberDto> members) {
            this.members = members;
            return this;
        }

        /**
         * 部门成员数量
         */
        public Builder setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }


        public DepartmentDto build() {
            return new DepartmentDto(id, name, parentId, departments, members, memberCount);
        }

    }
}
