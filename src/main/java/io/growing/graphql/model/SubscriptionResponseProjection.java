package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Subscription
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class SubscriptionResponseProjection extends GraphQLResponseProjection {

    public SubscriptionResponseProjection() {
    }

    @Override
    public SubscriptionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SubscriptionResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.status();
        if (projectionDepthOnFields.getOrDefault("SubscriptionResponseProjection.SubscriptionResponseProjection.children", 0) <= maxDepth) {
            projectionDepthOnFields.put("SubscriptionResponseProjection.SubscriptionResponseProjection.children", projectionDepthOnFields.getOrDefault("SubscriptionResponseProjection.SubscriptionResponseProjection.children", 0) + 1);
            this.children(new SubscriptionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SubscriptionResponseProjection.SubscriptionResponseProjection.children", 0)));
        }
        this.typename();
        return this;
    }

    public SubscriptionResponseProjection id() {
        return id(null);
    }

    public SubscriptionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SubscriptionResponseProjection name() {
        return name(null);
    }

    public SubscriptionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public SubscriptionResponseProjection status() {
        return status(null);
    }

    public SubscriptionResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public SubscriptionResponseProjection children(SubscriptionResponseProjection subProjection) {
        return children(null, subProjection);
    }

    public SubscriptionResponseProjection children(String alias, SubscriptionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("children").alias(alias).projection(subProjection));
        return this;
    }

    public SubscriptionResponseProjection typename() {
        return typename(null);
    }

    public SubscriptionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
