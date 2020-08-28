package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class TagInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private TagTypeDto type;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<ComputeDefinitionInputDto> computes;

    public TagInputDto() {
    }

    public TagInputDto(String name, TagTypeDto type, String description, java.util.List<ComputeDefinitionInputDto> computes) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.computes = computes;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public TagTypeDto getType() {
        return type;
    }
    public void setType(TagTypeDto type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<ComputeDefinitionInputDto> getComputes() {
        return computes;
    }
    public void setComputes(java.util.List<ComputeDefinitionInputDto> computes) {
        this.computes = computes;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (computes != null) {
            joiner.add("computes: " + GraphQLRequestSerializer.getEntry(computes));
        }
        return joiner.toString();
    }

    public static TagInputDto.Builder builder() {
        return new TagInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private TagTypeDto type;
        private String description;
        private java.util.List<ComputeDefinitionInputDto> computes;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(TagTypeDto type) {
            this.type = type;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setComputes(java.util.List<ComputeDefinitionInputDto> computes) {
            this.computes = computes;
            return this;
        }


        public TagInputDto build() {
            return new TagInputDto(name, type, description, computes);
        }

    }
}
