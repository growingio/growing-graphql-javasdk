package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class FunnelDrillDownSegmentInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private Integer position;
    @javax.validation.constraints.NotNull
    private Boolean excluded;
    @javax.validation.constraints.NotNull
    private SchedulerTypeDto scheduler;
    private String dimensionValue;
    private TargetUserInputDto targetUser;
    @javax.validation.constraints.NotNull
    private FunnelAnalysisInputDto analysis;

    public FunnelDrillDownSegmentInputDto() {
    }

    public FunnelDrillDownSegmentInputDto(String name, Integer position, Boolean excluded, SchedulerTypeDto scheduler, String dimensionValue, TargetUserInputDto targetUser, FunnelAnalysisInputDto analysis) {
        this.name = name;
        this.position = position;
        this.excluded = excluded;
        this.scheduler = scheduler;
        this.dimensionValue = dimensionValue;
        this.targetUser = targetUser;
        this.analysis = analysis;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getExcluded() {
        return excluded;
    }
    public void setExcluded(Boolean excluded) {
        this.excluded = excluded;
    }

    public SchedulerTypeDto getScheduler() {
        return scheduler;
    }
    public void setScheduler(SchedulerTypeDto scheduler) {
        this.scheduler = scheduler;
    }

    public String getDimensionValue() {
        return dimensionValue;
    }
    public void setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
    }

    public TargetUserInputDto getTargetUser() {
        return targetUser;
    }
    public void setTargetUser(TargetUserInputDto targetUser) {
        this.targetUser = targetUser;
    }

    public FunnelAnalysisInputDto getAnalysis() {
        return analysis;
    }
    public void setAnalysis(FunnelAnalysisInputDto analysis) {
        this.analysis = analysis;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (position != null) {
            joiner.add("position: " + GraphQLRequestSerializer.getEntry(position));
        }
        if (excluded != null) {
            joiner.add("excluded: " + GraphQLRequestSerializer.getEntry(excluded));
        }
        if (scheduler != null) {
            joiner.add("scheduler: " + GraphQLRequestSerializer.getEntry(scheduler));
        }
        if (dimensionValue != null) {
            joiner.add("dimensionValue: " + GraphQLRequestSerializer.getEntry(dimensionValue));
        }
        if (targetUser != null) {
            joiner.add("targetUser: " + GraphQLRequestSerializer.getEntry(targetUser));
        }
        if (analysis != null) {
            joiner.add("analysis: " + GraphQLRequestSerializer.getEntry(analysis));
        }
        return joiner.toString();
    }

    public static FunnelDrillDownSegmentInputDto.Builder builder() {
        return new FunnelDrillDownSegmentInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private Integer position;
        private Boolean excluded;
        private SchedulerTypeDto scheduler;
        private String dimensionValue;
        private TargetUserInputDto targetUser;
        private FunnelAnalysisInputDto analysis;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = position;
            return this;
        }

        public Builder setExcluded(Boolean excluded) {
            this.excluded = excluded;
            return this;
        }

        public Builder setScheduler(SchedulerTypeDto scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        public Builder setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }

        public Builder setTargetUser(TargetUserInputDto targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        public Builder setAnalysis(FunnelAnalysisInputDto analysis) {
            this.analysis = analysis;
            return this;
        }


        public FunnelDrillDownSegmentInputDto build() {
            return new FunnelDrillDownSegmentInputDto(name, position, excluded, scheduler, dimensionValue, targetUser, analysis);
        }

    }
}
