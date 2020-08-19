package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class ComplexMetricInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    private ExpressionInputDto expression;

    public ComplexMetricInputDto() {
    }

    public ComplexMetricInputDto(String name, String description, ExpressionInputDto expression) {
        this.name = name;
        this.description = description;
        this.expression = expression;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public ExpressionInputDto getExpression() {
        return expression;
    }
    public void setExpression(ExpressionInputDto expression) {
        this.expression = expression;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (expression != null) {
            joiner.add("expression: " + GraphQLRequestSerializer.getEntry(expression));
        }
        return joiner.toString();
    }

    public static ComplexMetricInputDto.Builder builder() {
        return new ComplexMetricInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private ExpressionInputDto expression;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setExpression(ExpressionInputDto expression) {
            this.expression = expression;
            return this;
        }


        public ComplexMetricInputDto build() {
            return new ComplexMetricInputDto(name, description, expression);
        }

    }
}
