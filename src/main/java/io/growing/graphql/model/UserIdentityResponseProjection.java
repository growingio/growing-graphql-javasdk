package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserIdentity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UserIdentityResponseProjection extends GraphQLResponseProjection {

    public UserIdentityResponseProjection() {
    }

    @Override
    public UserIdentityResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserIdentityResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.key();
        this.matchType();
        this.description();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.ownerId();
        this.example();
        this.typename();
        return this;
    }

    public UserIdentityResponseProjection id() {
        return id(null);
    }

    public UserIdentityResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection name() {
        return name(null);
    }

    public UserIdentityResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection key() {
        return key(null);
    }

    public UserIdentityResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection matchType() {
        return matchType(null);
    }

    public UserIdentityResponseProjection matchType(String alias) {
        fields.add(new GraphQLResponseField("matchType").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection description() {
        return description(null);
    }

    public UserIdentityResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection creatorId() {
        return creatorId(null);
    }

    public UserIdentityResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection createdAt() {
        return createdAt(null);
    }

    public UserIdentityResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection updaterId() {
        return updaterId(null);
    }

    public UserIdentityResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public UserIdentityResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection creator() {
        return creator(null);
    }

    public UserIdentityResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection updater() {
        return updater(null);
    }

    public UserIdentityResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection ownerId() {
        return ownerId(null);
    }

    public UserIdentityResponseProjection ownerId(String alias) {
        fields.add(new GraphQLResponseField("ownerId").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection example() {
        return example(null);
    }

    public UserIdentityResponseProjection example(String alias) {
        fields.add(new GraphQLResponseField("example").alias(alias));
        return this;
    }

    public UserIdentityResponseProjection typename() {
        return typename(null);
    }

    public UserIdentityResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
