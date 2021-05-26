package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ComputeDirective
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ComputeDirectiveResponseProjection extends GraphQLResponseProjection {

    public ComputeDirectiveResponseProjection() {
    }

    @Override
    public ComputeDirectiveResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ComputeDirectiveResponseProjection all$(int maxDepth) {
        this.alias();
        if (projectionDepthOnFields.getOrDefault("ComputeDirectiveResponseProjection.MeasurementResponseProjection.measurement", 0) <= maxDepth) {
            projectionDepthOnFields.put("ComputeDirectiveResponseProjection.MeasurementResponseProjection.measurement", projectionDepthOnFields.getOrDefault("ComputeDirectiveResponseProjection.MeasurementResponseProjection.measurement", 0) + 1);
            this.measurement(new MeasurementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ComputeDirectiveResponseProjection.MeasurementResponseProjection.measurement", 0)));
        }
        this.timeRange();
        if (projectionDepthOnFields.getOrDefault("ComputeDirectiveResponseProjection.FilterResponseProjection.filter", 0) <= maxDepth) {
            projectionDepthOnFields.put("ComputeDirectiveResponseProjection.FilterResponseProjection.filter", projectionDepthOnFields.getOrDefault("ComputeDirectiveResponseProjection.FilterResponseProjection.filter", 0) + 1);
            this.filter(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ComputeDirectiveResponseProjection.FilterResponseProjection.filter", 0)));
        }
        this.op();
        this.attribute();
        this.aggregator();
        this.values();
        this.typename();
        return this;
    }

    public ComputeDirectiveResponseProjection alias() {
        return alias(null);
    }

    public ComputeDirectiveResponseProjection alias(String alias) {
        fields.add(new GraphQLResponseField("alias").alias(alias));
        return this;
    }

    public ComputeDirectiveResponseProjection measurement(MeasurementResponseProjection subProjection) {
        return measurement(null, subProjection);
    }

    public ComputeDirectiveResponseProjection measurement(String alias, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("measurement").alias(alias).projection(subProjection));
        return this;
    }

    public ComputeDirectiveResponseProjection timeRange() {
        return timeRange(null);
    }

    public ComputeDirectiveResponseProjection timeRange(String alias) {
        fields.add(new GraphQLResponseField("timeRange").alias(alias));
        return this;
    }

    public ComputeDirectiveResponseProjection filter(FilterResponseProjection subProjection) {
        return filter(null, subProjection);
    }

    public ComputeDirectiveResponseProjection filter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filter").alias(alias).projection(subProjection));
        return this;
    }

    public ComputeDirectiveResponseProjection op() {
        return op(null);
    }

    public ComputeDirectiveResponseProjection op(String alias) {
        fields.add(new GraphQLResponseField("op").alias(alias));
        return this;
    }

    public ComputeDirectiveResponseProjection attribute() {
        return attribute(null);
    }

    public ComputeDirectiveResponseProjection attribute(String alias) {
        fields.add(new GraphQLResponseField("attribute").alias(alias));
        return this;
    }

    public ComputeDirectiveResponseProjection aggregator() {
        return aggregator(null);
    }

    public ComputeDirectiveResponseProjection aggregator(String alias) {
        fields.add(new GraphQLResponseField("aggregator").alias(alias));
        return this;
    }

    public ComputeDirectiveResponseProjection values() {
        return values(null);
    }

    public ComputeDirectiveResponseProjection values(String alias) {
        fields.add(new GraphQLResponseField("values").alias(alias));
        return this;
    }

    public ComputeDirectiveResponseProjection typename() {
        return typename(null);
    }

    public ComputeDirectiveResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
