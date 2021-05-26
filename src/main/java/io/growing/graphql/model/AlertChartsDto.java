package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 大洋分析预警图
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AlertChartsDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String expression;
    @javax.validation.constraints.NotNull
    private java.util.List<AlertMetricDto> alerts;

    public AlertChartsDto() {
    }

    public AlertChartsDto(String expression, java.util.List<AlertMetricDto> alerts) {
        this.expression = expression;
        this.alerts = alerts;
    }

    /**
     * 表达式
     */
    public String getExpression() {
        return expression;
    }
    /**
     * 表达式
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * 预警单图
     */
    public java.util.List<AlertMetricDto> getAlerts() {
        return alerts;
    }
    /**
     * 预警单图
     */
    public void setAlerts(java.util.List<AlertMetricDto> alerts) {
        this.alerts = alerts;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (expression != null) {
            joiner.add("expression: " + GraphQLRequestSerializer.getEntry(expression));
        }
        if (alerts != null) {
            joiner.add("alerts: " + GraphQLRequestSerializer.getEntry(alerts));
        }
        return joiner.toString();
    }

    public static AlertChartsDto.Builder builder() {
        return new AlertChartsDto.Builder();
    }

    public static class Builder {

        private String expression;
        private java.util.List<AlertMetricDto> alerts;

        public Builder() {
        }

        /**
         * 表达式
         */
        public Builder setExpression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * 预警单图
         */
        public Builder setAlerts(java.util.List<AlertMetricDto> alerts) {
            this.alerts = alerts;
            return this;
        }


        public AlertChartsDto build() {
            return new AlertChartsDto(expression, alerts);
        }

    }
}
