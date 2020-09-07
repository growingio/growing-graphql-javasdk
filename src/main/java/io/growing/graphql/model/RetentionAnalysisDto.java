package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class RetentionAnalysisDto implements java.io.Serializable, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String projectId;
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

    public RetentionAnalysisDto() {
    }

    public RetentionAnalysisDto(String id, String projectId, String name, String description, java.util.List<MeasurementDto> measurements, String range, String eventType, String timeRange, TargetUserDto targetUser, Integer currentTurn, SplitterDto splitter, String chartType, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater) {
        this.id = id;
        this.projectId = projectId;
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
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
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

    public java.util.List<MeasurementDto> getMeasurements() {
        return measurements;
    }
    public void setMeasurements(java.util.List<MeasurementDto> measurements) {
        this.measurements = measurements;
    }

    public String getRange() {
        return range;
    }
    public void setRange(String range) {
        this.range = range;
    }

    public String getEventType() {
        return eventType;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public TargetUserDto getTargetUser() {
        return targetUser;
    }
    public void setTargetUser(TargetUserDto targetUser) {
        this.targetUser = targetUser;
    }

    public Integer getCurrentTurn() {
        return currentTurn;
    }
    public void setCurrentTurn(Integer currentTurn) {
        this.currentTurn = currentTurn;
    }

    public SplitterDto getSplitter() {
        return splitter;
    }
    public void setSplitter(SplitterDto splitter) {
        this.splitter = splitter;
    }

    public String getChartType() {
        return chartType;
    }
    public void setChartType(String chartType) {
        this.chartType = chartType;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
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
        return joiner.toString();
    }

    public static RetentionAnalysisDto.Builder builder() {
        return new RetentionAnalysisDto.Builder();
    }

    public static class Builder {

        private String id;
        private String projectId;
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

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setMeasurements(java.util.List<MeasurementDto> measurements) {
            this.measurements = measurements;
            return this;
        }

        public Builder setRange(String range) {
            this.range = range;
            return this;
        }

        public Builder setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setTargetUser(TargetUserDto targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        public Builder setCurrentTurn(Integer currentTurn) {
            this.currentTurn = currentTurn;
            return this;
        }

        public Builder setSplitter(SplitterDto splitter) {
            this.splitter = splitter;
            return this;
        }

        public Builder setChartType(String chartType) {
            this.chartType = chartType;
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


        public RetentionAnalysisDto build() {
            return new RetentionAnalysisDto(id, projectId, name, description, measurements, range, eventType, timeRange, targetUser, currentTurn, splitter, chartType, creatorId, createdAt, updaterId, updatedAt, creator, updater);
        }

    }
}
