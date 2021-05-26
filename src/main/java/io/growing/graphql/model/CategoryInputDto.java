package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CategoryInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String parentId;
    @javax.validation.constraints.NotNull
    private String resourceType;

    public CategoryInputDto() {
    }

    public CategoryInputDto(String name, String parentId, String resourceType) {
        this.name = name;
        this.parentId = parentId;
        this.resourceType = resourceType;
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

    public String getResourceType() {
        return resourceType;
    }
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
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
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
        }
        return joiner.toString();
    }

    public static CategoryInputDto.Builder builder() {
        return new CategoryInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String parentId;
        private String resourceType;

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

        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }


        public CategoryInputDto build() {
            return new CategoryInputDto(name, parentId, resourceType);
        }

    }
}
