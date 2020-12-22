package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Measurement
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MeasurementResponseProjection extends GraphQLResponseProjection {

    public MeasurementResponseProjection() {
    }

    @Override
    public MeasurementResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MeasurementResponseProjection all$(int maxDepth) {
        this.id();
        this.type();
        if (projectionDepthOnFields.getOrDefault("MeasurementResponseProjection.FilterResponseProjection.filter", 0) <= maxDepth) {
            projectionDepthOnFields.put("MeasurementResponseProjection.FilterResponseProjection.filter", projectionDepthOnFields.getOrDefault("MeasurementResponseProjection.FilterResponseProjection.filter", 0) + 1);
            this.filter(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MeasurementResponseProjection.FilterResponseProjection.filter", 0)));
        }
        this.name();
        this.action();
        this.timeRange();
        this.attribute();
        this.aggregator();
        this.weight();
        this.typename();
        return this;
    }

    public MeasurementResponseProjection id() {
        return id(null);
    }

    public MeasurementResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MeasurementResponseProjection type() {
        return type(null);
    }

    public MeasurementResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public MeasurementResponseProjection filter(FilterResponseProjection subProjection) {
        return filter(null, subProjection);
    }

    public MeasurementResponseProjection filter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filter").alias(alias).projection(subProjection));
        return this;
    }

    public MeasurementResponseProjection name() {
        return name(null);
    }

    public MeasurementResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public MeasurementResponseProjection action() {
        return action(null);
    }

    public MeasurementResponseProjection action(String alias) {
        fields.add(new GraphQLResponseField("action").alias(alias));
        return this;
    }

    public MeasurementResponseProjection timeRange() {
        return timeRange(null);
    }

    public MeasurementResponseProjection timeRange(String alias) {
        fields.add(new GraphQLResponseField("timeRange").alias(alias));
        return this;
    }

    public MeasurementResponseProjection attribute() {
        return attribute(null);
    }

    public MeasurementResponseProjection attribute(String alias) {
        fields.add(new GraphQLResponseField("attribute").alias(alias));
        return this;
    }

    public MeasurementResponseProjection aggregator() {
        return aggregator(null);
    }

    public MeasurementResponseProjection aggregator(String alias) {
        fields.add(new GraphQLResponseField("aggregator").alias(alias));
        return this;
    }

    public MeasurementResponseProjection weight() {
        return weight(null);
    }

    public MeasurementResponseProjection weight(String alias) {
        fields.add(new GraphQLResponseField("weight").alias(alias));
        return this;
    }

    public MeasurementResponseProjection typename() {
        return typename(null);
    }

    public MeasurementResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
