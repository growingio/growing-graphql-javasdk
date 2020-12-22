package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class TreeNodeDto implements java.io.Serializable {

    private String id;
    private String name;
    @javax.validation.constraints.NotNull
    private String type;
    private String resourceId;
    private String parentId;
    private java.util.List<TreeNodeDto> children;

    public TreeNodeDto() {
    }

    public TreeNodeDto(String id, String name, String type, String resourceId, String parentId, java.util.List<TreeNodeDto> children) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.resourceId = resourceId;
        this.parentId = parentId;
        this.children = children;
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

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getResourceId() {
        return resourceId;
    }
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getParentId() {
        return parentId;
    }
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public java.util.List<TreeNodeDto> getChildren() {
        return children;
    }
    public void setChildren(java.util.List<TreeNodeDto> children) {
        this.children = children;
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
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (resourceId != null) {
            joiner.add("resourceId: " + GraphQLRequestSerializer.getEntry(resourceId));
        }
        if (parentId != null) {
            joiner.add("parentId: " + GraphQLRequestSerializer.getEntry(parentId));
        }
        if (children != null) {
            joiner.add("children: " + GraphQLRequestSerializer.getEntry(children));
        }
        return joiner.toString();
    }

    public static TreeNodeDto.Builder builder() {
        return new TreeNodeDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String type;
        private String resourceId;
        private String parentId;
        private java.util.List<TreeNodeDto> children;

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

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setChildren(java.util.List<TreeNodeDto> children) {
            this.children = children;
            return this;
        }


        public TreeNodeDto build() {
            return new TreeNodeDto(id, name, type, resourceId, parentId, children);
        }

    }
}
