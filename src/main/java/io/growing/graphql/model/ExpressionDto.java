package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ExpressionDto implements java.io.Serializable {

    private String op;
    private java.util.List<ExpressionDto> exprs;
    private java.util.List<MeasurementDto> measurements;
    private java.util.List<OlapMetricDto> metrics;
    private String expression;
    private String format;

    public ExpressionDto() {
    }

    public ExpressionDto(String op, java.util.List<ExpressionDto> exprs, java.util.List<MeasurementDto> measurements, java.util.List<OlapMetricDto> metrics, String expression, String format) {
        this.op = op;
        this.exprs = exprs;
        this.measurements = measurements;
        this.metrics = metrics;
        this.expression = expression;
        this.format = format;
    }

    /**
     * 运算符
     */
    public String getOp() {
        return op;
    }
    /**
     * 运算符
     */
    public void setOp(String op) {
        this.op = op;
    }

    /**
     * 嵌套的表达式
     */
    public java.util.List<ExpressionDto> getExprs() {
        return exprs;
    }
    /**
     * 嵌套的表达式
     */
    public void setExprs(java.util.List<ExpressionDto> exprs) {
        this.exprs = exprs;
    }

    /**
     * 升级后的计算指标事件列表(非大洋分析事件)
     */
    public java.util.List<MeasurementDto> getMeasurements() {
        return measurements;
    }
    /**
     * 升级后的计算指标事件列表(非大洋分析事件)
     */
    public void setMeasurements(java.util.List<MeasurementDto> measurements) {
        this.measurements = measurements;
    }

    /**
     * 大洋分析指标列表
     */
    public java.util.List<OlapMetricDto> getMetrics() {
        return metrics;
    }
    /**
     * 大洋分析指标列表
     */
    public void setMetrics(java.util.List<OlapMetricDto> metrics) {
        this.metrics = metrics;
    }

    /**
     * 计算指标表达式
     */
    public String getExpression() {
        return expression;
    }
    /**
     * 计算指标表达式
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * 格式化方式
     */
    public String getFormat() {
        return format;
    }
    /**
     * 格式化方式
     */
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

    public static ExpressionDto.Builder builder() {
        return new ExpressionDto.Builder();
    }

    public static class Builder {

        private String op;
        private java.util.List<ExpressionDto> exprs;
        private java.util.List<MeasurementDto> measurements;
        private java.util.List<OlapMetricDto> metrics;
        private String expression;
        private String format;

        public Builder() {
        }

        /**
         * 运算符
         */
        public Builder setOp(String op) {
            this.op = op;
            return this;
        }

        /**
         * 嵌套的表达式
         */
        public Builder setExprs(java.util.List<ExpressionDto> exprs) {
            this.exprs = exprs;
            return this;
        }

        /**
         * 升级后的计算指标事件列表(非大洋分析事件)
         */
        public Builder setMeasurements(java.util.List<MeasurementDto> measurements) {
            this.measurements = measurements;
            return this;
        }

        /**
         * 大洋分析指标列表
         */
        public Builder setMetrics(java.util.List<OlapMetricDto> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * 计算指标表达式
         */
        public Builder setExpression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * 格式化方式
         */
        public Builder setFormat(String format) {
            this.format = format;
            return this;
        }


        public ExpressionDto build() {
            return new ExpressionDto(op, exprs, measurements, metrics, expression, format);
        }

    }
}
