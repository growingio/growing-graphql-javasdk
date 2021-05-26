package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TagInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String key;
    @javax.validation.constraints.NotNull
    private TagTypeDto type;
    private ValueTypeInputDto valueType;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<ComputeDefinitionInputDto> computes;
    private String businessType;

    public TagInputDto() {
    }

    public TagInputDto(String name, String key, TagTypeDto type, ValueTypeInputDto valueType, String description, java.util.List<ComputeDefinitionInputDto> computes, String businessType) {
        this.name = name;
        this.key = key;
        this.type = type;
        this.valueType = valueType;
        this.description = description;
        this.computes = computes;
        this.businessType = businessType;
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

    public TagTypeDto getType() {
        return type;
    }
    public void setType(TagTypeDto type) {
        this.type = type;
    }

    public ValueTypeInputDto getValueType() {
        return valueType;
    }
    public void setValueType(ValueTypeInputDto valueType) {
        this.valueType = valueType;
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

    public String getBusinessType() {
        return businessType;
    }
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
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
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (computes != null) {
            joiner.add("computes: " + GraphQLRequestSerializer.getEntry(computes));
        }
        if (businessType != null) {
            joiner.add("businessType: " + GraphQLRequestSerializer.getEntry(businessType));
        }
        return joiner.toString();
    }

    public static TagInputDto.Builder builder() {
        return new TagInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String key;
        private TagTypeDto type;
        private ValueTypeInputDto valueType;
        private String description;
        private java.util.List<ComputeDefinitionInputDto> computes;
        private String businessType;

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

        public Builder setType(TagTypeDto type) {
            this.type = type;
            return this;
        }

        public Builder setValueType(ValueTypeInputDto valueType) {
            this.valueType = valueType;
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

        public Builder setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }


        public TagInputDto build() {
            return new TagInputDto(name, key, type, valueType, description, computes, businessType);
        }

    }
}
