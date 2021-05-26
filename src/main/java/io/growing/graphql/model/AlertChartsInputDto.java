package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 大洋分析预警图输入
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AlertChartsInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String expression;
    @javax.validation.constraints.NotNull
    private java.util.List<AlertMetricInputDto> alerts;

    public AlertChartsInputDto() {
    }

    public AlertChartsInputDto(String expression, java.util.List<AlertMetricInputDto> alerts) {
        this.expression = expression;
        this.alerts = alerts;
    }

    public String getExpression() {
        return expression;
    }
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public java.util.List<AlertMetricInputDto> getAlerts() {
        return alerts;
    }
    public void setAlerts(java.util.List<AlertMetricInputDto> alerts) {
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

    public static AlertChartsInputDto.Builder builder() {
        return new AlertChartsInputDto.Builder();
    }

    public static class Builder {

        private String expression;
        private java.util.List<AlertMetricInputDto> alerts;

        public Builder() {
        }

        public Builder setExpression(String expression) {
            this.expression = expression;
            return this;
        }

        public Builder setAlerts(java.util.List<AlertMetricInputDto> alerts) {
            this.alerts = alerts;
            return this;
        }


        public AlertChartsInputDto build() {
            return new AlertChartsInputDto(expression, alerts);
        }

    }
}
