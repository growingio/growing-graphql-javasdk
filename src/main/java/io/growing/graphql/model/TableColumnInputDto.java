package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TableColumnInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String alias;
    private String type;

    public TableColumnInputDto() {
    }

    public TableColumnInputDto(String name, String alias, String type) {
        this.name = name;
        this.alias = alias;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (alias != null) {
            joiner.add("alias: " + GraphQLRequestSerializer.getEntry(alias));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }

    public static TableColumnInputDto.Builder builder() {
        return new TableColumnInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String alias;
        private String type;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAlias(String alias) {
            this.alias = alias;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }


        public TableColumnInputDto build() {
            return new TableColumnInputDto(name, alias, type);
        }

    }
}
