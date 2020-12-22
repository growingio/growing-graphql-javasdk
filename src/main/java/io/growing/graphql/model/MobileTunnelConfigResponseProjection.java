package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MobileTunnelConfig
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MobileTunnelConfigResponseProjection extends GraphQLResponseProjection {

    public MobileTunnelConfigResponseProjection() {
    }

    @Override
    public MobileTunnelConfigResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MobileTunnelConfigResponseProjection all$(int maxDepth) {
        this.platform();
        this.urlScheme();
        this.spn();
        this.typename();
        return this;
    }

    public MobileTunnelConfigResponseProjection platform() {
        return platform(null);
    }

    public MobileTunnelConfigResponseProjection platform(String alias) {
        fields.add(new GraphQLResponseField("platform").alias(alias));
        return this;
    }

    public MobileTunnelConfigResponseProjection urlScheme() {
        return urlScheme(null);
    }

    public MobileTunnelConfigResponseProjection urlScheme(String alias) {
        fields.add(new GraphQLResponseField("urlScheme").alias(alias));
        return this;
    }

    public MobileTunnelConfigResponseProjection spn() {
        return spn(null);
    }

    public MobileTunnelConfigResponseProjection spn(String alias) {
        fields.add(new GraphQLResponseField("spn").alias(alias));
        return this;
    }

    public MobileTunnelConfigResponseProjection typename() {
        return typename(null);
    }

    public MobileTunnelConfigResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
