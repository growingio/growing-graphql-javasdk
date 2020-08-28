package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
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

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getOp() {
        return op;
    }
    public void setOp(String op) {
        this.op = op;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<String> getValues() {
        return values;
    }
    public void setValues(java.util.List<String> values) {
        this.values = values;
    }

    public java.util.List<FilterDto> getExprs() {
        return exprs;
    }
    public void setExprs(java.util.List<FilterDto> exprs) {
        this.exprs = exprs;
    }

    public String getValueType() {
        return valueType;
    }
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

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setOp(String op) {
            this.op = op;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public Builder setExprs(java.util.List<FilterDto> exprs) {
            this.exprs = exprs;
            return this;
        }

        public Builder setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }


        public FilterDto build() {
            return new FilterDto(key, op, name, values, exprs, valueType);
        }

    }
}
