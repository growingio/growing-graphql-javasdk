package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 新事件分析
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class OlapEventAnalysisDto implements java.io.Serializable, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<OlapMetricDto> metrics;
    private java.util.List<String> dimensions;
    private java.util.List<GranularityDto> granularities;
    @javax.validation.constraints.NotNull
    private String timeRange;
    private FilterDto filter;
    private TargetUserDto targetUser;
    private Integer limit;
    private String attrs;
    private java.util.List<OrderDto> orders;
    private SplitterDto splitter;
    private String chartType;
    private Boolean isSystem;
    private String businessType;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;
    private String ownerId;

    public OlapEventAnalysisDto() {
    }

    public OlapEventAnalysisDto(String id, String name, String description, java.util.List<OlapMetricDto> metrics, java.util.List<String> dimensions, java.util.List<GranularityDto> granularities, String timeRange, FilterDto filter, TargetUserDto targetUser, Integer limit, String attrs, java.util.List<OrderDto> orders, SplitterDto splitter, String chartType, Boolean isSystem, String businessType, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, String ownerId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.metrics = metrics;
        this.dimensions = dimensions;
        this.granularities = granularities;
        this.timeRange = timeRange;
        this.filter = filter;
        this.targetUser = targetUser;
        this.limit = limit;
        this.attrs = attrs;
        this.orders = orders;
        this.splitter = splitter;
        this.chartType = chartType;
        this.isSystem = isSystem;
        this.businessType = businessType;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updaterId = updaterId;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.updater = updater;
        this.ownerId = ownerId;
    }

    /**
     * 事件id
     */
    public String getId() {
        return id;
    }
    /**
     * 事件id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 名称
     */
    public String getName() {
        return name;
    }
    /**
     * 名称
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
     * 指标
     */
    public java.util.List<OlapMetricDto> getMetrics() {
        return metrics;
    }
    /**
     * 指标
     */
    public void setMetrics(java.util.List<OlapMetricDto> metrics) {
        this.metrics = metrics;
    }

    /**
     * 维度
     */
    public java.util.List<String> getDimensions() {
        return dimensions;
    }
    /**
     * 维度
     */
    public void setDimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * 粒度
     */
    public java.util.List<GranularityDto> getGranularities() {
        return granularities;
    }
    /**
     * 粒度
     */
    public void setGranularities(java.util.List<GranularityDto> granularities) {
        this.granularities = granularities;
    }

    /**
     * 时间区间
     */
    public String getTimeRange() {
        return timeRange;
    }
    /**
     * 时间区间
     */
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    /**
     * 过滤条件
     */
    public FilterDto getFilter() {
        return filter;
    }
    /**
     * 过滤条件
     */
    public void setFilter(FilterDto filter) {
        this.filter = filter;
    }

    /**
     * 目标用户(分群)
     */
    public TargetUserDto getTargetUser() {
        return targetUser;
    }
    /**
     * 目标用户(分群)
     */
    public void setTargetUser(TargetUserDto targetUser) {
        this.targetUser = targetUser;
    }

    /**
     * 限定返回数据量
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * 限定返回数据量
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getAttrs() {
        return attrs;
    }
    public void setAttrs(String attrs) {
        this.attrs = attrs;
    }

    /**
     * 排序
     */
    public java.util.List<OrderDto> getOrders() {
        return orders;
    }
    /**
     * 排序
     */
    public void setOrders(java.util.List<OrderDto> orders) {
        this.orders = orders;
    }

    public SplitterDto getSplitter() {
        return splitter;
    }
    public void setSplitter(SplitterDto splitter) {
        this.splitter = splitter;
    }

    /**
     * 单图类型
     */
    public String getChartType() {
        return chartType;
    }
    /**
     * 单图类型
     */
    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getBusinessType() {
        return businessType;
    }
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdaterId() {
        return updaterId;
    }
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    public java.time.ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.time.ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
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
        if (metrics != null) {
            joiner.add("metrics: " + GraphQLRequestSerializer.getEntry(metrics));
        }
        if (dimensions != null) {
            joiner.add("dimensions: " + GraphQLRequestSerializer.getEntry(dimensions));
        }
        if (granularities != null) {
            joiner.add("granularities: " + GraphQLRequestSerializer.getEntry(granularities));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        if (targetUser != null) {
            joiner.add("targetUser: " + GraphQLRequestSerializer.getEntry(targetUser));
        }
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        }
        if (attrs != null) {
            joiner.add("attrs: " + GraphQLRequestSerializer.getEntry(attrs));
        }
        if (orders != null) {
            joiner.add("orders: " + GraphQLRequestSerializer.getEntry(orders));
        }
        if (splitter != null) {
            joiner.add("splitter: " + GraphQLRequestSerializer.getEntry(splitter));
        }
        if (chartType != null) {
            joiner.add("chartType: " + GraphQLRequestSerializer.getEntry(chartType));
        }
        if (isSystem != null) {
            joiner.add("isSystem: " + GraphQLRequestSerializer.getEntry(isSystem));
        }
        if (businessType != null) {
            joiner.add("businessType: " + GraphQLRequestSerializer.getEntry(businessType));
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
        return joiner.toString();
    }

    public static OlapEventAnalysisDto.Builder builder() {
        return new OlapEventAnalysisDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private java.util.List<OlapMetricDto> metrics;
        private java.util.List<String> dimensions;
        private java.util.List<GranularityDto> granularities;
        private String timeRange;
        private FilterDto filter;
        private TargetUserDto targetUser;
        private Integer limit;
        private String attrs;
        private java.util.List<OrderDto> orders;
        private SplitterDto splitter;
        private String chartType;
        private Boolean isSystem;
        private String businessType;
        private String creatorId;
        private java.time.ZonedDateTime createdAt;
        private String updaterId;
        private java.time.ZonedDateTime updatedAt;
        private String creator;
        private String updater;
        private String ownerId;

        public Builder() {
        }

        /**
         * 事件id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 名称
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
         * 指标
         */
        public Builder setMetrics(java.util.List<OlapMetricDto> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * 维度
         */
        public Builder setDimensions(java.util.List<String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        /**
         * 粒度
         */
        public Builder setGranularities(java.util.List<GranularityDto> granularities) {
            this.granularities = granularities;
            return this;
        }

        /**
         * 时间区间
         */
        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * 过滤条件
         */
        public Builder setFilter(FilterDto filter) {
            this.filter = filter;
            return this;
        }

        /**
         * 目标用户(分群)
         */
        public Builder setTargetUser(TargetUserDto targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        /**
         * 限定返回数据量
         */
        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setAttrs(String attrs) {
            this.attrs = attrs;
            return this;
        }

        /**
         * 排序
         */
        public Builder setOrders(java.util.List<OrderDto> orders) {
            this.orders = orders;
            return this;
        }

        public Builder setSplitter(SplitterDto splitter) {
            this.splitter = splitter;
            return this;
        }

        /**
         * 单图类型
         */
        public Builder setChartType(String chartType) {
            this.chartType = chartType;
            return this;
        }

        public Builder setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        public Builder setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        public Builder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdaterId(String updaterId) {
            this.updaterId = updaterId;
            return this;
        }

        public Builder setUpdatedAt(java.time.ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setCreator(String creator) {
            this.creator = creator;
            return this;
        }

        public Builder setUpdater(String updater) {
            this.updater = updater;
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }


        public OlapEventAnalysisDto build() {
            return new OlapEventAnalysisDto(id, name, description, metrics, dimensions, granularities, timeRange, filter, targetUser, limit, attrs, orders, splitter, chartType, isSystem, businessType, creatorId, createdAt, updaterId, updatedAt, creator, updater, ownerId);
        }

    }
}
