package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class JobResultDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private JobStageDto stage;
    @javax.validation.constraints.NotNull
    private java.util.List<String> uris;

    public JobResultDto() {
    }

    public JobResultDto(String id, JobStageDto stage, java.util.List<String> uris) {
        this.id = id;
        this.stage = stage;
        this.uris = uris;
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

    public java.util.List<String> getUris() {
        return uris;
    }
    public void setUris(java.util.List<String> uris) {
        this.uris = uris;
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
        return joiner.toString();
    }

    public static JobResultDto.Builder builder() {
        return new JobResultDto.Builder();
    }

    public static class Builder {

        private String id;
        private JobStageDto stage;
        private java.util.List<String> uris;

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

        public Builder setUris(java.util.List<String> uris) {
            this.uris = uris;
            return this;
        }


        public JobResultDto build() {
            return new JobResultDto(id, stage, uris);
        }

    }
}
