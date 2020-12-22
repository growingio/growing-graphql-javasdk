package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class EventAnalysisDto implements java.io.Serializable, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<MeasurementDto> measurements;
    private java.util.List<String> dimensions;
    private java.util.List<GranularityDto> granularities;
    @javax.validation.constraints.NotNull
    private String timeRange;
    private FilterDto filter;
    private TargetUserDto targetUser;
    private Integer limit;
    private String attrs;
    private java.util.List<OrderDto> orders;
    private SplitterDto splitter;
    private String chartType;
    private Boolean isSystem;
    private String businessType;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;
    private String ownerId;

    public EventAnalysisDto() {
    }

    public EventAnalysisDto(String id, String name, String description, java.util.List<MeasurementDto> measurements, java.util.List<String> dimensions, java.util.List<GranularityDto> granularities, String timeRange, FilterDto filter, TargetUserDto targetUser, Integer limit, String attrs, java.util.List<OrderDto> orders, SplitterDto splitter, String chartType, Boolean isSystem, String businessType, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, String ownerId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.measurements = measurements;
        this.dimensions = dimensions;
        this.granularities = granularities;
        this.timeRange = timeRange;
        this.filter = filter;
        this.targetUser = targetUser;
        this.limit = limit;
        this.attrs = attrs;
        this.orders = orders;
        this.splitter = splitter;
        this.chartType = chartType;
        this.isSystem = isSystem;
        this.businessType = businessType;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updaterId = updaterId;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.updater = updater;
        this.ownerId = ownerId;
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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<MeasurementDto> getMeasurements() {
        return measurements;
    }
    public void setMeasurements(java.util.List<MeasurementDto> measurements) {
        this.measurements = measurements;
    }

    public java.util.List<String> getDimensions() {
        return dimensions;
    }
    public void setDimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
    }

    public java.util.List<GranularityDto> getGranularities() {
        return granularities;
    }
    public void setGranularities(java.util.List<GranularityDto> granularities) {
        this.granularities = granularities;
    }

    public String getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public FilterDto getFilter() {
        return filter;
    }
    public void setFilter(FilterDto filter) {
        this.filter = filter;
    }

    public TargetUserDto getTargetUser() {
        return targetUser;
    }
    public void setTargetUser(TargetUserDto targetUser) {
        this.targetUser = targetUser;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getAttrs() {
        return attrs;
    }
    public void setAttrs(String attrs) {
        this.attrs = attrs;
    }

    public java.util.List<OrderDto> getOrders() {
        return orders;
    }
    public void setOrders(java.util.List<OrderDto> orders) {
        this.orders = orders;
    }

    public SplitterDto getSplitter() {
        return splitter;
    }
    public void setSplitter(SplitterDto splitter) {
        this.splitter = splitter;
    }

    public String getChartType() {
        return chartType;
    }
    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getBusinessType() {
        return businessType;
    }
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdaterId() {
        return updaterId;
    }
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    public java.time.ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.time.ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (measurements != null) {
            joiner.add("measurements: " + GraphQLRequestSerializer.getEntry(measurements));
        }
        if (dimensions != null) {
            joiner.add("dimensions: " + GraphQLRequestSerializer.getEntry(dimensions));
        }
        if (granularities != null) {
            joiner.add("granularities: " + GraphQLRequestSerializer.getEntry(granularities));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        if (targetUser != null) {
            joiner.add("targetUser: " + GraphQLRequestSerializer.getEntry(targetUser));
        }
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        }
        if (attrs != null) {
            joiner.add("attrs: " + GraphQLRequestSerializer.getEntry(attrs));
        }
        if (orders != null) {
            joiner.add("orders: " + GraphQLRequestSerializer.getEntry(orders));
        }
        if (splitter != null) {
            joiner.add("splitter: " + GraphQLRequestSerializer.getEntry(splitter));
        }
        if (chartType != null) {
            joiner.add("chartType: " + GraphQLRequestSerializer.getEntry(chartType));
        }
        if (isSystem != null) {
            joiner.add("isSystem: " + GraphQLRequestSerializer.getEntry(isSystem));
        }
        if (businessType != null) {
            joiner.add("businessType: " + GraphQLRequestSerializer.getEntry(businessType));
        }
        if (creatorId != null) {
            joiner.add("creatorId: " + GraphQLRequestSerializer.getEntry(creatorId));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (updaterId != null) {
            joiner.add("updaterId: " + GraphQLRequestSerializer.getEntry(updaterId));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        if (updater != null) {
            joiner.add("updater: " + GraphQLRequestSerializer.getEntry(updater));
        }
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId));
        }
        return joiner.toString();
    }

    public static EventAnalysisDto.Builder builder() {
        return new EventAnalysisDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private java.util.List<MeasurementDto> measurements;
        private java.util.List<String> dimensions;
        private java.util.List<GranularityDto> granularities;
        private String timeRange;
        private FilterDto filter;
        private TargetUserDto targetUser;
        private Integer limit;
        private String attrs;
        private java.util.List<OrderDto> orders;
        private SplitterDto splitter;
        private String chartType;
        private Boolean isSystem;
        private String businessType;
        private String creatorId;
        private java.time.ZonedDateTime createdAt;
        private String updaterId;
        private java.time.ZonedDateTime updatedAt;
        private String creator;
        private String updater;
        private String ownerId;

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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setMeasurements(java.util.List<MeasurementDto> measurements) {
            this.measurements = measurements;
            return this;
        }

        public Builder setDimensions(java.util.List<String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setGranularities(java.util.List<GranularityDto> granularities) {
            this.granularities = granularities;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setFilter(FilterDto filter) {
            this.filter = filter;
            return this;
        }

        public Builder setTargetUser(TargetUserDto targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setAttrs(String attrs) {
            this.attrs = attrs;
            return this;
        }

        public Builder setOrders(java.util.List<OrderDto> orders) {
            this.orders = orders;
            return this;
        }

        public Builder setSplitter(SplitterDto splitter) {
            this.splitter = splitter;
            return this;
        }

        public Builder setChartType(String chartType) {
            this.chartType = chartType;
            return this;
        }

        public Builder setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        public Builder setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        public Builder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdaterId(String updaterId) {
            this.updaterId = updaterId;
            return this;
        }

        public Builder setUpdatedAt(java.time.ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setCreator(String creator) {
            this.creator = creator;
            return this;
        }

        public Builder setUpdater(String updater) {
            this.updater = updater;
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }


        public EventAnalysisDto build() {
            return new EventAnalysisDto(id, name, description, measurements, dimensions, granularities, timeRange, filter, targetUser, limit, attrs, orders, splitter, chartType, isSystem, businessType, creatorId, createdAt, updaterId, updatedAt, creator, updater, ownerId);
        }

    }
}
