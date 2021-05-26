package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PasswordRecoverySetting
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class PasswordRecoverySettingResponseProjection extends GraphQLResponseProjection {

    public PasswordRecoverySettingResponseProjection() {
    }

    @Override
    public PasswordRecoverySettingResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PasswordRecoverySettingResponseProjection all$(int maxDepth) {
        this.enabled();
        this.verificationModes();
        if (projectionDepthOnFields.getOrDefault("PasswordRecoverySettingResponseProjection.NotificationChannelResponseProjection.smsChannel", 0) <= maxDepth) {
            projectionDepthOnFields.put("PasswordRecoverySettingResponseProjection.NotificationChannelResponseProjection.smsChannel", projectionDepthOnFields.getOrDefault("PasswordRecoverySettingResponseProjection.NotificationChannelResponseProjection.smsChannel", 0) + 1);
            this.smsChannel(new NotificationChannelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PasswordRecoverySettingResponseProjection.NotificationChannelResponseProjection.smsChannel", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PasswordRecoverySettingResponseProjection.NotificationChannelResponseProjection.emailChannel", 0) <= maxDepth) {
            projectionDepthOnFields.put("PasswordRecoverySettingResponseProjection.NotificationChannelResponseProjection.emailChannel", projectionDepthOnFields.getOrDefault("PasswordRecoverySettingResponseProjection.NotificationChannelResponseProjection.emailChannel", 0) + 1);
            this.emailChannel(new NotificationChannelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PasswordRecoverySettingResponseProjection.NotificationChannelResponseProjection.emailChannel", 0)));
        }
        this.typename();
        return this;
    }

    public PasswordRecoverySettingResponseProjection enabled() {
        return enabled(null);
    }

    public PasswordRecoverySettingResponseProjection enabled(String alias) {
        fields.add(new GraphQLResponseField("enabled").alias(alias));
        return this;
    }

    public PasswordRecoverySettingResponseProjection verificationModes() {
        return verificationModes(null);
    }

    public PasswordRecoverySettingResponseProjection verificationModes(String alias) {
        fields.add(new GraphQLResponseField("verificationModes").alias(alias));
        return this;
    }

    public PasswordRecoverySettingResponseProjection smsChannel(NotificationChannelResponseProjection subProjection) {
        return smsChannel(null, subProjection);
    }

    public PasswordRecoverySettingResponseProjection smsChannel(String alias, NotificationChannelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("smsChannel").alias(alias).projection(subProjection));
        return this;
    }

    public PasswordRecoverySettingResponseProjection emailChannel(NotificationChannelResponseProjection subProjection) {
        return emailChannel(null, subProjection);
    }

    public PasswordRecoverySettingResponseProjection emailChannel(String alias, NotificationChannelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("emailChannel").alias(alias).projection(subProjection));
        return this;
    }

    public PasswordRecoverySettingResponseProjection typename() {
        return typename(null);
    }

    public PasswordRecoverySettingResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
