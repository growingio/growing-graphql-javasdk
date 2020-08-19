package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class DetectorDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private DetectedStageDto stage;
    private String description;
    private java.time.ZonedDateTime detectedAt;
    private Integer totalUsers;
    private Double usersRatio;

    public DetectorDto() {
    }

    public DetectorDto(DetectedStageDto stage, String description, java.time.ZonedDateTime detectedAt, Integer totalUsers, Double usersRatio) {
        this.stage = stage;
        this.description = description;
        this.detectedAt = detectedAt;
        this.totalUsers = totalUsers;
        this.usersRatio = usersRatio;
    }

    public DetectedStageDto getStage() {
        return stage;
    }
    public void setStage(DetectedStageDto stage) {
        this.stage = stage;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.time.ZonedDateTime getDetectedAt() {
        return detectedAt;
    }
    public void setDetectedAt(java.time.ZonedDateTime detectedAt) {
        this.detectedAt = detectedAt;
    }

    public Integer getTotalUsers() {
        return totalUsers;
    }
    public void setTotalUsers(Integer totalUsers) {
        this.totalUsers = totalUsers;
    }

    public Double getUsersRatio() {
        return usersRatio;
    }
    public void setUsersRatio(Double usersRatio) {
        this.usersRatio = usersRatio;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (stage != null) {
            joiner.add("stage: " + GraphQLRequestSerializer.getEntry(stage));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (detectedAt != null) {
            joiner.add("detectedAt: " + GraphQLRequestSerializer.getEntry(detectedAt));
        }
        if (totalUsers != null) {
            joiner.add("totalUsers: " + GraphQLRequestSerializer.getEntry(totalUsers));
        }
        if (usersRatio != null) {
            joiner.add("usersRatio: " + GraphQLRequestSerializer.getEntry(usersRatio));
        }
        return joiner.toString();
    }

    public static DetectorDto.Builder builder() {
        return new DetectorDto.Builder();
    }

    public static class Builder {

        private DetectedStageDto stage;
        private String description;
        private java.time.ZonedDateTime detectedAt;
        private Integer totalUsers;
        private Double usersRatio;

        public Builder() {
        }

        public Builder setStage(DetectedStageDto stage) {
            this.stage = stage;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDetectedAt(java.time.ZonedDateTime detectedAt) {
            this.detectedAt = detectedAt;
            return this;
        }

        public Builder setTotalUsers(Integer totalUsers) {
            this.totalUsers = totalUsers;
            return this;
        }

        public Builder setUsersRatio(Double usersRatio) {
            this.usersRatio = usersRatio;
            return this;
        }


        public DetectorDto build() {
            return new DetectorDto(stage, description, detectedAt, totalUsers, usersRatio);
        }

    }
}
