package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class SlicePaginationDto implements java.io.Serializable {

    private Integer offset;
    private Integer limit;
    private Integer totalCount;
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

    public SlicePaginationDto() {
    }

    public SlicePaginationDto(Integer offset, Integer limit, Integer totalCount, Boolean hasNextPage, Boolean hasPreviousPage, java.util.List<EntityDto> values) {
        this.offset = offset;
        this.limit = limit;
        this.totalCount = totalCount;
        this.hasNextPage = hasNextPage;
        this.hasPreviousPage = hasPreviousPage;
        this.values = values;
    }

    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
        if (offset != null) {
            joiner.add("offset: " + GraphQLRequestSerializer.getEntry(offset));
        }
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        }
        if (totalCount != null) {
            joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount));
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

    public static SlicePaginationDto.Builder builder() {
        return new SlicePaginationDto.Builder();
    }

    public static class Builder {

        private Integer offset;
        private Integer limit;
        private Integer totalCount;
        private Boolean hasNextPage;
        private Boolean hasPreviousPage;
        private java.util.List<EntityDto> values;

        public Builder() {
        }

        public Builder setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
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


        public SlicePaginationDto build() {
            return new SlicePaginationDto(offset, limit, totalCount, hasNextPage, hasPreviousPage, values);
        }

    }
}
