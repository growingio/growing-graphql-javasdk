package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Member
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
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

    public MemberResponseProjection typename() {
        return typename(null);
    }

    public MemberResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
