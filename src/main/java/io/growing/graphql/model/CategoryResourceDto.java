package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class CategoryResourceDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String categoryId;
    @javax.validation.constraints.NotNull
    private String resourceType;
    private String resourceId;
    @com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,property = "__typename")
    @com.fasterxml.jackson.annotation.JsonSubTypes(value = {
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SegmentDto.class, name = "Segment"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UserSummaryDto.class, name = "UserSummary"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TagDto.class, name = "Tag"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TunnelDto.class, name = "Tunnel"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UserEventDto.class, name = "UserEvent")
        })
    private EntityDto resourceEntity;

    public CategoryResourceDto() {
    }

    public CategoryResourceDto(String categoryId, String resourceType, String resourceId, EntityDto resourceEntity) {
        this.categoryId = categoryId;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
        this.resourceEntity = resourceEntity;
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

    public EntityDto getResourceEntity() {
        return resourceEntity;
    }
    public void setResourceEntity(EntityDto resourceEntity) {
        this.resourceEntity = resourceEntity;
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
        if (resourceEntity != null) {
            joiner.add("resourceEntity: " + GraphQLRequestSerializer.getEntry(resourceEntity));
        }
        return joiner.toString();
    }

    public static CategoryResourceDto.Builder builder() {
        return new CategoryResourceDto.Builder();
    }

    public static class Builder {

        private String categoryId;
        private String resourceType;
        private String resourceId;
        private EntityDto resourceEntity;

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

        public Builder setResourceEntity(EntityDto resourceEntity) {
            this.resourceEntity = resourceEntity;
            return this;
        }


        public CategoryResourceDto build() {
            return new CategoryResourceDto(categoryId, resourceType, resourceId, resourceEntity);
        }

    }
}
