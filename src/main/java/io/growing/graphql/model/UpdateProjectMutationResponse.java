package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class UpdateProjectMutationResponse extends GraphQLResult<Map<String, ProjectDto>> {

    private static final String OPERATION_NAME = "updateProject";

    public UpdateProjectMutationResponse() {
    }

    public ProjectDto updateProject() {
        Map<String, ProjectDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
