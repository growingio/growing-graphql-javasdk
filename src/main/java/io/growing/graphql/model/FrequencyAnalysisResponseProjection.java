package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for FrequencyAnalysis
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class FrequencyAnalysisResponseProjection extends GraphQLResponseProjection {

    public FrequencyAnalysisResponseProjection() {
    }

    public FrequencyAnalysisResponseProjection id() {
        return id(null);
    }

    public FrequencyAnalysisResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection projectId() {
        return projectId(null);
    }

    public FrequencyAnalysisResponseProjection projectId(String alias) {
        fields.add(new GraphQLResponseField("projectId").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection name() {
        return name(null);
    }

    public FrequencyAnalysisResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection description() {
        return description(null);
    }

    public FrequencyAnalysisResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection measurements(MeasurementResponseProjection subProjection) {
        return measurements(null, subProjection);
    }

    public FrequencyAnalysisResponseProjection measurements(String alias, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("measurements").alias(alias).projection(subProjection));
        return this;
    }

    public FrequencyAnalysisResponseProjection dimensions() {
        return dimensions(null);
    }

    public FrequencyAnalysisResponseProjection dimensions(String alias) {
        fields.add(new GraphQLResponseField("dimensions").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection granularities(GranularityResponseProjection subProjection) {
        return granularities(null, subProjection);
    }

    public FrequencyAnalysisResponseProjection granularities(String alias, GranularityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("granularities").alias(alias).projection(subProjection));
        return this;
    }

    public FrequencyAnalysisResponseProjection timeRange() {
        return timeRange(null);
    }

    public FrequencyAnalysisResponseProjection timeRange(String alias) {
        fields.add(new GraphQLResponseField("timeRange").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection filter(FilterResponseProjection subProjection) {
        return filter(null, subProjection);
    }

    public FrequencyAnalysisResponseProjection filter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filter").alias(alias).projection(subProjection));
        return this;
    }

    public FrequencyAnalysisResponseProjection splitter(SplitterResponseProjection subProjection) {
        return splitter(null, subProjection);
    }

    public FrequencyAnalysisResponseProjection splitter(String alias, SplitterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("splitter").alias(alias).projection(subProjection));
        return this;
    }

    public FrequencyAnalysisResponseProjection targetUser(TargetUserResponseProjection subProjection) {
        return targetUser(null, subProjection);
    }

    public FrequencyAnalysisResponseProjection targetUser(String alias, TargetUserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("targetUser").alias(alias).projection(subProjection));
        return this;
    }

    public FrequencyAnalysisResponseProjection chartType() {
        return chartType(null);
    }

    public FrequencyAnalysisResponseProjection chartType(String alias) {
        fields.add(new GraphQLResponseField("chartType").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection isSystem() {
        return isSystem(null);
    }

    public FrequencyAnalysisResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection businessType() {
        return businessType(null);
    }

    public FrequencyAnalysisResponseProjection businessType(String alias) {
        fields.add(new GraphQLResponseField("businessType").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection creatorId() {
        return creatorId(null);
    }

    public FrequencyAnalysisResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection createdAt() {
        return createdAt(null);
    }

    public FrequencyAnalysisResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection updaterId() {
        return updaterId(null);
    }

    public FrequencyAnalysisResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public FrequencyAnalysisResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection creator() {
        return creator(null);
    }

    public FrequencyAnalysisResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection updater() {
        return updater(null);
    }

    public FrequencyAnalysisResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public FrequencyAnalysisResponseProjection typename() {
        return typename(null);
    }

    public FrequencyAnalysisResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
