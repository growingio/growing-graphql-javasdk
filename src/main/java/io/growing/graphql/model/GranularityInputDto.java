package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class GranularityInputDto implements java.io.Serializable {

    private String id;
    private java.util.List<String> values;
    private java.lang.Long interval;
    private Double split;
    private java.util.List<String> statistics;
    private java.util.List<Double> ranges;
    private Integer top;
    private String period;
    private Boolean trend;

    public GranularityInputDto() {
    }

    public GranularityInputDto(String id, java.util.List<String> values, java.lang.Long interval, Double split, java.util.List<String> statistics, java.util.List<Double> ranges, Integer top, String period, Boolean trend) {
        this.id = id;
        this.values = values;
        this.interval = interval;
        this.split = split;
        this.statistics = statistics;
        this.ranges = ranges;
        this.top = top;
        this.period = period;
        this.trend = trend;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public java.util.List<String> getValues() {
        return values;
    }
    public void setValues(java.util.List<String> values) {
        this.values = values;
    }

    public java.lang.Long getInterval() {
        return interval;
    }
    public void setInterval(java.lang.Long interval) {
        this.interval = interval;
    }

    public Double getSplit() {
        return split;
    }
    public void setSplit(Double split) {
        this.split = split;
    }

    public java.util.List<String> getStatistics() {
        return statistics;
    }
    public void setStatistics(java.util.List<String> statistics) {
        this.statistics = statistics;
    }

    public java.util.List<Double> getRanges() {
        return ranges;
    }
    public void setRanges(java.util.List<Double> ranges) {
        this.ranges = ranges;
    }

    public Integer getTop() {
        return top;
    }
    public void setTop(Integer top) {
        this.top = top;
    }

    public String getPeriod() {
        return period;
    }
    public void setPeriod(String period) {
        this.period = period;
    }

    public Boolean getTrend() {
        return trend;
    }
    public void setTrend(Boolean trend) {
        this.trend = trend;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (values != null) {
            joiner.add("values: " + GraphQLRequestSerializer.getEntry(values));
        }
        if (interval != null) {
            joiner.add("interval: " + GraphQLRequestSerializer.getEntry(interval));
        }
        if (split != null) {
            joiner.add("split: " + GraphQLRequestSerializer.getEntry(split));
        }
        if (statistics != null) {
            joiner.add("statistics: " + GraphQLRequestSerializer.getEntry(statistics));
        }
        if (ranges != null) {
            joiner.add("ranges: " + GraphQLRequestSerializer.getEntry(ranges));
        }
        if (top != null) {
            joiner.add("top: " + GraphQLRequestSerializer.getEntry(top));
        }
        if (period != null) {
            joiner.add("period: " + GraphQLRequestSerializer.getEntry(period));
        }
        if (trend != null) {
            joiner.add("trend: " + GraphQLRequestSerializer.getEntry(trend));
        }
        return joiner.toString();
    }

    public static GranularityInputDto.Builder builder() {
        return new GranularityInputDto.Builder();
    }

    public static class Builder {

        private String id;
        private java.util.List<String> values;
        private java.lang.Long interval;
        private Double split;
        private java.util.List<String> statistics;
        private java.util.List<Double> ranges;
        private Integer top;
        private String period;
        private Boolean trend;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public Builder setInterval(java.lang.Long interval) {
            this.interval = interval;
            return this;
        }

        public Builder setSplit(Double split) {
            this.split = split;
            return this;
        }

        public Builder setStatistics(java.util.List<String> statistics) {
            this.statistics = statistics;
            return this;
        }

        public Builder setRanges(java.util.List<Double> ranges) {
            this.ranges = ranges;
            return this;
        }

        public Builder setTop(Integer top) {
            this.top = top;
            return this;
        }

        public Builder setPeriod(String period) {
            this.period = period;
            return this;
        }

        public Builder setTrend(Boolean trend) {
            this.trend = trend;
            return this;
        }


        public GranularityInputDto build() {
            return new GranularityInputDto(id, values, interval, split, statistics, ranges, top, period, trend);
        }

    }
}
