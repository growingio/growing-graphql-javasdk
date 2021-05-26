package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class SubgroupAggregationInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String type;
    @javax.validation.constraints.NotNull
    private String math;

    public SubgroupAggregationInputDto() {
    }

    public SubgroupAggregationInputDto(String type, String math) {
        this.type = type;
        this.math = math;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getMath() {
        return math;
    }
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

    public static SubgroupAggregationInputDto.Builder builder() {
        return new SubgroupAggregationInputDto.Builder();
    }

    public static class Builder {

        private String type;
        private String math;

        public Builder() {
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setMath(String math) {
            this.math = math;
            return this;
        }


        public SubgroupAggregationInputDto build() {
            return new SubgroupAggregationInputDto(type, math);
        }

    }
}
