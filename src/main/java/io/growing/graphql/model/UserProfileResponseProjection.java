package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserProfile
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UserProfileResponseProjection extends GraphQLResponseProjection {

    public UserProfileResponseProjection() {
    }

    @Override
    public UserProfileResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserProfileResponseProjection all$(int maxDepth) {
        this.id();
        this.userId();
        if (projectionDepthOnFields.getOrDefault("UserProfileResponseProjection.InsensitivePropertyResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserProfileResponseProjection.InsensitivePropertyResponseProjection.properties", projectionDepthOnFields.getOrDefault("UserProfileResponseProjection.InsensitivePropertyResponseProjection.properties", 0) + 1);
            this.properties(new InsensitivePropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserProfileResponseProjection.InsensitivePropertyResponseProjection.properties", 0)));
        }
        this.typename();
        return this;
    }

    public UserProfileResponseProjection id() {
        return id(null);
    }

    public UserProfileResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserProfileResponseProjection userId() {
        return userId(null);
    }

    public UserProfileResponseProjection userId(String alias) {
        fields.add(new GraphQLResponseField("userId").alias(alias));
        return this;
    }

    public UserProfileResponseProjection properties(InsensitivePropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public UserProfileResponseProjection properties(String alias, InsensitivePropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public UserProfileResponseProjection typename() {
        return typename(null);
    }

    public UserProfileResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
