package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProjectInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class ProjectInfoResponseProjection extends GraphQLResponseProjection {

    public ProjectInfoResponseProjection() {
    }

    public ProjectInfoResponseProjection id() {
        return id(null);
    }

    public ProjectInfoResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProjectInfoResponseProjection name() {
        return name(null);
    }

    public ProjectInfoResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProjectInfoResponseProjection logo() {
        return logo(null);
    }

    public ProjectInfoResponseProjection logo(String alias) {
        fields.add(new GraphQLResponseField("logo").alias(alias));
        return this;
    }

    public ProjectInfoResponseProjection createdAt() {
        return createdAt(null);
    }

    public ProjectInfoResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ProjectInfoResponseProjection typename() {
        return typename(null);
    }

    public ProjectInfoResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
