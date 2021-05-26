package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * olap(新 chart-service) 服务的指标模型
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class OlapMetricDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String type;
    private String name;
    private String alias;
    private String attribute;
    private SubgroupAggregationDto subgroupAggregation;
    private String math;
    private FilterDto filter;

    public OlapMetricDto() {
    }

    public OlapMetricDto(String id, String type, String name, String alias, String attribute, SubgroupAggregationDto subgroupAggregation, String math, FilterDto filter) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.alias = alias;
        this.attribute = attribute;
        this.subgroupAggregation = subgroupAggregation;
        this.math = math;
        this.filter = filter;
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
     * 过滤条件
     */
    public FilterDto getFilter() {
        return filter;
    }
    /**
     * 过滤条件
     */
    public void setFilter(FilterDto filter) {
        this.filter = filter;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (alias != null) {
            joiner.add("alias: " + GraphQLRequestSerializer.getEntry(alias));
        }
        if (attribute != null) {
            joiner.add("attribute: " + GraphQLRequestSerializer.getEntry(attribute));
        }
        if (subgroupAggregation != null) {
            joiner.add("subgroupAggregation: " + GraphQLRequestSerializer.getEntry(subgroupAggregation));
        }
        if (math != null) {
            joiner.add("math: " + GraphQLRequestSerializer.getEntry(math));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        return joiner.toString();
    }

    public static OlapMetricDto.Builder builder() {
        return new OlapMetricDto.Builder();
    }

    public static class Builder {

        private String id;
        private String type;
        private String name;
        private String alias;
        private String attribute;
        private SubgroupAggregationDto subgroupAggregation;
        private String math;
        private FilterDto filter;

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
         * 事件名称
         */
        public Builder setName(String name) {
            this.name = name;
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
         * 是否是事件下边的事件级变量
         */
        public Builder setAttribute(String attribute) {
            this.attribute = attribute;
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
         * 指标的度量. e.g.: sum, total。 详见 olap 服务
         */
        public Builder setMath(String math) {
            this.math = math;
            return this;
        }

        /**
         * 过滤条件
         */
        public Builder setFilter(FilterDto filter) {
            this.filter = filter;
            return this;
        }


        public OlapMetricDto build() {
            return new OlapMetricDto(id, type, name, alias, attribute, subgroupAggregation, math, filter);
        }

    }
}
