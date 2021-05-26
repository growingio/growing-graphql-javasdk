package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OlapMetric
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class OlapMetricResponseProjection extends GraphQLResponseProjection {

    public OlapMetricResponseProjection() {
    }

    @Override
    public OlapMetricResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OlapMetricResponseProjection all$(int maxDepth) {
        this.id();
        this.type();
        this.name();
        this.alias();
        this.attribute();
        if (projectionDepthOnFields.getOrDefault("OlapMetricResponseProjection.SubgroupAggregationResponseProjection.subgroupAggregation", 0) <= maxDepth) {
            projectionDepthOnFields.put("OlapMetricResponseProjection.SubgroupAggregationResponseProjection.subgroupAggregation", projectionDepthOnFields.getOrDefault("OlapMetricResponseProjection.SubgroupAggregationResponseProjection.subgroupAggregation", 0) + 1);
            this.subgroupAggregation(new SubgroupAggregationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OlapMetricResponseProjection.SubgroupAggregationResponseProjection.subgroupAggregation", 0)));
        }
        this.math();
        if (projectionDepthOnFields.getOrDefault("OlapMetricResponseProjection.FilterResponseProjection.filter", 0) <= maxDepth) {
            projectionDepthOnFields.put("OlapMetricResponseProjection.FilterResponseProjection.filter", projectionDepthOnFields.getOrDefault("OlapMetricResponseProjection.FilterResponseProjection.filter", 0) + 1);
            this.filter(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OlapMetricResponseProjection.FilterResponseProjection.filter", 0)));
        }
        this.typename();
        return this;
    }

    public OlapMetricResponseProjection id() {
        return id(null);
    }

    public OlapMetricResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public OlapMetricResponseProjection type() {
        return type(null);
    }

    public OlapMetricResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public OlapMetricResponseProjection name() {
        return name(null);
    }

    public OlapMetricResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public OlapMetricResponseProjection alias() {
        return alias(null);
    }

    public OlapMetricResponseProjection alias(String alias) {
        fields.add(new GraphQLResponseField("alias").alias(alias));
        return this;
    }

    public OlapMetricResponseProjection attribute() {
        return attribute(null);
    }

    public OlapMetricResponseProjection attribute(String alias) {
        fields.add(new GraphQLResponseField("attribute").alias(alias));
        return this;
    }

    public OlapMetricResponseProjection subgroupAggregation(SubgroupAggregationResponseProjection subProjection) {
        return subgroupAggregation(null, subProjection);
    }

    public OlapMetricResponseProjection subgroupAggregation(String alias, SubgroupAggregationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subgroupAggregation").alias(alias).projection(subProjection));
        return this;
    }

    public OlapMetricResponseProjection math() {
        return math(null);
    }

    public OlapMetricResponseProjection math(String alias) {
        fields.add(new GraphQLResponseField("math").alias(alias));
        return this;
    }

    public OlapMetricResponseProjection filter(FilterResponseProjection subProjection) {
        return filter(null, subProjection);
    }

    public OlapMetricResponseProjection filter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filter").alias(alias).projection(subProjection));
        return this;
    }

    public OlapMetricResponseProjection typename() {
        return typename(null);
    }

    public OlapMetricResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
