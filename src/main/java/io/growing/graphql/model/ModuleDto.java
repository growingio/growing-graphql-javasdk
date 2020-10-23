package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class ModuleDto implements java.io.Serializable {

    private String key;
    private String name;
    @javax.validation.constraints.NotNull
    private java.util.List<PermissionDto> permissions;

    public ModuleDto() {
    }

    public ModuleDto(String key, String name, java.util.List<PermissionDto> permissions) {
        this.key = key;
        this.name = name;
        this.permissions = permissions;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<PermissionDto> getPermissions() {
        return permissions;
    }
    public void setPermissions(java.util.List<PermissionDto> permissions) {
        this.permissions = permissions;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (permissions != null) {
            joiner.add("permissions: " + GraphQLRequestSerializer.getEntry(permissions));
        }
        return joiner.toString();
    }

    public static ModuleDto.Builder builder() {
        return new ModuleDto.Builder();
    }

    public static class Builder {

        private String key;
        private String name;
        private java.util.List<PermissionDto> permissions;

        public Builder() {
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPermissions(java.util.List<PermissionDto> permissions) {
            this.permissions = permissions;
            return this;
        }


        public ModuleDto build() {
            return new ModuleDto(key, name, permissions);
        }

    }
}
