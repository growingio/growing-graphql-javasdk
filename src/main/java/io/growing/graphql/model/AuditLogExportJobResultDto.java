package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AuditLogExportJobResultDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private JobStageDto stage;
    @javax.validation.constraints.NotNull
    private String uri;

    public AuditLogExportJobResultDto() {
    }

    public AuditLogExportJobResultDto(JobStageDto stage, String uri) {
        this.stage = stage;
        this.uri = uri;
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
     * 资源uri
     */
    public String getUri() {
        return uri;
    }
    /**
     * 资源uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (stage != null) {
            joiner.add("stage: " + GraphQLRequestSerializer.getEntry(stage));
        }
        if (uri != null) {
            joiner.add("uri: " + GraphQLRequestSerializer.getEntry(uri));
        }
        return joiner.toString();
    }

    public static AuditLogExportJobResultDto.Builder builder() {
        return new AuditLogExportJobResultDto.Builder();
    }

    public static class Builder {

        private JobStageDto stage;
        private String uri;

        public Builder() {
        }

        /**
         * 任务状态
         */
        public Builder setStage(JobStageDto stage) {
            this.stage = stage;
            return this;
        }

        /**
         * 资源uri
         */
        public Builder setUri(String uri) {
            this.uri = uri;
            return this;
        }


        public AuditLogExportJobResultDto build() {
            return new AuditLogExportJobResultDto(stage, uri);
        }

    }
}
