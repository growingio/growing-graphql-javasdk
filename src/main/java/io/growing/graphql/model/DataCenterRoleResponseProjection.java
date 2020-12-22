package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DataCenterRole
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class DataCenterRoleResponseProjection extends GraphQLResponseProjection {

    public DataCenterRoleResponseProjection() {
    }

    @Override
    public DataCenterRoleResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DataCenterRoleResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("DataCenterRoleResponseProjection.MemberResponseProjection.members", 0) <= maxDepth) {
            projectionDepthOnFields.put("DataCenterRoleResponseProjection.MemberResponseProjection.members", projectionDepthOnFields.getOrDefault("DataCenterRoleResponseProjection.MemberResponseProjection.members", 0) + 1);
            this.members(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DataCenterRoleResponseProjection.MemberResponseProjection.members", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DataCenterRoleResponseProjection.PermissionResponseProjection.permissions", 0) <= maxDepth) {
            projectionDepthOnFields.put("DataCenterRoleResponseProjection.PermissionResponseProjection.permissions", projectionDepthOnFields.getOrDefault("DataCenterRoleResponseProjection.PermissionResponseProjection.permissions", 0) + 1);
            this.permissions(new PermissionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DataCenterRoleResponseProjection.PermissionResponseProjection.permissions", 0)));
        }
        this.isSystem();
        this.isRoot();
        this.isTechSupport();
        this.typename();
        return this;
    }

    public DataCenterRoleResponseProjection id() {
        return id(null);
    }

    public DataCenterRoleResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DataCenterRoleResponseProjection name() {
        return name(null);
    }

    public DataCenterRoleResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public DataCenterRoleResponseProjection description() {
        return description(null);
    }

    public DataCenterRoleResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public DataCenterRoleResponseProjection members(MemberResponseProjection subProjection) {
        return members(null, subProjection);
    }

    public DataCenterRoleResponseProjection members(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("members").alias(alias).projection(subProjection));
        return this;
    }

    public DataCenterRoleResponseProjection permissions(PermissionResponseProjection subProjection) {
        return permissions(null, subProjection);
    }

    public DataCenterRoleResponseProjection permissions(String alias, PermissionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("permissions").alias(alias).projection(subProjection));
        return this;
    }

    public DataCenterRoleResponseProjection isSystem() {
        return isSystem(null);
    }

    public DataCenterRoleResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public DataCenterRoleResponseProjection isRoot() {
        return isRoot(null);
    }

    public DataCenterRoleResponseProjection isRoot(String alias) {
        fields.add(new GraphQLResponseField("isRoot").alias(alias));
        return this;
    }

    public DataCenterRoleResponseProjection isTechSupport() {
        return isTechSupport(null);
    }

    public DataCenterRoleResponseProjection isTechSupport(String alias) {
        fields.add(new GraphQLResponseField("isTechSupport").alias(alias));
        return this;
    }

    public DataCenterRoleResponseProjection typename() {
        return typename(null);
    }

    public DataCenterRoleResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
