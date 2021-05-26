package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ChartNmaeDto implements java.io.Serializable {

    private String id;
    private String chartName;
    private String status;

    public ChartNmaeDto() {
    }

    public ChartNmaeDto(String id, String chartName, String status) {
        this.id = id;
        this.chartName = chartName;
        this.status = status;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getChartName() {
        return chartName;
    }
    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (chartName != null) {
            joiner.add("chartName: " + GraphQLRequestSerializer.getEntry(chartName));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        return joiner.toString();
    }

    public static ChartNmaeDto.Builder builder() {
        return new ChartNmaeDto.Builder();
    }

    public static class Builder {

        private String id;
        private String chartName;
        private String status;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setChartName(String chartName) {
            this.chartName = chartName;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }


        public ChartNmaeDto build() {
            return new ChartNmaeDto(id, chartName, status);
        }

    }
}
