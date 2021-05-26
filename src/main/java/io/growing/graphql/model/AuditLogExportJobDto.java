package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AuditLogExportJobDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private JobStageDto stage;

    public AuditLogExportJobDto() {
    }

    public AuditLogExportJobDto(String id, JobStageDto stage) {
        this.id = id;
        this.stage = stage;
    }

    /**
     * 导出操作任务的id
     */
    public String getId() {
        return id;
    }
    /**
     * 导出操作任务的id
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (stage != null) {
            joiner.add("stage: " + GraphQLRequestSerializer.getEntry(stage));
        }
        return joiner.toString();
    }

    public static AuditLogExportJobDto.Builder builder() {
        return new AuditLogExportJobDto.Builder();
    }

    public static class Builder {

        private String id;
        private JobStageDto stage;

        public Builder() {
        }

        /**
         * 导出操作任务的id
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


        public AuditLogExportJobDto build() {
            return new AuditLogExportJobDto(id, stage);
        }

    }
}
