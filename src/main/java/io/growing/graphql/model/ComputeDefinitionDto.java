package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ComputeDefinitionDto implements java.io.Serializable {

    private String name;
    @javax.validation.constraints.NotNull
    private String expression;
    @javax.validation.constraints.NotNull
    private java.util.List<ComputeDirectiveDto> directives;
    private java.lang.Object drillDownAttrs;
    private String sql;
    private String dataUri;

    public ComputeDefinitionDto() {
    }

    public ComputeDefinitionDto(String name, String expression, java.util.List<ComputeDirectiveDto> directives, java.lang.Object drillDownAttrs, String sql, String dataUri) {
        this.name = name;
        this.expression = expression;
        this.directives = directives;
        this.drillDownAttrs = drillDownAttrs;
        this.sql = sql;
        this.dataUri = dataUri;
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

    public String getSql() {
        return sql;
    }
    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getDataUri() {
        return dataUri;
    }
    public void setDataUri(String dataUri) {
        this.dataUri = dataUri;
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
        if (sql != null) {
            joiner.add("sql: " + GraphQLRequestSerializer.getEntry(sql));
        }
        if (dataUri != null) {
            joiner.add("dataUri: " + GraphQLRequestSerializer.getEntry(dataUri));
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
        private String sql;
        private String dataUri;

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

        public Builder setSql(String sql) {
            this.sql = sql;
            return this;
        }

        public Builder setDataUri(String dataUri) {
            this.dataUri = dataUri;
            return this;
        }


        public ComputeDefinitionDto build() {
            return new ComputeDefinitionDto(name, expression, directives, drillDownAttrs, sql, dataUri);
        }

    }
}
