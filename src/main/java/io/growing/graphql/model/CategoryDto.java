package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class CategoryDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private String name;
    private String parentId;
    private java.util.List<CategoryDto> subCategories;
    private java.util.List<CategoryResourceDto> resources;
    private Integer resourceCount;

    public CategoryDto() {
    }

    public CategoryDto(String id, String name, String parentId, java.util.List<CategoryDto> subCategories, java.util.List<CategoryResourceDto> resources, Integer resourceCount) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.subCategories = subCategories;
        this.resources = resources;
        this.resourceCount = resourceCount;
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

    public java.util.List<CategoryDto> getSubCategories() {
        return subCategories;
    }
    public void setSubCategories(java.util.List<CategoryDto> subCategories) {
        this.subCategories = subCategories;
    }

    public java.util.List<CategoryResourceDto> getResources() {
        return resources;
    }
    public void setResources(java.util.List<CategoryResourceDto> resources) {
        this.resources = resources;
    }

    public Integer getResourceCount() {
        return resourceCount;
    }
    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
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
        if (subCategories != null) {
            joiner.add("subCategories: " + GraphQLRequestSerializer.getEntry(subCategories));
        }
        if (resources != null) {
            joiner.add("resources: " + GraphQLRequestSerializer.getEntry(resources));
        }
        if (resourceCount != null) {
            joiner.add("resourceCount: " + GraphQLRequestSerializer.getEntry(resourceCount));
        }
        return joiner.toString();
    }

    public static CategoryDto.Builder builder() {
        return new CategoryDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String parentId;
        private java.util.List<CategoryDto> subCategories;
        private java.util.List<CategoryResourceDto> resources;
        private Integer resourceCount;

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

        public Builder setSubCategories(java.util.List<CategoryDto> subCategories) {
            this.subCategories = subCategories;
            return this;
        }

        public Builder setResources(java.util.List<CategoryResourceDto> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }


        public CategoryDto build() {
            return new CategoryDto(id, name, parentId, subCategories, resources, resourceCount);
        }

    }
}
