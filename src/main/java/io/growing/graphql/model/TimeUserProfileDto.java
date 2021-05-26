package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TimeUserProfileDto implements java.io.Serializable {

    private java.time.ZonedDateTime updatedAt;
    private InsensitivePropertyDto property;

    public TimeUserProfileDto() {
    }

    public TimeUserProfileDto(java.time.ZonedDateTime updatedAt, InsensitivePropertyDto property) {
        this.updatedAt = updatedAt;
        this.property = property;
    }

    public java.time.ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.time.ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public InsensitivePropertyDto getProperty() {
        return property;
    }
    public void setProperty(InsensitivePropertyDto property) {
        this.property = property;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (property != null) {
            joiner.add("property: " + GraphQLRequestSerializer.getEntry(property));
        }
        return joiner.toString();
    }

    public static TimeUserProfileDto.Builder builder() {
        return new TimeUserProfileDto.Builder();
    }

    public static class Builder {

        private java.time.ZonedDateTime updatedAt;
        private InsensitivePropertyDto property;

        public Builder() {
        }

        public Builder setUpdatedAt(java.time.ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setProperty(InsensitivePropertyDto property) {
            this.property = property;
            return this;
        }


        public TimeUserProfileDto build() {
            return new TimeUserProfileDto(updatedAt, property);
        }

    }
}
