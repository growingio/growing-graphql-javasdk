package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for EventAnalysis
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class EventAnalysisResponseProjection extends GraphQLResponseProjection {

    public EventAnalysisResponseProjection() {
    }

    @Override
    public EventAnalysisResponseProjection all$() {
        return all$(3);
    }

    @Override
    public EventAnalysisResponseProjection all$(int maxDepth) {
        this.id();
        this.projectId();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventAnalysisResponseProjection.MeasurementResponseProjection.measurements", projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0) + 1);
            this.measurements(new MeasurementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0)));
        }
        this.dimensions();
        if (projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.GranularityResponseProjection.granularities", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventAnalysisResponseProjection.GranularityResponseProjection.granularities", projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.GranularityResponseProjection.granularities", 0) + 1);
            this.granularities(new GranularityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.GranularityResponseProjection.granularities", 0)));
        }
        this.timeRange();
        if (projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.FilterResponseProjection.filter", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventAnalysisResponseProjection.FilterResponseProjection.filter", projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.FilterResponseProjection.filter", 0) + 1);
            this.filter(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.FilterResponseProjection.filter", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventAnalysisResponseProjection.TargetUserResponseProjection.targetUser", projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0) + 1);
            this.targetUser(new TargetUserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0)));
        }
        this.limit();
        this.attrs();
        if (projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.OrderResponseProjection.orders", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventAnalysisResponseProjection.OrderResponseProjection.orders", projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.OrderResponseProjection.orders", 0) + 1);
            this.orders(new OrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.OrderResponseProjection.orders", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.SplitterResponseProjection.splitter", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventAnalysisResponseProjection.SplitterResponseProjection.splitter", projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.SplitterResponseProjection.splitter", 0) + 1);
            this.splitter(new SplitterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventAnalysisResponseProjection.SplitterResponseProjection.splitter", 0)));
        }
        this.chartType();
        this.isSystem();
        this.businessType();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.typename();
        return this;
    }

    public EventAnalysisResponseProjection id() {
        return id(null);
    }

    public EventAnalysisResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection projectId() {
        return projectId(null);
    }

    public EventAnalysisResponseProjection projectId(String alias) {
        fields.add(new GraphQLResponseField("projectId").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection name() {
        return name(null);
    }

    public EventAnalysisResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection description() {
        return description(null);
    }

    public EventAnalysisResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection measurements(MeasurementResponseProjection subProjection) {
        return measurements(null, subProjection);
    }

    public EventAnalysisResponseProjection measurements(String alias, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("measurements").alias(alias).projection(subProjection));
        return this;
    }

    public EventAnalysisResponseProjection dimensions() {
        return dimensions(null);
    }

    public EventAnalysisResponseProjection dimensions(String alias) {
        fields.add(new GraphQLResponseField("dimensions").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection granularities(GranularityResponseProjection subProjection) {
        return granularities(null, subProjection);
    }

    public EventAnalysisResponseProjection granularities(String alias, GranularityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("granularities").alias(alias).projection(subProjection));
        return this;
    }

    public EventAnalysisResponseProjection timeRange() {
        return timeRange(null);
    }

    public EventAnalysisResponseProjection timeRange(String alias) {
        fields.add(new GraphQLResponseField("timeRange").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection filter(FilterResponseProjection subProjection) {
        return filter(null, subProjection);
    }

    public EventAnalysisResponseProjection filter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filter").alias(alias).projection(subProjection));
        return this;
    }

    public EventAnalysisResponseProjection targetUser(TargetUserResponseProjection subProjection) {
        return targetUser(null, subProjection);
    }

    public EventAnalysisResponseProjection targetUser(String alias, TargetUserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("targetUser").alias(alias).projection(subProjection));
        return this;
    }

    public EventAnalysisResponseProjection limit() {
        return limit(null);
    }

    public EventAnalysisResponseProjection limit(String alias) {
        fields.add(new GraphQLResponseField("limit").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection attrs() {
        return attrs(null);
    }

    public EventAnalysisResponseProjection attrs(String alias) {
        fields.add(new GraphQLResponseField("attrs").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection orders(OrderResponseProjection subProjection) {
        return orders(null, subProjection);
    }

    public EventAnalysisResponseProjection orders(String alias, OrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("orders").alias(alias).projection(subProjection));
        return this;
    }

    public EventAnalysisResponseProjection splitter(SplitterResponseProjection subProjection) {
        return splitter(null, subProjection);
    }

    public EventAnalysisResponseProjection splitter(String alias, SplitterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("splitter").alias(alias).projection(subProjection));
        return this;
    }

    public EventAnalysisResponseProjection chartType() {
        return chartType(null);
    }

    public EventAnalysisResponseProjection chartType(String alias) {
        fields.add(new GraphQLResponseField("chartType").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection isSystem() {
        return isSystem(null);
    }

    public EventAnalysisResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection businessType() {
        return businessType(null);
    }

    public EventAnalysisResponseProjection businessType(String alias) {
        fields.add(new GraphQLResponseField("businessType").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection creatorId() {
        return creatorId(null);
    }

    public EventAnalysisResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection createdAt() {
        return createdAt(null);
    }

    public EventAnalysisResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection updaterId() {
        return updaterId(null);
    }

    public EventAnalysisResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public EventAnalysisResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection creator() {
        return creator(null);
    }

    public EventAnalysisResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection updater() {
        return updater(null);
    }

    public EventAnalysisResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public EventAnalysisResponseProjection typename() {
        return typename(null);
    }

    public EventAnalysisResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
