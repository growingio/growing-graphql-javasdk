package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SubgroupAggregation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class SubgroupAggregationResponseProjection extends GraphQLResponseProjection {

    public SubgroupAggregationResponseProjection() {
    }

    @Override
    public SubgroupAggregationResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SubgroupAggregationResponseProjection all$(int maxDepth) {
        this.type();
        this.math();
        this.typename();
        return this;
    }

    public SubgroupAggregationResponseProjection type() {
        return type(null);
    }

    public SubgroupAggregationResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public SubgroupAggregationResponseProjection math() {
        return math(null);
    }

    public SubgroupAggregationResponseProjection math(String alias) {
        fields.add(new GraphQLResponseField("math").alias(alias));
        return this;
    }

    public SubgroupAggregationResponseProjection typename() {
        return typename(null);
    }

    public SubgroupAggregationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
