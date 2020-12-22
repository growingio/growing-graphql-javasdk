package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TreeNode
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class TreeNodeResponseProjection extends GraphQLResponseProjection {

    public TreeNodeResponseProjection() {
    }

    @Override
    public TreeNodeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TreeNodeResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.type();
        this.resourceId();
        this.parentId();
        if (projectionDepthOnFields.getOrDefault("TreeNodeResponseProjection.TreeNodeResponseProjection.children", 0) <= maxDepth) {
            projectionDepthOnFields.put("TreeNodeResponseProjection.TreeNodeResponseProjection.children", projectionDepthOnFields.getOrDefault("TreeNodeResponseProjection.TreeNodeResponseProjection.children", 0) + 1);
            this.children(new TreeNodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TreeNodeResponseProjection.TreeNodeResponseProjection.children", 0)));
        }
        this.typename();
        return this;
    }

    public TreeNodeResponseProjection id() {
        return id(null);
    }

    public TreeNodeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TreeNodeResponseProjection name() {
        return name(null);
    }

    public TreeNodeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TreeNodeResponseProjection type() {
        return type(null);
    }

    public TreeNodeResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public TreeNodeResponseProjection resourceId() {
        return resourceId(null);
    }

    public TreeNodeResponseProjection resourceId(String alias) {
        fields.add(new GraphQLResponseField("resourceId").alias(alias));
        return this;
    }

    public TreeNodeResponseProjection parentId() {
        return parentId(null);
    }

    public TreeNodeResponseProjection parentId(String alias) {
        fields.add(new GraphQLResponseField("parentId").alias(alias));
        return this;
    }

    public TreeNodeResponseProjection children(TreeNodeResponseProjection subProjection) {
        return children(null, subProjection);
    }

    public TreeNodeResponseProjection children(String alias, TreeNodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("children").alias(alias).projection(subProjection));
        return this;
    }

    public TreeNodeResponseProjection typename() {
        return typename(null);
    }

    public TreeNodeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
