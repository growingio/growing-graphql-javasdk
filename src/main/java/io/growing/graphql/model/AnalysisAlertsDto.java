package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 分析预警
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AnalysisAlertsDto implements java.io.Serializable, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private AlertChartsDto alertCharts;
    private FilterDto globalFilter;
    @javax.validation.constraints.NotNull
    private String cronExpression;
    private java.util.List<NoticeInfoDto> noticeInfo;
    @javax.validation.constraints.NotNull
    private String chartId;
    private String status;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;
    private String ownerId;
    private ChartNmaeDto chartName;

    public AnalysisAlertsDto() {
    }

    public AnalysisAlertsDto(String id, String name, String description, AlertChartsDto alertCharts, FilterDto globalFilter, String cronExpression, java.util.List<NoticeInfoDto> noticeInfo, String chartId, String status, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, String ownerId, ChartNmaeDto chartName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.alertCharts = alertCharts;
        this.globalFilter = globalFilter;
        this.cronExpression = cronExpression;
        this.noticeInfo = noticeInfo;
        this.chartId = chartId;
        this.status = status;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updaterId = updaterId;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.updater = updater;
        this.ownerId = ownerId;
        this.chartName = chartName;
    }

    /**
     * 预警id
     */
    public String getId() {
        return id;
    }
    /**
     * 预警id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 预警名称
     */
    public String getName() {
        return name;
    }
    /**
     * 预警名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 描述
     */
    public String getDescription() {
        return description;
    }
    /**
     * 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 大洋分析预警图
     */
    public AlertChartsDto getAlertCharts() {
        return alertCharts;
    }
    /**
     * 大洋分析预警图
     */
    public void setAlertCharts(AlertChartsDto alertCharts) {
        this.alertCharts = alertCharts;
    }

    /**
     * 全局过滤条件
     */
    public FilterDto getGlobalFilter() {
        return globalFilter;
    }
    /**
     * 全局过滤条件
     */
    public void setGlobalFilter(FilterDto globalFilter) {
        this.globalFilter = globalFilter;
    }

    /**
     * 触发时间
     */
    public String getCronExpression() {
        return cronExpression;
    }
    /**
     * 触发时间
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * 预警type，预警信息
     */
    public java.util.List<NoticeInfoDto> getNoticeInfo() {
        return noticeInfo;
    }
    /**
     * 预警type，预警信息
     */
    public void setNoticeInfo(java.util.List<NoticeInfoDto> noticeInfo) {
        this.noticeInfo = noticeInfo;
    }

    /**
     * 对应单图id
     */
    public String getChartId() {
        return chartId;
    }
    /**
     * 对应单图id
     */
    public void setChartId(String chartId) {
        this.chartId = chartId;
    }

    /**
     * 软删除
     */
    public String getStatus() {
        return status;
    }
    /**
     * 软删除
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 创建人id
     */
    public String getCreatorId() {
        return creatorId;
    }
    /**
     * 创建人id
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 创建时间
     */
    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    /**
     * 创建时间
     */
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 更新人id
     */
    public String getUpdaterId() {
        return updaterId;
    }
    /**
     * 更新人id
     */
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    /**
     * 更新时间
     */
    public java.time.ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }
    /**
     * 更新时间
     */
    public void setUpdatedAt(java.time.ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 创建者
     */
    public String getCreator() {
        return creator;
    }
    /**
     * 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 更新者
     */
    public String getUpdater() {
        return updater;
    }
    /**
     * 更新者
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * 拥有者
     */
    public String getOwnerId() {
        return ownerId;
    }
    /**
     * 拥有者
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public ChartNmaeDto getChartName() {
        return chartName;
    }
    public void setChartName(ChartNmaeDto chartName) {
        this.chartName = chartName;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
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
        if (creatorId != null) {
            joiner.add("creatorId: " + GraphQLRequestSerializer.getEntry(creatorId));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (updaterId != null) {
            joiner.add("updaterId: " + GraphQLRequestSerializer.getEntry(updaterId));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        if (updater != null) {
            joiner.add("updater: " + GraphQLRequestSerializer.getEntry(updater));
        }
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId));
        }
        if (chartName != null) {
            joiner.add("chartName: " + GraphQLRequestSerializer.getEntry(chartName));
        }
        return joiner.toString();
    }

    public static AnalysisAlertsDto.Builder builder() {
        return new AnalysisAlertsDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private AlertChartsDto alertCharts;
        private FilterDto globalFilter;
        private String cronExpression;
        private java.util.List<NoticeInfoDto> noticeInfo;
        private String chartId;
        private String status;
        private String creatorId;
        private java.time.ZonedDateTime createdAt;
        private String updaterId;
        private java.time.ZonedDateTime updatedAt;
        private String creator;
        private String updater;
        private String ownerId;
        private ChartNmaeDto chartName;

        public Builder() {
        }

        /**
         * 预警id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 预警名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 描述
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * 大洋分析预警图
         */
        public Builder setAlertCharts(AlertChartsDto alertCharts) {
            this.alertCharts = alertCharts;
            return this;
        }

        /**
         * 全局过滤条件
         */
        public Builder setGlobalFilter(FilterDto globalFilter) {
            this.globalFilter = globalFilter;
            return this;
        }

        /**
         * 触发时间
         */
        public Builder setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * 预警type，预警信息
         */
        public Builder setNoticeInfo(java.util.List<NoticeInfoDto> noticeInfo) {
            this.noticeInfo = noticeInfo;
            return this;
        }

        /**
         * 对应单图id
         */
        public Builder setChartId(String chartId) {
            this.chartId = chartId;
            return this;
        }

        /**
         * 软删除
         */
        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        /**
         * 创建人id
         */
        public Builder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * 更新人id
         */
        public Builder setUpdaterId(String updaterId) {
            this.updaterId = updaterId;
            return this;
        }

        /**
         * 更新时间
         */
        public Builder setUpdatedAt(java.time.ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * 创建者
         */
        public Builder setCreator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * 更新者
         */
        public Builder setUpdater(String updater) {
            this.updater = updater;
            return this;
        }

        /**
         * 拥有者
         */
        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setChartName(ChartNmaeDto chartName) {
            this.chartName = chartName;
            return this;
        }


        public AnalysisAlertsDto build() {
            return new AnalysisAlertsDto(id, name, description, alertCharts, globalFilter, cronExpression, noticeInfo, chartId, status, creatorId, createdAt, updaterId, updatedAt, creator, updater, ownerId, chartName);
        }

    }
}
