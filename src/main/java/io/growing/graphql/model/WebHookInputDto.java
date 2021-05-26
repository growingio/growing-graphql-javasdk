package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class WebHookInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private String method;
    private String secret;

    public WebHookInputDto() {
    }

    public WebHookInputDto(String name, String url, String method, String secret) {
        this.name = name;
        this.url = url;
        this.method = method;
        this.secret = secret;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        return joiner.toString();
    }

    public static WebHookInputDto.Builder builder() {
        return new WebHookInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String url;
        private String method;
        private String secret;

        public Builder() {
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


        public WebHookInputDto build() {
            return new WebHookInputDto(name, url, method, secret);
        }

    }
}
