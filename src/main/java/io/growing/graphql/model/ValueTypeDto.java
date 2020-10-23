package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class ValueTypeDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private PrimitiveTypeDto type;
    private ValueUnitDto unit;
    private Boolean isArray;

    public ValueTypeDto() {
    }

    public ValueTypeDto(PrimitiveTypeDto type, ValueUnitDto unit, Boolean isArray) {
        this.type = type;
        this.unit = unit;
        this.isArray = isArray;
    }

    public PrimitiveTypeDto getType() {
        return type;
    }
    public void setType(PrimitiveTypeDto type) {
        this.type = type;
    }

    public ValueUnitDto getUnit() {
        return unit;
    }
    public void setUnit(ValueUnitDto unit) {
        this.unit = unit;
    }

    public Boolean getIsArray() {
        return isArray;
    }
    public void setIsArray(Boolean isArray) {
        this.isArray = isArray;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (unit != null) {
            joiner.add("unit: " + GraphQLRequestSerializer.getEntry(unit));
        }
        if (isArray != null) {
            joiner.add("isArray: " + GraphQLRequestSerializer.getEntry(isArray));
        }
        return joiner.toString();
    }

    public static ValueTypeDto.Builder builder() {
        return new ValueTypeDto.Builder();
    }

    public static class Builder {

        private PrimitiveTypeDto type;
        private ValueUnitDto unit;
        private Boolean isArray;

        public Builder() {
        }

        public Builder setType(PrimitiveTypeDto type) {
            this.type = type;
            return this;
        }

        public Builder setUnit(ValueUnitDto unit) {
            this.unit = unit;
            return this;
        }

        public Builder setIsArray(Boolean isArray) {
            this.isArray = isArray;
            return this;
        }


        public ValueTypeDto build() {
            return new ValueTypeDto(type, unit, isArray);
        }

    }
}
