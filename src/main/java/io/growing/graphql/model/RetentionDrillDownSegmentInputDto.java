package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class RetentionDrillDownSegmentInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private java.lang.Long time;
    @javax.validation.constraints.NotNull
    private Integer timeIndex;
    @javax.validation.constraints.NotNull
    private Boolean excluded;
    @javax.validation.constraints.NotNull
    private SchedulerTypeDto scheduler;
    private String dimensionValue;
    private ActionInputDto action;
    private TargetUserInputDto targetUser;
    @javax.validation.constraints.NotNull
    private String triggerTimeRange;
    @javax.validation.constraints.NotNull
    private String returnTimeRange;
    @javax.validation.constraints.NotNull
    private RetentionAnalysisInputDto analysis;

    public RetentionDrillDownSegmentInputDto() {
    }

    public RetentionDrillDownSegmentInputDto(String name, java.lang.Long time, Integer timeIndex, Boolean excluded, SchedulerTypeDto scheduler, String dimensionValue, ActionInputDto action, TargetUserInputDto targetUser, String triggerTimeRange, String returnTimeRange, RetentionAnalysisInputDto analysis) {
        this.name = name;
        this.time = time;
        this.timeIndex = timeIndex;
        this.excluded = excluded;
        this.scheduler = scheduler;
        this.dimensionValue = dimensionValue;
        this.action = action;
        this.targetUser = targetUser;
        this.triggerTimeRange = triggerTimeRange;
        this.returnTimeRange = returnTimeRange;
        this.analysis = analysis;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.lang.Long getTime() {
        return time;
    }
    public void setTime(java.lang.Long time) {
        this.time = time;
    }

    public Integer getTimeIndex() {
        return timeIndex;
    }
    public void setTimeIndex(Integer timeIndex) {
        this.timeIndex = timeIndex;
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

    public ActionInputDto getAction() {
        return action;
    }
    public void setAction(ActionInputDto action) {
        this.action = action;
    }

    public TargetUserInputDto getTargetUser() {
        return targetUser;
    }
    public void setTargetUser(TargetUserInputDto targetUser) {
        this.targetUser = targetUser;
    }

    public String getTriggerTimeRange() {
        return triggerTimeRange;
    }
    public void setTriggerTimeRange(String triggerTimeRange) {
        this.triggerTimeRange = triggerTimeRange;
    }

    public String getReturnTimeRange() {
        return returnTimeRange;
    }
    public void setReturnTimeRange(String returnTimeRange) {
        this.returnTimeRange = returnTimeRange;
    }

    public RetentionAnalysisInputDto getAnalysis() {
        return analysis;
    }
    public void setAnalysis(RetentionAnalysisInputDto analysis) {
        this.analysis = analysis;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (time != null) {
            joiner.add("time: " + GraphQLRequestSerializer.getEntry(time));
        }
        if (timeIndex != null) {
            joiner.add("timeIndex: " + GraphQLRequestSerializer.getEntry(timeIndex));
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
        if (action != null) {
            joiner.add("action: " + GraphQLRequestSerializer.getEntry(action));
        }
        if (targetUser != null) {
            joiner.add("targetUser: " + GraphQLRequestSerializer.getEntry(targetUser));
        }
        if (triggerTimeRange != null) {
            joiner.add("triggerTimeRange: " + GraphQLRequestSerializer.getEntry(triggerTimeRange));
        }
        if (returnTimeRange != null) {
            joiner.add("returnTimeRange: " + GraphQLRequestSerializer.getEntry(returnTimeRange));
        }
        if (analysis != null) {
            joiner.add("analysis: " + GraphQLRequestSerializer.getEntry(analysis));
        }
        return joiner.toString();
    }

    public static RetentionDrillDownSegmentInputDto.Builder builder() {
        return new RetentionDrillDownSegmentInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private java.lang.Long time;
        private Integer timeIndex;
        private Boolean excluded;
        private SchedulerTypeDto scheduler;
        private String dimensionValue;
        private ActionInputDto action;
        private TargetUserInputDto targetUser;
        private String triggerTimeRange;
        private String returnTimeRange;
        private RetentionAnalysisInputDto analysis;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setTime(java.lang.Long time) {
            this.time = time;
            return this;
        }

        public Builder setTimeIndex(Integer timeIndex) {
            this.timeIndex = timeIndex;
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

        public Builder setAction(ActionInputDto action) {
            this.action = action;
            return this;
        }

        public Builder setTargetUser(TargetUserInputDto targetUser) {
            this.targetUser = targetUser;
            return this;
        }

        public Builder setTriggerTimeRange(String triggerTimeRange) {
            this.triggerTimeRange = triggerTimeRange;
            return this;
        }

        public Builder setReturnTimeRange(String returnTimeRange) {
            this.returnTimeRange = returnTimeRange;
            return this;
        }

        public Builder setAnalysis(RetentionAnalysisInputDto analysis) {
            this.analysis = analysis;
            return this;
        }


        public RetentionDrillDownSegmentInputDto build() {
            return new RetentionDrillDownSegmentInputDto(name, time, timeIndex, excluded, scheduler, dimensionValue, action, targetUser, triggerTimeRange, returnTimeRange, analysis);
        }

    }
}
