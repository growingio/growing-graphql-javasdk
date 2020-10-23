package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public interface UpdateDashboardMutationResolver {

    @javax.validation.constraints.NotNull
    DashboardDto updateDashboard(String id, DashboardInputDto dashboard) throws Exception;

}