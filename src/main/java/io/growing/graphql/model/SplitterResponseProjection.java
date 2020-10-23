package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Splitter
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class SplitterResponseProjection extends GraphQLResponseProjection {

    public SplitterResponseProjection() {
    }

    @Override
    public SplitterResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SplitterResponseProjection all$(int maxDepth) {
        this.key();
        this.values();
        if (projectionDepthOnFields.getOrDefault("SplitterResponseProjection.TargetUserResponseProjection.users", 0) <= maxDepth) {
            projectionDepthOnFields.put("SplitterResponseProjection.TargetUserResponseProjection.users", projectionDepthOnFields.getOrDefault("SplitterResponseProjection.TargetUserResponseProjection.users", 0) + 1);
            this.users(new TargetUserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SplitterResponseProjection.TargetUserResponseProjection.users", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SplitterResponseProjection.ActionResponseProjection.actions", 0) <= maxDepth) {
            projectionDepthOnFields.put("SplitterResponseProjection.ActionResponseProjection.actions", projectionDepthOnFields.getOrDefault("SplitterResponseProjection.ActionResponseProjection.actions", 0) + 1);
            this.actions(new ActionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SplitterResponseProjection.ActionResponseProjection.actions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SplitterResponseProjection.SplitterResponseProjection.splitters", 0) <= maxDepth) {
            projectionDepthOnFields.put("SplitterResponseProjection.SplitterResponseProjection.splitters", projectionDepthOnFields.getOrDefault("SplitterResponseProjection.SplitterResponseProjection.splitters", 0) + 1);
            this.splitters(new SplitterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SplitterResponseProjection.SplitterResponseProjection.splitters", 0)));
        }
        this.selectedValues();
        this.selectedIndices();
        this.valueType();
        this.name();
        this.typename();
        return this;
    }

    public SplitterResponseProjection key() {
        return key(null);
    }

    public SplitterResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public SplitterResponseProjection values() {
        return values(null);
    }

    public SplitterResponseProjection values(String alias) {
        fields.add(new GraphQLResponseField("values").alias(alias));
        return this;
    }

    public SplitterResponseProjection users(TargetUserResponseProjection subProjection) {
        return users(null, subProjection);
    }

    public SplitterResponseProjection users(String alias, TargetUserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("users").alias(alias).projection(subProjection));
        return this;
    }

    public SplitterResponseProjection actions(ActionResponseProjection subProjection) {
        return actions(null, subProjection);
    }

    public SplitterResponseProjection actions(String alias, ActionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actions").alias(alias).projection(subProjection));
        return this;
    }

    public SplitterResponseProjection splitters(SplitterResponseProjection subProjection) {
        return splitters(null, subProjection);
    }

    public SplitterResponseProjection splitters(String alias, SplitterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("splitters").alias(alias).projection(subProjection));
        return this;
    }

    public SplitterResponseProjection selectedValues() {
        return selectedValues(null);
    }

    public SplitterResponseProjection selectedValues(String alias) {
        fields.add(new GraphQLResponseField("selectedValues").alias(alias));
        return this;
    }

    public SplitterResponseProjection selectedIndices() {
        return selectedIndices(null);
    }

    public SplitterResponseProjection selectedIndices(String alias) {
        fields.add(new GraphQLResponseField("selectedIndices").alias(alias));
        return this;
    }

    public SplitterResponseProjection valueType() {
        return valueType(null);
    }

    public SplitterResponseProjection valueType(String alias) {
        fields.add(new GraphQLResponseField("valueType").alias(alias));
        return this;
    }

    public SplitterResponseProjection name() {
        return name(null);
    }

    public SplitterResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public SplitterResponseProjection typename() {
        return typename(null);
    }

    public SplitterResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
