package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class HubbleInfoDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String jwtSharedSecret;
    @javax.validation.constraints.NotNull
    private String siteUrl;

    public HubbleInfoDto() {
    }

    public HubbleInfoDto(String jwtSharedSecret, String siteUrl) {
        this.jwtSharedSecret = jwtSharedSecret;
        this.siteUrl = siteUrl;
    }

    public String getJwtSharedSecret() {
        return jwtSharedSecret;
    }
    public void setJwtSharedSecret(String jwtSharedSecret) {
        this.jwtSharedSecret = jwtSharedSecret;
    }

    public String getSiteUrl() {
        return siteUrl;
    }
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (jwtSharedSecret != null) {
            joiner.add("jwtSharedSecret: " + GraphQLRequestSerializer.getEntry(jwtSharedSecret));
        }
        if (siteUrl != null) {
            joiner.add("siteUrl: " + GraphQLRequestSerializer.getEntry(siteUrl));
        }
        return joiner.toString();
    }

    public static HubbleInfoDto.Builder builder() {
        return new HubbleInfoDto.Builder();
    }

    public static class Builder {

        private String jwtSharedSecret;
        private String siteUrl;

        public Builder() {
        }

        public Builder setJwtSharedSecret(String jwtSharedSecret) {
            this.jwtSharedSecret = jwtSharedSecret;
            return this;
        }

        public Builder setSiteUrl(String siteUrl) {
            this.siteUrl = siteUrl;
            return this;
        }


        public HubbleInfoDto build() {
            return new HubbleInfoDto(jwtSharedSecret, siteUrl);
        }

    }
}
