package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 用来表示指标
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
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

    /**
     * 指标的过滤条件
     */
    public FilterDto getFilter() {
        return filter;
    }
    /**
     * 指标的过滤条件
     */
    public void setFilter(FilterDto filter) {
        this.filter = filter;
    }

    /**
     * 指标名
     */
    public String getName() {
        return name;
    }
    /**
     * 指标名
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * 表示时间，比如 7天前 day:8,1, 30天前 day:31,1, 绝对时间  abs:1603631197000,1604631197000
     */
    public String getTimeRange() {
        return timeRange;
    }
    /**
     * 表示时间，比如 7天前 day:8,1, 30天前 day:31,1, 绝对时间  abs:1603631197000,1604631197000
     */
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getAttribute() {
        return attribute;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * 聚合方式，如 sum
     */
    public String getAggregator() {
        return aggregator;
    }
    /**
     * 聚合方式，如 sum
     */
    public void setAggregator(String aggregator) {
        this.aggregator = aggregator;
    }

    /**
     * 指标权重
     */
    public Double getWeight() {
        return weight;
    }
    /**
     * 指标权重
     */
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

        /**
         * 指标的过滤条件
         */
        public Builder setFilter(FilterDto filter) {
            this.filter = filter;
            return this;
        }

        /**
         * 指标名
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAction(String action) {
            this.action = action;
            return this;
        }

        /**
         * 表示时间，比如 7天前 day:8,1, 30天前 day:31,1, 绝对时间  abs:1603631197000,1604631197000
         */
        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }

        /**
         * 聚合方式，如 sum
         */
        public Builder setAggregator(String aggregator) {
            this.aggregator = aggregator;
            return this;
        }

        /**
         * 指标权重
         */
        public Builder setWeight(Double weight) {
            this.weight = weight;
            return this;
        }


        public MeasurementDto build() {
            return new MeasurementDto(id, type, filter, name, action, timeRange, attribute, aggregator, weight);
        }

    }
}
