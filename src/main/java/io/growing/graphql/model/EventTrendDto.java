package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class EventTrendDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.lang.Long interval;
    @javax.validation.constraints.NotNull
    private java.util.List<TrendPointDto> points;

    public EventTrendDto() {
    }

    public EventTrendDto(java.lang.Long interval, java.util.List<TrendPointDto> points) {
        this.interval = interval;
        this.points = points;
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
        if (interval != null) {
            joiner.add("interval: " + GraphQLRequestSerializer.getEntry(interval));
        }
        if (points != null) {
            joiner.add("points: " + GraphQLRequestSerializer.getEntry(points));
        }
        return joiner.toString();
    }

    public static EventTrendDto.Builder builder() {
        return new EventTrendDto.Builder();
    }

    public static class Builder {

        private java.lang.Long interval;
        private java.util.List<TrendPointDto> points;

        public Builder() {
        }

        public Builder setInterval(java.lang.Long interval) {
            this.interval = interval;
            return this;
        }

        public Builder setPoints(java.util.List<TrendPointDto> points) {
            this.points = points;
            return this;
        }


        public EventTrendDto build() {
            return new EventTrendDto(interval, points);
        }

    }
}
