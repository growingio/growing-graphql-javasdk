package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class MobileTunnelConfigDto implements java.io.Serializable, TunnelConfigDto {

    @javax.validation.constraints.NotNull
    private PlatformTypeDto platform;
    @javax.validation.constraints.NotNull
    private String urlScheme;
    private String spn;

    public MobileTunnelConfigDto() {
    }

    public MobileTunnelConfigDto(PlatformTypeDto platform, String urlScheme, String spn) {
        this.platform = platform;
        this.urlScheme = urlScheme;
        this.spn = spn;
    }

    public PlatformTypeDto getPlatform() {
        return platform;
    }
    public void setPlatform(PlatformTypeDto platform) {
        this.platform = platform;
    }

    public String getUrlScheme() {
        return urlScheme;
    }
    public void setUrlScheme(String urlScheme) {
        this.urlScheme = urlScheme;
    }

    public String getSpn() {
        return spn;
    }
    public void setSpn(String spn) {
        this.spn = spn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (platform != null) {
            joiner.add("platform: " + GraphQLRequestSerializer.getEntry(platform));
        }
        if (urlScheme != null) {
            joiner.add("urlScheme: " + GraphQLRequestSerializer.getEntry(urlScheme));
        }
        if (spn != null) {
            joiner.add("spn: " + GraphQLRequestSerializer.getEntry(spn));
        }
        return joiner.toString();
    }

    public static MobileTunnelConfigDto.Builder builder() {
        return new MobileTunnelConfigDto.Builder();
    }

    public static class Builder {

        private PlatformTypeDto platform;
        private String urlScheme;
        private String spn;

        public Builder() {
        }

        public Builder setPlatform(PlatformTypeDto platform) {
            this.platform = platform;
            return this;
        }

        public Builder setUrlScheme(String urlScheme) {
            this.urlScheme = urlScheme;
            return this;
        }

        public Builder setSpn(String spn) {
            this.spn = spn;
            return this;
        }


        public MobileTunnelConfigDto build() {
            return new MobileTunnelConfigDto(platform, urlScheme, spn);
        }

    }
}
