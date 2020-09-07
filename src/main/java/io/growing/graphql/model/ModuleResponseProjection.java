package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Module
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class ModuleResponseProjection extends GraphQLResponseProjection {

    public ModuleResponseProjection() {
    }

    @Override
    public ModuleResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ModuleResponseProjection all$(int maxDepth) {
        this.key();
        this.name();
        if (projectionDepthOnFields.getOrDefault("ModuleResponseProjection.PermissionResponseProjection.permissions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ModuleResponseProjection.PermissionResponseProjection.permissions", projectionDepthOnFields.getOrDefault("ModuleResponseProjection.PermissionResponseProjection.permissions", 0) + 1);
            this.permissions(new PermissionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ModuleResponseProjection.PermissionResponseProjection.permissions", 0)));
        }
        this.typename();
        return this;
    }

    public ModuleResponseProjection key() {
        return key(null);
    }

    public ModuleResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public ModuleResponseProjection name() {
        return name(null);
    }

    public ModuleResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ModuleResponseProjection permissions(PermissionResponseProjection subProjection) {
        return permissions(null, subProjection);
    }

    public ModuleResponseProjection permissions(String alias, PermissionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("permissions").alias(alias).projection(subProjection));
        return this;
    }

    public ModuleResponseProjection typename() {
        return typename(null);
    }

    public ModuleResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
