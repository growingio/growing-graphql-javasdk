package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 计算指标 expression 对象
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ExpressionInputDto implements java.io.Serializable {

    private String op;
    private java.util.List<ExpressionInputDto> exprs;
    private java.util.List<MeasurementInputDto> measurements;
    private java.util.List<MetricInputDto> metrics;
    private String expression;
    private String format;

    public ExpressionInputDto() {
    }

    public ExpressionInputDto(String op, java.util.List<ExpressionInputDto> exprs, java.util.List<MeasurementInputDto> measurements, java.util.List<MetricInputDto> metrics, String expression, String format) {
        this.op = op;
        this.exprs = exprs;
        this.measurements = measurements;
        this.metrics = metrics;
        this.expression = expression;
        this.format = format;
    }

    public String getOp() {
        return op;
    }
    public void setOp(String op) {
        this.op = op;
    }

    public java.util.List<ExpressionInputDto> getExprs() {
        return exprs;
    }
    public void setExprs(java.util.List<ExpressionInputDto> exprs) {
        this.exprs = exprs;
    }

    public java.util.List<MeasurementInputDto> getMeasurements() {
        return measurements;
    }
    public void setMeasurements(java.util.List<MeasurementInputDto> measurements) {
        this.measurements = measurements;
    }

    public java.util.List<MetricInputDto> getMetrics() {
        return metrics;
    }
    public void setMetrics(java.util.List<MetricInputDto> metrics) {
        this.metrics = metrics;
    }

    public String getExpression() {
        return expression;
    }
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
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
        if (metrics != null) {
            joiner.add("metrics: " + GraphQLRequestSerializer.getEntry(metrics));
        }
        if (expression != null) {
            joiner.add("expression: " + GraphQLRequestSerializer.getEntry(expression));
        }
        if (format != null) {
            joiner.add("format: " + GraphQLRequestSerializer.getEntry(format));
        }
        return joiner.toString();
    }

    public static ExpressionInputDto.Builder builder() {
        return new ExpressionInputDto.Builder();
    }

    public static class Builder {

        private String op;
        private java.util.List<ExpressionInputDto> exprs;
        private java.util.List<MeasurementInputDto> measurements;
        private java.util.List<MetricInputDto> metrics;
        private String expression;
        private String format;

        public Builder() {
        }

        public Builder setOp(String op) {
            this.op = op;
            return this;
        }

        public Builder setExprs(java.util.List<ExpressionInputDto> exprs) {
            this.exprs = exprs;
            return this;
        }

        public Builder setMeasurements(java.util.List<MeasurementInputDto> measurements) {
            this.measurements = measurements;
            return this;
        }

        public Builder setMetrics(java.util.List<MetricInputDto> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = expression;
            return this;
        }

        public Builder setFormat(String format) {
            this.format = format;
            return this;
        }


        public ExpressionInputDto build() {
            return new ExpressionInputDto(op, exprs, measurements, metrics, expression, format);
        }

    }
}
