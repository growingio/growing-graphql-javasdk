package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TableInfoDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private java.util.List<ColumnInfoDto> simpleColumns;
    @javax.validation.constraints.NotNull
    private java.util.List<ColumnInfoDto> partitionsColumns;

    public TableInfoDto() {
    }

    public TableInfoDto(String name, java.util.List<ColumnInfoDto> simpleColumns, java.util.List<ColumnInfoDto> partitionsColumns) {
        this.name = name;
        this.simpleColumns = simpleColumns;
        this.partitionsColumns = partitionsColumns;
    }

    /**
     * 表名
     */
    public String getName() {
        return name;
    }
    /**
     * 表名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 普通列
     */
    public java.util.List<ColumnInfoDto> getSimpleColumns() {
        return simpleColumns;
    }
    /**
     * 普通列
     */
    public void setSimpleColumns(java.util.List<ColumnInfoDto> simpleColumns) {
        this.simpleColumns = simpleColumns;
    }

    /**
     * 分区列
     */
    public java.util.List<ColumnInfoDto> getPartitionsColumns() {
        return partitionsColumns;
    }
    /**
     * 分区列
     */
    public void setPartitionsColumns(java.util.List<ColumnInfoDto> partitionsColumns) {
        this.partitionsColumns = partitionsColumns;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (simpleColumns != null) {
            joiner.add("simpleColumns: " + GraphQLRequestSerializer.getEntry(simpleColumns));
        }
        if (partitionsColumns != null) {
            joiner.add("partitionsColumns: " + GraphQLRequestSerializer.getEntry(partitionsColumns));
        }
        return joiner.toString();
    }

    public static TableInfoDto.Builder builder() {
        return new TableInfoDto.Builder();
    }

    public static class Builder {

        private String name;
        private java.util.List<ColumnInfoDto> simpleColumns;
        private java.util.List<ColumnInfoDto> partitionsColumns;

        public Builder() {
        }

        /**
         * 表名
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 普通列
         */
        public Builder setSimpleColumns(java.util.List<ColumnInfoDto> simpleColumns) {
            this.simpleColumns = simpleColumns;
            return this;
        }

        /**
         * 分区列
         */
        public Builder setPartitionsColumns(java.util.List<ColumnInfoDto> partitionsColumns) {
            this.partitionsColumns = partitionsColumns;
            return this;
        }


        public TableInfoDto build() {
            return new TableInfoDto(name, simpleColumns, partitionsColumns);
        }

    }
}
