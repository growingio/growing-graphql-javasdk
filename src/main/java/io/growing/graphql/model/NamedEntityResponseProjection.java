package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for NamedEntity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class NamedEntityResponseProjection extends GraphQLResponseProjection {

    public NamedEntityResponseProjection() {
    }

    @Override
    public NamedEntityResponseProjection all$() {
        return all$(3);
    }

    @Override
    public NamedEntityResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.typename();
        return this;
    }

    public NamedEntityResponseProjection id() {
        return id(null);
    }

    public NamedEntityResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public NamedEntityResponseProjection name() {
        return name(null);
    }

    public NamedEntityResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public NamedEntityResponseProjection creatorId() {
        return creatorId(null);
    }

    public NamedEntityResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public NamedEntityResponseProjection createdAt() {
        return createdAt(null);
    }

    public NamedEntityResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public NamedEntityResponseProjection updaterId() {
        return updaterId(null);
    }

    public NamedEntityResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public NamedEntityResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public NamedEntityResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public NamedEntityResponseProjection creator() {
        return creator(null);
    }

    public NamedEntityResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public NamedEntityResponseProjection updater() {
        return updater(null);
    }

    public NamedEntityResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public NamedEntityResponseProjection onCustomEvent(CustomEventResponseProjection subProjection) {
        return onCustomEvent(null, subProjection);
    }

    public NamedEntityResponseProjection onCustomEvent(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CustomEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onSimpleEvent(SimpleEventResponseProjection subProjection) {
        return onSimpleEvent(null, subProjection);
    }

    public NamedEntityResponseProjection onSimpleEvent(String alias, SimpleEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SimpleEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onItemModel(ItemModelResponseProjection subProjection) {
        return onItemModel(null, subProjection);
    }

    public NamedEntityResponseProjection onItemModel(String alias, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ItemModel").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onElement(ElementResponseProjection subProjection) {
        return onElement(null, subProjection);
    }

    public NamedEntityResponseProjection onElement(String alias, ElementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Element").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onDashboard(DashboardResponseProjection subProjection) {
        return onDashboard(null, subProjection);
    }

    public NamedEntityResponseProjection onDashboard(String alias, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Dashboard").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onItemVariable(ItemVariableResponseProjection subProjection) {
        return onItemVariable(null, subProjection);
    }

    public NamedEntityResponseProjection onItemVariable(String alias, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ItemVariable").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onEventVariable(EventVariableResponseProjection subProjection) {
        return onEventVariable(null, subProjection);
    }

    public NamedEntityResponseProjection onEventVariable(String alias, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on EventVariable").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onEventImportJob(EventImportJobResponseProjection subProjection) {
        return onEventImportJob(null, subProjection);
    }

    public NamedEntityResponseProjection onEventImportJob(String alias, EventImportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on EventImportJob").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onUserVariable(UserVariableResponseProjection subProjection) {
        return onUserVariable(null, subProjection);
    }

    public NamedEntityResponseProjection onUserVariable(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UserVariable").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onSegment(SegmentResponseProjection subProjection) {
        return onSegment(null, subProjection);
    }

    public NamedEntityResponseProjection onSegment(String alias, SegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Segment").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onTunnel(TunnelResponseProjection subProjection) {
        return onTunnel(null, subProjection);
    }

    public NamedEntityResponseProjection onTunnel(String alias, TunnelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Tunnel").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onFunnelAnalysis(FunnelAnalysisResponseProjection subProjection) {
        return onFunnelAnalysis(null, subProjection);
    }

    public NamedEntityResponseProjection onFunnelAnalysis(String alias, FunnelAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on FunnelAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onTag(TagResponseProjection subProjection) {
        return onTag(null, subProjection);
    }

    public NamedEntityResponseProjection onTag(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Tag").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onFrequencyAnalysis(FrequencyAnalysisResponseProjection subProjection) {
        return onFrequencyAnalysis(null, subProjection);
    }

    public NamedEntityResponseProjection onFrequencyAnalysis(String alias, FrequencyAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on FrequencyAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onKpiAnalysis(KpiAnalysisResponseProjection subProjection) {
        return onKpiAnalysis(null, subProjection);
    }

    public NamedEntityResponseProjection onKpiAnalysis(String alias, KpiAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on KpiAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onEventAnalysis(EventAnalysisResponseProjection subProjection) {
        return onEventAnalysis(null, subProjection);
    }

    public NamedEntityResponseProjection onEventAnalysis(String alias, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on EventAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onComplexMetric(ComplexMetricResponseProjection subProjection) {
        return onComplexMetric(null, subProjection);
    }

    public NamedEntityResponseProjection onComplexMetric(String alias, ComplexMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ComplexMetric").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection onRetentionAnalysis(RetentionAnalysisResponseProjection subProjection) {
        return onRetentionAnalysis(null, subProjection);
    }

    public NamedEntityResponseProjection onRetentionAnalysis(String alias, RetentionAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RetentionAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public NamedEntityResponseProjection typename() {
        return typename(null);
    }

    public NamedEntityResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
