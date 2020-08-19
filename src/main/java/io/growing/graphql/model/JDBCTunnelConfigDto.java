package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class JDBCTunnelConfigDto implements java.io.Serializable, TunnelConfigDto {

    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private String username;
    @javax.validation.constraints.NotNull
    private String password;

    public JDBCTunnelConfigDto() {
    }

    public JDBCTunnelConfigDto(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        if (username != null) {
            joiner.add("username: " + GraphQLRequestSerializer.getEntry(username));
        }
        if (password != null) {
            joiner.add("password: " + GraphQLRequestSerializer.getEntry(password));
        }
        return joiner.toString();
    }

    public static JDBCTunnelConfigDto.Builder builder() {
        return new JDBCTunnelConfigDto.Builder();
    }

    public static class Builder {

        private String url;
        private String username;
        private String password;

        public Builder() {
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }


        public JDBCTunnelConfigDto build() {
            return new JDBCTunnelConfigDto(url, username, password);
        }

    }
}
