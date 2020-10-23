package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class ComputeDefinitionInputDto implements java.io.Serializable {

    private String name;
    @javax.validation.constraints.NotNull
    private String expression;
    @javax.validation.constraints.NotNull
    private java.util.List<ComputeDirectiveInputDto> directives;

    public ComputeDefinitionInputDto() {
    }

    public ComputeDefinitionInputDto(String name, String expression, java.util.List<ComputeDirectiveInputDto> directives) {
        this.name = name;
        this.expression = expression;
        this.directives = directives;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getExpression() {
        return expression;
    }
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public java.util.List<ComputeDirectiveInputDto> getDirectives() {
        return directives;
    }
    public void setDirectives(java.util.List<ComputeDirectiveInputDto> directives) {
        this.directives = directives;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (expression != null) {
            joiner.add("expression: " + GraphQLRequestSerializer.getEntry(expression));
        }
        if (directives != null) {
            joiner.add("directives: " + GraphQLRequestSerializer.getEntry(directives));
        }
        return joiner.toString();
    }

    public static ComputeDefinitionInputDto.Builder builder() {
        return new ComputeDefinitionInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String expression;
        private java.util.List<ComputeDirectiveInputDto> directives;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = expression;
            return this;
        }

        public Builder setDirectives(java.util.List<ComputeDirectiveInputDto> directives) {
            this.directives = directives;
            return this;
        }


        public ComputeDefinitionInputDto build() {
            return new ComputeDefinitionInputDto(name, expression, directives);
        }

    }
}
