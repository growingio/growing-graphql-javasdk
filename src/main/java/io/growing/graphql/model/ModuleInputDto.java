package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class ModuleInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private java.util.List<PermissionInputDto> permissions;

    public ModuleInputDto() {
    }

    public ModuleInputDto(String key, java.util.List<PermissionInputDto> permissions) {
        this.key = key;
        this.permissions = permissions;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public java.util.List<PermissionInputDto> getPermissions() {
        return permissions;
    }
    public void setPermissions(java.util.List<PermissionInputDto> permissions) {
        this.permissions = permissions;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (permissions != null) {
            joiner.add("permissions: " + GraphQLRequestSerializer.getEntry(permissions));
        }
        return joiner.toString();
    }

    public static ModuleInputDto.Builder builder() {
        return new ModuleInputDto.Builder();
    }

    public static class Builder {

        private String key;
        private java.util.List<PermissionInputDto> permissions;

        public Builder() {
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setPermissions(java.util.List<PermissionInputDto> permissions) {
            this.permissions = permissions;
            return this;
        }


        public ModuleInputDto build() {
            return new ModuleInputDto(key, permissions);
        }

    }
}
