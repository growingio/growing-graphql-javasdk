package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CategoryResource
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CategoryResourceResponseProjection extends GraphQLResponseProjection {

    public CategoryResourceResponseProjection() {
    }

    @Override
    public CategoryResourceResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CategoryResourceResponseProjection all$(int maxDepth) {
        this.categoryId();
        this.resourceType();
        this.resourceId();
        if (projectionDepthOnFields.getOrDefault("CategoryResourceResponseProjection.EntityResponseProjection.resourceEntity", 0) <= maxDepth) {
            projectionDepthOnFields.put("CategoryResourceResponseProjection.EntityResponseProjection.resourceEntity", projectionDepthOnFields.getOrDefault("CategoryResourceResponseProjection.EntityResponseProjection.resourceEntity", 0) + 1);
            this.resourceEntity(new EntityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CategoryResourceResponseProjection.EntityResponseProjection.resourceEntity", 0)));
        }
        this.typename();
        return this;
    }

    public CategoryResourceResponseProjection categoryId() {
        return categoryId(null);
    }

    public CategoryResourceResponseProjection categoryId(String alias) {
        fields.add(new GraphQLResponseField("categoryId").alias(alias));
        return this;
    }

    public CategoryResourceResponseProjection resourceType() {
        return resourceType(null);
    }

    public CategoryResourceResponseProjection resourceType(String alias) {
        fields.add(new GraphQLResponseField("resourceType").alias(alias));
        return this;
    }

    public CategoryResourceResponseProjection resourceId() {
        return resourceId(null);
    }

    public CategoryResourceResponseProjection resourceId(String alias) {
        fields.add(new GraphQLResponseField("resourceId").alias(alias));
        return this;
    }

    public CategoryResourceResponseProjection resourceEntity(EntityResponseProjection subProjection) {
        return resourceEntity(null, subProjection);
    }

    public CategoryResourceResponseProjection resourceEntity(String alias, EntityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resourceEntity").alias(alias).projection(subProjection));
        return this;
    }

    public CategoryResourceResponseProjection typename() {
        return typename(null);
    }

    public CategoryResourceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
