package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for WebHook
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class WebHookResponseProjection extends GraphQLResponseProjection {

    public WebHookResponseProjection() {
    }

    @Override
    public WebHookResponseProjection all$() {
        return all$(3);
    }

    @Override
    public WebHookResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.url();
        this.method();
        this.secret();
        this.status();
        this.createdAt();
        this.creator();
        this.creatorId();
        if (projectionDepthOnFields.getOrDefault("WebHookResponseProjection.NotificationTaskResponseProjection.referers", 0) <= maxDepth) {
            projectionDepthOnFields.put("WebHookResponseProjection.NotificationTaskResponseProjection.referers", projectionDepthOnFields.getOrDefault("WebHookResponseProjection.NotificationTaskResponseProjection.referers", 0) + 1);
            this.referers(new NotificationTaskResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WebHookResponseProjection.NotificationTaskResponseProjection.referers", 0)));
        }
        this.typename();
        return this;
    }

    public WebHookResponseProjection id() {
        return id(null);
    }

    public WebHookResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public WebHookResponseProjection name() {
        return name(null);
    }

    public WebHookResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public WebHookResponseProjection url() {
        return url(null);
    }

    public WebHookResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public WebHookResponseProjection method() {
        return method(null);
    }

    public WebHookResponseProjection method(String alias) {
        fields.add(new GraphQLResponseField("method").alias(alias));
        return this;
    }

    public WebHookResponseProjection secret() {
        return secret(null);
    }

    public WebHookResponseProjection secret(String alias) {
        fields.add(new GraphQLResponseField("secret").alias(alias));
        return this;
    }

    public WebHookResponseProjection status() {
        return status(null);
    }

    public WebHookResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public WebHookResponseProjection createdAt() {
        return createdAt(null);
    }

    public WebHookResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public WebHookResponseProjection creator() {
        return creator(null);
    }

    public WebHookResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public WebHookResponseProjection creatorId() {
        return creatorId(null);
    }

    public WebHookResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public WebHookResponseProjection referers(NotificationTaskResponseProjection subProjection) {
        return referers(null, subProjection);
    }

    public WebHookResponseProjection referers(String alias, NotificationTaskResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("referers").alias(alias).projection(subProjection));
        return this;
    }

    public WebHookResponseProjection typename() {
        return typename(null);
    }

    public WebHookResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
