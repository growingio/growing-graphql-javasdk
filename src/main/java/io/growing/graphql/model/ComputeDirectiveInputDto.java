package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class ComputeDirectiveInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String alias;
    @javax.validation.constraints.NotNull
    private MeasurementInputDto measurement;
    private String op;
    private java.util.List<String> values;
    private String timeRange;
    private String attribute;
    private String aggregator;
    private FilterInputDto filter;

    public ComputeDirectiveInputDto() {
    }

    public ComputeDirectiveInputDto(String alias, MeasurementInputDto measurement, String op, java.util.List<String> values, String timeRange, String attribute, String aggregator, FilterInputDto filter) {
        this.alias = alias;
        this.measurement = measurement;
        this.op = op;
        this.values = values;
        this.timeRange = timeRange;
        this.attribute = attribute;
        this.aggregator = aggregator;
        this.filter = filter;
    }

    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public MeasurementInputDto getMeasurement() {
        return measurement;
    }
    public void setMeasurement(MeasurementInputDto measurement) {
        this.measurement = measurement;
    }

    public String getOp() {
        return op;
    }
    public void setOp(String op) {
        this.op = op;
    }

    public java.util.List<String> getValues() {
        return values;
    }
    public void setValues(java.util.List<String> values) {
        this.values = values;
    }

    public String getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getAttribute() {
        return attribute;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAggregator() {
        return aggregator;
    }
    public void setAggregator(String aggregator) {
        this.aggregator = aggregator;
    }

    public FilterInputDto getFilter() {
        return filter;
    }
    public void setFilter(FilterInputDto filter) {
        this.filter = filter;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (alias != null) {
            joiner.add("alias: " + GraphQLRequestSerializer.getEntry(alias));
        }
        if (measurement != null) {
            joiner.add("measurement: " + GraphQLRequestSerializer.getEntry(measurement));
        }
        if (op != null) {
            joiner.add("op: " + GraphQLRequestSerializer.getEntry(op));
        }
        if (values != null) {
            joiner.add("values: " + GraphQLRequestSerializer.getEntry(values));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (attribute != null) {
            joiner.add("attribute: " + GraphQLRequestSerializer.getEntry(attribute));
        }
        if (aggregator != null) {
            joiner.add("aggregator: " + GraphQLRequestSerializer.getEntry(aggregator));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        return joiner.toString();
    }

    public static ComputeDirectiveInputDto.Builder builder() {
        return new ComputeDirectiveInputDto.Builder();
    }

    public static class Builder {

        private String alias;
        private MeasurementInputDto measurement;
        private String op;
        private java.util.List<String> values;
        private String timeRange;
        private String attribute;
        private String aggregator;
        private FilterInputDto filter;

        public Builder() {
        }

        public Builder setAlias(String alias) {
            this.alias = alias;
            return this;
        }

        public Builder setMeasurement(MeasurementInputDto measurement) {
            this.measurement = measurement;
            return this;
        }

        public Builder setOp(String op) {
            this.op = op;
            return this;
        }

        public Builder setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }

        public Builder setAggregator(String aggregator) {
            this.aggregator = aggregator;
            return this;
        }

        public Builder setFilter(FilterInputDto filter) {
            this.filter = filter;
            return this;
        }


        public ComputeDirectiveInputDto build() {
            return new ComputeDirectiveInputDto(alias, measurement, op, values, timeRange, attribute, aggregator, filter);
        }

    }
}
