package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class EventImportParameterDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String tunnelId;
    @javax.validation.constraints.NotNull
    private String timeRange;

    public EventImportParameterDto() {
    }

    public EventImportParameterDto(String tunnelId, String timeRange) {
        this.tunnelId = tunnelId;
        this.timeRange = timeRange;
    }

    public String getTunnelId() {
        return tunnelId;
    }
    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    public String getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (tunnelId != null) {
            joiner.add("tunnelId: " + GraphQLRequestSerializer.getEntry(tunnelId));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        return joiner.toString();
    }

    public static EventImportParameterDto.Builder builder() {
        return new EventImportParameterDto.Builder();
    }

    public static class Builder {

        private String tunnelId;
        private String timeRange;

        public Builder() {
        }

        public Builder setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }


        public EventImportParameterDto build() {
            return new EventImportParameterDto(tunnelId, timeRange);
        }

    }
}
