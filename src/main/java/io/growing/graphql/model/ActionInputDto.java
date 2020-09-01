package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class ActionInputDto implements java.io.Serializable {

    private MeasurementInputDto measurement;
    private Boolean excluded;
    private String eventType;

    public ActionInputDto() {
    }

    public ActionInputDto(MeasurementInputDto measurement, Boolean excluded, String eventType) {
        this.measurement = measurement;
        this.excluded = excluded;
        this.eventType = eventType;
    }

    public MeasurementInputDto getMeasurement() {
        return measurement;
    }
    public void setMeasurement(MeasurementInputDto measurement) {
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

    public static ActionInputDto.Builder builder() {
        return new ActionInputDto.Builder();
    }

    public static class Builder {

        private MeasurementInputDto measurement;
        private Boolean excluded;
        private String eventType;

        public Builder() {
        }

        public Builder setMeasurement(MeasurementInputDto measurement) {
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


        public ActionInputDto build() {
            return new ActionInputDto(measurement, excluded, eventType);
        }

    }
}
