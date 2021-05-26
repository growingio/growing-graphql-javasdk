package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AlertMetric
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AlertMetricResponseProjection extends GraphQLResponseProjection {

    public AlertMetricResponseProjection() {
    }

    @Override
    public AlertMetricResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AlertMetricResponseProjection all$(int maxDepth) {
        this.id();
        this.type();
        this.alias();
        this.name();
        this.math();
        if (projectionDepthOnFields.getOrDefault("AlertMetricResponseProjection.SubgroupAggregationResponseProjection.subgroupAggregation", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlertMetricResponseProjection.SubgroupAggregationResponseProjection.subgroupAggregation", projectionDepthOnFields.getOrDefault("AlertMetricResponseProjection.SubgroupAggregationResponseProjection.subgroupAggregation", 0) + 1);
            this.subgroupAggregation(new SubgroupAggregationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlertMetricResponseProjection.SubgroupAggregationResponseProjection.subgroupAggregation", 0)));
        }
        this.attribute();
        if (projectionDepthOnFields.getOrDefault("AlertMetricResponseProjection.FilterResponseProjection.filter", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlertMetricResponseProjection.FilterResponseProjection.filter", projectionDepthOnFields.getOrDefault("AlertMetricResponseProjection.FilterResponseProjection.filter", 0) + 1);
            this.filter(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlertMetricResponseProjection.FilterResponseProjection.filter", 0)));
        }
        this.timeRange();
        this.interval();
        if (projectionDepthOnFields.getOrDefault("AlertMetricResponseProjection.FilterResponseProjection.dimensionFilter", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlertMetricResponseProjection.FilterResponseProjection.dimensionFilter", projectionDepthOnFields.getOrDefault("AlertMetricResponseProjection.FilterResponseProjection.dimensionFilter", 0) + 1);
            this.dimensionFilter(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlertMetricResponseProjection.FilterResponseProjection.dimensionFilter", 0)));
        }
        this.targetUser();
        if (projectionDepthOnFields.getOrDefault("AlertMetricResponseProjection.RulesResponseProjection.rules", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlertMetricResponseProjection.RulesResponseProjection.rules", projectionDepthOnFields.getOrDefault("AlertMetricResponseProjection.RulesResponseProjection.rules", 0) + 1);
            this.rules(new RulesResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlertMetricResponseProjection.RulesResponseProjection.rules", 0)));
        }
        this.typename();
        return this;
    }

    public AlertMetricResponseProjection id() {
        return id(null);
    }

    public AlertMetricResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public AlertMetricResponseProjection type() {
        return type(null);
    }

    public AlertMetricResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public AlertMetricResponseProjection alias() {
        return alias(null);
    }

    public AlertMetricResponseProjection alias(String alias) {
        fields.add(new GraphQLResponseField("alias").alias(alias));
        return this;
    }

    public AlertMetricResponseProjection name() {
        return name(null);
    }

    public AlertMetricResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public AlertMetricResponseProjection math() {
        return math(null);
    }

    public AlertMetricResponseProjection math(String alias) {
        fields.add(new GraphQLResponseField("math").alias(alias));
        return this;
    }

    public AlertMetricResponseProjection subgroupAggregation(SubgroupAggregationResponseProjection subProjection) {
        return subgroupAggregation(null, subProjection);
    }

    public AlertMetricResponseProjection subgroupAggregation(String alias, SubgroupAggregationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subgroupAggregation").alias(alias).projection(subProjection));
        return this;
    }

    public AlertMetricResponseProjection attribute() {
        return attribute(null);
    }

    public AlertMetricResponseProjection attribute(String alias) {
        fields.add(new GraphQLResponseField("attribute").alias(alias));
        return this;
    }

    public AlertMetricResponseProjection filter(FilterResponseProjection subProjection) {
        return filter(null, subProjection);
    }

    public AlertMetricResponseProjection filter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filter").alias(alias).projection(subProjection));
        return this;
    }

    public AlertMetricResponseProjection timeRange() {
        return timeRange(null);
    }

    public AlertMetricResponseProjection timeRange(String alias) {
        fields.add(new GraphQLResponseField("timeRange").alias(alias));
        return this;
    }

    public AlertMetricResponseProjection interval() {
        return interval(null);
    }

    public AlertMetricResponseProjection interval(String alias) {
        fields.add(new GraphQLResponseField("interval").alias(alias));
        return this;
    }

    public AlertMetricResponseProjection dimensionFilter(FilterResponseProjection subProjection) {
        return dimensionFilter(null, subProjection);
    }

    public AlertMetricResponseProjection dimensionFilter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dimensionFilter").alias(alias).projection(subProjection));
        return this;
    }

    public AlertMetricResponseProjection targetUser() {
        return targetUser(null);
    }

    public AlertMetricResponseProjection targetUser(String alias) {
        fields.add(new GraphQLResponseField("targetUser").alias(alias));
        return this;
    }

    public AlertMetricResponseProjection rules(RulesResponseProjection subProjection) {
        return rules(null, subProjection);
    }

    public AlertMetricResponseProjection rules(String alias, RulesResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("rules").alias(alias).projection(subProjection));
        return this;
    }

    public AlertMetricResponseProjection typename() {
        return typename(null);
    }

    public AlertMetricResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
