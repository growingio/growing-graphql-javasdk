package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Group
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class GroupResponseProjection extends GraphQLResponseProjection {

    public GroupResponseProjection() {
    }

    @Override
    public GroupResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GroupResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.typename();
        return this;
    }

    public GroupResponseProjection id() {
        return id(null);
    }

    public GroupResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public GroupResponseProjection name() {
        return name(null);
    }

    public GroupResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public GroupResponseProjection typename() {
        return typename(null);
    }

    public GroupResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
