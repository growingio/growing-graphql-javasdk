package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CategoryDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private String name;
    private String parentId;
    @javax.validation.constraints.NotNull
    private java.util.List<CategoryDto> subCategories;
    @javax.validation.constraints.NotNull
    private String resourceType;
    @javax.validation.constraints.NotNull
    private java.util.List<CategoryResourceDto> resources;
    private Integer resourceCount;

    public CategoryDto() {
    }

    public CategoryDto(String id, String name, String parentId, java.util.List<CategoryDto> subCategories, String resourceType, java.util.List<CategoryResourceDto> resources, Integer resourceCount) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.subCategories = subCategories;
        this.resourceType = resourceType;
        this.resources = resources;
        this.resourceCount = resourceCount;
    }

    /**
     * 分类ID
     */
    public String getId() {
        return id;
    }
    /**
     * 分类ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 分类名称
     */
    public String getName() {
        return name;
    }
    /**
     * 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 父分类ID
     */
    public String getParentId() {
        return parentId;
    }
    /**
     * 父分类ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 子分类
     */
    public java.util.List<CategoryDto> getSubCategories() {
        return subCategories;
    }
    /**
     * 子分类
     */
    public void setSubCategories(java.util.List<CategoryDto> subCategories) {
        this.subCategories = subCategories;
    }

    /**
     * 资源类型
     */
    public String getResourceType() {
        return resourceType;
    }
    /**
     * 资源类型
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * 资源列表
     */
    public java.util.List<CategoryResourceDto> getResources() {
        return resources;
    }
    /**
     * 资源列表
     */
    public void setResources(java.util.List<CategoryResourceDto> resources) {
        this.resources = resources;
    }

    /**
     * 资源数量
     */
    public Integer getResourceCount() {
        return resourceCount;
    }
    /**
     * 资源数量
     */
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
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
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
        private String resourceType;
        private java.util.List<CategoryResourceDto> resources;
        private Integer resourceCount;

        public Builder() {
        }

        /**
         * 分类ID
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 分类名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 父分类ID
         */
        public Builder setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * 子分类
         */
        public Builder setSubCategories(java.util.List<CategoryDto> subCategories) {
            this.subCategories = subCategories;
            return this;
        }

        /**
         * 资源类型
         */
        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * 资源列表
         */
        public Builder setResources(java.util.List<CategoryResourceDto> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * 资源数量
         */
        public Builder setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }


        public CategoryDto build() {
            return new CategoryDto(id, name, parentId, subCategories, resourceType, resources, resourceCount);
        }

    }
}
