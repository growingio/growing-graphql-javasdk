package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class PasswordRecoverySettingInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Boolean enabled;
    @javax.validation.constraints.NotNull
    private java.util.List<String> verificationModes;
    private NotificationChannelInputDto smsChannel;
    private NotificationChannelInputDto emailChannel;

    public PasswordRecoverySettingInputDto() {
    }

    public PasswordRecoverySettingInputDto(Boolean enabled, java.util.List<String> verificationModes, NotificationChannelInputDto smsChannel, NotificationChannelInputDto emailChannel) {
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

    public NotificationChannelInputDto getSmsChannel() {
        return smsChannel;
    }
    public void setSmsChannel(NotificationChannelInputDto smsChannel) {
        this.smsChannel = smsChannel;
    }

    public NotificationChannelInputDto getEmailChannel() {
        return emailChannel;
    }
    public void setEmailChannel(NotificationChannelInputDto emailChannel) {
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

    public static PasswordRecoverySettingInputDto.Builder builder() {
        return new PasswordRecoverySettingInputDto.Builder();
    }

    public static class Builder {

        private Boolean enabled;
        private java.util.List<String> verificationModes;
        private NotificationChannelInputDto smsChannel;
        private NotificationChannelInputDto emailChannel;

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

        public Builder setSmsChannel(NotificationChannelInputDto smsChannel) {
            this.smsChannel = smsChannel;
            return this;
        }

        public Builder setEmailChannel(NotificationChannelInputDto emailChannel) {
            this.emailChannel = emailChannel;
            return this;
        }


        public PasswordRecoverySettingInputDto build() {
            return new PasswordRecoverySettingInputDto(enabled, verificationModes, smsChannel, emailChannel);
        }

    }
}
