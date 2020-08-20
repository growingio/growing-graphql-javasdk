package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class MeasurementDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String type;
    private FilterDto filter;
    private String name;
    private String action;
    private String timeRange;
    private String attribute;
    private String aggregator;
    private Double weight;

    public MeasurementDto() {
    }

    public MeasurementDto(String id, String type, FilterDto filter, String name, String action, String timeRange, String attribute, String aggregator, Double weight) {
        this.id = id;
        this.type = type;
        this.filter = filter;
        this.name = name;
        this.action = action;
        this.timeRange = timeRange;
        this.attribute = attribute;
        this.aggregator = aggregator;
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

    public FilterDto getFilter() {
        return filter;
    }
    public void setFilter(FilterDto filter) {
        this.filter = filter;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
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
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (action != null) {
            joiner.add("action: " + GraphQLRequestSerializer.getEntry(action));
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
        if (weight != null) {
            joiner.add("weight: " + GraphQLRequestSerializer.getEntry(weight));
        }
        return joiner.toString();
    }

    public static MeasurementDto.Builder builder() {
        return new MeasurementDto.Builder();
    }

    public static class Builder {

        private String id;
        private String type;
        private FilterDto filter;
        private String name;
        private String action;
        private String timeRange;
        private String attribute;
        private String aggregator;
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

        public Builder setFilter(FilterDto filter) {
            this.filter = filter;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAction(String action) {
            this.action = action;
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

        public Builder setWeight(Double weight) {
            this.weight = weight;
            return this;
        }


        public MeasurementDto build() {
            return new MeasurementDto(id, type, filter, name, action, timeRange, attribute, aggregator, weight);
        }

    }
}
