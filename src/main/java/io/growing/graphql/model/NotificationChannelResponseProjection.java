package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for NotificationChannel
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class NotificationChannelResponseProjection extends GraphQLResponseProjection {

    public NotificationChannelResponseProjection() {
    }

    @Override
    public NotificationChannelResponseProjection all$() {
        return all$(3);
    }

    @Override
    public NotificationChannelResponseProjection all$(int maxDepth) {
        this.id();
        this.type();
        this.typename();
        return this;
    }

    public NotificationChannelResponseProjection id() {
        return id(null);
    }

    public NotificationChannelResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public NotificationChannelResponseProjection type() {
        return type(null);
    }

    public NotificationChannelResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public NotificationChannelResponseProjection typename() {
        return typename(null);
    }

    public NotificationChannelResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
