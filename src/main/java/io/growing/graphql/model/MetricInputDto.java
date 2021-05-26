package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 新指标度量对象
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MetricInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String type;
    private String name;
    private String alias;
    private String attribute;
    private SubgroupAggregationInputDto subgroupAggregation;
    private String math;
    private FilterInputDto filter;

    public MetricInputDto() {
    }

    public MetricInputDto(String id, String type, String name, String alias, String attribute, SubgroupAggregationInputDto subgroupAggregation, String math, FilterInputDto filter) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.alias = alias;
        this.attribute = attribute;
        this.subgroupAggregation = subgroupAggregation;
        this.math = math;
        this.filter = filter;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAttribute() {
        return attribute;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public SubgroupAggregationInputDto getSubgroupAggregation() {
        return subgroupAggregation;
    }
    public void setSubgroupAggregation(SubgroupAggregationInputDto subgroupAggregation) {
        this.subgroupAggregation = subgroupAggregation;
    }

    public String getMath() {
        return math;
    }
    public void setMath(String math) {
        this.math = math;
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

    public static MetricInputDto.Builder builder() {
        return new MetricInputDto.Builder();
    }

    public static class Builder {

        private String id;
        private String type;
        private String name;
        private String alias;
        private String attribute;
        private SubgroupAggregationInputDto subgroupAggregation;
        private String math;
        private FilterInputDto filter;

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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAlias(String alias) {
            this.alias = alias;
            return this;
        }

        public Builder setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }

        public Builder setSubgroupAggregation(SubgroupAggregationInputDto subgroupAggregation) {
            this.subgroupAggregation = subgroupAggregation;
            return this;
        }

        public Builder setMath(String math) {
            this.math = math;
            return this;
        }

        public Builder setFilter(FilterInputDto filter) {
            this.filter = filter;
            return this;
        }


        public MetricInputDto build() {
            return new MetricInputDto(id, type, name, alias, attribute, subgroupAggregation, math, filter);
        }

    }
}
