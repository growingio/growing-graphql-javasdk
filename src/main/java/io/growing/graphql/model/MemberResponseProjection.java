package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Member
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MemberResponseProjection extends GraphQLResponseProjection {

    public MemberResponseProjection() {
    }

    @Override
    public MemberResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MemberResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.source();
        this.avatar();
        this.email();
        this.createdAt();
        this.phoneNumber();
        if (projectionDepthOnFields.getOrDefault("MemberResponseProjection.DepartmentResponseProjection.directDepartment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MemberResponseProjection.DepartmentResponseProjection.directDepartment", projectionDepthOnFields.getOrDefault("MemberResponseProjection.DepartmentResponseProjection.directDepartment", 0) + 1);
            this.directDepartment(new DepartmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MemberResponseProjection.DepartmentResponseProjection.directDepartment", 0)));
        }
        this.identity();
        if (projectionDepthOnFields.getOrDefault("MemberResponseProjection.ProjectResponseProjection.enterableProjects", 0) <= maxDepth) {
            projectionDepthOnFields.put("MemberResponseProjection.ProjectResponseProjection.enterableProjects", projectionDepthOnFields.getOrDefault("MemberResponseProjection.ProjectResponseProjection.enterableProjects", 0) + 1);
            this.enterableProjects(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MemberResponseProjection.ProjectResponseProjection.enterableProjects", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MemberResponseProjection.DataCenterRoleResponseProjection.dataCenterRole", 0) <= maxDepth) {
            projectionDepthOnFields.put("MemberResponseProjection.DataCenterRoleResponseProjection.dataCenterRole", projectionDepthOnFields.getOrDefault("MemberResponseProjection.DataCenterRoleResponseProjection.dataCenterRole", 0) + 1);
            this.dataCenterRole(new DataCenterRoleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MemberResponseProjection.DataCenterRoleResponseProjection.dataCenterRole", 0)));
        }
        this.lastVisitAt();
        this.creator();
        this.typename();
        return this;
    }

    public MemberResponseProjection id() {
        return id(null);
    }

    public MemberResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MemberResponseProjection name() {
        return name(null);
    }

    public MemberResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public MemberResponseProjection source() {
        return source(null);
    }

    public MemberResponseProjection source(String alias) {
        fields.add(new GraphQLResponseField("source").alias(alias));
        return this;
    }

    public MemberResponseProjection avatar() {
        return avatar(null);
    }

    public MemberResponseProjection avatar(String alias) {
        fields.add(new GraphQLResponseField("avatar").alias(alias));
        return this;
    }

    public MemberResponseProjection email() {
        return email(null);
    }

    public MemberResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public MemberResponseProjection createdAt() {
        return createdAt(null);
    }

    public MemberResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public MemberResponseProjection phoneNumber() {
        return phoneNumber(null);
    }

    public MemberResponseProjection phoneNumber(String alias) {
        fields.add(new GraphQLResponseField("phoneNumber").alias(alias));
        return this;
    }

    public MemberResponseProjection directDepartment(DepartmentResponseProjection subProjection) {
        return directDepartment(null, subProjection);
    }

    public MemberResponseProjection directDepartment(String alias, DepartmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("directDepartment").alias(alias).projection(subProjection));
        return this;
    }

    public MemberResponseProjection identity() {
        return identity(null);
    }

    public MemberResponseProjection identity(String alias) {
        fields.add(new GraphQLResponseField("identity").alias(alias));
        return this;
    }

    public MemberResponseProjection enterableProjects(ProjectResponseProjection subProjection) {
        return enterableProjects(null, subProjection);
    }

    public MemberResponseProjection enterableProjects(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("enterableProjects").alias(alias).projection(subProjection));
        return this;
    }

    public MemberResponseProjection dataCenterRole(DataCenterRoleResponseProjection subProjection) {
        return dataCenterRole(null, subProjection);
    }

    public MemberResponseProjection dataCenterRole(String alias, DataCenterRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterRole").alias(alias).projection(subProjection));
        return this;
    }

    public MemberResponseProjection lastVisitAt() {
        return lastVisitAt(null);
    }

    public MemberResponseProjection lastVisitAt(String alias) {
        fields.add(new GraphQLResponseField("lastVisitAt").alias(alias));
        return this;
    }

    public MemberResponseProjection creator() {
        return creator(null);
    }

    public MemberResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public MemberResponseProjection typename() {
        return typename(null);
    }

    public MemberResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
