package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Granularity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class GranularityResponseProjection extends GraphQLResponseProjection {

    public GranularityResponseProjection() {
    }

    @Override
    public GranularityResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GranularityResponseProjection all$(int maxDepth) {
        this.id();
        this.values();
        this.interval();
        this.split();
        this.statistics();
        this.ranges();
        this.top();
        this.period();
        this.trend();
        this.typename();
        return this;
    }

    public GranularityResponseProjection id() {
        return id(null);
    }

    public GranularityResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public GranularityResponseProjection values() {
        return values(null);
    }

    public GranularityResponseProjection values(String alias) {
        fields.add(new GraphQLResponseField("values").alias(alias));
        return this;
    }

    public GranularityResponseProjection interval() {
        return interval(null);
    }

    public GranularityResponseProjection interval(String alias) {
        fields.add(new GraphQLResponseField("interval").alias(alias));
        return this;
    }

    public GranularityResponseProjection split() {
        return split(null);
    }

    public GranularityResponseProjection split(String alias) {
        fields.add(new GraphQLResponseField("split").alias(alias));
        return this;
    }

    public GranularityResponseProjection statistics() {
        return statistics(null);
    }

    public GranularityResponseProjection statistics(String alias) {
        fields.add(new GraphQLResponseField("statistics").alias(alias));
        return this;
    }

    public GranularityResponseProjection ranges() {
        return ranges(null);
    }

    public GranularityResponseProjection ranges(String alias) {
        fields.add(new GraphQLResponseField("ranges").alias(alias));
        return this;
    }

    public GranularityResponseProjection top() {
        return top(null);
    }

    public GranularityResponseProjection top(String alias) {
        fields.add(new GraphQLResponseField("top").alias(alias));
        return this;
    }

    public GranularityResponseProjection period() {
        return period(null);
    }

    public GranularityResponseProjection period(String alias) {
        fields.add(new GraphQLResponseField("period").alias(alias));
        return this;
    }

    public GranularityResponseProjection trend() {
        return trend(null);
    }

    public GranularityResponseProjection trend(String alias) {
        fields.add(new GraphQLResponseField("trend").alias(alias));
        return this;
    }

    public GranularityResponseProjection typename() {
        return typename(null);
    }

    public GranularityResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
