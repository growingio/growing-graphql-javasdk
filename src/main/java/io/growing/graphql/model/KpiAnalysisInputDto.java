package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class KpiAnalysisInputDto implements java.io.Serializable {

    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<MeasurementInputDto> measurements;
    private Integer limit = 10;
    @javax.validation.constraints.NotNull
    private TargetUserInputDto targetUser;
    @javax.validation.constraints.NotNull
    private String timeRange;
    private java.lang.Long interval = 3600000L;
    private FilterInputDto filter;
    private Double goal = 0.0;
    private SplitterInputDto splitter;

    public KpiAnalysisInputDto() {
    }

    public KpiAnalysisInputDto(String name, String description, java.util.List<MeasurementInputDto> measurements, Integer limit, TargetUserInputDto targetUser, String timeRange, java.lang.Long interval, FilterInputDto filter, Double goal, SplitterInputDto splitter) {
        this.name = name;
        this.description = description;
        this.measurements = measurements;
        this.limit = limit;
        this.targetUser = targetUser;
        this.timeRange = timeRange;
        this.interval = interval;
        this.filter = filter;
        this.goal = goal;
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

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public TargetUserInputDto getTargetUser() {
        return targetUser;
    }
    public void setTargetUser(TargetUserInputDto targetUser) {
        this.targetUser = targetUser;
    }

    public String getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public java.lang.Long getInterval() {
        return interval;
    }
    public void setInterval(java.lang.Long interval) {
        this.interval = interval;
    }

    public FilterInputDto getFilter() {
        return filter;
    }
    public void setFilter(FilterInputDto filter) {
        this.filter = filter;
    }

    public Double getGoal() {
        return goal;
    }
    public void setGoal(Double goal) {
        this.goal = goal;
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
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        }
        if (targetUser != null) {
            joiner.add("targetUser: " + GraphQLRequestSerializer.getEntry(targetUser));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (interval != null) {
            joiner.add("interval: " + GraphQLRequestSerializer.getEntry(interval));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        if (goal != null) {
            joiner.add("goal: " + GraphQLRequestSerializer.getEntry(goal));
        }
        if (splitter != null) {
            joiner.add("splitter: " + GraphQLRequestSerializer.getEntry(splitter));
        }
        return joiner.toString();
    }

    public static KpiAnalysisInputDto.Builder builder() {
        return new KpiAnalysisInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<MeasurementInputDto> measurements;
        private Integer limit = 10;
        private TargetUserInputDto targetUser;
        private String timeRange;
        private java.lang.Long interval = 3600000L;
        private FilterInputDto filter;
        private Double goal = 0.0;
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

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setTargetUser(TargetUserInputDto targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setInterval(java.lang.Long interval) {
            this.interval = interval;
            return this;
        }

        public Builder setFilter(FilterInputDto filter) {
            this.filter = filter;
            return this;
        }

        public Builder setGoal(Double goal) {
            this.goal = goal;
            return this;
        }

        public Builder setSplitter(SplitterInputDto splitter) {
            this.splitter = splitter;
            return this;
        }


        public KpiAnalysisInputDto build() {
            return new KpiAnalysisInputDto(name, description, measurements, limit, targetUser, timeRange, interval, filter, goal, splitter);
        }

    }
}
