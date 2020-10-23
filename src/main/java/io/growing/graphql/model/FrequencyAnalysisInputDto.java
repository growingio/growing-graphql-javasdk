package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class FrequencyAnalysisInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<MeasurementInputDto> measurements;
    private java.util.List<String> dimensions;
    private java.util.List<GranularityInputDto> granularities;
    @javax.validation.constraints.NotNull
    private String timeRange;
    private FilterInputDto filter;
    private SplitterInputDto splitter;
    private TargetUserInputDto targetUser;
    @javax.validation.constraints.NotNull
    private String chartType;

    public FrequencyAnalysisInputDto() {
    }

    public FrequencyAnalysisInputDto(String name, String description, java.util.List<MeasurementInputDto> measurements, java.util.List<String> dimensions, java.util.List<GranularityInputDto> granularities, String timeRange, FilterInputDto filter, SplitterInputDto splitter, TargetUserInputDto targetUser, String chartType) {
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

    public java.util.List<String> getDimensions() {
        return dimensions;
    }
    public void setDimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
    }

    public java.util.List<GranularityInputDto> getGranularities() {
        return granularities;
    }
    public void setGranularities(java.util.List<GranularityInputDto> granularities) {
        this.granularities = granularities;
    }

    public String getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public FilterInputDto getFilter() {
        return filter;
    }
    public void setFilter(FilterInputDto filter) {
        this.filter = filter;
    }

    public SplitterInputDto getSplitter() {
        return splitter;
    }
    public void setSplitter(SplitterInputDto splitter) {
        this.splitter = splitter;
    }

    public TargetUserInputDto getTargetUser() {
        return targetUser;
    }
    public void setTargetUser(TargetUserInputDto targetUser) {
        this.targetUser = targetUser;
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
        return joiner.toString();
    }

    public static FrequencyAnalysisInputDto.Builder builder() {
        return new FrequencyAnalysisInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<MeasurementInputDto> measurements;
        private java.util.List<String> dimensions;
        private java.util.List<GranularityInputDto> granularities;
        private String timeRange;
        private FilterInputDto filter;
        private SplitterInputDto splitter;
        private TargetUserInputDto targetUser;
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

        public Builder setDimensions(java.util.List<String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setGranularities(java.util.List<GranularityInputDto> granularities) {
            this.granularities = granularities;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setFilter(FilterInputDto filter) {
            this.filter = filter;
            return this;
        }

        public Builder setSplitter(SplitterInputDto splitter) {
            this.splitter = splitter;
            return this;
        }

        public Builder setTargetUser(TargetUserInputDto targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        public Builder setChartType(String chartType) {
            this.chartType = chartType;
            return this;
        }


        public FrequencyAnalysisInputDto build() {
            return new FrequencyAnalysisInputDto(name, description, measurements, dimensions, granularities, timeRange, filter, splitter, targetUser, chartType);
        }

    }
}
