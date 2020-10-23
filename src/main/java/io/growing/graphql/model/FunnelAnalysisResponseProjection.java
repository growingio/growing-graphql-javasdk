package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for FunnelAnalysis
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class FunnelAnalysisResponseProjection extends GraphQLResponseProjection {

    public FunnelAnalysisResponseProjection() {
    }

    @Override
    public FunnelAnalysisResponseProjection all$() {
        return all$(3);
    }

    @Override
    public FunnelAnalysisResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("FunnelAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0) <= maxDepth) {
            projectionDepthOnFields.put("FunnelAnalysisResponseProjection.MeasurementResponseProjection.measurements", projectionDepthOnFields.getOrDefault("FunnelAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0) + 1);
            this.measurements(new MeasurementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FunnelAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0)));
        }
        this.conversionWindow();
        this.timeRange();
        if (projectionDepthOnFields.getOrDefault("FunnelAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0) <= maxDepth) {
            projectionDepthOnFields.put("FunnelAnalysisResponseProjection.TargetUserResponseProjection.targetUser", projectionDepthOnFields.getOrDefault("FunnelAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0) + 1);
            this.targetUser(new TargetUserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FunnelAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FunnelAnalysisResponseProjection.FilterResponseProjection.filter", 0) <= maxDepth) {
            projectionDepthOnFields.put("FunnelAnalysisResponseProjection.FilterResponseProjection.filter", projectionDepthOnFields.getOrDefault("FunnelAnalysisResponseProjection.FilterResponseProjection.filter", 0) + 1);
            this.filter(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FunnelAnalysisResponseProjection.FilterResponseProjection.filter", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FunnelAnalysisResponseProjection.SplitterResponseProjection.splitter", 0) <= maxDepth) {
            projectionDepthOnFields.put("FunnelAnalysisResponseProjection.SplitterResponseProjection.splitter", projectionDepthOnFields.getOrDefault("FunnelAnalysisResponseProjection.SplitterResponseProjection.splitter", 0) + 1);
            this.splitter(new SplitterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FunnelAnalysisResponseProjection.SplitterResponseProjection.splitter", 0)));
        }
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

    public FunnelAnalysisResponseProjection id() {
        return id(null);
    }

    public FunnelAnalysisResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection name() {
        return name(null);
    }

    public FunnelAnalysisResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection description() {
        return description(null);
    }

    public FunnelAnalysisResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection measurements(MeasurementResponseProjection subProjection) {
        return measurements(null, subProjection);
    }

    public FunnelAnalysisResponseProjection measurements(String alias, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("measurements").alias(alias).projection(subProjection));
        return this;
    }

    public FunnelAnalysisResponseProjection conversionWindow() {
        return conversionWindow(null);
    }

    public FunnelAnalysisResponseProjection conversionWindow(String alias) {
        fields.add(new GraphQLResponseField("conversionWindow").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection timeRange() {
        return timeRange(null);
    }

    public FunnelAnalysisResponseProjection timeRange(String alias) {
        fields.add(new GraphQLResponseField("timeRange").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection targetUser(TargetUserResponseProjection subProjection) {
        return targetUser(null, subProjection);
    }

    public FunnelAnalysisResponseProjection targetUser(String alias, TargetUserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("targetUser").alias(alias).projection(subProjection));
        return this;
    }

    public FunnelAnalysisResponseProjection filter(FilterResponseProjection subProjection) {
        return filter(null, subProjection);
    }

    public FunnelAnalysisResponseProjection filter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filter").alias(alias).projection(subProjection));
        return this;
    }

    public FunnelAnalysisResponseProjection splitter(SplitterResponseProjection subProjection) {
        return splitter(null, subProjection);
    }

    public FunnelAnalysisResponseProjection splitter(String alias, SplitterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("splitter").alias(alias).projection(subProjection));
        return this;
    }

    public FunnelAnalysisResponseProjection isSystem() {
        return isSystem(null);
    }

    public FunnelAnalysisResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection businessType() {
        return businessType(null);
    }

    public FunnelAnalysisResponseProjection businessType(String alias) {
        fields.add(new GraphQLResponseField("businessType").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection creatorId() {
        return creatorId(null);
    }

    public FunnelAnalysisResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection createdAt() {
        return createdAt(null);
    }

    public FunnelAnalysisResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection updaterId() {
        return updaterId(null);
    }

    public FunnelAnalysisResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public FunnelAnalysisResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection creator() {
        return creator(null);
    }

    public FunnelAnalysisResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection updater() {
        return updater(null);
    }

    public FunnelAnalysisResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public FunnelAnalysisResponseProjection typename() {
        return typename(null);
    }

    public FunnelAnalysisResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
