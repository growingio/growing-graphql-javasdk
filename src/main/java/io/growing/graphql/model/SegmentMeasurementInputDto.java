package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class SegmentMeasurementInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private MeasurementInputDto measurement;
    @javax.validation.constraints.NotNull
    private String timeRange;

    public SegmentMeasurementInputDto() {
    }

    public SegmentMeasurementInputDto(MeasurementInputDto measurement, String timeRange) {
        this.measurement = measurement;
        this.timeRange = timeRange;
    }

    public MeasurementInputDto getMeasurement() {
        return measurement;
    }
    public void setMeasurement(MeasurementInputDto measurement) {
        this.measurement = measurement;
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
        if (measurement != null) {
            joiner.add("measurement: " + GraphQLRequestSerializer.getEntry(measurement));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        return joiner.toString();
    }

    public static SegmentMeasurementInputDto.Builder builder() {
        return new SegmentMeasurementInputDto.Builder();
    }

    public static class Builder {

        private MeasurementInputDto measurement;
        private String timeRange;

        public Builder() {
        }

        public Builder setMeasurement(MeasurementInputDto measurement) {
            this.measurement = measurement;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }


        public SegmentMeasurementInputDto build() {
            return new SegmentMeasurementInputDto(measurement, timeRange);
        }

    }
}
