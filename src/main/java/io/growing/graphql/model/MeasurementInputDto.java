package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class MeasurementInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String type;
    private String action;
    private FilterInputDto filter;
    private String attribute;
    private String aggregator;
    private String timeRange;
    private Double weight;

    public MeasurementInputDto() {
    }

    public MeasurementInputDto(String id, String type, String action, FilterInputDto filter, String attribute, String aggregator, String timeRange, Double weight) {
        this.id = id;
        this.type = type;
        this.action = action;
        this.filter = filter;
        this.attribute = attribute;
        this.aggregator = aggregator;
        this.timeRange = timeRange;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public FilterInputDto getFilter() {
        return filter;
    }
    public void setFilter(FilterInputDto filter) {
        this.filter = filter;
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

    public String getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (action != null) {
            joiner.add("action: " + GraphQLRequestSerializer.getEntry(action));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        if (attribute != null) {
            joiner.add("attribute: " + GraphQLRequestSerializer.getEntry(attribute));
        }
        if (aggregator != null) {
            joiner.add("aggregator: " + GraphQLRequestSerializer.getEntry(aggregator));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (weight != null) {
            joiner.add("weight: " + GraphQLRequestSerializer.getEntry(weight));
        }
        return joiner.toString();
    }

    public static MeasurementInputDto.Builder builder() {
        return new MeasurementInputDto.Builder();
    }

    public static class Builder {

        private String id;
        private String type;
        private String action;
        private FilterInputDto filter;
        private String attribute;
        private String aggregator;
        private String timeRange;
        private Double weight;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setAction(String action) {
            this.action = action;
            return this;
        }

        public Builder setFilter(FilterInputDto filter) {
            this.filter = filter;
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

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setWeight(Double weight) {
            this.weight = weight;
            return this;
        }


        public MeasurementInputDto build() {
            return new MeasurementInputDto(id, type, action, filter, attribute, aggregator, timeRange, weight);
        }

    }
}
