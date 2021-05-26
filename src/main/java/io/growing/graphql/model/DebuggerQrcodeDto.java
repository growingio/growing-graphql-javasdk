package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * debugger使用，分别为二维码URL和ws URL
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DebuggerQrcodeDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String qrcodeUrl;
    @javax.validation.constraints.NotNull
    private String wsUrl;

    public DebuggerQrcodeDto() {
    }

    public DebuggerQrcodeDto(String qrcodeUrl, String wsUrl) {
        this.qrcodeUrl = qrcodeUrl;
        this.wsUrl = wsUrl;
    }

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }
    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    public String getWsUrl() {
        return wsUrl;
    }
    public void setWsUrl(String wsUrl) {
        this.wsUrl = wsUrl;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (qrcodeUrl != null) {
            joiner.add("qrcodeUrl: " + GraphQLRequestSerializer.getEntry(qrcodeUrl));
        }
        if (wsUrl != null) {
            joiner.add("wsUrl: " + GraphQLRequestSerializer.getEntry(wsUrl));
        }
        return joiner.toString();
    }

    public static DebuggerQrcodeDto.Builder builder() {
        return new DebuggerQrcodeDto.Builder();
    }

    public static class Builder {

        private String qrcodeUrl;
        private String wsUrl;

        public Builder() {
        }

        public Builder setQrcodeUrl(String qrcodeUrl) {
            this.qrcodeUrl = qrcodeUrl;
            return this;
        }

        public Builder setWsUrl(String wsUrl) {
            this.wsUrl = wsUrl;
            return this;
        }


        public DebuggerQrcodeDto build() {
            return new DebuggerQrcodeDto(qrcodeUrl, wsUrl);
        }

    }
}
