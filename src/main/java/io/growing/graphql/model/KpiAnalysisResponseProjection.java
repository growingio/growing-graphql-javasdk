package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for KpiAnalysis
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class KpiAnalysisResponseProjection extends GraphQLResponseProjection {

    public KpiAnalysisResponseProjection() {
    }

    @Override
    public KpiAnalysisResponseProjection all$() {
        return all$(3);
    }

    @Override
    public KpiAnalysisResponseProjection all$(int maxDepth) {
        this.id();
        this.projectId();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("KpiAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiAnalysisResponseProjection.MeasurementResponseProjection.measurements", projectionDepthOnFields.getOrDefault("KpiAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0) + 1);
            this.measurements(new MeasurementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0)));
        }
        this.limit();
        this.timeRange();
        this.interval();
        if (projectionDepthOnFields.getOrDefault("KpiAnalysisResponseProjection.FilterResponseProjection.filter", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiAnalysisResponseProjection.FilterResponseProjection.filter", projectionDepthOnFields.getOrDefault("KpiAnalysisResponseProjection.FilterResponseProjection.filter", 0) + 1);
            this.filter(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiAnalysisResponseProjection.FilterResponseProjection.filter", 0)));
        }
        this.goal();
        if (projectionDepthOnFields.getOrDefault("KpiAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiAnalysisResponseProjection.TargetUserResponseProjection.targetUser", projectionDepthOnFields.getOrDefault("KpiAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0) + 1);
            this.targetUser(new TargetUserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KpiAnalysisResponseProjection.SplitterResponseProjection.splitter", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiAnalysisResponseProjection.SplitterResponseProjection.splitter", projectionDepthOnFields.getOrDefault("KpiAnalysisResponseProjection.SplitterResponseProjection.splitter", 0) + 1);
            this.splitter(new SplitterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiAnalysisResponseProjection.SplitterResponseProjection.splitter", 0)));
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

    public KpiAnalysisResponseProjection id() {
        return id(null);
    }

    public KpiAnalysisResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection projectId() {
        return projectId(null);
    }

    public KpiAnalysisResponseProjection projectId(String alias) {
        fields.add(new GraphQLResponseField("projectId").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection name() {
        return name(null);
    }

    public KpiAnalysisResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection description() {
        return description(null);
    }

    public KpiAnalysisResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection measurements(MeasurementResponseProjection subProjection) {
        return measurements(null, subProjection);
    }

    public KpiAnalysisResponseProjection measurements(String alias, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("measurements").alias(alias).projection(subProjection));
        return this;
    }

    public KpiAnalysisResponseProjection limit() {
        return limit(null);
    }

    public KpiAnalysisResponseProjection limit(String alias) {
        fields.add(new GraphQLResponseField("limit").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection timeRange() {
        return timeRange(null);
    }

    public KpiAnalysisResponseProjection timeRange(String alias) {
        fields.add(new GraphQLResponseField("timeRange").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection interval() {
        return interval(null);
    }

    public KpiAnalysisResponseProjection interval(String alias) {
        fields.add(new GraphQLResponseField("interval").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection filter(FilterResponseProjection subProjection) {
        return filter(null, subProjection);
    }

    public KpiAnalysisResponseProjection filter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filter").alias(alias).projection(subProjection));
        return this;
    }

    public KpiAnalysisResponseProjection goal() {
        return goal(null);
    }

    public KpiAnalysisResponseProjection goal(String alias) {
        fields.add(new GraphQLResponseField("goal").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection targetUser(TargetUserResponseProjection subProjection) {
        return targetUser(null, subProjection);
    }

    public KpiAnalysisResponseProjection targetUser(String alias, TargetUserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("targetUser").alias(alias).projection(subProjection));
        return this;
    }

    public KpiAnalysisResponseProjection splitter(SplitterResponseProjection subProjection) {
        return splitter(null, subProjection);
    }

    public KpiAnalysisResponseProjection splitter(String alias, SplitterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("splitter").alias(alias).projection(subProjection));
        return this;
    }

    public KpiAnalysisResponseProjection isSystem() {
        return isSystem(null);
    }

    public KpiAnalysisResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection businessType() {
        return businessType(null);
    }

    public KpiAnalysisResponseProjection businessType(String alias) {
        fields.add(new GraphQLResponseField("businessType").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection creatorId() {
        return creatorId(null);
    }

    public KpiAnalysisResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection createdAt() {
        return createdAt(null);
    }

    public KpiAnalysisResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection updaterId() {
        return updaterId(null);
    }

    public KpiAnalysisResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public KpiAnalysisResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection creator() {
        return creator(null);
    }

    public KpiAnalysisResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection updater() {
        return updater(null);
    }

    public KpiAnalysisResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public KpiAnalysisResponseProjection typename() {
        return typename(null);
    }

    public KpiAnalysisResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
