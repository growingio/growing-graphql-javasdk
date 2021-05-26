package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 预警具体规则模型
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AlertDetailsDto implements java.io.Serializable {

    private String op;
    private java.util.List<String> values;
    private String alias;

    public AlertDetailsDto() {
    }

    public AlertDetailsDto(String op, java.util.List<String> values, String alias) {
        this.op = op;
        this.values = values;
        this.alias = alias;
    }

    /**
     * 过滤操作  如 >  <  in
     */
    public String getOp() {
        return op;
    }
    /**
     * 过滤操作  如 >  <  in
     */
    public void setOp(String op) {
        this.op = op;
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

    /**
     * 别名
     */
    public String getAlias() {
        return alias;
    }
    /**
     * 别名
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (op != null) {
            joiner.add("op: " + GraphQLRequestSerializer.getEntry(op));
        }
        if (values != null) {
            joiner.add("values: " + GraphQLRequestSerializer.getEntry(values));
        }
        if (alias != null) {
            joiner.add("alias: " + GraphQLRequestSerializer.getEntry(alias));
        }
        return joiner.toString();
    }

    public static AlertDetailsDto.Builder builder() {
        return new AlertDetailsDto.Builder();
    }

    public static class Builder {

        private String op;
        private java.util.List<String> values;
        private String alias;

        public Builder() {
        }

        /**
         * 过滤操作  如 >  <  in
         */
        public Builder setOp(String op) {
            this.op = op;
            return this;
        }

        /**
         * 维度值
         */
        public Builder setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        /**
         * 别名
         */
        public Builder setAlias(String alias) {
            this.alias = alias;
            return this;
        }


        public AlertDetailsDto build() {
            return new AlertDetailsDto(op, values, alias);
        }

    }
}
