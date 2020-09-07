package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class ComputeDirectiveDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String alias;
    @javax.validation.constraints.NotNull
    private MeasurementDto measurement;
    private String timeRange;
    private FilterDto filter;
    private String op;
    private String attribute;
    private String aggregator;
    private java.util.List<String> values;

    public ComputeDirectiveDto() {
    }

    public ComputeDirectiveDto(String alias, MeasurementDto measurement, String timeRange, FilterDto filter, String op, String attribute, String aggregator, java.util.List<String> values) {
        this.alias = alias;
        this.measurement = measurement;
        this.timeRange = timeRange;
        this.filter = filter;
        this.op = op;
        this.attribute = attribute;
        this.aggregator = aggregator;
        this.values = values;
    }

    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public MeasurementDto getMeasurement() {
        return measurement;
    }
    public void setMeasurement(MeasurementDto measurement) {
        this.measurement = measurement;
    }

    public String getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public FilterDto getFilter() {
        return filter;
    }
    public void setFilter(FilterDto filter) {
        this.filter = filter;
    }

    public String getOp() {
        return op;
    }
    public void setOp(String op) {
        this.op = op;
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

    public java.util.List<String> getValues() {
        return values;
    }
    public void setValues(java.util.List<String> values) {
        this.values = values;
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
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        if (op != null) {
            joiner.add("op: " + GraphQLRequestSerializer.getEntry(op));
        }
        if (attribute != null) {
            joiner.add("attribute: " + GraphQLRequestSerializer.getEntry(attribute));
        }
        if (aggregator != null) {
            joiner.add("aggregator: " + GraphQLRequestSerializer.getEntry(aggregator));
        }
        if (values != null) {
            joiner.add("values: " + GraphQLRequestSerializer.getEntry(values));
        }
        return joiner.toString();
    }

    public static ComputeDirectiveDto.Builder builder() {
        return new ComputeDirectiveDto.Builder();
    }

    public static class Builder {

        private String alias;
        private MeasurementDto measurement;
        private String timeRange;
        private FilterDto filter;
        private String op;
        private String attribute;
        private String aggregator;
        private java.util.List<String> values;

        public Builder() {
        }

        public Builder setAlias(String alias) {
            this.alias = alias;
            return this;
        }

        public Builder setMeasurement(MeasurementDto measurement) {
            this.measurement = measurement;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setFilter(FilterDto filter) {
            this.filter = filter;
            return this;
        }

        public Builder setOp(String op) {
            this.op = op;
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

        public Builder setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }


        public ComputeDirectiveDto build() {
            return new ComputeDirectiveDto(alias, measurement, timeRange, filter, op, attribute, aggregator, values);
        }

    }
}
