package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class EventAnalysisInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<MeasurementInputDto> measurements;
    private java.util.List<String> dimensions;
    private java.util.List<GranularityInputDto> granularities;
    @javax.validation.constraints.NotNull
    private String timeRange;
    private TargetUserInputDto targetUser;
    private SplitterInputDto splitter;
    private FilterInputDto filter;
    private java.lang.Object attrs;
    private Integer limit;
    private java.util.List<OrderInputDto> orders;
    @javax.validation.constraints.NotNull
    private String chartType;

    public EventAnalysisInputDto() {
    }

    public EventAnalysisInputDto(String name, String description, java.util.List<MeasurementInputDto> measurements, java.util.List<String> dimensions, java.util.List<GranularityInputDto> granularities, String timeRange, TargetUserInputDto targetUser, SplitterInputDto splitter, FilterInputDto filter, java.lang.Object attrs, Integer limit, java.util.List<OrderInputDto> orders, String chartType) {
        this.name = name;
        this.description = description;
        this.measurements = measurements;
        this.dimensions = dimensions;
        this.granularities = granularities;
        this.timeRange = timeRange;
        this.targetUser = targetUser;
        this.splitter = splitter;
        this.filter = filter;
        this.attrs = attrs;
        this.limit = limit;
        this.orders = orders;
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

    public FilterInputDto getFilter() {
        return filter;
    }
    public void setFilter(FilterInputDto filter) {
        this.filter = filter;
    }

    public java.lang.Object getAttrs() {
        return attrs;
    }
    public void setAttrs(java.lang.Object attrs) {
        this.attrs = attrs;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public java.util.List<OrderInputDto> getOrders() {
        return orders;
    }
    public void setOrders(java.util.List<OrderInputDto> orders) {
        this.orders = orders;
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
        if (targetUser != null) {
            joiner.add("targetUser: " + GraphQLRequestSerializer.getEntry(targetUser));
        }
        if (splitter != null) {
            joiner.add("splitter: " + GraphQLRequestSerializer.getEntry(splitter));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        if (attrs != null) {
            joiner.add("attrs: " + GraphQLRequestSerializer.getEntry(attrs));
        }
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        }
        if (orders != null) {
            joiner.add("orders: " + GraphQLRequestSerializer.getEntry(orders));
        }
        if (chartType != null) {
            joiner.add("chartType: " + GraphQLRequestSerializer.getEntry(chartType));
        }
        return joiner.toString();
    }

    public static EventAnalysisInputDto.Builder builder() {
        return new EventAnalysisInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<MeasurementInputDto> measurements;
        private java.util.List<String> dimensions;
        private java.util.List<GranularityInputDto> granularities;
        private String timeRange;
        private TargetUserInputDto targetUser;
        private SplitterInputDto splitter;
        private FilterInputDto filter;
        private java.lang.Object attrs;
        private Integer limit;
        private java.util.List<OrderInputDto> orders;
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

        public Builder setTargetUser(TargetUserInputDto targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        public Builder setSplitter(SplitterInputDto splitter) {
            this.splitter = splitter;
            return this;
        }

        public Builder setFilter(FilterInputDto filter) {
            this.filter = filter;
            return this;
        }

        public Builder setAttrs(java.lang.Object attrs) {
            this.attrs = attrs;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setOrders(java.util.List<OrderInputDto> orders) {
            this.orders = orders;
            return this;
        }

        public Builder setChartType(String chartType) {
            this.chartType = chartType;
            return this;
        }


        public EventAnalysisInputDto build() {
            return new EventAnalysisInputDto(name, description, measurements, dimensions, granularities, timeRange, targetUser, splitter, filter, attrs, limit, orders, chartType);
        }

    }
}
