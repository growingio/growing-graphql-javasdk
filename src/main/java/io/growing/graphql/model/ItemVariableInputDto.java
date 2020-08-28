package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class ItemVariableInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private Boolean isPrimaryKey;
    private String description;
    @javax.validation.constraints.NotNull
    private String valueType;

    public ItemVariableInputDto() {
    }

    public ItemVariableInputDto(String name, String key, Boolean isPrimaryKey, String description, String valueType) {
        this.name = name;
        this.key = key;
        this.isPrimaryKey = isPrimaryKey;
        this.description = description;
        this.valueType = valueType;
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

    public Boolean getIsPrimaryKey() {
        return isPrimaryKey;
    }
    public void setIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (isPrimaryKey != null) {
            joiner.add("isPrimaryKey: " + GraphQLRequestSerializer.getEntry(isPrimaryKey));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        return joiner.toString();
    }

    public static ItemVariableInputDto.Builder builder() {
        return new ItemVariableInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String key;
        private Boolean isPrimaryKey;
        private String description;
        private String valueType;

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

        public Builder setIsPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
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


        public ItemVariableInputDto build() {
            return new ItemVariableInputDto(name, key, isPrimaryKey, description, valueType);
        }

    }
}
