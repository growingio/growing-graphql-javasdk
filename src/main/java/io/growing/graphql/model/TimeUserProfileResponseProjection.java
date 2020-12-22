package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TimeUserProfile
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class TimeUserProfileResponseProjection extends GraphQLResponseProjection {

    public TimeUserProfileResponseProjection() {
    }

    @Override
    public TimeUserProfileResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TimeUserProfileResponseProjection all$(int maxDepth) {
        this.updatedAt();
        if (projectionDepthOnFields.getOrDefault("TimeUserProfileResponseProjection.InsensitivePropertyResponseProjection.property", 0) <= maxDepth) {
            projectionDepthOnFields.put("TimeUserProfileResponseProjection.InsensitivePropertyResponseProjection.property", projectionDepthOnFields.getOrDefault("TimeUserProfileResponseProjection.InsensitivePropertyResponseProjection.property", 0) + 1);
            this.property(new InsensitivePropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TimeUserProfileResponseProjection.InsensitivePropertyResponseProjection.property", 0)));
        }
        this.typename();
        return this;
    }

    public TimeUserProfileResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public TimeUserProfileResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public TimeUserProfileResponseProjection property(InsensitivePropertyResponseProjection subProjection) {
        return property(null, subProjection);
    }

    public TimeUserProfileResponseProjection property(String alias, InsensitivePropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("property").alias(alias).projection(subProjection));
        return this;
    }

    public TimeUserProfileResponseProjection typename() {
        return typename(null);
    }

    public TimeUserProfileResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
