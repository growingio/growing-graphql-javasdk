package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProjectDataCtrl
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class ProjectDataCtrlResponseProjection extends GraphQLResponseProjection {

    public ProjectDataCtrlResponseProjection() {
    }

    @Override
    public ProjectDataCtrlResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectDataCtrlResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("ProjectDataCtrlResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectDataCtrlResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("ProjectDataCtrlResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectDataCtrlResponseProjection.ProjectResponseProjection.project", 0)));
        }
        this.dataType();
        this.grantType();
        this.useType();
        if (projectionDepthOnFields.getOrDefault("ProjectDataCtrlResponseProjection.ProjectDataCtrlItemResponseProjection.dataItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectDataCtrlResponseProjection.ProjectDataCtrlItemResponseProjection.dataItems", projectionDepthOnFields.getOrDefault("ProjectDataCtrlResponseProjection.ProjectDataCtrlItemResponseProjection.dataItems", 0) + 1);
            this.dataItems(new ProjectDataCtrlItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectDataCtrlResponseProjection.ProjectDataCtrlItemResponseProjection.dataItems", 0)));
        }
        this.typename();
        return this;
    }

    public ProjectDataCtrlResponseProjection id() {
        return id(null);
    }

    public ProjectDataCtrlResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProjectDataCtrlResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public ProjectDataCtrlResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectDataCtrlResponseProjection dataType() {
        return dataType(null);
    }

    public ProjectDataCtrlResponseProjection dataType(String alias) {
        fields.add(new GraphQLResponseField("dataType").alias(alias));
        return this;
    }

    public ProjectDataCtrlResponseProjection grantType() {
        return grantType(null);
    }

    public ProjectDataCtrlResponseProjection grantType(String alias) {
        fields.add(new GraphQLResponseField("grantType").alias(alias));
        return this;
    }

    public ProjectDataCtrlResponseProjection useType() {
        return useType(null);
    }

    public ProjectDataCtrlResponseProjection useType(String alias) {
        fields.add(new GraphQLResponseField("useType").alias(alias));
        return this;
    }

    public ProjectDataCtrlResponseProjection dataItems(ProjectDataCtrlItemResponseProjection subProjection) {
        return dataItems(null, subProjection);
    }

    public ProjectDataCtrlResponseProjection dataItems(String alias, ProjectDataCtrlItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataItems").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectDataCtrlResponseProjection typename() {
        return typename(null);
    }

    public ProjectDataCtrlResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
