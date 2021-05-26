package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for HubbleInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class HubbleInfoResponseProjection extends GraphQLResponseProjection {

    public HubbleInfoResponseProjection() {
    }

    @Override
    public HubbleInfoResponseProjection all$() {
        return all$(3);
    }

    @Override
    public HubbleInfoResponseProjection all$(int maxDepth) {
        this.jwtSharedSecret();
        this.siteUrl();
        this.typename();
        return this;
    }

    public HubbleInfoResponseProjection jwtSharedSecret() {
        return jwtSharedSecret(null);
    }

    public HubbleInfoResponseProjection jwtSharedSecret(String alias) {
        fields.add(new GraphQLResponseField("jwtSharedSecret").alias(alias));
        return this;
    }

    public HubbleInfoResponseProjection siteUrl() {
        return siteUrl(null);
    }

    public HubbleInfoResponseProjection siteUrl(String alias) {
        fields.add(new GraphQLResponseField("siteUrl").alias(alias));
        return this;
    }

    public HubbleInfoResponseProjection typename() {
        return typename(null);
    }

    public HubbleInfoResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
