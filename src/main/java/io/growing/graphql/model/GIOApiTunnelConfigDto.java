package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class GIOApiTunnelConfigDto implements java.io.Serializable, TunnelConfigDto {

    @javax.validation.constraints.NotNull
    private String projectUid;
    @javax.validation.constraints.NotNull
    private String projectKey;
    @javax.validation.constraints.NotNull
    private String token;

    public GIOApiTunnelConfigDto() {
    }

    public GIOApiTunnelConfigDto(String projectUid, String projectKey, String token) {
        this.projectUid = projectUid;
        this.projectKey = projectKey;
        this.token = token;
    }

    public String getProjectUid() {
        return projectUid;
    }
    public void setProjectUid(String projectUid) {
        this.projectUid = projectUid;
    }

    public String getProjectKey() {
        return projectKey;
    }
    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (projectUid != null) {
            joiner.add("projectUid: " + GraphQLRequestSerializer.getEntry(projectUid));
        }
        if (projectKey != null) {
            joiner.add("projectKey: " + GraphQLRequestSerializer.getEntry(projectKey));
        }
        if (token != null) {
            joiner.add("token: " + GraphQLRequestSerializer.getEntry(token));
        }
        return joiner.toString();
    }

    public static GIOApiTunnelConfigDto.Builder builder() {
        return new GIOApiTunnelConfigDto.Builder();
    }

    public static class Builder {

        private String projectUid;
        private String projectKey;
        private String token;

        public Builder() {
        }

        public Builder setProjectUid(String projectUid) {
            this.projectUid = projectUid;
            return this;
        }

        public Builder setProjectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder setToken(String token) {
            this.token = token;
            return this;
        }


        public GIOApiTunnelConfigDto build() {
            return new GIOApiTunnelConfigDto(projectUid, projectKey, token);
        }

    }
}
