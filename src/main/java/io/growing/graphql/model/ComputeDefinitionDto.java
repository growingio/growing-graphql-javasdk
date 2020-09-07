package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class ComputeDefinitionDto implements java.io.Serializable {

    private String name;
    @javax.validation.constraints.NotNull
    private String expression;
    @javax.validation.constraints.NotNull
    private java.util.List<ComputeDirectiveDto> directives;
    private java.lang.Object drillDownAttrs;

    public ComputeDefinitionDto() {
    }

    public ComputeDefinitionDto(String name, String expression, java.util.List<ComputeDirectiveDto> directives, java.lang.Object drillDownAttrs) {
        this.name = name;
        this.expression = expression;
        this.directives = directives;
        this.drillDownAttrs = drillDownAttrs;
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

    public java.util.List<ComputeDirectiveDto> getDirectives() {
        return directives;
    }
    public void setDirectives(java.util.List<ComputeDirectiveDto> directives) {
        this.directives = directives;
    }

    public java.lang.Object getDrillDownAttrs() {
        return drillDownAttrs;
    }
    public void setDrillDownAttrs(java.lang.Object drillDownAttrs) {
        this.drillDownAttrs = drillDownAttrs;
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
        if (drillDownAttrs != null) {
            joiner.add("drillDownAttrs: " + GraphQLRequestSerializer.getEntry(drillDownAttrs));
        }
        return joiner.toString();
    }

    public static ComputeDefinitionDto.Builder builder() {
        return new ComputeDefinitionDto.Builder();
    }

    public static class Builder {

        private String name;
        private String expression;
        private java.util.List<ComputeDirectiveDto> directives;
        private java.lang.Object drillDownAttrs;

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

        public Builder setDirectives(java.util.List<ComputeDirectiveDto> directives) {
            this.directives = directives;
            return this;
        }

        public Builder setDrillDownAttrs(java.lang.Object drillDownAttrs) {
            this.drillDownAttrs = drillDownAttrs;
            return this;
        }


        public ComputeDefinitionDto build() {
            return new ComputeDefinitionDto(name, expression, directives, drillDownAttrs);
        }

    }
}
