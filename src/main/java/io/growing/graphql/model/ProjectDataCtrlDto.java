package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class ProjectDataCtrlDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private ProjectDto project;
    @javax.validation.constraints.NotNull
    private String dataType;
    @javax.validation.constraints.NotNull
    private String grantType;
    private String useType;
    private java.util.List<ProjectDataCtrlItemDto> dataItems;

    public ProjectDataCtrlDto() {
    }

    public ProjectDataCtrlDto(String id, ProjectDto project, String dataType, String grantType, String useType, java.util.List<ProjectDataCtrlItemDto> dataItems) {
        this.id = id;
        this.project = project;
        this.dataType = dataType;
        this.grantType = grantType;
        this.useType = useType;
        this.dataItems = dataItems;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public ProjectDto getProject() {
        return project;
    }
    public void setProject(ProjectDto project) {
        this.project = project;
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

    public java.util.List<ProjectDataCtrlItemDto> getDataItems() {
        return dataItems;
    }
    public void setDataItems(java.util.List<ProjectDataCtrlItemDto> dataItems) {
        this.dataItems = dataItems;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project));
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

    public static ProjectDataCtrlDto.Builder builder() {
        return new ProjectDataCtrlDto.Builder();
    }

    public static class Builder {

        private String id;
        private ProjectDto project;
        private String dataType;
        private String grantType;
        private String useType;
        private java.util.List<ProjectDataCtrlItemDto> dataItems;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setProject(ProjectDto project) {
            this.project = project;
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

        public Builder setDataItems(java.util.List<ProjectDataCtrlItemDto> dataItems) {
            this.dataItems = dataItems;
            return this;
        }


        public ProjectDataCtrlDto build() {
            return new ProjectDataCtrlDto(id, project, dataType, grantType, useType, dataItems);
        }

    }
}
