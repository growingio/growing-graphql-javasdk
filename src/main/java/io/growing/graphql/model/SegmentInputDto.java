package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class SegmentInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private ComputeDefinitionInputDto compute;
    @javax.validation.constraints.NotNull
    private SchedulerTypeDto scheduler;
    @javax.validation.constraints.NotNull
    private SegmentCreatedByTypeDto createdBy;

    public SegmentInputDto() {
    }

    public SegmentInputDto(String name, String description, ComputeDefinitionInputDto compute, SchedulerTypeDto scheduler, SegmentCreatedByTypeDto createdBy) {
        this.name = name;
        this.description = description;
        this.compute = compute;
        this.scheduler = scheduler;
        this.createdBy = createdBy;
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

    public ComputeDefinitionInputDto getCompute() {
        return compute;
    }
    public void setCompute(ComputeDefinitionInputDto compute) {
        this.compute = compute;
    }

    public SchedulerTypeDto getScheduler() {
        return scheduler;
    }
    public void setScheduler(SchedulerTypeDto scheduler) {
        this.scheduler = scheduler;
    }

    public SegmentCreatedByTypeDto getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(SegmentCreatedByTypeDto createdBy) {
        this.createdBy = createdBy;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (compute != null) {
            joiner.add("compute: " + GraphQLRequestSerializer.getEntry(compute));
        }
        if (scheduler != null) {
            joiner.add("scheduler: " + GraphQLRequestSerializer.getEntry(scheduler));
        }
        if (createdBy != null) {
            joiner.add("createdBy: " + GraphQLRequestSerializer.getEntry(createdBy));
        }
        return joiner.toString();
    }

    public static SegmentInputDto.Builder builder() {
        return new SegmentInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private ComputeDefinitionInputDto compute;
        private SchedulerTypeDto scheduler;
        private SegmentCreatedByTypeDto createdBy;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setCompute(ComputeDefinitionInputDto compute) {
            this.compute = compute;
            return this;
        }

        public Builder setScheduler(SchedulerTypeDto scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        public Builder setCreatedBy(SegmentCreatedByTypeDto createdBy) {
            this.createdBy = createdBy;
            return this;
        }


        public SegmentInputDto build() {
            return new SegmentInputDto(name, description, compute, scheduler, createdBy);
        }

    }
}
