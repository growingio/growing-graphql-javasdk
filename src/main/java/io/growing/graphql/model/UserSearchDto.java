package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class UserSearchDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private String userId;
    @javax.validation.constraints.NotNull
    private PropertyDto property;

    public UserSearchDto() {
    }

    public UserSearchDto(String id, String userId, PropertyDto property) {
        this.id = id;
        this.userId = userId;
        this.property = property;
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

    public PropertyDto getProperty() {
        return property;
    }
    public void setProperty(PropertyDto property) {
        this.property = property;
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
        if (property != null) {
            joiner.add("property: " + GraphQLRequestSerializer.getEntry(property));
        }
        return joiner.toString();
    }

    public static UserSearchDto.Builder builder() {
        return new UserSearchDto.Builder();
    }

    public static class Builder {

        private String id;
        private String userId;
        private PropertyDto property;

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

        public Builder setProperty(PropertyDto property) {
            this.property = property;
            return this;
        }


        public UserSearchDto build() {
            return new UserSearchDto(id, userId, property);
        }

    }
}
