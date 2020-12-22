package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TrackOverviewAnalysis
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class TrackOverviewAnalysisResponseProjection extends GraphQLResponseProjection {

    public TrackOverviewAnalysisResponseProjection() {
    }

    @Override
    public TrackOverviewAnalysisResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TrackOverviewAnalysisResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("TrackOverviewAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0) <= maxDepth) {
            projectionDepthOnFields.put("TrackOverviewAnalysisResponseProjection.MeasurementResponseProjection.measurements", projectionDepthOnFields.getOrDefault("TrackOverviewAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0) + 1);
            this.measurements(new MeasurementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TrackOverviewAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0)));
        }
        this.timeRange();
        if (projectionDepthOnFields.getOrDefault("TrackOverviewAnalysisResponseProjection.FilterResponseProjection.filter", 0) <= maxDepth) {
            projectionDepthOnFields.put("TrackOverviewAnalysisResponseProjection.FilterResponseProjection.filter", projectionDepthOnFields.getOrDefault("TrackOverviewAnalysisResponseProjection.FilterResponseProjection.filter", 0) + 1);
            this.filter(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TrackOverviewAnalysisResponseProjection.FilterResponseProjection.filter", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TrackOverviewAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0) <= maxDepth) {
            projectionDepthOnFields.put("TrackOverviewAnalysisResponseProjection.TargetUserResponseProjection.targetUser", projectionDepthOnFields.getOrDefault("TrackOverviewAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0) + 1);
            this.targetUser(new TargetUserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TrackOverviewAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0)));
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

    public TrackOverviewAnalysisResponseProjection id() {
        return id(null);
    }

    public TrackOverviewAnalysisResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection name() {
        return name(null);
    }

    public TrackOverviewAnalysisResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection description() {
        return description(null);
    }

    public TrackOverviewAnalysisResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection measurements(MeasurementResponseProjection subProjection) {
        return measurements(null, subProjection);
    }

    public TrackOverviewAnalysisResponseProjection measurements(String alias, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("measurements").alias(alias).projection(subProjection));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection timeRange() {
        return timeRange(null);
    }

    public TrackOverviewAnalysisResponseProjection timeRange(String alias) {
        fields.add(new GraphQLResponseField("timeRange").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection filter(FilterResponseProjection subProjection) {
        return filter(null, subProjection);
    }

    public TrackOverviewAnalysisResponseProjection filter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filter").alias(alias).projection(subProjection));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection targetUser(TargetUserResponseProjection subProjection) {
        return targetUser(null, subProjection);
    }

    public TrackOverviewAnalysisResponseProjection targetUser(String alias, TargetUserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("targetUser").alias(alias).projection(subProjection));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection chartType() {
        return chartType(null);
    }

    public TrackOverviewAnalysisResponseProjection chartType(String alias) {
        fields.add(new GraphQLResponseField("chartType").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection isSystem() {
        return isSystem(null);
    }

    public TrackOverviewAnalysisResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection businessType() {
        return businessType(null);
    }

    public TrackOverviewAnalysisResponseProjection businessType(String alias) {
        fields.add(new GraphQLResponseField("businessType").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection creatorId() {
        return creatorId(null);
    }

    public TrackOverviewAnalysisResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection createdAt() {
        return createdAt(null);
    }

    public TrackOverviewAnalysisResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection updaterId() {
        return updaterId(null);
    }

    public TrackOverviewAnalysisResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public TrackOverviewAnalysisResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection creator() {
        return creator(null);
    }

    public TrackOverviewAnalysisResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection updater() {
        return updater(null);
    }

    public TrackOverviewAnalysisResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection ownerId() {
        return ownerId(null);
    }

    public TrackOverviewAnalysisResponseProjection ownerId(String alias) {
        fields.add(new GraphQLResponseField("ownerId").alias(alias));
        return this;
    }

    public TrackOverviewAnalysisResponseProjection typename() {
        return typename(null);
    }

    public TrackOverviewAnalysisResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
