package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 表示过滤条件
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class FilterDto implements java.io.Serializable {

    private String key;
    private String op;
    private String name;
    private java.util.List<String> values;
    private java.util.List<FilterDto> exprs;
    private String valueType;

    public FilterDto() {
    }

    public FilterDto(String key, String op, String name, java.util.List<String> values, java.util.List<FilterDto> exprs, String valueType) {
        this.key = key;
        this.op = op;
        this.name = name;
        this.values = values;
        this.exprs = exprs;
        this.valueType = valueType;
    }

    /**
     * 维度的 key
     */
    public String getKey() {
        return key;
    }
    /**
     * 维度的 key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 过滤的操作，比如：in, not in, like, =, !=
     */
    public String getOp() {
        return op;
    }
    /**
     * 过滤的操作，比如：in, not in, like, =, !=
     */
    public void setOp(String op) {
        this.op = op;
    }

    /**
     * 维度名
     */
    public String getName() {
        return name;
    }
    /**
     * 维度名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 维度值
     */
    public java.util.List<String> getValues() {
        return values;
    }
    /**
     * 维度值
     */
    public void setValues(java.util.List<String> values) {
        this.values = values;
    }

    public java.util.List<FilterDto> getExprs() {
        return exprs;
    }
    public void setExprs(java.util.List<FilterDto> exprs) {
        this.exprs = exprs;
    }

    /**
     * 维度值类型
     */
    public String getValueType() {
        return valueType;
    }
    /**
     * 维度值类型
     */
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (op != null) {
            joiner.add("op: " + GraphQLRequestSerializer.getEntry(op));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (values != null) {
            joiner.add("values: " + GraphQLRequestSerializer.getEntry(values));
        }
        if (exprs != null) {
            joiner.add("exprs: " + GraphQLRequestSerializer.getEntry(exprs));
        }
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        return joiner.toString();
    }

    public static FilterDto.Builder builder() {
        return new FilterDto.Builder();
    }

    public static class Builder {

        private String key;
        private String op;
        private String name;
        private java.util.List<String> values;
        private java.util.List<FilterDto> exprs;
        private String valueType;

        public Builder() {
        }

        /**
         * 维度的 key
         */
        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        /**
         * 过滤的操作，比如：in, not in, like, =, !=
         */
        public Builder setOp(String op) {
            this.op = op;
            return this;
        }

        /**
         * 维度名
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 维度值
         */
        public Builder setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public Builder setExprs(java.util.List<FilterDto> exprs) {
            this.exprs = exprs;
            return this;
        }

        /**
         * 维度值类型
         */
        public Builder setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }


        public FilterDto build() {
            return new FilterDto(key, op, name, values, exprs, valueType);
        }

    }
}
