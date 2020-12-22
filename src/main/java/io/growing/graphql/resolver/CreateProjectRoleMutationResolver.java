package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface CreateProjectRoleMutationResolver {

    @javax.validation.constraints.NotNull
    ProjectRoleDto createProjectRole(String projectId, RoleInputDto role) throws Exception;

}