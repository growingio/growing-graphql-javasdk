package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class OriginDataSettingDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String key;
    private java.lang.Long dayTTL;

    public OriginDataSettingDto() {
    }

    public OriginDataSettingDto(String key, java.lang.Long dayTTL) {
        this.key = key;
        this.dayTTL = dayTTL;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public java.lang.Long getDayTTL() {
        return dayTTL;
    }
    public void setDayTTL(java.lang.Long dayTTL) {
        this.dayTTL = dayTTL;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (dayTTL != null) {
            joiner.add("dayTTL: " + GraphQLRequestSerializer.getEntry(dayTTL));
        }
        return joiner.toString();
    }

    public static OriginDataSettingDto.Builder builder() {
        return new OriginDataSettingDto.Builder();
    }

    public static class Builder {

        private String key;
        private java.lang.Long dayTTL;

        public Builder() {
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setDayTTL(java.lang.Long dayTTL) {
            this.dayTTL = dayTTL;
            return this;
        }


        public OriginDataSettingDto build() {
            return new OriginDataSettingDto(key, dayTTL);
        }

    }
}
