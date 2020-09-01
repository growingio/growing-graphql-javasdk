package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Dashboard
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:35+0800"
)
public class DashboardResponseProjection extends GraphQLResponseProjection {

    public DashboardResponseProjection() {
    }

    @Override
    public DashboardResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DashboardResponseProjection all$(int maxDepth) {
        this.id();
        this.projectId();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("DashboardResponseProjection.ComponentResponseProjection.components", 0) <= maxDepth) {
            projectionDepthOnFields.put("DashboardResponseProjection.ComponentResponseProjection.components", projectionDepthOnFields.getOrDefault("DashboardResponseProjection.ComponentResponseProjection.components", 0) + 1);
            this.components(new ComponentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DashboardResponseProjection.ComponentResponseProjection.components", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DashboardResponseProjection.FilterResponseProjection.filter", 0) <= maxDepth) {
            projectionDepthOnFields.put("DashboardResponseProjection.FilterResponseProjection.filter", projectionDepthOnFields.getOrDefault("DashboardResponseProjection.FilterResponseProjection.filter", 0) + 1);
            this.filter(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DashboardResponseProjection.FilterResponseProjection.filter", 0)));
        }
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        if (projectionDepthOnFields.getOrDefault("DashboardResponseProjection.MemberResponseProjection.readers", 0) <= maxDepth) {
            projectionDepthOnFields.put("DashboardResponseProjection.MemberResponseProjection.readers", projectionDepthOnFields.getOrDefault("DashboardResponseProjection.MemberResponseProjection.readers", 0) + 1);
            this.readers(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DashboardResponseProjection.MemberResponseProjection.readers", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DashboardResponseProjection.MemberResponseProjection.editors", 0) <= maxDepth) {
            projectionDepthOnFields.put("DashboardResponseProjection.MemberResponseProjection.editors", projectionDepthOnFields.getOrDefault("DashboardResponseProjection.MemberResponseProjection.editors", 0) + 1);
            this.editors(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DashboardResponseProjection.MemberResponseProjection.editors", 0)));
        }
        this.typename();
        return this;
    }

    public DashboardResponseProjection id() {
        return id(null);
    }

    public DashboardResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DashboardResponseProjection projectId() {
        return projectId(null);
    }

    public DashboardResponseProjection projectId(String alias) {
        fields.add(new GraphQLResponseField("projectId").alias(alias));
        return this;
    }

    public DashboardResponseProjection name() {
        return name(null);
    }

    public DashboardResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public DashboardResponseProjection description() {
        return description(null);
    }

    public DashboardResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public DashboardResponseProjection components(ComponentResponseProjection subProjection) {
        return components(null, subProjection);
    }

    public DashboardResponseProjection components(String alias, ComponentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("components").alias(alias).projection(subProjection));
        return this;
    }

    public DashboardResponseProjection filter(FilterResponseProjection subProjection) {
        return filter(null, subProjection);
    }

    public DashboardResponseProjection filter(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filter").alias(alias).projection(subProjection));
        return this;
    }

    public DashboardResponseProjection creatorId() {
        return creatorId(null);
    }

    public DashboardResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public DashboardResponseProjection createdAt() {
        return createdAt(null);
    }

    public DashboardResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public DashboardResponseProjection updaterId() {
        return updaterId(null);
    }

    public DashboardResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public DashboardResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public DashboardResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public DashboardResponseProjection creator() {
        return creator(null);
    }

    public DashboardResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public DashboardResponseProjection updater() {
        return updater(null);
    }

    public DashboardResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public DashboardResponseProjection readers(MemberResponseProjection subProjection) {
        return readers(null, subProjection);
    }

    public DashboardResponseProjection readers(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("readers").alias(alias).projection(subProjection));
        return this;
    }

    public DashboardResponseProjection editors(MemberResponseProjection subProjection) {
        return editors(null, subProjection);
    }

    public DashboardResponseProjection editors(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("editors").alias(alias).projection(subProjection));
        return this;
    }

    public DashboardResponseProjection typename() {
        return typename(null);
    }

    public DashboardResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
