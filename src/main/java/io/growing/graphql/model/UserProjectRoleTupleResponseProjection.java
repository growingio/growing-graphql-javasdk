package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserProjectRoleTuple
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UserProjectRoleTupleResponseProjection extends GraphQLResponseProjection {

    public UserProjectRoleTupleResponseProjection() {
    }

    @Override
    public UserProjectRoleTupleResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserProjectRoleTupleResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UserProjectRoleTupleResponseProjection.MemberResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserProjectRoleTupleResponseProjection.MemberResponseProjection.user", projectionDepthOnFields.getOrDefault("UserProjectRoleTupleResponseProjection.MemberResponseProjection.user", 0) + 1);
            this.user(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserProjectRoleTupleResponseProjection.MemberResponseProjection.user", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserProjectRoleTupleResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserProjectRoleTupleResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("UserProjectRoleTupleResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserProjectRoleTupleResponseProjection.ProjectResponseProjection.project", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserProjectRoleTupleResponseProjection.ProjectRoleResponseProjection.projectRole", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserProjectRoleTupleResponseProjection.ProjectRoleResponseProjection.projectRole", projectionDepthOnFields.getOrDefault("UserProjectRoleTupleResponseProjection.ProjectRoleResponseProjection.projectRole", 0) + 1);
            this.projectRole(new ProjectRoleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserProjectRoleTupleResponseProjection.ProjectRoleResponseProjection.projectRole", 0)));
        }
        this.typename();
        return this;
    }

    public UserProjectRoleTupleResponseProjection user(MemberResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public UserProjectRoleTupleResponseProjection user(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public UserProjectRoleTupleResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public UserProjectRoleTupleResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public UserProjectRoleTupleResponseProjection projectRole(ProjectRoleResponseProjection subProjection) {
        return projectRole(null, subProjection);
    }

    public UserProjectRoleTupleResponseProjection projectRole(String alias, ProjectRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectRole").alias(alias).projection(subProjection));
        return this;
    }

    public UserProjectRoleTupleResponseProjection typename() {
        return typename(null);
    }

    public UserProjectRoleTupleResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
