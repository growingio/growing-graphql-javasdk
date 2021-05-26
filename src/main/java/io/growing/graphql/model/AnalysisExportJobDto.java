package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
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

    /**
     * 任务id
     */
    public String getId() {
        return id;
    }
    /**
     * 任务id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 任务状态
     */
    public JobStageDto getStage() {
        return stage;
    }
    /**
     * 任务状态
     */
    public void setStage(JobStageDto stage) {
        this.stage = stage;
    }

    /**
     * 错误类型
     */
    public ErrorDto getError() {
        return error;
    }
    /**
     * 错误类型
     */
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

        /**
         * 任务id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 任务状态
         */
        public Builder setStage(JobStageDto stage) {
            this.stage = stage;
            return this;
        }

        /**
         * 错误类型
         */
        public Builder setError(ErrorDto error) {
            this.error = error;
            return this;
        }


        public AnalysisExportJobDto build() {
            return new AnalysisExportJobDto(id, stage, error);
        }

    }
}
