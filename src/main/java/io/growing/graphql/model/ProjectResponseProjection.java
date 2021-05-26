package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Project
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ProjectResponseProjection extends GraphQLResponseProjection {

    public ProjectResponseProjection() {
    }

    @Override
    public ProjectResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        this.creator();
        this.creatorId();
        this.createdAt();
        this.owner();
        this.ownerId();
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectMemberResponseProjection.projectMembers", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.ProjectMemberResponseProjection.projectMembers", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectMemberResponseProjection.projectMembers", 0) + 1);
            this.projectMembers(new ProjectMemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectMemberResponseProjection.projectMembers", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectRoleResponseProjection.projectRoles", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.ProjectRoleResponseProjection.projectRoles", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectRoleResponseProjection.projectRoles", 0) + 1);
            this.projectRoles(new ProjectRoleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectRoleResponseProjection.projectRoles", 0)));
        }
        this.projectMemberCount();
        this.typename();
        return this;
    }

    public ProjectResponseProjection id() {
        return id(null);
    }

    public ProjectResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProjectResponseProjection name() {
        return name(null);
    }

    public ProjectResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProjectResponseProjection description() {
        return description(null);
    }

    public ProjectResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ProjectResponseProjection creator() {
        return creator(null);
    }

    public ProjectResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public ProjectResponseProjection creatorId() {
        return creatorId(null);
    }

    public ProjectResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public ProjectResponseProjection createdAt() {
        return createdAt(null);
    }

    public ProjectResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ProjectResponseProjection owner() {
        return owner(null);
    }

    public ProjectResponseProjection owner(String alias) {
        fields.add(new GraphQLResponseField("owner").alias(alias));
        return this;
    }

    public ProjectResponseProjection ownerId() {
        return ownerId(null);
    }

    public ProjectResponseProjection ownerId(String alias) {
        fields.add(new GraphQLResponseField("ownerId").alias(alias));
        return this;
    }

    public ProjectResponseProjection projectMembers(ProjectMemberResponseProjection subProjection) {
        return projectMembers(null, subProjection);
    }

    public ProjectResponseProjection projectMembers(String alias, ProjectMemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectMembers").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection projectRoles(ProjectRoleResponseProjection subProjection) {
        return projectRoles(null, subProjection);
    }

    public ProjectResponseProjection projectRoles(String alias, ProjectRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectRoles").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection projectMemberCount() {
        return projectMemberCount(null);
    }

    public ProjectResponseProjection projectMemberCount(String alias) {
        fields.add(new GraphQLResponseField("projectMemberCount").alias(alias));
        return this;
    }

    public ProjectResponseProjection typename() {
        return typename(null);
    }

    public ProjectResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
