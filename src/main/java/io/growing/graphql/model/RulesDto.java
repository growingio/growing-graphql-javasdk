package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 预警规则模型
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class RulesDto implements java.io.Serializable {

    private String expression;
    private java.util.List<AlertDetailsDto> details;

    public RulesDto() {
    }

    public RulesDto(String expression, java.util.List<AlertDetailsDto> details) {
        this.expression = expression;
        this.details = details;
    }

    /**
     * 公式
     */
    public String getExpression() {
        return expression;
    }
    /**
     * 公式
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * 具体规则
     */
    public java.util.List<AlertDetailsDto> getDetails() {
        return details;
    }
    /**
     * 具体规则
     */
    public void setDetails(java.util.List<AlertDetailsDto> details) {
        this.details = details;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (expression != null) {
            joiner.add("expression: " + GraphQLRequestSerializer.getEntry(expression));
        }
        if (details != null) {
            joiner.add("details: " + GraphQLRequestSerializer.getEntry(details));
        }
        return joiner.toString();
    }

    public static RulesDto.Builder builder() {
        return new RulesDto.Builder();
    }

    public static class Builder {

        private String expression;
        private java.util.List<AlertDetailsDto> details;

        public Builder() {
        }

        /**
         * 公式
         */
        public Builder setExpression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * 具体规则
         */
        public Builder setDetails(java.util.List<AlertDetailsDto> details) {
            this.details = details;
            return this;
        }


        public RulesDto build() {
            return new RulesDto(expression, details);
        }

    }
}
