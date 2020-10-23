package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class ProjectInfoQueryResponse extends GraphQLResult<Map<String, ProjectInfoDto>> {

    private static final String OPERATION_NAME = "projectInfo";

    public ProjectInfoQueryResponse() {
    }

    public ProjectInfoDto projectInfo() {
        Map<String, ProjectInfoDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
