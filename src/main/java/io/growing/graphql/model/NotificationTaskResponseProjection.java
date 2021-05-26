package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for NotificationTask
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class NotificationTaskResponseProjection extends GraphQLResponseProjection {

    public NotificationTaskResponseProjection() {
    }

    @Override
    public NotificationTaskResponseProjection all$() {
        return all$(3);
    }

    @Override
    public NotificationTaskResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.channelType();
        if (projectionDepthOnFields.getOrDefault("NotificationTaskResponseProjection.WebHookResponseProjection.channel", 0) <= maxDepth) {
            projectionDepthOnFields.put("NotificationTaskResponseProjection.WebHookResponseProjection.channel", projectionDepthOnFields.getOrDefault("NotificationTaskResponseProjection.WebHookResponseProjection.channel", 0) + 1);
            this.channel(new WebHookResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NotificationTaskResponseProjection.WebHookResponseProjection.channel", 0)));
        }
        this.receivers();
        this.creator();
        this.createdAt();
        this.typename();
        return this;
    }

    public NotificationTaskResponseProjection id() {
        return id(null);
    }

    public NotificationTaskResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public NotificationTaskResponseProjection name() {
        return name(null);
    }

    public NotificationTaskResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public NotificationTaskResponseProjection channelType() {
        return channelType(null);
    }

    public NotificationTaskResponseProjection channelType(String alias) {
        fields.add(new GraphQLResponseField("channelType").alias(alias));
        return this;
    }

    public NotificationTaskResponseProjection channel(WebHookResponseProjection subProjection) {
        return channel(null, subProjection);
    }

    public NotificationTaskResponseProjection channel(String alias, WebHookResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("channel").alias(alias).projection(subProjection));
        return this;
    }

    public NotificationTaskResponseProjection receivers() {
        return receivers(null);
    }

    public NotificationTaskResponseProjection receivers(String alias) {
        fields.add(new GraphQLResponseField("receivers").alias(alias));
        return this;
    }

    public NotificationTaskResponseProjection creator() {
        return creator(null);
    }

    public NotificationTaskResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public NotificationTaskResponseProjection createdAt() {
        return createdAt(null);
    }

    public NotificationTaskResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public NotificationTaskResponseProjection typename() {
        return typename(null);
    }

    public NotificationTaskResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
