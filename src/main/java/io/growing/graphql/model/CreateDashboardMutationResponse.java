package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateDashboardMutationResponse extends GraphQLResult<Map<String, DashboardDto>> {

    private static final String OPERATION_NAME = "createDashboard";

    public CreateDashboardMutationResponse() {
    }

    public DashboardDto createDashboard() {
        Map<String, DashboardDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
