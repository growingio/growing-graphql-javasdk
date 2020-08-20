package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserSearch
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class UserSearchResponseProjection extends GraphQLResponseProjection {

    public UserSearchResponseProjection() {
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
