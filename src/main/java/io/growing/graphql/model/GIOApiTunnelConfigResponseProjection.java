package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for GIOApiTunnelConfig
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class GIOApiTunnelConfigResponseProjection extends GraphQLResponseProjection {

    public GIOApiTunnelConfigResponseProjection() {
    }

    @Override
    public GIOApiTunnelConfigResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GIOApiTunnelConfigResponseProjection all$(int maxDepth) {
        this.projectUid();
        this.projectKey();
        this.token();
        this.typename();
        return this;
    }

    public GIOApiTunnelConfigResponseProjection projectUid() {
        return projectUid(null);
    }

    public GIOApiTunnelConfigResponseProjection projectUid(String alias) {
        fields.add(new GraphQLResponseField("projectUid").alias(alias));
        return this;
    }

    public GIOApiTunnelConfigResponseProjection projectKey() {
        return projectKey(null);
    }

    public GIOApiTunnelConfigResponseProjection projectKey(String alias) {
        fields.add(new GraphQLResponseField("projectKey").alias(alias));
        return this;
    }

    public GIOApiTunnelConfigResponseProjection token() {
        return token(null);
    }

    public GIOApiTunnelConfigResponseProjection token(String alias) {
        fields.add(new GraphQLResponseField("token").alias(alias));
        return this;
    }

    public GIOApiTunnelConfigResponseProjection typename() {
        return typename(null);
    }

    public GIOApiTunnelConfigResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
