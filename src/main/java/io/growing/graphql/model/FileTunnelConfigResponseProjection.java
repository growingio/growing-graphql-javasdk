package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for FileTunnelConfig
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class FileTunnelConfigResponseProjection extends GraphQLResponseProjection {

    public FileTunnelConfigResponseProjection() {
    }

    @Override
    public FileTunnelConfigResponseProjection all$() {
        return all$(3);
    }

    @Override
    public FileTunnelConfigResponseProjection all$(int maxDepth) {
        this.type();
        this.typename();
        return this;
    }

    public FileTunnelConfigResponseProjection type() {
        return type(null);
    }

    public FileTunnelConfigResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public FileTunnelConfigResponseProjection typename() {
        return typename(null);
    }

    public FileTunnelConfigResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
