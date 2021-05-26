package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class WebHookDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private String method;
    private String secret;
    @javax.validation.constraints.NotNull
    private String status;
    private java.time.ZonedDateTime createdAt;
    private String creator;
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.util.List<NotificationTaskDto> referers;

    public WebHookDto() {
    }

    public WebHookDto(String id, String name, String url, String method, String secret, String status, java.time.ZonedDateTime createdAt, String creator, String creatorId, java.util.List<NotificationTaskDto> referers) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.method = method;
        this.secret = secret;
        this.status = status;
        this.createdAt = createdAt;
        this.creator = creator;
        this.creatorId = creatorId;
        this.referers = referers;
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

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }

    public String getSecret() {
        return secret;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public java.util.List<NotificationTaskDto> getReferers() {
        return referers;
    }
    public void setReferers(java.util.List<NotificationTaskDto> referers) {
        this.referers = referers;
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
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        if (method != null) {
            joiner.add("method: " + GraphQLRequestSerializer.getEntry(method));
        }
        if (secret != null) {
            joiner.add("secret: " + GraphQLRequestSerializer.getEntry(secret));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        if (creatorId != null) {
            joiner.add("creatorId: " + GraphQLRequestSerializer.getEntry(creatorId));
        }
        if (referers != null) {
            joiner.add("referers: " + GraphQLRequestSerializer.getEntry(referers));
        }
        return joiner.toString();
    }

    public static WebHookDto.Builder builder() {
        return new WebHookDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String url;
        private String method;
        private String secret;
        private String status;
        private java.time.ZonedDateTime createdAt;
        private String creator;
        private String creatorId;
        private java.util.List<NotificationTaskDto> referers;

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

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setMethod(String method) {
            this.method = method;
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = secret;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreator(String creator) {
            this.creator = creator;
            return this;
        }

        public Builder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        public Builder setReferers(java.util.List<NotificationTaskDto> referers) {
            this.referers = referers;
            return this;
        }


        public WebHookDto build() {
            return new WebHookDto(id, name, url, method, secret, status, createdAt, creator, creatorId, referers);
        }

    }
}
