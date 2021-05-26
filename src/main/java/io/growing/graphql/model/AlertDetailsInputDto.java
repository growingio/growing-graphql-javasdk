package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AlertDetailsInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String op;
    @javax.validation.constraints.NotNull
    private java.util.List<String> values;
    @javax.validation.constraints.NotNull
    private String alias;

    public AlertDetailsInputDto() {
    }

    public AlertDetailsInputDto(String op, java.util.List<String> values, String alias) {
        this.op = op;
        this.values = values;
        this.alias = alias;
    }

    public String getOp() {
        return op;
    }
    public void setOp(String op) {
        this.op = op;
    }

    public java.util.List<String> getValues() {
        return values;
    }
    public void setValues(java.util.List<String> values) {
        this.values = values;
    }

    public String getAlias() {
        return alias;
    }
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

    public static AlertDetailsInputDto.Builder builder() {
        return new AlertDetailsInputDto.Builder();
    }

    public static class Builder {

        private String op;
        private java.util.List<String> values;
        private String alias;

        public Builder() {
        }

        public Builder setOp(String op) {
            this.op = op;
            return this;
        }

        public Builder setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public Builder setAlias(String alias) {
            this.alias = alias;
            return this;
        }


        public AlertDetailsInputDto build() {
            return new AlertDetailsInputDto(op, values, alias);
        }

    }
}
