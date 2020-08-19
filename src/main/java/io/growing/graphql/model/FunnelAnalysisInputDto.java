package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class FunnelAnalysisInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<MeasurementInputDto> measurements;
    private Integer conversionWindow;
    @javax.validation.constraints.NotNull
    private String timeRange;
    @javax.validation.constraints.NotNull
    private TargetUserInputDto targetUser;
    private FilterInputDto filter;
    private SplitterInputDto splitter;

    public FunnelAnalysisInputDto() {
    }

    public FunnelAnalysisInputDto(String name, String description, java.util.List<MeasurementInputDto> measurements, Integer conversionWindow, String timeRange, TargetUserInputDto targetUser, FilterInputDto filter, SplitterInputDto splitter) {
        this.name = name;
        this.description = description;
        this.measurements = measurements;
        this.conversionWindow = conversionWindow;
        this.timeRange = timeRange;
        this.targetUser = targetUser;
        this.filter = filter;
        this.splitter = splitter;
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

    public Integer getConversionWindow() {
        return conversionWindow;
    }
    public void setConversionWindow(Integer conversionWindow) {
        this.conversionWindow = conversionWindow;
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
        if (conversionWindow != null) {
            joiner.add("conversionWindow: " + GraphQLRequestSerializer.getEntry(conversionWindow));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (targetUser != null) {
            joiner.add("targetUser: " + GraphQLRequestSerializer.getEntry(targetUser));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        if (splitter != null) {
            joiner.add("splitter: " + GraphQLRequestSerializer.getEntry(splitter));
        }
        return joiner.toString();
    }

    public static FunnelAnalysisInputDto.Builder builder() {
        return new FunnelAnalysisInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<MeasurementInputDto> measurements;
        private Integer conversionWindow;
        private String timeRange;
        private TargetUserInputDto targetUser;
        private FilterInputDto filter;
        private SplitterInputDto splitter;

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

        public Builder setConversionWindow(Integer conversionWindow) {
            this.conversionWindow = conversionWindow;
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

        public Builder setFilter(FilterInputDto filter) {
            this.filter = filter;
            return this;
        }

        public Builder setSplitter(SplitterInputDto splitter) {
            this.splitter = splitter;
            return this;
        }


        public FunnelAnalysisInputDto build() {
            return new FunnelAnalysisInputDto(name, description, measurements, conversionWindow, timeRange, targetUser, filter, splitter);
        }

    }
}
