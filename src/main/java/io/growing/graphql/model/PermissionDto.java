package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class PermissionDto implements java.io.Serializable {

    private String id;
    private String action;
    private String name;

    public PermissionDto() {
    }

    public PermissionDto(String id, String action, String name) {
        this.id = id;
        this.action = action;
        this.name = name;
    }

    /**
     * 权限id
     */
    public String getId() {
        return id;
    }
    /**
     * 权限id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 权限的 key/标识/动作
     */
    public String getAction() {
        return action;
    }
    /**
     * 权限的 key/标识/动作
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * 权限名称
     */
    public String getName() {
        return name;
    }
    /**
     * 权限名称
     */
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (action != null) {
            joiner.add("action: " + GraphQLRequestSerializer.getEntry(action));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }

    public static PermissionDto.Builder builder() {
        return new PermissionDto.Builder();
    }

    public static class Builder {

        private String id;
        private String action;
        private String name;

        public Builder() {
        }

        /**
         * 权限id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 权限的 key/标识/动作
         */
        public Builder setAction(String action) {
            this.action = action;
            return this;
        }

        /**
         * 权限名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public PermissionDto build() {
            return new PermissionDto(id, action, name);
        }

    }
}
