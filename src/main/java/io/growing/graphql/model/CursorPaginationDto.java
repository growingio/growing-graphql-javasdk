package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CursorPaginationDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Integer totalCount;
    private String startCursor;
    private String endCursor;
    private Boolean hasNextPage;
    private Boolean hasPreviousPage;
    @javax.validation.constraints.NotNull
    @com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,property = "__typename")
    @com.fasterxml.jackson.annotation.JsonSubTypes(value = {
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SegmentDto.class, name = "Segment"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UserSummaryDto.class, name = "UserSummary"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TagDto.class, name = "Tag"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TunnelDto.class, name = "Tunnel"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UserEventDto.class, name = "UserEvent")
        })
    private java.util.List<EntityDto> values;

    public CursorPaginationDto() {
    }

    public CursorPaginationDto(Integer totalCount, String startCursor, String endCursor, Boolean hasNextPage, Boolean hasPreviousPage, java.util.List<EntityDto> values) {
        this.totalCount = totalCount;
        this.startCursor = startCursor;
        this.endCursor = endCursor;
        this.hasNextPage = hasNextPage;
        this.hasPreviousPage = hasPreviousPage;
        this.values = values;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getStartCursor() {
        return startCursor;
    }
    public void setStartCursor(String startCursor) {
        this.startCursor = startCursor;
    }

    public String getEndCursor() {
        return endCursor;
    }
    public void setEndCursor(String endCursor) {
        this.endCursor = endCursor;
    }

    public Boolean getHasNextPage() {
        return hasNextPage;
    }
    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public Boolean getHasPreviousPage() {
        return hasPreviousPage;
    }
    public void setHasPreviousPage(Boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public java.util.List<EntityDto> getValues() {
        return values;
    }
    public void setValues(java.util.List<EntityDto> values) {
        this.values = values;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (totalCount != null) {
            joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount));
        }
        if (startCursor != null) {
            joiner.add("startCursor: " + GraphQLRequestSerializer.getEntry(startCursor));
        }
        if (endCursor != null) {
            joiner.add("endCursor: " + GraphQLRequestSerializer.getEntry(endCursor));
        }
        if (hasNextPage != null) {
            joiner.add("hasNextPage: " + GraphQLRequestSerializer.getEntry(hasNextPage));
        }
        if (hasPreviousPage != null) {
            joiner.add("hasPreviousPage: " + GraphQLRequestSerializer.getEntry(hasPreviousPage));
        }
        if (values != null) {
            joiner.add("values: " + GraphQLRequestSerializer.getEntry(values));
        }
        return joiner.toString();
    }

    public static CursorPaginationDto.Builder builder() {
        return new CursorPaginationDto.Builder();
    }

    public static class Builder {

        private Integer totalCount;
        private String startCursor;
        private String endCursor;
        private Boolean hasNextPage;
        private Boolean hasPreviousPage;
        private java.util.List<EntityDto> values;

        public Builder() {
        }

        public Builder setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Builder setStartCursor(String startCursor) {
            this.startCursor = startCursor;
            return this;
        }

        public Builder setEndCursor(String endCursor) {
            this.endCursor = endCursor;
            return this;
        }

        public Builder setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }

        public Builder setHasPreviousPage(Boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
            return this;
        }

        public Builder setValues(java.util.List<EntityDto> values) {
            this.values = values;
            return this;
        }


        public CursorPaginationDto build() {
            return new CursorPaginationDto(totalCount, startCursor, endCursor, hasNextPage, hasPreviousPage, values);
        }

    }
}
