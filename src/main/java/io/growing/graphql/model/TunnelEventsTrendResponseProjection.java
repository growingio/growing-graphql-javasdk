package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TunnelEventsTrend
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TunnelEventsTrendResponseProjection extends GraphQLResponseProjection {

    public TunnelEventsTrendResponseProjection() {
    }

    @Override
    public TunnelEventsTrendResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TunnelEventsTrendResponseProjection all$(int maxDepth) {
        this.totalCount();
        this.interval();
        if (projectionDepthOnFields.getOrDefault("TunnelEventsTrendResponseProjection.TrendPointResponseProjection.points", 0) <= maxDepth) {
            projectionDepthOnFields.put("TunnelEventsTrendResponseProjection.TrendPointResponseProjection.points", projectionDepthOnFields.getOrDefault("TunnelEventsTrendResponseProjection.TrendPointResponseProjection.points", 0) + 1);
            this.points(new TrendPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TunnelEventsTrendResponseProjection.TrendPointResponseProjection.points", 0)));
        }
        this.typename();
        return this;
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
