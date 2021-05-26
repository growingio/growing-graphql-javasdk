package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class RetentionAnalysisDto implements java.io.Serializable, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<MeasurementDto> measurements;
    @javax.validation.constraints.NotNull
    private String range;
    private String eventType;
    @javax.validation.constraints.NotNull
    private String timeRange;
    private TargetUserDto targetUser;
    private Integer currentTurn;
    private SplitterDto splitter;
    @javax.validation.constraints.NotNull
    private String chartType;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;
    private String ownerId;

    public RetentionAnalysisDto() {
    }

    public RetentionAnalysisDto(String id, String name, String description, java.util.List<MeasurementDto> measurements, String range, String eventType, String timeRange, TargetUserDto targetUser, Integer currentTurn, SplitterDto splitter, String chartType, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, String ownerId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.measurements = measurements;
        this.range = range;
        this.eventType = eventType;
        this.timeRange = timeRange;
        this.targetUser = targetUser;
        this.currentTurn = currentTurn;
        this.splitter = splitter;
        this.chartType = chartType;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updaterId = updaterId;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.updater = updater;
        this.ownerId = ownerId;
    }

    /**
     * 留存分析id
     */
    public String getId() {
        return id;
    }
    /**
     * 留存分析id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 此条分析名称
     */
    public String getName() {
        return name;
    }
    /**
     * 此条分析名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 此条分析描述信息
     */
    public String getDescription() {
        return description;
    }
    /**
     * 此条分析描述信息
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

    public String getRange() {
        return range;
    }
    public void setRange(String range) {
        this.range = range;
    }

    /**
     * 事件类型
     */
    public String getEventType() {
        return eventType;
    }
    /**
     * 事件类型
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
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

    public Integer getCurrentTurn() {
        return currentTurn;
    }
    public void setCurrentTurn(Integer currentTurn) {
        this.currentTurn = currentTurn;
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
        if (range != null) {
            joiner.add("range: " + GraphQLRequestSerializer.getEntry(range));
        }
        if (eventType != null) {
            joiner.add("eventType: " + GraphQLRequestSerializer.getEntry(eventType));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (targetUser != null) {
            joiner.add("targetUser: " + GraphQLRequestSerializer.getEntry(targetUser));
        }
        if (currentTurn != null) {
            joiner.add("currentTurn: " + GraphQLRequestSerializer.getEntry(currentTurn));
        }
        if (splitter != null) {
            joiner.add("splitter: " + GraphQLRequestSerializer.getEntry(splitter));
        }
        if (chartType != null) {
            joiner.add("chartType: " + GraphQLRequestSerializer.getEntry(chartType));
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

    public static RetentionAnalysisDto.Builder builder() {
        return new RetentionAnalysisDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private java.util.List<MeasurementDto> measurements;
        private String range;
        private String eventType;
        private String timeRange;
        private TargetUserDto targetUser;
        private Integer currentTurn;
        private SplitterDto splitter;
        private String chartType;
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
         * 留存分析id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 此条分析名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 此条分析描述信息
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

        public Builder setRange(String range) {
            this.range = range;
            return this;
        }

        /**
         * 事件类型
         */
        public Builder setEventType(String eventType) {
            this.eventType = eventType;
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
         * 目标用户
         */
        public Builder setTargetUser(TargetUserDto targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        public Builder setCurrentTurn(Integer currentTurn) {
            this.currentTurn = currentTurn;
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
         * 图表类型
         */
        public Builder setChartType(String chartType) {
            this.chartType = chartType;
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
         * 拥有者
         */
        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }


        public RetentionAnalysisDto build() {
            return new RetentionAnalysisDto(id, name, description, measurements, range, eventType, timeRange, targetUser, currentTurn, splitter, chartType, creatorId, createdAt, updaterId, updatedAt, creator, updater, ownerId);
        }

    }
}
