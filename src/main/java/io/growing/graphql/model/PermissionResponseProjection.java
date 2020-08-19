package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Permission
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class PermissionResponseProjection extends GraphQLResponseProjection {

    public PermissionResponseProjection() {
    }

    public PermissionResponseProjection id() {
        return id(null);
    }

    public PermissionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PermissionResponseProjection action() {
        return action(null);
    }

    public PermissionResponseProjection action(String alias) {
        fields.add(new GraphQLResponseField("action").alias(alias));
        return this;
    }

    public PermissionResponseProjection name() {
        return name(null);
    }

    public PermissionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PermissionResponseProjection typename() {
        return typename(null);
    }

    public PermissionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
