package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class RetentionAnalysisInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<MeasurementInputDto> measurements;
    @javax.validation.constraints.NotNull
    private String range;
    private String eventType;
    @javax.validation.constraints.NotNull
    private String timeRange;
    @javax.validation.constraints.NotNull
    private TargetUserInputDto targetUser;
    private SplitterInputDto splitter;
    private Integer currentTurn = 1;
    @javax.validation.constraints.NotNull
    private String chartType;

    public RetentionAnalysisInputDto() {
    }

    public RetentionAnalysisInputDto(String name, String description, java.util.List<MeasurementInputDto> measurements, String range, String eventType, String timeRange, TargetUserInputDto targetUser, SplitterInputDto splitter, Integer currentTurn, String chartType) {
        this.name = name;
        this.description = description;
        this.measurements = measurements;
        this.range = range;
        this.eventType = eventType;
        this.timeRange = timeRange;
        this.targetUser = targetUser;
        this.splitter = splitter;
        this.currentTurn = currentTurn;
        this.chartType = chartType;
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

    public java.util.List<MeasurementInputDto> getMeasurements() {
        return measurements;
    }
    public void setMeasurements(java.util.List<MeasurementInputDto> measurements) {
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

    public TargetUserInputDto getTargetUser() {
        return targetUser;
    }
    public void setTargetUser(TargetUserInputDto targetUser) {
        this.targetUser = targetUser;
    }

    public SplitterInputDto getSplitter() {
        return splitter;
    }
    public void setSplitter(SplitterInputDto splitter) {
        this.splitter = splitter;
    }

    public Integer getCurrentTurn() {
        return currentTurn;
    }
    public void setCurrentTurn(Integer currentTurn) {
        this.currentTurn = currentTurn;
    }

    public String getChartType() {
        return chartType;
    }
    public void setChartType(String chartType) {
        this.chartType = chartType;
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
        if (splitter != null) {
            joiner.add("splitter: " + GraphQLRequestSerializer.getEntry(splitter));
        }
        if (currentTurn != null) {
            joiner.add("currentTurn: " + GraphQLRequestSerializer.getEntry(currentTurn));
        }
        if (chartType != null) {
            joiner.add("chartType: " + GraphQLRequestSerializer.getEntry(chartType));
        }
        return joiner.toString();
    }

    public static RetentionAnalysisInputDto.Builder builder() {
        return new RetentionAnalysisInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<MeasurementInputDto> measurements;
        private String range;
        private String eventType;
        private String timeRange;
        private TargetUserInputDto targetUser;
        private SplitterInputDto splitter;
        private Integer currentTurn = 1;
        private String chartType;

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

        public Builder setMeasurements(java.util.List<MeasurementInputDto> measurements) {
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

        public Builder setTargetUser(TargetUserInputDto targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        public Builder setSplitter(SplitterInputDto splitter) {
            this.splitter = splitter;
            return this;
        }

        public Builder setCurrentTurn(Integer currentTurn) {
            this.currentTurn = currentTurn;
            return this;
        }

        public Builder setChartType(String chartType) {
            this.chartType = chartType;
            return this;
        }


        public RetentionAnalysisInputDto build() {
            return new RetentionAnalysisInputDto(name, description, measurements, range, eventType, timeRange, targetUser, splitter, currentTurn, chartType);
        }

    }
}
