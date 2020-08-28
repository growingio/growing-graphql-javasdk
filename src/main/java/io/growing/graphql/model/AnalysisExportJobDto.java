package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class AnalysisExportJobDto implements java.io.Serializable, JobEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private JobStageDto stage;
    private ErrorDto error;

    public AnalysisExportJobDto() {
    }

    public AnalysisExportJobDto(String id, JobStageDto stage, ErrorDto error) {
        this.id = id;
        this.stage = stage;
        this.error = error;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public JobStageDto getStage() {
        return stage;
    }
    public void setStage(JobStageDto stage) {
        this.stage = stage;
    }

    public ErrorDto getError() {
        return error;
    }
    public void setError(ErrorDto error) {
        this.error = error;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (stage != null) {
            joiner.add("stage: " + GraphQLRequestSerializer.getEntry(stage));
        }
        if (error != null) {
            joiner.add("error: " + GraphQLRequestSerializer.getEntry(error));
        }
        return joiner.toString();
    }

    public static AnalysisExportJobDto.Builder builder() {
        return new AnalysisExportJobDto.Builder();
    }

    public static class Builder {

        private String id;
        private JobStageDto stage;
        private ErrorDto error;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setStage(JobStageDto stage) {
            this.stage = stage;
            return this;
        }

        public Builder setError(ErrorDto error) {
            this.error = error;
            return this;
        }


        public AnalysisExportJobDto build() {
            return new AnalysisExportJobDto(id, stage, error);
        }

    }
}
