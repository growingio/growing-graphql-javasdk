package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProjectDataCtrlItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class ProjectDataCtrlItemResponseProjection extends GraphQLResponseProjection {

    public ProjectDataCtrlItemResponseProjection() {
    }

    @Override
    public ProjectDataCtrlItemResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectDataCtrlItemResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public ProjectDataCtrlItemResponseProjection onCustomEvent(CustomEventResponseProjection subProjection) {
        return onCustomEvent(null, subProjection);
    }

    public ProjectDataCtrlItemResponseProjection onCustomEvent(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CustomEvent").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectDataCtrlItemResponseProjection onTag(TagResponseProjection subProjection) {
        return onTag(null, subProjection);
    }

    public ProjectDataCtrlItemResponseProjection onTag(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Tag").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectDataCtrlItemResponseProjection onUserVariable(UserVariableResponseProjection subProjection) {
        return onUserVariable(null, subProjection);
    }

    public ProjectDataCtrlItemResponseProjection onUserVariable(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UserVariable").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectDataCtrlItemResponseProjection typename() {
        return typename(null);
    }

    public ProjectDataCtrlItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
