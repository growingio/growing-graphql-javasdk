package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Category
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CategoryResponseProjection extends GraphQLResponseProjection {

    public CategoryResponseProjection() {
    }

    @Override
    public CategoryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CategoryResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.parentId();
        if (projectionDepthOnFields.getOrDefault("CategoryResponseProjection.CategoryResponseProjection.subCategories", 0) <= maxDepth) {
            projectionDepthOnFields.put("CategoryResponseProjection.CategoryResponseProjection.subCategories", projectionDepthOnFields.getOrDefault("CategoryResponseProjection.CategoryResponseProjection.subCategories", 0) + 1);
            this.subCategories(new CategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CategoryResponseProjection.CategoryResponseProjection.subCategories", 0)));
        }
        this.resourceType();
        if (projectionDepthOnFields.getOrDefault("CategoryResponseProjection.CategoryResourceResponseProjection.resources", 0) <= maxDepth) {
            projectionDepthOnFields.put("CategoryResponseProjection.CategoryResourceResponseProjection.resources", projectionDepthOnFields.getOrDefault("CategoryResponseProjection.CategoryResourceResponseProjection.resources", 0) + 1);
            this.resources(new CategoryResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CategoryResponseProjection.CategoryResourceResponseProjection.resources", 0)));
        }
        this.resourceCount();
        this.typename();
        return this;
    }

    public CategoryResponseProjection id() {
        return id(null);
    }

    public CategoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CategoryResponseProjection name() {
        return name(null);
    }

    public CategoryResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CategoryResponseProjection parentId() {
        return parentId(null);
    }

    public CategoryResponseProjection parentId(String alias) {
        fields.add(new GraphQLResponseField("parentId").alias(alias));
        return this;
    }

    public CategoryResponseProjection subCategories(CategoryResponseProjection subProjection) {
        return subCategories(null, subProjection);
    }

    public CategoryResponseProjection subCategories(String alias, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subCategories").alias(alias).projection(subProjection));
        return this;
    }

    public CategoryResponseProjection resourceType() {
        return resourceType(null);
    }

    public CategoryResponseProjection resourceType(String alias) {
        fields.add(new GraphQLResponseField("resourceType").alias(alias));
        return this;
    }

    public CategoryResponseProjection resources(CategoryResourceResponseProjection subProjection) {
        return resources(null, subProjection);
    }

    public CategoryResponseProjection resources(String alias, CategoryResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resources").alias(alias).projection(subProjection));
        return this;
    }

    public CategoryResponseProjection resourceCount() {
        return resourceCount(null);
    }

    public CategoryResponseProjection resourceCount(String alias) {
        fields.add(new GraphQLResponseField("resourceCount").alias(alias));
        return this;
    }

    public CategoryResponseProjection typename() {
        return typename(null);
    }

    public CategoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
