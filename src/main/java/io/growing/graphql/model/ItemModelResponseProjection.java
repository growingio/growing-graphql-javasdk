package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ItemModel
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class ItemModelResponseProjection extends GraphQLResponseProjection {

    public ItemModelResponseProjection() {
    }

    @Override
    public ItemModelResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ItemModelResponseProjection all$(int maxDepth) {
        this.id();
        this.projectId();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("ItemModelResponseProjection.ItemVariableResponseProjection.attributes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ItemModelResponseProjection.ItemVariableResponseProjection.attributes", projectionDepthOnFields.getOrDefault("ItemModelResponseProjection.ItemVariableResponseProjection.attributes", 0) + 1);
            this.attributes(new ItemVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ItemModelResponseProjection.ItemVariableResponseProjection.attributes", 0)));
        }
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.typename();
        return this;
    }

    public ItemModelResponseProjection id() {
        return id(null);
    }

    public ItemModelResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ItemModelResponseProjection projectId() {
        return projectId(null);
    }

    public ItemModelResponseProjection projectId(String alias) {
        fields.add(new GraphQLResponseField("projectId").alias(alias));
        return this;
    }

    public ItemModelResponseProjection name() {
        return name(null);
    }

    public ItemModelResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ItemModelResponseProjection description() {
        return description(null);
    }

    public ItemModelResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ItemModelResponseProjection attributes(ItemVariableResponseProjection subProjection) {
        return attributes(null, subProjection);
    }

    public ItemModelResponseProjection attributes(String alias, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("attributes").alias(alias).projection(subProjection));
        return this;
    }

    public ItemModelResponseProjection creatorId() {
        return creatorId(null);
    }

    public ItemModelResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public ItemModelResponseProjection createdAt() {
        return createdAt(null);
    }

    public ItemModelResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ItemModelResponseProjection updaterId() {
        return updaterId(null);
    }

    public ItemModelResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public ItemModelResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public ItemModelResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public ItemModelResponseProjection creator() {
        return creator(null);
    }

    public ItemModelResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public ItemModelResponseProjection updater() {
        return updater(null);
    }

    public ItemModelResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public ItemModelResponseProjection typename() {
        return typename(null);
    }

    public ItemModelResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
