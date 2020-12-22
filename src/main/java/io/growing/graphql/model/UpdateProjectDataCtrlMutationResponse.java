package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class UpdateProjectDataCtrlMutationResponse extends GraphQLResult<Map<String, ProjectDataCtrlDto>> {

    private static final String OPERATION_NAME = "updateProjectDataCtrl";

    public UpdateProjectDataCtrlMutationResponse() {
    }

    public ProjectDataCtrlDto updateProjectDataCtrl() {
        Map<String, ProjectDataCtrlDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
