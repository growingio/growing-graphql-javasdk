package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Role
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class RoleResponseProjection extends GraphQLResponseProjection {

    public RoleResponseProjection() {
    }

    @Override
    public RoleResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RoleResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("RoleResponseProjection.MemberResponseProjection.members", 0) <= maxDepth) {
            projectionDepthOnFields.put("RoleResponseProjection.MemberResponseProjection.members", projectionDepthOnFields.getOrDefault("RoleResponseProjection.MemberResponseProjection.members", 0) + 1);
            this.members(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RoleResponseProjection.MemberResponseProjection.members", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RoleResponseProjection.PermissionResponseProjection.permissions", 0) <= maxDepth) {
            projectionDepthOnFields.put("RoleResponseProjection.PermissionResponseProjection.permissions", projectionDepthOnFields.getOrDefault("RoleResponseProjection.PermissionResponseProjection.permissions", 0) + 1);
            this.permissions(new PermissionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RoleResponseProjection.PermissionResponseProjection.permissions", 0)));
        }
        this.isSystem();
        this.isRoot();
        this.isTechSupport();
        this.typename();
        return this;
    }

    public RoleResponseProjection id() {
        return id(null);
    }

    public RoleResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RoleResponseProjection name() {
        return name(null);
    }

    public RoleResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RoleResponseProjection description() {
        return description(null);
    }

    public RoleResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public RoleResponseProjection members(MemberResponseProjection subProjection) {
        return members(null, subProjection);
    }

    public RoleResponseProjection members(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("members").alias(alias).projection(subProjection));
        return this;
    }

    public RoleResponseProjection permissions(PermissionResponseProjection subProjection) {
        return permissions(null, subProjection);
    }

    public RoleResponseProjection permissions(String alias, PermissionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("permissions").alias(alias).projection(subProjection));
        return this;
    }

    public RoleResponseProjection isSystem() {
        return isSystem(null);
    }

    public RoleResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public RoleResponseProjection isRoot() {
        return isRoot(null);
    }

    public RoleResponseProjection isRoot(String alias) {
        fields.add(new GraphQLResponseField("isRoot").alias(alias));
        return this;
    }

    public RoleResponseProjection isTechSupport() {
        return isTechSupport(null);
    }

    public RoleResponseProjection isTechSupport(String alias) {
        fields.add(new GraphQLResponseField("isTechSupport").alias(alias));
        return this;
    }

    public RoleResponseProjection typename() {
        return typename(null);
    }

    public RoleResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
