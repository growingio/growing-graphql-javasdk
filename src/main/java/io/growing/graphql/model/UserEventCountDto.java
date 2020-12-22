package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class UserEventCountDto implements java.io.Serializable {

    private java.util.List<EventStatDto> stats;
    private Double totalOfChangeRate;

    public UserEventCountDto() {
    }

    public UserEventCountDto(java.util.List<EventStatDto> stats, Double totalOfChangeRate) {
        this.stats = stats;
        this.totalOfChangeRate = totalOfChangeRate;
    }

    public java.util.List<EventStatDto> getStats() {
        return stats;
    }
    public void setStats(java.util.List<EventStatDto> stats) {
        this.stats = stats;
    }

    public Double getTotalOfChangeRate() {
        return totalOfChangeRate;
    }
    public void setTotalOfChangeRate(Double totalOfChangeRate) {
        this.totalOfChangeRate = totalOfChangeRate;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (stats != null) {
            joiner.add("stats: " + GraphQLRequestSerializer.getEntry(stats));
        }
        if (totalOfChangeRate != null) {
            joiner.add("totalOfChangeRate: " + GraphQLRequestSerializer.getEntry(totalOfChangeRate));
        }
        return joiner.toString();
    }

    public static UserEventCountDto.Builder builder() {
        return new UserEventCountDto.Builder();
    }

    public static class Builder {

        private java.util.List<EventStatDto> stats;
        private Double totalOfChangeRate;

        public Builder() {
        }

        public Builder setStats(java.util.List<EventStatDto> stats) {
            this.stats = stats;
            return this;
        }

        public Builder setTotalOfChangeRate(Double totalOfChangeRate) {
            this.totalOfChangeRate = totalOfChangeRate;
            return this;
        }


        public UserEventCountDto build() {
            return new UserEventCountDto(stats, totalOfChangeRate);
        }

    }
}
