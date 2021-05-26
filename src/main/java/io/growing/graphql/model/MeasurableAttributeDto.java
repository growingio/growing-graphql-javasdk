package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MeasurableAttributeDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String valueType;
    private Boolean isSystem;
    private java.util.List<String> supportedTimeGranularities;

    public MeasurableAttributeDto() {
    }

    public MeasurableAttributeDto(String id, String name, String valueType, Boolean isSystem, java.util.List<String> supportedTimeGranularities) {
        this.id = id;
        this.name = name;
        this.valueType = valueType;
        this.isSystem = isSystem;
        this.supportedTimeGranularities = supportedTimeGranularities;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getValueType() {
        return valueType;
    }
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public java.util.List<String> getSupportedTimeGranularities() {
        return supportedTimeGranularities;
    }
    public void setSupportedTimeGranularities(java.util.List<String> supportedTimeGranularities) {
        this.supportedTimeGranularities = supportedTimeGranularities;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        if (isSystem != null) {
            joiner.add("isSystem: " + GraphQLRequestSerializer.getEntry(isSystem));
        }
        if (supportedTimeGranularities != null) {
            joiner.add("supportedTimeGranularities: " + GraphQLRequestSerializer.getEntry(supportedTimeGranularities));
        }
        return joiner.toString();
    }

    public static MeasurableAttributeDto.Builder builder() {
        return new MeasurableAttributeDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String valueType;
        private Boolean isSystem;
        private java.util.List<String> supportedTimeGranularities;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        public Builder setSupportedTimeGranularities(java.util.List<String> supportedTimeGranularities) {
            this.supportedTimeGranularities = supportedTimeGranularities;
            return this;
        }


        public MeasurableAttributeDto build() {
            return new MeasurableAttributeDto(id, name, valueType, isSystem, supportedTimeGranularities);
        }

    }
}
