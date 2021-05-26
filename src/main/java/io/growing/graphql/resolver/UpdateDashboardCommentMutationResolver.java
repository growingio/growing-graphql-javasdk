package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface UpdateDashboardCommentMutationResolver {

    @javax.validation.constraints.NotNull
    DashboardCommentDto updateDashboardComment(String projectId, String id, DashboardCommentInputDto dashboardComment) throws Exception;

}