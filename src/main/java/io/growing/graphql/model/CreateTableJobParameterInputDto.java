package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CreateTableJobParameterInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String fileId;
    @javax.validation.constraints.NotNull
    private String tableName;
    @javax.validation.constraints.NotNull
    private java.util.List<TableColumnInputDto> columns;

    public CreateTableJobParameterInputDto() {
    }

    public CreateTableJobParameterInputDto(String fileId, String tableName, java.util.List<TableColumnInputDto> columns) {
        this.fileId = fileId;
        this.tableName = tableName;
        this.columns = columns;
    }

    public String getFileId() {
        return fileId;
    }
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getTableName() {
        return tableName;
    }
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public java.util.List<TableColumnInputDto> getColumns() {
        return columns;
    }
    public void setColumns(java.util.List<TableColumnInputDto> columns) {
        this.columns = columns;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fileId != null) {
            joiner.add("fileId: " + GraphQLRequestSerializer.getEntry(fileId));
        }
        if (tableName != null) {
            joiner.add("tableName: " + GraphQLRequestSerializer.getEntry(tableName));
        }
        if (columns != null) {
            joiner.add("columns: " + GraphQLRequestSerializer.getEntry(columns));
        }
        return joiner.toString();
    }

    public static CreateTableJobParameterInputDto.Builder builder() {
        return new CreateTableJobParameterInputDto.Builder();
    }

    public static class Builder {

        private String fileId;
        private String tableName;
        private java.util.List<TableColumnInputDto> columns;

        public Builder() {
        }

        public Builder setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder setColumns(java.util.List<TableColumnInputDto> columns) {
            this.columns = columns;
            return this;
        }


        public CreateTableJobParameterInputDto build() {
            return new CreateTableJobParameterInputDto(fileId, tableName, columns);
        }

    }
}
