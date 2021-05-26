package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 预警单图
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AlertMetricDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String type;
    private String alias;
    private String name;
    private String math;
    private SubgroupAggregationDto subgroupAggregation;
    private String attribute;
    private FilterDto filter;
    private String timeRange;
    private java.lang.Long interval;
    private FilterDto dimensionFilter;
    @javax.validation.constraints.NotNull
    private String targetUser;
    private RulesDto rules;

    public AlertMetricDto() {
    }

    public AlertMetricDto(String id, String type, String alias, String name, String math, SubgroupAggregationDto subgroupAggregation, String attribute, FilterDto filter, String timeRange, java.lang.Long interval, FilterDto dimensionFilter, String targetUser, RulesDto rules) {
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

    /**
     * 事件id。 e.g.: uc, xxxxx
     */
    public String getId() {
        return id;
    }
    /**
     * 事件id。 e.g.: uc, xxxxx
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 事件类型
     */
    public String getType() {
        return type;
    }
    /**
     * 事件类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 重命名
     */
    public String getAlias() {
        return alias;
    }
    /**
     * 重命名
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 事件名称
     */
    public String getName() {
        return name;
    }
    /**
     * 事件名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 指标的度量. e.g.: sum, total。 详见 olap 服务
     */
    public String getMath() {
        return math;
    }
    /**
     * 指标的度量. e.g.: sum, total。 详见 olap 服务
     */
    public void setMath(String math) {
        this.math = math;
    }

    /**
     * 基于哪种方式聚合. 目前只有按人聚合. 2021年01月11日13:21:04
     */
    public SubgroupAggregationDto getSubgroupAggregation() {
        return subgroupAggregation;
    }
    /**
     * 基于哪种方式聚合. 目前只有按人聚合. 2021年01月11日13:21:04
     */
    public void setSubgroupAggregation(SubgroupAggregationDto subgroupAggregation) {
        this.subgroupAggregation = subgroupAggregation;
    }

    /**
     * 是否是事件下边的事件级变量
     */
    public String getAttribute() {
        return attribute;
    }
    /**
     * 是否是事件下边的事件级变量
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * 单事件过滤条件
     */
    public FilterDto getFilter() {
        return filter;
    }
    /**
     * 单事件过滤条件
     */
    public void setFilter(FilterDto filter) {
        this.filter = filter;
    }

    /**
     * 时间范围
     */
    public String getTimeRange() {
        return timeRange;
    }
    /**
     * 时间范围
     */
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public java.lang.Long getInterval() {
        return interval;
    }
    public void setInterval(java.lang.Long interval) {
        this.interval = interval;
    }

    /**
     * 维度过滤条件值
     */
    public FilterDto getDimensionFilter() {
        return dimensionFilter;
    }
    /**
     * 维度过滤条件值
     */
    public void setDimensionFilter(FilterDto dimensionFilter) {
        this.dimensionFilter = dimensionFilter;
    }

    /**
     * 目标用户
     */
    public String getTargetUser() {
        return targetUser;
    }
    /**
     * 目标用户
     */
    public void setTargetUser(String targetUser) {
        this.targetUser = targetUser;
    }

    /**
     * 预警规则
     */
    public RulesDto getRules() {
        return rules;
    }
    /**
     * 预警规则
     */
    public void setRules(RulesDto rules) {
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

    public static AlertMetricDto.Builder builder() {
        return new AlertMetricDto.Builder();
    }

    public static class Builder {

        private String id;
        private String type;
        private String alias;
        private String name;
        private String math;
        private SubgroupAggregationDto subgroupAggregation;
        private String attribute;
        private FilterDto filter;
        private String timeRange;
        private java.lang.Long interval;
        private FilterDto dimensionFilter;
        private String targetUser;
        private RulesDto rules;

        public Builder() {
        }

        /**
         * 事件id。 e.g.: uc, xxxxx
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 事件类型
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * 重命名
         */
        public Builder setAlias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * 事件名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 指标的度量. e.g.: sum, total。 详见 olap 服务
         */
        public Builder setMath(String math) {
            this.math = math;
            return this;
        }

        /**
         * 基于哪种方式聚合. 目前只有按人聚合. 2021年01月11日13:21:04
         */
        public Builder setSubgroupAggregation(SubgroupAggregationDto subgroupAggregation) {
            this.subgroupAggregation = subgroupAggregation;
            return this;
        }

        /**
         * 是否是事件下边的事件级变量
         */
        public Builder setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }

        /**
         * 单事件过滤条件
         */
        public Builder setFilter(FilterDto filter) {
            this.filter = filter;
            return this;
        }

        /**
         * 时间范围
         */
        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setInterval(java.lang.Long interval) {
            this.interval = interval;
            return this;
        }

        /**
         * 维度过滤条件值
         */
        public Builder setDimensionFilter(FilterDto dimensionFilter) {
            this.dimensionFilter = dimensionFilter;
            return this;
        }

        /**
         * 目标用户
         */
        public Builder setTargetUser(String targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        /**
         * 预警规则
         */
        public Builder setRules(RulesDto rules) {
            this.rules = rules;
            return this;
        }


        public AlertMetricDto build() {
            return new AlertMetricDto(id, type, alias, name, math, subgroupAggregation, attribute, filter, timeRange, interval, dimensionFilter, targetUser, rules);
        }

    }
}
