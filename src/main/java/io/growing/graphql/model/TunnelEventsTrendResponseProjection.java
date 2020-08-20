package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TunnelEventsTrend
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class TunnelEventsTrendResponseProjection extends GraphQLResponseProjection {

    public TunnelEventsTrendResponseProjection() {
    }

    public TunnelEventsTrendResponseProjection totalCount() {
        return totalCount(null);
    }

    public TunnelEventsTrendResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public TunnelEventsTrendResponseProjection interval() {
        return interval(null);
    }

    public TunnelEventsTrendResponseProjection interval(String alias) {
        fields.add(new GraphQLResponseField("interval").alias(alias));
        return this;
    }

    public TunnelEventsTrendResponseProjection points(TrendPointResponseProjection subProjection) {
        return points(null, subProjection);
    }

    public TunnelEventsTrendResponseProjection points(String alias, TrendPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("points").alias(alias).projection(subProjection));
        return this;
    }

    public TunnelEventsTrendResponseProjection typename() {
        return typename(null);
    }

    public TunnelEventsTrendResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
