package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class PasswordRecoverySettingDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Boolean enabled;
    @javax.validation.constraints.NotNull
    private java.util.List<String> verificationModes;
    private NotificationChannelDto smsChannel;
    private NotificationChannelDto emailChannel;

    public PasswordRecoverySettingDto() {
    }

    public PasswordRecoverySettingDto(Boolean enabled, java.util.List<String> verificationModes, NotificationChannelDto smsChannel, NotificationChannelDto emailChannel) {
        this.enabled = enabled;
        this.verificationModes = verificationModes;
        this.smsChannel = smsChannel;
        this.emailChannel = emailChannel;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public java.util.List<String> getVerificationModes() {
        return verificationModes;
    }
    public void setVerificationModes(java.util.List<String> verificationModes) {
        this.verificationModes = verificationModes;
    }

    public NotificationChannelDto getSmsChannel() {
        return smsChannel;
    }
    public void setSmsChannel(NotificationChannelDto smsChannel) {
        this.smsChannel = smsChannel;
    }

    public NotificationChannelDto getEmailChannel() {
        return emailChannel;
    }
    public void setEmailChannel(NotificationChannelDto emailChannel) {
        this.emailChannel = emailChannel;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (enabled != null) {
            joiner.add("enabled: " + GraphQLRequestSerializer.getEntry(enabled));
        }
        if (verificationModes != null) {
            joiner.add("verificationModes: " + GraphQLRequestSerializer.getEntry(verificationModes));
        }
        if (smsChannel != null) {
            joiner.add("smsChannel: " + GraphQLRequestSerializer.getEntry(smsChannel));
        }
        if (emailChannel != null) {
            joiner.add("emailChannel: " + GraphQLRequestSerializer.getEntry(emailChannel));
        }
        return joiner.toString();
    }

    public static PasswordRecoverySettingDto.Builder builder() {
        return new PasswordRecoverySettingDto.Builder();
    }

    public static class Builder {

        private Boolean enabled;
        private java.util.List<String> verificationModes;
        private NotificationChannelDto smsChannel;
        private NotificationChannelDto emailChannel;

        public Builder() {
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setVerificationModes(java.util.List<String> verificationModes) {
            this.verificationModes = verificationModes;
            return this;
        }

        public Builder setSmsChannel(NotificationChannelDto smsChannel) {
            this.smsChannel = smsChannel;
            return this;
        }

        public Builder setEmailChannel(NotificationChannelDto emailChannel) {
            this.emailChannel = emailChannel;
            return this;
        }


        public PasswordRecoverySettingDto build() {
            return new PasswordRecoverySettingDto(enabled, verificationModes, smsChannel, emailChannel);
        }

    }
}
