package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Department
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DepartmentResponseProjection extends GraphQLResponseProjection {

    public DepartmentResponseProjection() {
    }

    @Override
    public DepartmentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DepartmentResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.parentId();
        if (projectionDepthOnFields.getOrDefault("DepartmentResponseProjection.DepartmentResponseProjection.departments", 0) <= maxDepth) {
            projectionDepthOnFields.put("DepartmentResponseProjection.DepartmentResponseProjection.departments", projectionDepthOnFields.getOrDefault("DepartmentResponseProjection.DepartmentResponseProjection.departments", 0) + 1);
            this.departments(new DepartmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DepartmentResponseProjection.DepartmentResponseProjection.departments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DepartmentResponseProjection.MemberResponseProjection.members", 0) <= maxDepth) {
            projectionDepthOnFields.put("DepartmentResponseProjection.MemberResponseProjection.members", projectionDepthOnFields.getOrDefault("DepartmentResponseProjection.MemberResponseProjection.members", 0) + 1);
            this.members(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DepartmentResponseProjection.MemberResponseProjection.members", 0)));
        }
        this.memberCount();
        this.typename();
        return this;
    }

    public DepartmentResponseProjection id() {
        return id(null);
    }

    public DepartmentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DepartmentResponseProjection name() {
        return name(null);
    }

    public DepartmentResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public DepartmentResponseProjection parentId() {
        return parentId(null);
    }

    public DepartmentResponseProjection parentId(String alias) {
        fields.add(new GraphQLResponseField("parentId").alias(alias));
        return this;
    }

    public DepartmentResponseProjection departments(DepartmentResponseProjection subProjection) {
        return departments(null, subProjection);
    }

    public DepartmentResponseProjection departments(String alias, DepartmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("departments").alias(alias).projection(subProjection));
        return this;
    }

    public DepartmentResponseProjection members(MemberResponseProjection subProjection) {
        return members(null, subProjection);
    }

    public DepartmentResponseProjection members(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("members").alias(alias).projection(subProjection));
        return this;
    }

    public DepartmentResponseProjection memberCount() {
        return memberCount(null);
    }

    public DepartmentResponseProjection memberCount(String alias) {
        fields.add(new GraphQLResponseField("memberCount").alias(alias));
        return this;
    }

    public DepartmentResponseProjection typename() {
        return typename(null);
    }

    public DepartmentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
