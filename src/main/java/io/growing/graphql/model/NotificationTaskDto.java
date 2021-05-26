package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class NotificationTaskDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String channelType;
    private WebHookDto channel;
    @javax.validation.constraints.NotNull
    private java.util.List<String> receivers;
    private String creator;
    private java.time.ZonedDateTime createdAt;

    public NotificationTaskDto() {
    }

    public NotificationTaskDto(String id, String name, String channelType, WebHookDto channel, java.util.List<String> receivers, String creator, java.time.ZonedDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.channelType = channelType;
        this.channel = channel;
        this.receivers = receivers;
        this.creator = creator;
        this.createdAt = createdAt;
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

    public String getChannelType() {
        return channelType;
    }
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public WebHookDto getChannel() {
        return channel;
    }
    public void setChannel(WebHookDto channel) {
        this.channel = channel;
    }

    public java.util.List<String> getReceivers() {
        return receivers;
    }
    public void setReceivers(java.util.List<String> receivers) {
        this.receivers = receivers;
    }

    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
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
        if (channelType != null) {
            joiner.add("channelType: " + GraphQLRequestSerializer.getEntry(channelType));
        }
        if (channel != null) {
            joiner.add("channel: " + GraphQLRequestSerializer.getEntry(channel));
        }
        if (receivers != null) {
            joiner.add("receivers: " + GraphQLRequestSerializer.getEntry(receivers));
        }
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        return joiner.toString();
    }

    public static NotificationTaskDto.Builder builder() {
        return new NotificationTaskDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String channelType;
        private WebHookDto channel;
        private java.util.List<String> receivers;
        private String creator;
        private java.time.ZonedDateTime createdAt;

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

        public Builder setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }

        public Builder setChannel(WebHookDto channel) {
            this.channel = channel;
            return this;
        }

        public Builder setReceivers(java.util.List<String> receivers) {
            this.receivers = receivers;
            return this;
        }

        public Builder setCreator(String creator) {
            this.creator = creator;
            return this;
        }

        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }


        public NotificationTaskDto build() {
            return new NotificationTaskDto(id, name, channelType, channel, receivers, creator, createdAt);
        }

    }
}
