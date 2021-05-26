package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 预警单图接收对象
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AlertMetricInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String type;
    private String alias;
    private String name;
    private String math;
    private SubgroupAggregationInputDto subgroupAggregation;
    private String attribute;
    private FilterInputDto filter;
    @javax.validation.constraints.NotNull
    private String timeRange;
    private java.lang.Long interval;
    private FilterInputDto dimensionFilter;
    @javax.validation.constraints.NotNull
    private String targetUser;
    @javax.validation.constraints.NotNull
    private RulesInputDto rules;

    public AlertMetricInputDto() {
    }

    public AlertMetricInputDto(String id, String type, String alias, String name, String math, SubgroupAggregationInputDto subgroupAggregation, String attribute, FilterInputDto filter, String timeRange, java.lang.Long interval, FilterInputDto dimensionFilter, String targetUser, RulesInputDto rules) {
        this.id = id;
        this.type = type;
        this.alias = alias;
        this.name = name;
        this.math = math;
        this.subgroupAggregation = subgroupAggregation;
        this.attribute = attribute;
        this.filter = filter;
        this.timeRange = timeRange;
        this.interval = interval;
        this.dimensionFilter = dimensionFilter;
        this.targetUser = targetUser;
        this.rules = rules;
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

    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMath() {
        return math;
    }
    public void setMath(String math) {
        this.math = math;
    }

    public SubgroupAggregationInputDto getSubgroupAggregation() {
        return subgroupAggregation;
    }
    public void setSubgroupAggregation(SubgroupAggregationInputDto subgroupAggregation) {
        this.subgroupAggregation = subgroupAggregation;
    }

    public String getAttribute() {
        return attribute;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public FilterInputDto getFilter() {
        return filter;
    }
    public void setFilter(FilterInputDto filter) {
        this.filter = filter;
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

    public FilterInputDto getDimensionFilter() {
        return dimensionFilter;
    }
    public void setDimensionFilter(FilterInputDto dimensionFilter) {
        this.dimensionFilter = dimensionFilter;
    }

    public String getTargetUser() {
        return targetUser;
    }
    public void setTargetUser(String targetUser) {
        this.targetUser = targetUser;
    }

    public RulesInputDto getRules() {
        return rules;
    }
    public void setRules(RulesInputDto rules) {
        this.rules = rules;
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
        if (alias != null) {
            joiner.add("alias: " + GraphQLRequestSerializer.getEntry(alias));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (math != null) {
            joiner.add("math: " + GraphQLRequestSerializer.getEntry(math));
        }
        if (subgroupAggregation != null) {
            joiner.add("subgroupAggregation: " + GraphQLRequestSerializer.getEntry(subgroupAggregation));
        }
        if (attribute != null) {
            joiner.add("attribute: " + GraphQLRequestSerializer.getEntry(attribute));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (interval != null) {
            joiner.add("interval: " + GraphQLRequestSerializer.getEntry(interval));
        }
        if (dimensionFilter != null) {
            joiner.add("dimensionFilter: " + GraphQLRequestSerializer.getEntry(dimensionFilter));
        }
        if (targetUser != null) {
            joiner.add("targetUser: " + GraphQLRequestSerializer.getEntry(targetUser));
        }
        if (rules != null) {
            joiner.add("rules: " + GraphQLRequestSerializer.getEntry(rules));
        }
        return joiner.toString();
    }

    public static AlertMetricInputDto.Builder builder() {
        return new AlertMetricInputDto.Builder();
    }

    public static class Builder {

        private String id;
        private String type;
        private String alias;
        private String name;
        private String math;
        private SubgroupAggregationInputDto subgroupAggregation;
        private String attribute;
        private FilterInputDto filter;
        private String timeRange;
        private java.lang.Long interval;
        private FilterInputDto dimensionFilter;
        private String targetUser;
        private RulesInputDto rules;

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

        public Builder setAlias(String alias) {
            this.alias = alias;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMath(String math) {
            this.math = math;
            return this;
        }

        public Builder setSubgroupAggregation(SubgroupAggregationInputDto subgroupAggregation) {
            this.subgroupAggregation = subgroupAggregation;
            return this;
        }

        public Builder setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }

        public Builder setFilter(FilterInputDto filter) {
            this.filter = filter;
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

        public Builder setDimensionFilter(FilterInputDto dimensionFilter) {
            this.dimensionFilter = dimensionFilter;
            return this;
        }

        public Builder setTargetUser(String targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        public Builder setRules(RulesInputDto rules) {
            this.rules = rules;
            return this;
        }


        public AlertMetricInputDto build() {
            return new AlertMetricInputDto(id, type, alias, name, math, subgroupAggregation, attribute, filter, timeRange, interval, dimensionFilter, targetUser, rules);
        }

    }
}
