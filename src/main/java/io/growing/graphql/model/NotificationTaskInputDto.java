package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class NotificationTaskInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String channelId;
    @javax.validation.constraints.NotNull
    private String channelType;
    @javax.validation.constraints.NotNull
    private java.util.List<String> receivers;

    public NotificationTaskInputDto() {
    }

    public NotificationTaskInputDto(String name, String channelId, String channelType, java.util.List<String> receivers) {
        this.name = name;
        this.channelId = channelId;
        this.channelType = channelType;
        this.receivers = receivers;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getChannelId() {
        return channelId;
    }
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelType() {
        return channelType;
    }
    public void setChannelType(String channelType) {
        this.channelType = channelType;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (channelId != null) {
            joiner.add("channelId: " + GraphQLRequestSerializer.getEntry(channelId));
        }
        if (channelType != null) {
            joiner.add("channelType: " + GraphQLRequestSerializer.getEntry(channelType));
        }
        if (receivers != null) {
            joiner.add("receivers: " + GraphQLRequestSerializer.getEntry(receivers));
        }
        return joiner.toString();
    }

    public static NotificationTaskInputDto.Builder builder() {
        return new NotificationTaskInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String channelId;
        private String channelType;
        private java.util.List<String> receivers;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        public Builder setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }

        public Builder setReceivers(java.util.List<String> receivers) {
            this.receivers = receivers;
            return this;
        }


        public NotificationTaskInputDto build() {
            return new NotificationTaskInputDto(name, channelId, channelType, receivers);
        }

    }
}
