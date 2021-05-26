package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProjectMember
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ProjectMemberResponseProjection extends GraphQLResponseProjection {

    public ProjectMemberResponseProjection() {
    }

    @Override
    public ProjectMemberResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectMemberResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProjectMemberResponseProjection.MemberResponseProjection.member", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectMemberResponseProjection.MemberResponseProjection.member", projectionDepthOnFields.getOrDefault("ProjectMemberResponseProjection.MemberResponseProjection.member", 0) + 1);
            this.member(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectMemberResponseProjection.MemberResponseProjection.member", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectMemberResponseProjection.ProjectRoleResponseProjection.role", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectMemberResponseProjection.ProjectRoleResponseProjection.role", projectionDepthOnFields.getOrDefault("ProjectMemberResponseProjection.ProjectRoleResponseProjection.role", 0) + 1);
            this.role(new ProjectRoleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectMemberResponseProjection.ProjectRoleResponseProjection.role", 0)));
        }
        this.joinedAt();
        this.lastVisitAt();
        this.typename();
        return this;
    }

    public ProjectMemberResponseProjection member(MemberResponseProjection subProjection) {
        return member(null, subProjection);
    }

    public ProjectMemberResponseProjection member(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("member").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectMemberResponseProjection role(ProjectRoleResponseProjection subProjection) {
        return role(null, subProjection);
    }

    public ProjectMemberResponseProjection role(String alias, ProjectRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("role").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectMemberResponseProjection joinedAt() {
        return joinedAt(null);
    }

    public ProjectMemberResponseProjection joinedAt(String alias) {
        fields.add(new GraphQLResponseField("joinedAt").alias(alias));
        return this;
    }

    public ProjectMemberResponseProjection lastVisitAt() {
        return lastVisitAt(null);
    }

    public ProjectMemberResponseProjection lastVisitAt(String alias) {
        fields.add(new GraphQLResponseField("lastVisitAt").alias(alias));
        return this;
    }

    public ProjectMemberResponseProjection typename() {
        return typename(null);
    }

    public ProjectMemberResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
