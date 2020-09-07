package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TunnelConfig
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class TunnelConfigResponseProjection extends GraphQLResponseProjection {

    public TunnelConfigResponseProjection() {
    }

    @Override
    public TunnelConfigResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TunnelConfigResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public TunnelConfigResponseProjection onGIOApiTunnelConfig(GIOApiTunnelConfigResponseProjection subProjection) {
        return onGIOApiTunnelConfig(null, subProjection);
    }

    public TunnelConfigResponseProjection onGIOApiTunnelConfig(String alias, GIOApiTunnelConfigResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on GIOApiTunnelConfig").alias(alias).projection(subProjection));
        return this;
    }

    public TunnelConfigResponseProjection onFileTunnelConfig(FileTunnelConfigResponseProjection subProjection) {
        return onFileTunnelConfig(null, subProjection);
    }

    public TunnelConfigResponseProjection onFileTunnelConfig(String alias, FileTunnelConfigResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on FileTunnelConfig").alias(alias).projection(subProjection));
        return this;
    }

    public TunnelConfigResponseProjection onMiniProgramTunnelConfig(MiniProgramTunnelConfigResponseProjection subProjection) {
        return onMiniProgramTunnelConfig(null, subProjection);
    }

    public TunnelConfigResponseProjection onMiniProgramTunnelConfig(String alias, MiniProgramTunnelConfigResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MiniProgramTunnelConfig").alias(alias).projection(subProjection));
        return this;
    }

    public TunnelConfigResponseProjection onJDBCTunnelConfig(JDBCTunnelConfigResponseProjection subProjection) {
        return onJDBCTunnelConfig(null, subProjection);
    }

    public TunnelConfigResponseProjection onJDBCTunnelConfig(String alias, JDBCTunnelConfigResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on JDBCTunnelConfig").alias(alias).projection(subProjection));
        return this;
    }

    public TunnelConfigResponseProjection onMobileTunnelConfig(MobileTunnelConfigResponseProjection subProjection) {
        return onMobileTunnelConfig(null, subProjection);
    }

    public TunnelConfigResponseProjection onMobileTunnelConfig(String alias, MobileTunnelConfigResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MobileTunnelConfig").alias(alias).projection(subProjection));
        return this;
    }

    public TunnelConfigResponseProjection typename() {
        return typename(null);
    }

    public TunnelConfigResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
