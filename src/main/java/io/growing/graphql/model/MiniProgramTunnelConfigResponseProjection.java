package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MiniProgramTunnelConfig
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MiniProgramTunnelConfigResponseProjection extends GraphQLResponseProjection {

    public MiniProgramTunnelConfigResponseProjection() {
    }

    public MiniProgramTunnelConfigResponseProjection programType() {
        return programType(null);
    }

    public MiniProgramTunnelConfigResponseProjection programType(String alias) {
        fields.add(new GraphQLResponseField("programType").alias(alias));
        return this;
    }

    public MiniProgramTunnelConfigResponseProjection urlScheme() {
        return urlScheme(null);
    }

    public MiniProgramTunnelConfigResponseProjection urlScheme(String alias) {
        fields.add(new GraphQLResponseField("urlScheme").alias(alias));
        return this;
    }

    public MiniProgramTunnelConfigResponseProjection typename() {
        return typename(null);
    }

    public MiniProgramTunnelConfigResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
