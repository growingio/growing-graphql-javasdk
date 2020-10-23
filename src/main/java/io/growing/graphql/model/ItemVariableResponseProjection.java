package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ItemVariable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class ItemVariableResponseProjection extends GraphQLResponseProjection {

    public ItemVariableResponseProjection() {
    }

    @Override
    public ItemVariableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ItemVariableResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.key();
        this.description();
        this.valueType();
        this.isPrimaryKey();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.typename();
        return this;
    }

    public ItemVariableResponseProjection id() {
        return id(null);
    }

    public ItemVariableResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ItemVariableResponseProjection name() {
        return name(null);
    }

    public ItemVariableResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ItemVariableResponseProjection key() {
        return key(null);
    }

    public ItemVariableResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public ItemVariableResponseProjection description() {
        return description(null);
    }

    public ItemVariableResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ItemVariableResponseProjection valueType() {
        return valueType(null);
    }

    public ItemVariableResponseProjection valueType(String alias) {
        fields.add(new GraphQLResponseField("valueType").alias(alias));
        return this;
    }

    public ItemVariableResponseProjection isPrimaryKey() {
        return isPrimaryKey(null);
    }

    public ItemVariableResponseProjection isPrimaryKey(String alias) {
        fields.add(new GraphQLResponseField("isPrimaryKey").alias(alias));
        return this;
    }

    public ItemVariableResponseProjection creatorId() {
        return creatorId(null);
    }

    public ItemVariableResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public ItemVariableResponseProjection createdAt() {
        return createdAt(null);
    }

    public ItemVariableResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ItemVariableResponseProjection updaterId() {
        return updaterId(null);
    }

    public ItemVariableResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public ItemVariableResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public ItemVariableResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public ItemVariableResponseProjection creator() {
        return creator(null);
    }

    public ItemVariableResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public ItemVariableResponseProjection updater() {
        return updater(null);
    }

    public ItemVariableResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public ItemVariableResponseProjection typename() {
        return typename(null);
    }

    public ItemVariableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
