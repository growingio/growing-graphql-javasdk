package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 分析预警接收对象
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AnalysisAlertsInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private AlertChartsInputDto alertCharts;
    private FilterInputDto globalFilter;
    @javax.validation.constraints.NotNull
    private String cronExpression;
    @javax.validation.constraints.NotNull
    private java.util.List<NoticeInfoInputDto> noticeInfo;
    @javax.validation.constraints.NotNull
    private String chartId;
    private String status;

    public AnalysisAlertsInputDto() {
    }

    public AnalysisAlertsInputDto(String name, String description, AlertChartsInputDto alertCharts, FilterInputDto globalFilter, String cronExpression, java.util.List<NoticeInfoInputDto> noticeInfo, String chartId, String status) {
        this.name = name;
        this.description = description;
        this.alertCharts = alertCharts;
        this.globalFilter = globalFilter;
        this.cronExpression = cronExpression;
        this.noticeInfo = noticeInfo;
        this.chartId = chartId;
        this.status = status;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public AlertChartsInputDto getAlertCharts() {
        return alertCharts;
    }
    public void setAlertCharts(AlertChartsInputDto alertCharts) {
        this.alertCharts = alertCharts;
    }

    public FilterInputDto getGlobalFilter() {
        return globalFilter;
    }
    public void setGlobalFilter(FilterInputDto globalFilter) {
        this.globalFilter = globalFilter;
    }

    public String getCronExpression() {
        return cronExpression;
    }
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public java.util.List<NoticeInfoInputDto> getNoticeInfo() {
        return noticeInfo;
    }
    public void setNoticeInfo(java.util.List<NoticeInfoInputDto> noticeInfo) {
        this.noticeInfo = noticeInfo;
    }

    public String getChartId() {
        return chartId;
    }
    public void setChartId(String chartId) {
        this.chartId = chartId;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (alertCharts != null) {
            joiner.add("alertCharts: " + GraphQLRequestSerializer.getEntry(alertCharts));
        }
        if (globalFilter != null) {
            joiner.add("globalFilter: " + GraphQLRequestSerializer.getEntry(globalFilter));
        }
        if (cronExpression != null) {
            joiner.add("cronExpression: " + GraphQLRequestSerializer.getEntry(cronExpression));
        }
        if (noticeInfo != null) {
            joiner.add("noticeInfo: " + GraphQLRequestSerializer.getEntry(noticeInfo));
        }
        if (chartId != null) {
            joiner.add("chartId: " + GraphQLRequestSerializer.getEntry(chartId));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        return joiner.toString();
    }

    public static AnalysisAlertsInputDto.Builder builder() {
        return new AnalysisAlertsInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private AlertChartsInputDto alertCharts;
        private FilterInputDto globalFilter;
        private String cronExpression;
        private java.util.List<NoticeInfoInputDto> noticeInfo;
        private String chartId;
        private String status;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setAlertCharts(AlertChartsInputDto alertCharts) {
            this.alertCharts = alertCharts;
            return this;
        }

        public Builder setGlobalFilter(FilterInputDto globalFilter) {
            this.globalFilter = globalFilter;
            return this;
        }

        public Builder setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        public Builder setNoticeInfo(java.util.List<NoticeInfoInputDto> noticeInfo) {
            this.noticeInfo = noticeInfo;
            return this;
        }

        public Builder setChartId(String chartId) {
            this.chartId = chartId;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }


        public AnalysisAlertsInputDto build() {
            return new AnalysisAlertsInputDto(name, description, alertCharts, globalFilter, cronExpression, noticeInfo, chartId, status);
        }

    }
}
