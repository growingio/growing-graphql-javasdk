package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ActionDto implements java.io.Serializable {

    private MeasurementDto measurement;
    private Boolean excluded;
    private String eventType;

    public ActionDto() {
    }

    public ActionDto(MeasurementDto measurement, Boolean excluded, String eventType) {
        this.measurement = measurement;
        this.excluded = excluded;
        this.eventType = eventType;
    }

    public MeasurementDto getMeasurement() {
        return measurement;
    }
    public void setMeasurement(MeasurementDto measurement) {
        this.measurement = measurement;
    }

    public Boolean getExcluded() {
        return excluded;
    }
    public void setExcluded(Boolean excluded) {
        this.excluded = excluded;
    }

    public String getEventType() {
        return eventType;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (measurement != null) {
            joiner.add("measurement: " + GraphQLRequestSerializer.getEntry(measurement));
        }
        if (excluded != null) {
            joiner.add("excluded: " + GraphQLRequestSerializer.getEntry(excluded));
        }
        if (eventType != null) {
            joiner.add("eventType: " + GraphQLRequestSerializer.getEntry(eventType));
        }
        return joiner.toString();
    }

    public static ActionDto.Builder builder() {
        return new ActionDto.Builder();
    }

    public static class Builder {

        private MeasurementDto measurement;
        private Boolean excluded;
        private String eventType;

        public Builder() {
        }

        public Builder setMeasurement(MeasurementDto measurement) {
            this.measurement = measurement;
            return this;
        }

        public Builder setExcluded(Boolean excluded) {
            this.excluded = excluded;
            return this;
        }

        public Builder setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }


        public ActionDto build() {
            return new ActionDto(measurement, excluded, eventType);
        }

    }
}
