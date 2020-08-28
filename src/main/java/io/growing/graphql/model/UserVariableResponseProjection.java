package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserVariable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class UserVariableResponseProjection extends GraphQLResponseProjection {

    public UserVariableResponseProjection() {
    }

    @Override
    public UserVariableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserVariableResponseProjection all$(int maxDepth) {
        this.id();
        this.projectId();
        this.name();
        this.key();
        this.type();
        this.description();
        this.isSystem();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.valueType();
        this.typename();
        return this;
    }

    public UserVariableResponseProjection id() {
        return id(null);
    }

    public UserVariableResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserVariableResponseProjection projectId() {
        return projectId(null);
    }

    public UserVariableResponseProjection projectId(String alias) {
        fields.add(new GraphQLResponseField("projectId").alias(alias));
        return this;
    }

    public UserVariableResponseProjection name() {
        return name(null);
    }

    public UserVariableResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public UserVariableResponseProjection key() {
        return key(null);
    }

    public UserVariableResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public UserVariableResponseProjection type() {
        return type(null);
    }

    public UserVariableResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public UserVariableResponseProjection description() {
        return description(null);
    }

    public UserVariableResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public UserVariableResponseProjection isSystem() {
        return isSystem(null);
    }

    public UserVariableResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public UserVariableResponseProjection creatorId() {
        return creatorId(null);
    }

    public UserVariableResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public UserVariableResponseProjection createdAt() {
        return createdAt(null);
    }

    public UserVariableResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public UserVariableResponseProjection updaterId() {
        return updaterId(null);
    }

    public UserVariableResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public UserVariableResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public UserVariableResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public UserVariableResponseProjection creator() {
        return creator(null);
    }

    public UserVariableResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public UserVariableResponseProjection updater() {
        return updater(null);
    }

    public UserVariableResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public UserVariableResponseProjection valueType() {
        return valueType(null);
    }

    public UserVariableResponseProjection valueType(String alias) {
        fields.add(new GraphQLResponseField("valueType").alias(alias));
        return this;
    }

    public UserVariableResponseProjection typename() {
        return typename(null);
    }

    public UserVariableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
