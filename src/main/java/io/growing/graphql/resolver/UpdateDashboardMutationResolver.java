package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface UpdateDashboardMutationResolver {

    @javax.validation.constraints.NotNull
    DashboardDto updateDashboard(String projectId, String id, DashboardInputDto dashboard) throws Exception;

}