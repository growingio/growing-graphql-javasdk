package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class JobResultDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private JobStageDto stage;
    @javax.validation.constraints.NotNull
    private java.util.List<String> uris;
    private String jsonData;

    public JobResultDto() {
    }

    public JobResultDto(String id, JobStageDto stage, java.util.List<String> uris, String jsonData) {
        this.id = id;
        this.stage = stage;
        this.uris = uris;
        this.jsonData = jsonData;
    }

    /**
     * 任务结果id
     */
    public String getId() {
        return id;
    }
    /**
     * 任务结果id
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
     * 资源uri
     */
    public java.util.List<String> getUris() {
        return uris;
    }
    /**
     * 资源uri
     */
    public void setUris(java.util.List<String> uris) {
        this.uris = uris;
    }

    /**
     * 表示一个可以直接返回的结果， json格式
     */
    public String getJsonData() {
        return jsonData;
    }
    /**
     * 表示一个可以直接返回的结果， json格式
     */
    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
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
        if (uris != null) {
            joiner.add("uris: " + GraphQLRequestSerializer.getEntry(uris));
        }
        if (jsonData != null) {
            joiner.add("jsonData: " + GraphQLRequestSerializer.getEntry(jsonData));
        }
        return joiner.toString();
    }

    public static JobResultDto.Builder builder() {
        return new JobResultDto.Builder();
    }

    public static class Builder {

        private String id;
        private JobStageDto stage;
        private java.util.List<String> uris;
        private String jsonData;

        public Builder() {
        }

        /**
         * 任务结果id
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
         * 资源uri
         */
        public Builder setUris(java.util.List<String> uris) {
            this.uris = uris;
            return this;
        }

        /**
         * 表示一个可以直接返回的结果， json格式
         */
        public Builder setJsonData(String jsonData) {
            this.jsonData = jsonData;
            return this;
        }


        public JobResultDto build() {
            return new JobResultDto(id, stage, uris, jsonData);
        }

    }
}
