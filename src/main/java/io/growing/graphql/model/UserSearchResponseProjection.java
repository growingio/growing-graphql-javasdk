package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserSearch
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
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
        if (projectionDepthOnFields.getOrDefault("UserSearchResponseProjection.PropertyResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserSearchResponseProjection.PropertyResponseProjection.properties", projectionDepthOnFields.getOrDefault("UserSearchResponseProjection.PropertyResponseProjection.properties", 0) + 1);
            this.properties(new PropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserSearchResponseProjection.PropertyResponseProjection.properties", 0)));
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

    public UserSearchResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public UserSearchResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
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
