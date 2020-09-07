package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserSearch
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class UserSearchResponseProjection extends GraphQLResponseProjection {

    public UserSearchResponseProjection() {
    }

    @Override
    public UserSearchResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserSearchResponseProjection all$(int maxDepth) {
        this.id();
        this.userId();
        if (projectionDepthOnFields.getOrDefault("UserSearchResponseProjection.PropertyResponseProjection.property", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserSearchResponseProjection.PropertyResponseProjection.property", projectionDepthOnFields.getOrDefault("UserSearchResponseProjection.PropertyResponseProjection.property", 0) + 1);
            this.property(new PropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserSearchResponseProjection.PropertyResponseProjection.property", 0)));
        }
        this.typename();
        return this;
    }

    public UserSearchResponseProjection id() {
        return id(null);
    }

    public UserSearchResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserSearchResponseProjection userId() {
        return userId(null);
    }

    public UserSearchResponseProjection userId(String alias) {
        fields.add(new GraphQLResponseField("userId").alias(alias));
        return this;
    }

    public UserSearchResponseProjection property(PropertyResponseProjection subProjection) {
        return property(null, subProjection);
    }

    public UserSearchResponseProjection property(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("property").alias(alias).projection(subProjection));
        return this;
    }

    public UserSearchResponseProjection typename() {
        return typename(null);
    }

    public UserSearchResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
