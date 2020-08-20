package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DashboardReference
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class DashboardReferenceResponseProjection extends GraphQLResponseProjection {

    public DashboardReferenceResponseProjection() {
    }

    public DashboardReferenceResponseProjection id() {
        return id(null);
    }

    public DashboardReferenceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DashboardReferenceResponseProjection name() {
        return name(null);
    }

    public DashboardReferenceResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public DashboardReferenceResponseProjection creatorId() {
        return creatorId(null);
    }

    public DashboardReferenceResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public DashboardReferenceResponseProjection creator() {
        return creator(null);
    }

    public DashboardReferenceResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public DashboardReferenceResponseProjection typename() {
        return typename(null);
    }

    public DashboardReferenceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
