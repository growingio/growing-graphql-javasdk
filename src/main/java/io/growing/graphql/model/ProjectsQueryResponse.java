package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ProjectsQueryResponse extends GraphQLResult<Map<String, java.util.List<ProjectDto>>> {

    private static final String OPERATION_NAME = "projects";

    public ProjectsQueryResponse() {
    }

    public java.util.List<ProjectDto> projects() {
        Map<String, java.util.List<ProjectDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
