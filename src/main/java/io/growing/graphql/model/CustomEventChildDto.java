package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class CustomEventChildDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String valueType;
    private java.time.ZonedDateTime associatedAt;

    public CustomEventChildDto() {
    }

    public CustomEventChildDto(String id, String key, String name, String valueType, java.time.ZonedDateTime associatedAt) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.valueType = valueType;
        this.associatedAt = associatedAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    public java.time.ZonedDateTime getAssociatedAt() {
        return associatedAt;
    }
    public void setAssociatedAt(java.time.ZonedDateTime associatedAt) {
        this.associatedAt = associatedAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        if (associatedAt != null) {
            joiner.add("associatedAt: " + GraphQLRequestSerializer.getEntry(associatedAt));
        }
        return joiner.toString();
    }

    public static CustomEventChildDto.Builder builder() {
        return new CustomEventChildDto.Builder();
    }

    public static class Builder {

        private String id;
        private String key;
        private String name;
        private String valueType;
        private java.time.ZonedDateTime associatedAt;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
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

        public Builder setAssociatedAt(java.time.ZonedDateTime associatedAt) {
            this.associatedAt = associatedAt;
            return this;
        }


        public CustomEventChildDto build() {
            return new CustomEventChildDto(id, key, name, valueType, associatedAt);
        }

    }
}
