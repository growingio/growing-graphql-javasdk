package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class RulesInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String expression;
    @javax.validation.constraints.NotNull
    private java.util.List<AlertDetailsInputDto> details;

    public RulesInputDto() {
    }

    public RulesInputDto(String expression, java.util.List<AlertDetailsInputDto> details) {
        this.expression = expression;
        this.details = details;
    }

    public String getExpression() {
        return expression;
    }
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public java.util.List<AlertDetailsInputDto> getDetails() {
        return details;
    }
    public void setDetails(java.util.List<AlertDetailsInputDto> details) {
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

    public static RulesInputDto.Builder builder() {
        return new RulesInputDto.Builder();
    }

    public static class Builder {

        private String expression;
        private java.util.List<AlertDetailsInputDto> details;

        public Builder() {
        }

        public Builder setExpression(String expression) {
            this.expression = expression;
            return this;
        }

        public Builder setDetails(java.util.List<AlertDetailsInputDto> details) {
            this.details = details;
            return this;
        }


        public RulesInputDto build() {
            return new RulesInputDto(expression, details);
        }

    }
}
