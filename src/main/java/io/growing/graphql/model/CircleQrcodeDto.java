package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 前端创建二维码所需的连接
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class CircleQrcodeDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String qrcodeUrl;
    @javax.validation.constraints.NotNull
    private String wsUrl;

    public CircleQrcodeDto() {
    }

    public CircleQrcodeDto(String qrcodeUrl, String wsUrl) {
        this.qrcodeUrl = qrcodeUrl;
        this.wsUrl = wsUrl;
    }

    /**
     * 二维码内容，用来生成二维码
     */
    public String getQrcodeUrl() {
        return qrcodeUrl;
    }
    /**
     * 二维码内容，用来生成二维码
     */
    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    /**
     * ws地址，APP和Web都使用相同ws，Web通过查询参数带给APP
     */
    public String getWsUrl() {
        return wsUrl;
    }
    /**
     * ws地址，APP和Web都使用相同ws，Web通过查询参数带给APP
     */
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

    public static CircleQrcodeDto.Builder builder() {
        return new CircleQrcodeDto.Builder();
    }

    public static class Builder {

        private String qrcodeUrl;
        private String wsUrl;

        public Builder() {
        }

        /**
         * 二维码内容，用来生成二维码
         */
        public Builder setQrcodeUrl(String qrcodeUrl) {
            this.qrcodeUrl = qrcodeUrl;
            return this;
        }

        /**
         * ws地址，APP和Web都使用相同ws，Web通过查询参数带给APP
         */
        public Builder setWsUrl(String wsUrl) {
            this.wsUrl = wsUrl;
            return this;
        }


        public CircleQrcodeDto build() {
            return new CircleQrcodeDto(qrcodeUrl, wsUrl);
        }

    }
}
