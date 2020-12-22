package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class CategoryResourceInputDto implements java.io.Serializable {

    private String categoryId;
    @javax.validation.constraints.NotNull
    private String resourceType;
    @javax.validation.constraints.NotNull
    private String resourceId;

    public CategoryResourceInputDto() {
    }

    public CategoryResourceInputDto(String categoryId, String resourceType, String resourceId) {
        this.categoryId = categoryId;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
    }

    public String getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getResourceType() {
        return resourceType;
    }
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceId() {
        return resourceId;
    }
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (categoryId != null) {
            joiner.add("categoryId: " + GraphQLRequestSerializer.getEntry(categoryId));
        }
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
        }
        if (resourceId != null) {
            joiner.add("resourceId: " + GraphQLRequestSerializer.getEntry(resourceId));
        }
        return joiner.toString();
    }

    public static CategoryResourceInputDto.Builder builder() {
        return new CategoryResourceInputDto.Builder();
    }

    public static class Builder {

        private String categoryId;
        private String resourceType;
        private String resourceId;

        public Builder() {
        }

        public Builder setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }


        public CategoryResourceInputDto build() {
            return new CategoryResourceInputDto(categoryId, resourceType, resourceId);
        }

    }
}
