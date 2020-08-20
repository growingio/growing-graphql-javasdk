package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class FrequencyDrillDownSegmentInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private Double lowerBound;
    @javax.validation.constraints.NotNull
    private Double upperBound;
    private String dimensionValue;
    private TargetUserInputDto targetUser;
    @javax.validation.constraints.NotNull
    private SchedulerTypeDto scheduler;
    @javax.validation.constraints.NotNull
    private FrequencyAnalysisInputDto analysis;

    public FrequencyDrillDownSegmentInputDto() {
    }

    public FrequencyDrillDownSegmentInputDto(String name, Double lowerBound, Double upperBound, String dimensionValue, TargetUserInputDto targetUser, SchedulerTypeDto scheduler, FrequencyAnalysisInputDto analysis) {
        this.name = name;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.dimensionValue = dimensionValue;
        this.targetUser = targetUser;
        this.scheduler = scheduler;
        this.analysis = analysis;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getLowerBound() {
        return lowerBound;
    }
    public void setLowerBound(Double lowerBound) {
        this.lowerBound = lowerBound;
    }

    public Double getUpperBound() {
        return upperBound;
    }
    public void setUpperBound(Double upperBound) {
        this.upperBound = upperBound;
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

    public SchedulerTypeDto getScheduler() {
        return scheduler;
    }
    public void setScheduler(SchedulerTypeDto scheduler) {
        this.scheduler = scheduler;
    }

    public FrequencyAnalysisInputDto getAnalysis() {
        return analysis;
    }
    public void setAnalysis(FrequencyAnalysisInputDto analysis) {
        this.analysis = analysis;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (lowerBound != null) {
            joiner.add("lowerBound: " + GraphQLRequestSerializer.getEntry(lowerBound));
        }
        if (upperBound != null) {
            joiner.add("upperBound: " + GraphQLRequestSerializer.getEntry(upperBound));
        }
        if (dimensionValue != null) {
            joiner.add("dimensionValue: " + GraphQLRequestSerializer.getEntry(dimensionValue));
        }
        if (targetUser != null) {
            joiner.add("targetUser: " + GraphQLRequestSerializer.getEntry(targetUser));
        }
        if (scheduler != null) {
            joiner.add("scheduler: " + GraphQLRequestSerializer.getEntry(scheduler));
        }
        if (analysis != null) {
            joiner.add("analysis: " + GraphQLRequestSerializer.getEntry(analysis));
        }
        return joiner.toString();
    }

    public static FrequencyDrillDownSegmentInputDto.Builder builder() {
        return new FrequencyDrillDownSegmentInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private Double lowerBound;
        private Double upperBound;
        private String dimensionValue;
        private TargetUserInputDto targetUser;
        private SchedulerTypeDto scheduler;
        private FrequencyAnalysisInputDto analysis;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLowerBound(Double lowerBound) {
            this.lowerBound = lowerBound;
            return this;
        }

        public Builder setUpperBound(Double upperBound) {
            this.upperBound = upperBound;
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

        public Builder setScheduler(SchedulerTypeDto scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        public Builder setAnalysis(FrequencyAnalysisInputDto analysis) {
            this.analysis = analysis;
            return this;
        }


        public FrequencyDrillDownSegmentInputDto build() {
            return new FrequencyDrillDownSegmentInputDto(name, lowerBound, upperBound, dimensionValue, targetUser, scheduler, analysis);
        }

    }
}
