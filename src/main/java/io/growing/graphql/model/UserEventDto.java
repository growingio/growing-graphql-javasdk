package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class UserEventDto implements java.io.Serializable, EntityDto {

    private String name;
    @javax.validation.constraints.NotNull
    private UserEventTypeDto type;
    private String key;
    private java.time.ZonedDateTime timestamp;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyDto> properties;

    public UserEventDto() {
    }

    public UserEventDto(String name, UserEventTypeDto type, String key, java.time.ZonedDateTime timestamp, java.util.List<PropertyDto> properties) {
        this.name = name;
        this.type = type;
        this.key = key;
        this.timestamp = timestamp;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public UserEventTypeDto getType() {
        return type;
    }
    public void setType(UserEventTypeDto type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public java.time.ZonedDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (timestamp != null) {
            joiner.add("timestamp: " + GraphQLRequestSerializer.getEntry(timestamp));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        return joiner.toString();
    }

    public static UserEventDto.Builder builder() {
        return new UserEventDto.Builder();
    }

    public static class Builder {

        private String name;
        private UserEventTypeDto type;
        private String key;
        private java.time.ZonedDateTime timestamp;
        private java.util.List<PropertyDto> properties;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(UserEventTypeDto type) {
            this.type = type;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setTimestamp(java.time.ZonedDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyDto> properties) {
            this.properties = properties;
            return this;
        }


        public UserEventDto build() {
            return new UserEventDto(name, type, key, timestamp, properties);
        }

    }
}
