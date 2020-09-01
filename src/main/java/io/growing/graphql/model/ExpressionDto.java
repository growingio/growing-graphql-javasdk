package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class ExpressionDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String op;
    private java.util.List<ExpressionDto> exprs;
    private java.util.List<MeasurementDto> measurements;

    public ExpressionDto() {
    }

    public ExpressionDto(String op, java.util.List<ExpressionDto> exprs, java.util.List<MeasurementDto> measurements) {
        this.op = op;
        this.exprs = exprs;
        this.measurements = measurements;
    }

    public String getOp() {
        return op;
    }
    public void setOp(String op) {
        this.op = op;
    }

    public java.util.List<ExpressionDto> getExprs() {
        return exprs;
    }
    public void setExprs(java.util.List<ExpressionDto> exprs) {
        this.exprs = exprs;
    }

    public java.util.List<MeasurementDto> getMeasurements() {
        return measurements;
    }
    public void setMeasurements(java.util.List<MeasurementDto> measurements) {
        this.measurements = measurements;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (op != null) {
            joiner.add("op: " + GraphQLRequestSerializer.getEntry(op));
        }
        if (exprs != null) {
            joiner.add("exprs: " + GraphQLRequestSerializer.getEntry(exprs));
        }
        if (measurements != null) {
            joiner.add("measurements: " + GraphQLRequestSerializer.getEntry(measurements));
        }
        return joiner.toString();
    }

    public static ExpressionDto.Builder builder() {
        return new ExpressionDto.Builder();
    }

    public static class Builder {

        private String op;
        private java.util.List<ExpressionDto> exprs;
        private java.util.List<MeasurementDto> measurements;

        public Builder() {
        }

        public Builder setOp(String op) {
            this.op = op;
            return this;
        }

        public Builder setExprs(java.util.List<ExpressionDto> exprs) {
            this.exprs = exprs;
            return this;
        }

        public Builder setMeasurements(java.util.List<MeasurementDto> measurements) {
            this.measurements = measurements;
            return this;
        }


        public ExpressionDto build() {
            return new ExpressionDto(op, exprs, measurements);
        }

    }
}
