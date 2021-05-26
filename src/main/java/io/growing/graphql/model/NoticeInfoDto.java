package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 预警type，预警信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class NoticeInfoDto implements java.io.Serializable {

    private String type;
    private java.util.List<String> receivers;

    public NoticeInfoDto() {
    }

    public NoticeInfoDto(String type, java.util.List<String> receivers) {
        this.type = type;
        this.receivers = receivers;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public java.util.List<String> getReceivers() {
        return receivers;
    }
    public void setReceivers(java.util.List<String> receivers) {
        this.receivers = receivers;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (receivers != null) {
            joiner.add("receivers: " + GraphQLRequestSerializer.getEntry(receivers));
        }
        return joiner.toString();
    }

    public static NoticeInfoDto.Builder builder() {
        return new NoticeInfoDto.Builder();
    }

    public static class Builder {

        private String type;
        private java.util.List<String> receivers;

        public Builder() {
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setReceivers(java.util.List<String> receivers) {
            this.receivers = receivers;
            return this;
        }


        public NoticeInfoDto build() {
            return new NoticeInfoDto(type, receivers);
        }

    }
}
