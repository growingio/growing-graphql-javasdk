package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RetentionAnalysis
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class RetentionAnalysisResponseProjection extends GraphQLResponseProjection {

    public RetentionAnalysisResponseProjection() {
    }

    @Override
    public RetentionAnalysisResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RetentionAnalysisResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("RetentionAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0) <= maxDepth) {
            projectionDepthOnFields.put("RetentionAnalysisResponseProjection.MeasurementResponseProjection.measurements", projectionDepthOnFields.getOrDefault("RetentionAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0) + 1);
            this.measurements(new MeasurementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RetentionAnalysisResponseProjection.MeasurementResponseProjection.measurements", 0)));
        }
        this.range();
        this.eventType();
        this.timeRange();
        if (projectionDepthOnFields.getOrDefault("RetentionAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0) <= maxDepth) {
            projectionDepthOnFields.put("RetentionAnalysisResponseProjection.TargetUserResponseProjection.targetUser", projectionDepthOnFields.getOrDefault("RetentionAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0) + 1);
            this.targetUser(new TargetUserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RetentionAnalysisResponseProjection.TargetUserResponseProjection.targetUser", 0)));
        }
        this.currentTurn();
        if (projectionDepthOnFields.getOrDefault("RetentionAnalysisResponseProjection.SplitterResponseProjection.splitter", 0) <= maxDepth) {
            projectionDepthOnFields.put("RetentionAnalysisResponseProjection.SplitterResponseProjection.splitter", projectionDepthOnFields.getOrDefault("RetentionAnalysisResponseProjection.SplitterResponseProjection.splitter", 0) + 1);
            this.splitter(new SplitterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RetentionAnalysisResponseProjection.SplitterResponseProjection.splitter", 0)));
        }
        this.chartType();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.typename();
        return this;
    }

    public RetentionAnalysisResponseProjection id() {
        return id(null);
    }

    public RetentionAnalysisResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection name() {
        return name(null);
    }

    public RetentionAnalysisResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection description() {
        return description(null);
    }

    public RetentionAnalysisResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection measurements(MeasurementResponseProjection subProjection) {
        return measurements(null, subProjection);
    }

    public RetentionAnalysisResponseProjection measurements(String alias, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("measurements").alias(alias).projection(subProjection));
        return this;
    }

    public RetentionAnalysisResponseProjection range() {
        return range(null);
    }

    public RetentionAnalysisResponseProjection range(String alias) {
        fields.add(new GraphQLResponseField("range").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection eventType() {
        return eventType(null);
    }

    public RetentionAnalysisResponseProjection eventType(String alias) {
        fields.add(new GraphQLResponseField("eventType").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection timeRange() {
        return timeRange(null);
    }

    public RetentionAnalysisResponseProjection timeRange(String alias) {
        fields.add(new GraphQLResponseField("timeRange").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection targetUser(TargetUserResponseProjection subProjection) {
        return targetUser(null, subProjection);
    }

    public RetentionAnalysisResponseProjection targetUser(String alias, TargetUserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("targetUser").alias(alias).projection(subProjection));
        return this;
    }

    public RetentionAnalysisResponseProjection currentTurn() {
        return currentTurn(null);
    }

    public RetentionAnalysisResponseProjection currentTurn(String alias) {
        fields.add(new GraphQLResponseField("currentTurn").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection splitter(SplitterResponseProjection subProjection) {
        return splitter(null, subProjection);
    }

    public RetentionAnalysisResponseProjection splitter(String alias, SplitterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("splitter").alias(alias).projection(subProjection));
        return this;
    }

    public RetentionAnalysisResponseProjection chartType() {
        return chartType(null);
    }

    public RetentionAnalysisResponseProjection chartType(String alias) {
        fields.add(new GraphQLResponseField("chartType").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection creatorId() {
        return creatorId(null);
    }

    public RetentionAnalysisResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection createdAt() {
        return createdAt(null);
    }

    public RetentionAnalysisResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection updaterId() {
        return updaterId(null);
    }

    public RetentionAnalysisResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public RetentionAnalysisResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection creator() {
        return creator(null);
    }

    public RetentionAnalysisResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection updater() {
        return updater(null);
    }

    public RetentionAnalysisResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public RetentionAnalysisResponseProjection typename() {
        return typename(null);
    }

    public RetentionAnalysisResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
