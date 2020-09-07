package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class UserProfileDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String userId;
    private java.util.List<InsensitivePropertyDto> properties;

    public UserProfileDto() {
    }

    public UserProfileDto(String id, String userId, java.util.List<InsensitivePropertyDto> properties) {
        this.id = id;
        this.userId = userId;
        this.properties = properties;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public java.util.List<InsensitivePropertyDto> getProperties() {
        return properties;
    }
    public void setProperties(java.util.List<InsensitivePropertyDto> properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (userId != null) {
            joiner.add("userId: " + GraphQLRequestSerializer.getEntry(userId));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        return joiner.toString();
    }

    public static UserProfileDto.Builder builder() {
        return new UserProfileDto.Builder();
    }

    public static class Builder {

        private String id;
        private String userId;
        private java.util.List<InsensitivePropertyDto> properties;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setProperties(java.util.List<InsensitivePropertyDto> properties) {
            this.properties = properties;
            return this;
        }


        public UserProfileDto build() {
            return new UserProfileDto(id, userId, properties);
        }

    }
}
