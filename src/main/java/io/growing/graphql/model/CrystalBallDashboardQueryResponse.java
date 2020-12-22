package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class CrystalBallDashboardQueryResponse extends GraphQLResult<Map<String, DashboardDto>> {

    private static final String OPERATION_NAME = "crystalBallDashboard";

    public CrystalBallDashboardQueryResponse() {
    }

    public DashboardDto crystalBallDashboard() {
        Map<String, DashboardDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
