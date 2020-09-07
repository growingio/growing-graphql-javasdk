package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class TunnelEventsTrendDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.lang.Long totalCount;
    @javax.validation.constraints.NotNull
    private java.lang.Long interval;
    @javax.validation.constraints.NotNull
    private java.util.List<TrendPointDto> points;

    public TunnelEventsTrendDto() {
    }

    public TunnelEventsTrendDto(java.lang.Long totalCount, java.lang.Long interval, java.util.List<TrendPointDto> points) {
        this.totalCount = totalCount;
        this.interval = interval;
        this.points = points;
    }

    public java.lang.Long getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(java.lang.Long totalCount) {
        this.totalCount = totalCount;
    }

    public java.lang.Long getInterval() {
        return interval;
    }
    public void setInterval(java.lang.Long interval) {
        this.interval = interval;
    }

    public java.util.List<TrendPointDto> getPoints() {
        return points;
    }
    public void setPoints(java.util.List<TrendPointDto> points) {
        this.points = points;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (totalCount != null) {
            joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount));
        }
        if (interval != null) {
            joiner.add("interval: " + GraphQLRequestSerializer.getEntry(interval));
        }
        if (points != null) {
            joiner.add("points: " + GraphQLRequestSerializer.getEntry(points));
        }
        return joiner.toString();
    }

    public static TunnelEventsTrendDto.Builder builder() {
        return new TunnelEventsTrendDto.Builder();
    }

    public static class Builder {

        private java.lang.Long totalCount;
        private java.lang.Long interval;
        private java.util.List<TrendPointDto> points;

        public Builder() {
        }

        public Builder setTotalCount(java.lang.Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Builder setInterval(java.lang.Long interval) {
            this.interval = interval;
            return this;
        }

        public Builder setPoints(java.util.List<TrendPointDto> points) {
            this.points = points;
            return this;
        }


        public TunnelEventsTrendDto build() {
            return new TunnelEventsTrendDto(totalCount, interval, points);
        }

    }
}
