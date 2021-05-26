package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AnalysisAlerts
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AnalysisAlertsResponseProjection extends GraphQLResponseProjection {

    public AnalysisAlertsResponseProjection() {
    }

    @Override
    public AnalysisAlertsResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AnalysisAlertsResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("AnalysisAlertsResponseProjection.AlertChartsResponseProjection.alertCharts", 0) <= maxDepth) {
            projectionDepthOnFields.put("AnalysisAlertsResponseProjection.AlertChartsResponseProjection.alertCharts", projectionDepthOnFields.getOrDefault("AnalysisAlertsResponseProjection.AlertChartsResponseProjection.alertCharts", 0) + 1);
            this.alertCharts(new AlertChartsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AnalysisAlertsResponseProjection.AlertChartsResponseProjection.alertCharts", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AnalysisAlertsResponseProjection.FilterResponseProjection.globalFilter", 0) <= maxDepth) {
            projectionDepthOnFields.put("AnalysisAlertsResponseProjection.FilterResponseProjection.globalFilter", projectionDepthOnFields.getOrDefault("AnalysisAlertsResponseProjection.FilterResponseProjection.globalFilter", 0) + 1);
            this.globalFilter(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AnalysisAlertsResponseProjection.FilterResponseProjection.globalFilter", 0)));
        }
        this.cronExpression();
        if (projectionDepthOnFields.getOrDefault("AnalysisAlertsResponseProjection.NoticeInfoResponseProjection.noticeInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("AnalysisAlertsResponseProjection.NoticeInfoResponseProjection.noticeInfo", projectionDepthOnFields.getOrDefault("AnalysisAlertsResponseProjection.NoticeInfoResponseProjection.noticeInfo", 0) + 1);
            this.noticeInfo(new NoticeInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AnalysisAlertsResponseProjection.NoticeInfoResponseProjection.noticeInfo", 0)));
        }
        this.chartId();
        this.status();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.ownerId();
        if (projectionDepthOnFields.getOrDefault("AnalysisAlertsResponseProjection.ChartNmaeResponseProjection.chartName", 0) <= maxDepth) {
            projectionDepthOnFields.put("AnalysisAlertsResponseProjection.ChartNmaeResponseProjection.chartName", projectionDepthOnFields.getOrDefault("AnalysisAlertsResponseProjection.ChartNmaeResponseProjection.chartName", 0) + 1);
            this.chartName(new ChartNmaeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AnalysisAlertsResponseProjection.ChartNmaeResponseProjection.chartName", 0)));
        }
        this.typename();
        return this;
    }

    public AnalysisAlertsResponseProjection id() {
        return id(null);
    }

    public AnalysisAlertsResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection name() {
        return name(null);
    }

    public AnalysisAlertsResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection description() {
        return description(null);
    }

    public AnalysisAlertsResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection alertCharts(AlertChartsResponseProjection subProjection) {
        return alertCharts(null, subProjection);
    }

    public AnalysisAlertsResponseProjection alertCharts(String alias, AlertChartsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("alertCharts").alias(alias).projection(subProjection));
        return this;
    }

    public AnalysisAlertsResponseProjection globalFilter(FilterResponseProjection subProjection) {
        return globalFilter(null, subProjection);
    }

    public AnalysisAlertsResponseProjection globalFilter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("globalFilter").alias(alias).projection(subProjection));
        return this;
    }

    public AnalysisAlertsResponseProjection cronExpression() {
        return cronExpression(null);
    }

    public AnalysisAlertsResponseProjection cronExpression(String alias) {
        fields.add(new GraphQLResponseField("cronExpression").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection noticeInfo(NoticeInfoResponseProjection subProjection) {
        return noticeInfo(null, subProjection);
    }

    public AnalysisAlertsResponseProjection noticeInfo(String alias, NoticeInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("noticeInfo").alias(alias).projection(subProjection));
        return this;
    }

    public AnalysisAlertsResponseProjection chartId() {
        return chartId(null);
    }

    public AnalysisAlertsResponseProjection chartId(String alias) {
        fields.add(new GraphQLResponseField("chartId").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection status() {
        return status(null);
    }

    public AnalysisAlertsResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection creatorId() {
        return creatorId(null);
    }

    public AnalysisAlertsResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection createdAt() {
        return createdAt(null);
    }

    public AnalysisAlertsResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection updaterId() {
        return updaterId(null);
    }

    public AnalysisAlertsResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public AnalysisAlertsResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection creator() {
        return creator(null);
    }

    public AnalysisAlertsResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection updater() {
        return updater(null);
    }

    public AnalysisAlertsResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection ownerId() {
        return ownerId(null);
    }

    public AnalysisAlertsResponseProjection ownerId(String alias) {
        fields.add(new GraphQLResponseField("ownerId").alias(alias));
        return this;
    }

    public AnalysisAlertsResponseProjection chartName(ChartNmaeResponseProjection subProjection) {
        return chartName(null, subProjection);
    }

    public AnalysisAlertsResponseProjection chartName(String alias, ChartNmaeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("chartName").alias(alias).projection(subProjection));
        return this;
    }

    public AnalysisAlertsResponseProjection typename() {
        return typename(null);
    }

    public AnalysisAlertsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
