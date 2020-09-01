package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for EventVariable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class EventVariableResponseProjection extends GraphQLResponseProjection {

    public EventVariableResponseProjection() {
    }

    @Override
    public EventVariableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public EventVariableResponseProjection all$(int maxDepth) {
        this.id();
        this.projectId();
        this.name();
        this.key();
        this.description();
        this.valueType();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.typename();
        return this;
    }

    public EventVariableResponseProjection id() {
        return id(null);
    }

    public EventVariableResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EventVariableResponseProjection projectId() {
        return projectId(null);
    }

    public EventVariableResponseProjection projectId(String alias) {
        fields.add(new GraphQLResponseField("projectId").alias(alias));
        return this;
    }

    public EventVariableResponseProjection name() {
        return name(null);
    }

    public EventVariableResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EventVariableResponseProjection key() {
        return key(null);
    }

    public EventVariableResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public EventVariableResponseProjection description() {
        return description(null);
    }

    public EventVariableResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public EventVariableResponseProjection valueType() {
        return valueType(null);
    }

    public EventVariableResponseProjection valueType(String alias) {
        fields.add(new GraphQLResponseField("valueType").alias(alias));
        return this;
    }

    public EventVariableResponseProjection creatorId() {
        return creatorId(null);
    }

    public EventVariableResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public EventVariableResponseProjection createdAt() {
        return createdAt(null);
    }

    public EventVariableResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public EventVariableResponseProjection updaterId() {
        return updaterId(null);
    }

    public EventVariableResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public EventVariableResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public EventVariableResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public EventVariableResponseProjection creator() {
        return creator(null);
    }

    public EventVariableResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public EventVariableResponseProjection updater() {
        return updater(null);
    }

    public EventVariableResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public EventVariableResponseProjection typename() {
        return typename(null);
    }

    public EventVariableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
