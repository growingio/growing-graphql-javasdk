package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class UserSummaryDto implements java.io.Serializable, EntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String userId;
    @javax.validation.constraints.NotNull
    private Integer monthlyVisits;
    private java.time.ZonedDateTime visitedAt;
    @javax.validation.constraints.NotNull
    private String visitedLocation;

    public UserSummaryDto() {
    }

    public UserSummaryDto(String id, String userId, Integer monthlyVisits, java.time.ZonedDateTime visitedAt, String visitedLocation) {
        this.id = id;
        this.userId = userId;
        this.monthlyVisits = monthlyVisits;
        this.visitedAt = visitedAt;
        this.visitedLocation = visitedLocation;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getMonthlyVisits() {
        return monthlyVisits;
    }
    public void setMonthlyVisits(Integer monthlyVisits) {
        this.monthlyVisits = monthlyVisits;
    }

    public java.time.ZonedDateTime getVisitedAt() {
        return visitedAt;
    }
    public void setVisitedAt(java.time.ZonedDateTime visitedAt) {
        this.visitedAt = visitedAt;
    }

    public String getVisitedLocation() {
        return visitedLocation;
    }
    public void setVisitedLocation(String visitedLocation) {
        this.visitedLocation = visitedLocation;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (userId != null) {
            joiner.add("userId: " + GraphQLRequestSerializer.getEntry(userId));
        }
        if (monthlyVisits != null) {
            joiner.add("monthlyVisits: " + GraphQLRequestSerializer.getEntry(monthlyVisits));
        }
        if (visitedAt != null) {
            joiner.add("visitedAt: " + GraphQLRequestSerializer.getEntry(visitedAt));
        }
        if (visitedLocation != null) {
            joiner.add("visitedLocation: " + GraphQLRequestSerializer.getEntry(visitedLocation));
        }
        return joiner.toString();
    }

    public static UserSummaryDto.Builder builder() {
        return new UserSummaryDto.Builder();
    }

    public static class Builder {

        private String id;
        private String userId;
        private Integer monthlyVisits;
        private java.time.ZonedDateTime visitedAt;
        private String visitedLocation;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setMonthlyVisits(Integer monthlyVisits) {
            this.monthlyVisits = monthlyVisits;
            return this;
        }

        public Builder setVisitedAt(java.time.ZonedDateTime visitedAt) {
            this.visitedAt = visitedAt;
            return this;
        }

        public Builder setVisitedLocation(String visitedLocation) {
            this.visitedLocation = visitedLocation;
            return this;
        }


        public UserSummaryDto build() {
            return new UserSummaryDto(id, userId, monthlyVisits, visitedAt, visitedLocation);
        }

    }
}
