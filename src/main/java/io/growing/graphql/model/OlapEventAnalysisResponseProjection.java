package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OlapEventAnalysis
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class OlapEventAnalysisResponseProjection extends GraphQLResponseProjection {

    public OlapEventAnalysisResponseProjection() {
    }

    @Override
    public OlapEventAnalysisResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OlapEventAnalysisResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.OlapMetricResponseProjection.metrics", 0) <= maxDepth) {
            projectionDepthOnFields.put("OlapEventAnalysisResponseProjection.OlapMetricResponseProjection.metrics", projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.OlapMetricResponseProjection.metrics", 0) + 1);
            this.metrics(new OlapMetricResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.OlapMetricResponseProjection.metrics", 0)));
        }
        this.dimensions();
        if (projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.GranularityResponseProjection.granularities", 0) <= maxDepth) {
            projectionDepthOnFields.put("OlapEventAnalysisResponseProjection.GranularityResponseProjection.granularities", projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.GranularityResponseProjection.granularities", 0) + 1);
            this.granularities(new GranularityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.GranularityResponseProjection.granularities", 0)));
        }
        this.timeRange();
        if (projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.FilterResponseProjection.filter", 0) <= maxDepth) {
            projectionDepthOnFields.put("OlapEventAnalysisResponseProjection.FilterResponseProjection.filter", projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.FilterResponseProjection.filter", 0) + 1);
            this.filter(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.FilterResponseProjection.filter", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0) <= maxDepth) {
            projectionDepthOnFields.put("OlapEventAnalysisResponseProjection.TargetUserResponseProjection.targetUser", projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0) + 1);
            this.targetUser(new TargetUserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0)));
        }
        this.limit();
        this.attrs();
        if (projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.OrderResponseProjection.orders", 0) <= maxDepth) {
            projectionDepthOnFields.put("OlapEventAnalysisResponseProjection.OrderResponseProjection.orders", projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.OrderResponseProjection.orders", 0) + 1);
            this.orders(new OrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.OrderResponseProjection.orders", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.SplitterResponseProjection.splitter", 0) <= maxDepth) {
            projectionDepthOnFields.put("OlapEventAnalysisResponseProjection.SplitterResponseProjection.splitter", projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.SplitterResponseProjection.splitter", 0) + 1);
            this.splitter(new SplitterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OlapEventAnalysisResponseProjection.SplitterResponseProjection.splitter", 0)));
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
        this.ownerId();
        this.typename();
        return this;
    }

    public OlapEventAnalysisResponseProjection id() {
        return id(null);
    }

    public OlapEventAnalysisResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection name() {
        return name(null);
    }

    public OlapEventAnalysisResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection description() {
        return description(null);
    }

    public OlapEventAnalysisResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection metrics(OlapMetricResponseProjection subProjection) {
        return metrics(null, subProjection);
    }

    public OlapEventAnalysisResponseProjection metrics(String alias, OlapMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metrics").alias(alias).projection(subProjection));
        return this;
    }

    public OlapEventAnalysisResponseProjection dimensions() {
        return dimensions(null);
    }

    public OlapEventAnalysisResponseProjection dimensions(String alias) {
        fields.add(new GraphQLResponseField("dimensions").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection granularities(GranularityResponseProjection subProjection) {
        return granularities(null, subProjection);
    }

    public OlapEventAnalysisResponseProjection granularities(String alias, GranularityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("granularities").alias(alias).projection(subProjection));
        return this;
    }

    public OlapEventAnalysisResponseProjection timeRange() {
        return timeRange(null);
    }

    public OlapEventAnalysisResponseProjection timeRange(String alias) {
        fields.add(new GraphQLResponseField("timeRange").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection filter(FilterResponseProjection subProjection) {
        return filter(null, subProjection);
    }

    public OlapEventAnalysisResponseProjection filter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filter").alias(alias).projection(subProjection));
        return this;
    }

    public OlapEventAnalysisResponseProjection targetUser(TargetUserResponseProjection subProjection) {
        return targetUser(null, subProjection);
    }

    public OlapEventAnalysisResponseProjection targetUser(String alias, TargetUserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("targetUser").alias(alias).projection(subProjection));
        return this;
    }

    public OlapEventAnalysisResponseProjection limit() {
        return limit(null);
    }

    public OlapEventAnalysisResponseProjection limit(String alias) {
        fields.add(new GraphQLResponseField("limit").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection attrs() {
        return attrs(null);
    }

    public OlapEventAnalysisResponseProjection attrs(String alias) {
        fields.add(new GraphQLResponseField("attrs").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection orders(OrderResponseProjection subProjection) {
        return orders(null, subProjection);
    }

    public OlapEventAnalysisResponseProjection orders(String alias, OrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("orders").alias(alias).projection(subProjection));
        return this;
    }

    public OlapEventAnalysisResponseProjection splitter(SplitterResponseProjection subProjection) {
        return splitter(null, subProjection);
    }

    public OlapEventAnalysisResponseProjection splitter(String alias, SplitterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("splitter").alias(alias).projection(subProjection));
        return this;
    }

    public OlapEventAnalysisResponseProjection chartType() {
        return chartType(null);
    }

    public OlapEventAnalysisResponseProjection chartType(String alias) {
        fields.add(new GraphQLResponseField("chartType").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection isSystem() {
        return isSystem(null);
    }

    public OlapEventAnalysisResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection businessType() {
        return businessType(null);
    }

    public OlapEventAnalysisResponseProjection businessType(String alias) {
        fields.add(new GraphQLResponseField("businessType").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection creatorId() {
        return creatorId(null);
    }

    public OlapEventAnalysisResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection createdAt() {
        return createdAt(null);
    }

    public OlapEventAnalysisResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection updaterId() {
        return updaterId(null);
    }

    public OlapEventAnalysisResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public OlapEventAnalysisResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection creator() {
        return creator(null);
    }

    public OlapEventAnalysisResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection updater() {
        return updater(null);
    }

    public OlapEventAnalysisResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection ownerId() {
        return ownerId(null);
    }

    public OlapEventAnalysisResponseProjection ownerId(String alias) {
        fields.add(new GraphQLResponseField("ownerId").alias(alias));
        return this;
    }

    public OlapEventAnalysisResponseProjection typename() {
        return typename(null);
    }

    public OlapEventAnalysisResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
