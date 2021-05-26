package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AccountApplication
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationResponseProjection extends GraphQLResponseProjection {

    public AccountApplicationResponseProjection() {
    }

    @Override
    public AccountApplicationResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AccountApplicationResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.identity();
        this.status();
        if (projectionDepthOnFields.getOrDefault("AccountApplicationResponseProjection.AccountApplicationProfileResponseProjection.profile", 0) <= maxDepth) {
            projectionDepthOnFields.put("AccountApplicationResponseProjection.AccountApplicationProfileResponseProjection.profile", projectionDepthOnFields.getOrDefault("AccountApplicationResponseProjection.AccountApplicationProfileResponseProjection.profile", 0) + 1);
            this.profile(new AccountApplicationProfileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AccountApplicationResponseProjection.AccountApplicationProfileResponseProjection.profile", 0)));
        }
        this.createdAt();
        this.approver();
        this.approvedAt();
        this.typename();
        return this;
    }

    public AccountApplicationResponseProjection id() {
        return id(null);
    }

    public AccountApplicationResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public AccountApplicationResponseProjection name() {
        return name(null);
    }

    public AccountApplicationResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public AccountApplicationResponseProjection identity() {
        return identity(null);
    }

    public AccountApplicationResponseProjection identity(String alias) {
        fields.add(new GraphQLResponseField("identity").alias(alias));
        return this;
    }

    public AccountApplicationResponseProjection status() {
        return status(null);
    }

    public AccountApplicationResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public AccountApplicationResponseProjection profile(AccountApplicationProfileResponseProjection subProjection) {
        return profile(null, subProjection);
    }

    public AccountApplicationResponseProjection profile(String alias, AccountApplicationProfileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("profile").alias(alias).projection(subProjection));
        return this;
    }

    public AccountApplicationResponseProjection createdAt() {
        return createdAt(null);
    }

    public AccountApplicationResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public AccountApplicationResponseProjection approver() {
        return approver(null);
    }

    public AccountApplicationResponseProjection approver(String alias) {
        fields.add(new GraphQLResponseField("approver").alias(alias));
        return this;
    }

    public AccountApplicationResponseProjection approvedAt() {
        return approvedAt(null);
    }

    public AccountApplicationResponseProjection approvedAt(String alias) {
        fields.add(new GraphQLResponseField("approvedAt").alias(alias));
        return this;
    }

    public AccountApplicationResponseProjection typename() {
        return typename(null);
    }

    public AccountApplicationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
