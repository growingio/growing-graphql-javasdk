package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for JDBCTunnelConfig
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class JDBCTunnelConfigResponseProjection extends GraphQLResponseProjection {

    public JDBCTunnelConfigResponseProjection() {
    }

    @Override
    public JDBCTunnelConfigResponseProjection all$() {
        return all$(3);
    }

    @Override
    public JDBCTunnelConfigResponseProjection all$(int maxDepth) {
        this.url();
        this.username();
        this.password();
        this.typename();
        return this;
    }

    public JDBCTunnelConfigResponseProjection url() {
        return url(null);
    }

    public JDBCTunnelConfigResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public JDBCTunnelConfigResponseProjection username() {
        return username(null);
    }

    public JDBCTunnelConfigResponseProjection username(String alias) {
        fields.add(new GraphQLResponseField("username").alias(alias));
        return this;
    }

    public JDBCTunnelConfigResponseProjection password() {
        return password(null);
    }

    public JDBCTunnelConfigResponseProjection password(String alias) {
        fields.add(new GraphQLResponseField("password").alias(alias));
        return this;
    }

    public JDBCTunnelConfigResponseProjection typename() {
        return typename(null);
    }

    public JDBCTunnelConfigResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
