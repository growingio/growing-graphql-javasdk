package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class DepartmentInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String parentId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> members;

    public DepartmentInputDto() {
    }

    public DepartmentInputDto(String name, String parentId, java.util.List<String> members) {
        this.name = name;
        this.parentId = parentId;
        this.members = members;
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

    public java.util.List<String> getMembers() {
        return members;
    }
    public void setMembers(java.util.List<String> members) {
        this.members = members;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (parentId != null) {
            joiner.add("parentId: " + GraphQLRequestSerializer.getEntry(parentId));
        }
        if (members != null) {
            joiner.add("members: " + GraphQLRequestSerializer.getEntry(members));
        }
        return joiner.toString();
    }

    public static DepartmentInputDto.Builder builder() {
        return new DepartmentInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String parentId;
        private java.util.List<String> members;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }


        public DepartmentInputDto build() {
            return new DepartmentInputDto(name, parentId, members);
        }

    }
}
