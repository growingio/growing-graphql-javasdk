package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class ItemModelInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<ItemVariableInputDto> attributes;

    public ItemModelInputDto() {
    }

    public ItemModelInputDto(String name, String description, java.util.List<ItemVariableInputDto> attributes) {
        this.name = name;
        this.description = description;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<ItemVariableInputDto> getAttributes() {
        return attributes;
    }
    public void setAttributes(java.util.List<ItemVariableInputDto> attributes) {
        this.attributes = attributes;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (attributes != null) {
            joiner.add("attributes: " + GraphQLRequestSerializer.getEntry(attributes));
        }
        return joiner.toString();
    }

    public static ItemModelInputDto.Builder builder() {
        return new ItemModelInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<ItemVariableInputDto> attributes;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setAttributes(java.util.List<ItemVariableInputDto> attributes) {
            this.attributes = attributes;
            return this;
        }


        public ItemModelInputDto build() {
            return new ItemModelInputDto(name, description, attributes);
        }

    }
}
