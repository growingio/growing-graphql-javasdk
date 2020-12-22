package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SimpleEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class SimpleEventResponseProjection extends GraphQLResponseProjection {

    public SimpleEventResponseProjection() {
    }

    @Override
    public SimpleEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SimpleEventResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        this.elementId();
        this.platforms();
        this.docType();
        this.action();
        this.isSystem();
        this.businessType();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.ownerId();
        this.typename();
        return this;
    }

    public SimpleEventResponseProjection id() {
        return id(null);
    }

    public SimpleEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection name() {
        return name(null);
    }

    public SimpleEventResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection description() {
        return description(null);
    }

    public SimpleEventResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection elementId() {
        return elementId(null);
    }

    public SimpleEventResponseProjection elementId(String alias) {
        fields.add(new GraphQLResponseField("elementId").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection platforms() {
        return platforms(null);
    }

    public SimpleEventResponseProjection platforms(String alias) {
        fields.add(new GraphQLResponseField("platforms").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection docType() {
        return docType(null);
    }

    public SimpleEventResponseProjection docType(String alias) {
        fields.add(new GraphQLResponseField("docType").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection action() {
        return action(null);
    }

    public SimpleEventResponseProjection action(String alias) {
        fields.add(new GraphQLResponseField("action").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection isSystem() {
        return isSystem(null);
    }

    public SimpleEventResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection businessType() {
        return businessType(null);
    }

    public SimpleEventResponseProjection businessType(String alias) {
        fields.add(new GraphQLResponseField("businessType").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection creatorId() {
        return creatorId(null);
    }

    public SimpleEventResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public SimpleEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection updaterId() {
        return updaterId(null);
    }

    public SimpleEventResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public SimpleEventResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection creator() {
        return creator(null);
    }

    public SimpleEventResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection updater() {
        return updater(null);
    }

    public SimpleEventResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection ownerId() {
        return ownerId(null);
    }

    public SimpleEventResponseProjection ownerId(String alias) {
        fields.add(new GraphQLResponseField("ownerId").alias(alias));
        return this;
    }

    public SimpleEventResponseProjection typename() {
        return typename(null);
    }

    public SimpleEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
