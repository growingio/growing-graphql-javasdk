package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class TrendPointDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.lang.Long timestamp;
    @javax.validation.constraints.NotNull
    private Integer count;

    public TrendPointDto() {
    }

    public TrendPointDto(java.lang.Long timestamp, Integer count) {
        this.timestamp = timestamp;
        this.count = count;
    }

    public java.lang.Long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(java.lang.Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (timestamp != null) {
            joiner.add("timestamp: " + GraphQLRequestSerializer.getEntry(timestamp));
        }
        if (count != null) {
            joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        }
        return joiner.toString();
    }

    public static TrendPointDto.Builder builder() {
        return new TrendPointDto.Builder();
    }

    public static class Builder {

        private java.lang.Long timestamp;
        private Integer count;

        public Builder() {
        }

        public Builder setTimestamp(java.lang.Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public TrendPointDto build() {
            return new TrendPointDto(timestamp, count);
        }

    }
}
