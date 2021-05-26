package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 聚合方式
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class SubgroupAggregationDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String type;
    @javax.validation.constraints.NotNull
    private String math;

    public SubgroupAggregationDto() {
    }

    public SubgroupAggregationDto(String type, String math) {
        this.type = type;
        this.math = math;
    }

    /**
     * 类型
     */
    public String getType() {
        return type;
    }
    /**
     * 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 统计函数
     */
    public String getMath() {
        return math;
    }
    /**
     * 统计函数
     */
    public void setMath(String math) {
        this.math = math;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (math != null) {
            joiner.add("math: " + GraphQLRequestSerializer.getEntry(math));
        }
        return joiner.toString();
    }

    public static SubgroupAggregationDto.Builder builder() {
        return new SubgroupAggregationDto.Builder();
    }

    public static class Builder {

        private String type;
        private String math;

        public Builder() {
        }

        /**
         * 类型
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * 统计函数
         */
        public Builder setMath(String math) {
            this.math = math;
            return this;
        }


        public SubgroupAggregationDto build() {
            return new SubgroupAggregationDto(type, math);
        }

    }
}
