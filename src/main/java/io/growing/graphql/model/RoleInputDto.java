package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class RoleInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<String> permissions;
    @javax.validation.constraints.NotNull
    private java.util.List<String> members;

    public RoleInputDto() {
    }

    public RoleInputDto(String name, String description, java.util.List<String> permissions, java.util.List<String> members) {
        this.name = name;
        this.description = description;
        this.permissions = permissions;
        this.members = members;
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

    public java.util.List<String> getPermissions() {
        return permissions;
    }
    public void setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (permissions != null) {
            joiner.add("permissions: " + GraphQLRequestSerializer.getEntry(permissions));
        }
        if (members != null) {
            joiner.add("members: " + GraphQLRequestSerializer.getEntry(members));
        }
        return joiner.toString();
    }

    public static RoleInputDto.Builder builder() {
        return new RoleInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<String> permissions;
        private java.util.List<String> members;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }


        public RoleInputDto build() {
            return new RoleInputDto(name, description, permissions, members);
        }

    }
}
