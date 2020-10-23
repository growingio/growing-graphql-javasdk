package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class UbaCustomEventInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String valueType;
    @javax.validation.constraints.NotNull
    private java.util.List<UbaCustomEventVariableInputDto> variables;
    @javax.validation.constraints.NotNull
    private Boolean isSystem;

    public UbaCustomEventInputDto() {
    }

    public UbaCustomEventInputDto(String key, String name, String valueType, java.util.List<UbaCustomEventVariableInputDto> variables, Boolean isSystem) {
        this.key = key;
        this.name = name;
        this.valueType = valueType;
        this.variables = variables;
        this.isSystem = isSystem;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getValueType() {
        return valueType;
    }
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public java.util.List<UbaCustomEventVariableInputDto> getVariables() {
        return variables;
    }
    public void setVariables(java.util.List<UbaCustomEventVariableInputDto> variables) {
        this.variables = variables;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        if (variables != null) {
            joiner.add("variables: " + GraphQLRequestSerializer.getEntry(variables));
        }
        if (isSystem != null) {
            joiner.add("isSystem: " + GraphQLRequestSerializer.getEntry(isSystem));
        }
        return joiner.toString();
    }

    public static UbaCustomEventInputDto.Builder builder() {
        return new UbaCustomEventInputDto.Builder();
    }

    public static class Builder {

        private String key;
        private String name;
        private String valueType;
        private java.util.List<UbaCustomEventVariableInputDto> variables;
        private Boolean isSystem;

        public Builder() {
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder setVariables(java.util.List<UbaCustomEventVariableInputDto> variables) {
            this.variables = variables;
            return this;
        }

        public Builder setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }


        public UbaCustomEventInputDto build() {
            return new UbaCustomEventInputDto(key, name, valueType, variables, isSystem);
        }

    }
}
