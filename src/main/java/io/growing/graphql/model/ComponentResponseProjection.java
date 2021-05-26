package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Component
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ComponentResponseProjection extends GraphQLResponseProjection {

    public ComponentResponseProjection() {
    }

    @Override
    public ComponentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ComponentResponseProjection all$(int maxDepth) {
        this.dashboardId();
        this.resourceType();
        this.resourceId();
        if (projectionDepthOnFields.getOrDefault("ComponentResponseProjection.LayoutResponseProjection.layout", 0) <= maxDepth) {
            projectionDepthOnFields.put("ComponentResponseProjection.LayoutResponseProjection.layout", projectionDepthOnFields.getOrDefault("ComponentResponseProjection.LayoutResponseProjection.layout", 0) + 1);
            this.layout(new LayoutResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ComponentResponseProjection.LayoutResponseProjection.layout", 0)));
        }
        this.typename();
        return this;
    }

    public ComponentResponseProjection dashboardId() {
        return dashboardId(null);
    }

    public ComponentResponseProjection dashboardId(String alias) {
        fields.add(new GraphQLResponseField("dashboardId").alias(alias));
        return this;
    }

    public ComponentResponseProjection resourceType() {
        return resourceType(null);
    }

    public ComponentResponseProjection resourceType(String alias) {
        fields.add(new GraphQLResponseField("resourceType").alias(alias));
        return this;
    }

    public ComponentResponseProjection resourceId() {
        return resourceId(null);
    }

    public ComponentResponseProjection resourceId(String alias) {
        fields.add(new GraphQLResponseField("resourceId").alias(alias));
        return this;
    }

    public ComponentResponseProjection layout(LayoutResponseProjection subProjection) {
        return layout(null, subProjection);
    }

    public ComponentResponseProjection layout(String alias, LayoutResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("layout").alias(alias).projection(subProjection));
        return this;
    }

    public ComponentResponseProjection typename() {
        return typename(null);
    }

    public ComponentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
