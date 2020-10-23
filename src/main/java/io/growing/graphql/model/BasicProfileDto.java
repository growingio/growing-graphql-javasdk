package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class BasicProfileDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String userId;
    private String name;
    private String email;
    private String avatar;
    private String mobile;
    private java.time.ZonedDateTime createdAt;
    private String wechatOpenId;
    private java.util.List<PropertyDto> properties;

    public BasicProfileDto() {
    }

    public BasicProfileDto(String id, String userId, String name, String email, String avatar, String mobile, java.time.ZonedDateTime createdAt, String wechatOpenId, java.util.List<PropertyDto> properties) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.avatar = avatar;
        this.mobile = mobile;
        this.createdAt = createdAt;
        this.wechatOpenId = wechatOpenId;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getWechatOpenId() {
        return wechatOpenId;
    }
    public void setWechatOpenId(String wechatOpenId) {
        this.wechatOpenId = wechatOpenId;
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
        if (userId != null) {
            joiner.add("userId: " + GraphQLRequestSerializer.getEntry(userId));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (avatar != null) {
            joiner.add("avatar: " + GraphQLRequestSerializer.getEntry(avatar));
        }
        if (mobile != null) {
            joiner.add("mobile: " + GraphQLRequestSerializer.getEntry(mobile));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (wechatOpenId != null) {
            joiner.add("wechatOpenId: " + GraphQLRequestSerializer.getEntry(wechatOpenId));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        return joiner.toString();
    }

    public static BasicProfileDto.Builder builder() {
        return new BasicProfileDto.Builder();
    }

    public static class Builder {

        private String id;
        private String userId;
        private String name;
        private String email;
        private String avatar;
        private String mobile;
        private java.time.ZonedDateTime createdAt;
        private String wechatOpenId;
        private java.util.List<PropertyDto> properties;

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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setWechatOpenId(String wechatOpenId) {
            this.wechatOpenId = wechatOpenId;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyDto> properties) {
            this.properties = properties;
            return this;
        }


        public BasicProfileDto build() {
            return new BasicProfileDto(id, userId, name, email, avatar, mobile, createdAt, wechatOpenId, properties);
        }

    }
}
