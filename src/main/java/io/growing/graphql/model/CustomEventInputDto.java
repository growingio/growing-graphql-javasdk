package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class CustomEventInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String key;
    private String description;
    @javax.validation.constraints.NotNull
    private String valueType;
    @javax.validation.constraints.NotNull
    private java.util.List<EventAttributesDto> attributes;
    @javax.validation.constraints.NotNull
    private java.util.List<EventAttributesDto> itemModels;

    public CustomEventInputDto() {
    }

    public CustomEventInputDto(String name, String key, String description, String valueType, java.util.List<EventAttributesDto> attributes, java.util.List<EventAttributesDto> itemModels) {
        this.name = name;
        this.key = key;
        this.description = description;
        this.valueType = valueType;
        this.attributes = attributes;
        this.itemModels = itemModels;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getValueType() {
        return valueType;
    }
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public java.util.List<EventAttributesDto> getAttributes() {
        return attributes;
    }
    public void setAttributes(java.util.List<EventAttributesDto> attributes) {
        this.attributes = attributes;
    }

    public java.util.List<EventAttributesDto> getItemModels() {
        return itemModels;
    }
    public void setItemModels(java.util.List<EventAttributesDto> itemModels) {
        this.itemModels = itemModels;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        if (attributes != null) {
            joiner.add("attributes: " + GraphQLRequestSerializer.getEntry(attributes));
        }
        if (itemModels != null) {
            joiner.add("itemModels: " + GraphQLRequestSerializer.getEntry(itemModels));
        }
        return joiner.toString();
    }

    public static CustomEventInputDto.Builder builder() {
        return new CustomEventInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String key;
        private String description;
        private String valueType;
        private java.util.List<EventAttributesDto> attributes;
        private java.util.List<EventAttributesDto> itemModels;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder setAttributes(java.util.List<EventAttributesDto> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setItemModels(java.util.List<EventAttributesDto> itemModels) {
            this.itemModels = itemModels;
            return this;
        }


        public CustomEventInputDto build() {
            return new CustomEventInputDto(name, key, description, valueType, attributes, itemModels);
        }

    }
}
