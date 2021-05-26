package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProjectRole
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ProjectRoleResponseProjection extends GraphQLResponseProjection {

    public ProjectRoleResponseProjection() {
    }

    @Override
    public ProjectRoleResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectRoleResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("ProjectRoleResponseProjection.MemberResponseProjection.members", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectRoleResponseProjection.MemberResponseProjection.members", projectionDepthOnFields.getOrDefault("ProjectRoleResponseProjection.MemberResponseProjection.members", 0) + 1);
            this.members(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectRoleResponseProjection.MemberResponseProjection.members", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectRoleResponseProjection.PermissionResponseProjection.permissions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectRoleResponseProjection.PermissionResponseProjection.permissions", projectionDepthOnFields.getOrDefault("ProjectRoleResponseProjection.PermissionResponseProjection.permissions", 0) + 1);
            this.permissions(new PermissionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectRoleResponseProjection.PermissionResponseProjection.permissions", 0)));
        }
        this.isSystem();
        this.isRoot();
        this.isTechSupport();
        this.typename();
        return this;
    }

    public ProjectRoleResponseProjection id() {
        return id(null);
    }

    public ProjectRoleResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProjectRoleResponseProjection name() {
        return name(null);
    }

    public ProjectRoleResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProjectRoleResponseProjection description() {
        return description(null);
    }

    public ProjectRoleResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ProjectRoleResponseProjection members(MemberResponseProjection subProjection) {
        return members(null, subProjection);
    }

    public ProjectRoleResponseProjection members(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("members").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectRoleResponseProjection permissions(PermissionResponseProjection subProjection) {
        return permissions(null, subProjection);
    }

    public ProjectRoleResponseProjection permissions(String alias, PermissionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("permissions").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectRoleResponseProjection isSystem() {
        return isSystem(null);
    }

    public ProjectRoleResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public ProjectRoleResponseProjection isRoot() {
        return isRoot(null);
    }

    public ProjectRoleResponseProjection isRoot(String alias) {
        fields.add(new GraphQLResponseField("isRoot").alias(alias));
        return this;
    }

    public ProjectRoleResponseProjection isTechSupport() {
        return isTechSupport(null);
    }

    public ProjectRoleResponseProjection isTechSupport(String alias) {
        fields.add(new GraphQLResponseField("isTechSupport").alias(alias));
        return this;
    }

    public ProjectRoleResponseProjection typename() {
        return typename(null);
    }

    public ProjectRoleResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
