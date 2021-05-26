package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ColumnInfoDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String dataType;
    private String comment;

    public ColumnInfoDto() {
    }

    public ColumnInfoDto(String name, String dataType, String comment) {
        this.name = name;
        this.dataType = dataType;
        this.comment = comment;
    }

    /**
     * 列名
     */
    public String getName() {
        return name;
    }
    /**
     * 列名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 数据类型
     */
    public String getDataType() {
        return dataType;
    }
    /**
     * 数据类型
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * 注释
     */
    public String getComment() {
        return comment;
    }
    /**
     * 注释
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (dataType != null) {
            joiner.add("dataType: " + GraphQLRequestSerializer.getEntry(dataType));
        }
        if (comment != null) {
            joiner.add("comment: " + GraphQLRequestSerializer.getEntry(comment));
        }
        return joiner.toString();
    }

    public static ColumnInfoDto.Builder builder() {
        return new ColumnInfoDto.Builder();
    }

    public static class Builder {

        private String name;
        private String dataType;
        private String comment;

        public Builder() {
        }

        /**
         * 列名
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 数据类型
         */
        public Builder setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * 注释
         */
        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }


        public ColumnInfoDto build() {
            return new ColumnInfoDto(name, dataType, comment);
        }

    }
}
