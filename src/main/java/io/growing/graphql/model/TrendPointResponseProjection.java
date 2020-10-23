package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TrendPoint
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class TrendPointResponseProjection extends GraphQLResponseProjection {

    public TrendPointResponseProjection() {
    }

    @Override
    public TrendPointResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TrendPointResponseProjection all$(int maxDepth) {
        this.timestamp();
        this.count();
        this.typename();
        return this;
    }

    public TrendPointResponseProjection timestamp() {
        return timestamp(null);
    }

    public TrendPointResponseProjection timestamp(String alias) {
        fields.add(new GraphQLResponseField("timestamp").alias(alias));
        return this;
    }

    public TrendPointResponseProjection count() {
        return count(null);
    }

    public TrendPointResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }

    public TrendPointResponseProjection typename() {
        return typename(null);
    }

    public TrendPointResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
