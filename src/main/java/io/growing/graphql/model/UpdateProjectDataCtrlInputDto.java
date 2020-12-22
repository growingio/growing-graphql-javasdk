package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class UpdateProjectDataCtrlInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String dataType;
    @javax.validation.constraints.NotNull
    private String grantType;
    private String useType;
    @javax.validation.constraints.NotNull
    private java.util.List<String> dataItems;

    public UpdateProjectDataCtrlInputDto() {
    }

    public UpdateProjectDataCtrlInputDto(String projectId, String dataType, String grantType, String useType, java.util.List<String> dataItems) {
        this.projectId = projectId;
        this.dataType = dataType;
        this.grantType = grantType;
        this.useType = useType;
        this.dataItems = dataItems;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getDataType() {
        return dataType;
    }
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getGrantType() {
        return grantType;
    }
    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getUseType() {
        return useType;
    }
    public void setUseType(String useType) {
        this.useType = useType;
    }

    public java.util.List<String> getDataItems() {
        return dataItems;
    }
    public void setDataItems(java.util.List<String> dataItems) {
        this.dataItems = dataItems;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (dataType != null) {
            joiner.add("dataType: " + GraphQLRequestSerializer.getEntry(dataType));
        }
        if (grantType != null) {
            joiner.add("grantType: " + GraphQLRequestSerializer.getEntry(grantType));
        }
        if (useType != null) {
            joiner.add("useType: " + GraphQLRequestSerializer.getEntry(useType));
        }
        if (dataItems != null) {
            joiner.add("dataItems: " + GraphQLRequestSerializer.getEntry(dataItems));
        }
        return joiner.toString();
    }

    public static UpdateProjectDataCtrlInputDto.Builder builder() {
        return new UpdateProjectDataCtrlInputDto.Builder();
    }

    public static class Builder {

        private String projectId;
        private String dataType;
        private String grantType;
        private String useType;
        private java.util.List<String> dataItems;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setGrantType(String grantType) {
            this.grantType = grantType;
            return this;
        }

        public Builder setUseType(String useType) {
            this.useType = useType;
            return this;
        }

        public Builder setDataItems(java.util.List<String> dataItems) {
            this.dataItems = dataItems;
            return this;
        }


        public UpdateProjectDataCtrlInputDto build() {
            return new UpdateProjectDataCtrlInputDto(projectId, dataType, grantType, useType, dataItems);
        }

    }
}
