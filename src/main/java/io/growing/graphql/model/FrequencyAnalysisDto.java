package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class FrequencyAnalysisDto implements java.io.Serializable, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<MeasurementDto> measurements;
    private java.util.List<String> dimensions;
    private java.util.List<GranularityDto> granularities;
    @javax.validation.constraints.NotNull
    private String timeRange;
    private FilterDto filter;
    private SplitterDto splitter;
    private TargetUserDto targetUser;
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

    public FrequencyAnalysisDto() {
    }

    public FrequencyAnalysisDto(String id, String name, String description, java.util.List<MeasurementDto> measurements, java.util.List<String> dimensions, java.util.List<GranularityDto> granularities, String timeRange, FilterDto filter, SplitterDto splitter, TargetUserDto targetUser, String chartType, Boolean isSystem, String businessType, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, String ownerId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.measurements = measurements;
        this.dimensions = dimensions;
        this.granularities = granularities;
        this.timeRange = timeRange;
        this.filter = filter;
        this.splitter = splitter;
        this.targetUser = targetUser;
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
     * 此条分析的id
     */
    public String getId() {
        return id;
    }
    /**
     * 此条分析的id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 此条分析的名称
     */
    public String getName() {
        return name;
    }
    /**
     * 此条分析的名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 此条分析的描述信息
     */
    public String getDescription() {
        return description;
    }
    /**
     * 此条分析的描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 指标列表
     */
    public java.util.List<MeasurementDto> getMeasurements() {
        return measurements;
    }
    /**
     * 指标列表
     */
    public void setMeasurements(java.util.List<MeasurementDto> measurements) {
        this.measurements = measurements;
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
     * 时间
     */
    public String getTimeRange() {
        return timeRange;
    }
    /**
     * 时间
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
     * 维度对比/用户对比
     */
    public SplitterDto getSplitter() {
        return splitter;
    }
    /**
     * 维度对比/用户对比
     */
    public void setSplitter(SplitterDto splitter) {
        this.splitter = splitter;
    }

    /**
     * 目标用户
     */
    public TargetUserDto getTargetUser() {
        return targetUser;
    }
    /**
     * 目标用户
     */
    public void setTargetUser(TargetUserDto targetUser) {
        this.targetUser = targetUser;
    }

    /**
     * 图表类型
     */
    public String getChartType() {
        return chartType;
    }
    /**
     * 图表类型
     */
    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    /**
     * 是否为系统资源
     */
    public Boolean getIsSystem() {
        return isSystem;
    }
    /**
     * 是否为系统资源
     */
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    /**
     * 业务类型
     */
    public String getBusinessType() {
        return businessType;
    }
    /**
     * 业务类型
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    /**
     * 创建者id
     */
    public String getCreatorId() {
        return creatorId;
    }
    /**
     * 创建者id
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
     * 更新者id
     */
    public String getUpdaterId() {
        return updaterId;
    }
    /**
     * 更新者id
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
     * 拥有者id
     */
    public String getOwnerId() {
        return ownerId;
    }
    /**
     * 拥有者id
     */
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
        if (measurements != null) {
            joiner.add("measurements: " + GraphQLRequestSerializer.getEntry(measurements));
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
        if (splitter != null) {
            joiner.add("splitter: " + GraphQLRequestSerializer.getEntry(splitter));
        }
        if (targetUser != null) {
            joiner.add("targetUser: " + GraphQLRequestSerializer.getEntry(targetUser));
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

    public static FrequencyAnalysisDto.Builder builder() {
        return new FrequencyAnalysisDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private java.util.List<MeasurementDto> measurements;
        private java.util.List<String> dimensions;
        private java.util.List<GranularityDto> granularities;
        private String timeRange;
        private FilterDto filter;
        private SplitterDto splitter;
        private TargetUserDto targetUser;
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
         * 此条分析的id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 此条分析的名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 此条分析的描述信息
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * 指标列表
         */
        public Builder setMeasurements(java.util.List<MeasurementDto> measurements) {
            this.measurements = measurements;
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
         * 时间
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
         * 维度对比/用户对比
         */
        public Builder setSplitter(SplitterDto splitter) {
            this.splitter = splitter;
            return this;
        }

        /**
         * 目标用户
         */
        public Builder setTargetUser(TargetUserDto targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        /**
         * 图表类型
         */
        public Builder setChartType(String chartType) {
            this.chartType = chartType;
            return this;
        }

        /**
         * 是否为系统资源
         */
        public Builder setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        /**
         * 业务类型
         */
        public Builder setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
         * 创建者id
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
         * 更新者id
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
         * 拥有者id
         */
        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }


        public FrequencyAnalysisDto build() {
            return new FrequencyAnalysisDto(id, name, description, measurements, dimensions, granularities, timeRange, filter, splitter, targetUser, chartType, isSystem, businessType, creatorId, createdAt, updaterId, updatedAt, creator, updater, ownerId);
        }

    }
}
