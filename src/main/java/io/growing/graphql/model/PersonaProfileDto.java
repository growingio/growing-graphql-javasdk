package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class PersonaProfileDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private String name;
    private java.util.List<PropertyDto> properties;

    public PersonaProfileDto() {
    }

    public PersonaProfileDto(String id, String name, java.util.List<PropertyDto> properties) {
        this.id = id;
        this.name = name;
        this.properties = properties;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<PropertyDto> getProperties() {
        return properties;
    }
    public void setProperties(java.util.List<PropertyDto> properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        return joiner.toString();
    }

    public static PersonaProfileDto.Builder builder() {
        return new PersonaProfileDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<PropertyDto> properties;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyDto> properties) {
            this.properties = properties;
            return this;
        }


        public PersonaProfileDto build() {
            return new PersonaProfileDto(id, name, properties);
        }

    }
}
