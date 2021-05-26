package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ToggleProjectInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String dataCenterId;
    @javax.validation.constraints.NotNull
    private String projectId;

    public ToggleProjectInputDto() {
    }

    public ToggleProjectInputDto(String dataCenterId, String projectId) {
        this.dataCenterId = dataCenterId;
        this.projectId = projectId;
    }

    public String getDataCenterId() {
        return dataCenterId;
    }
    public void setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (dataCenterId != null) {
            joiner.add("dataCenterId: " + GraphQLRequestSerializer.getEntry(dataCenterId));
        }
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        return joiner.toString();
    }

    public static ToggleProjectInputDto.Builder builder() {
        return new ToggleProjectInputDto.Builder();
    }

    public static class Builder {

        private String dataCenterId;
        private String projectId;

        public Builder() {
        }

        public Builder setDataCenterId(String dataCenterId) {
            this.dataCenterId = dataCenterId;
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }


        public ToggleProjectInputDto build() {
            return new ToggleProjectInputDto(dataCenterId, projectId);
        }

    }
}
