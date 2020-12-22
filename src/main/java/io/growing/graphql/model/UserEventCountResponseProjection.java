package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserEventCount
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class UserEventCountResponseProjection extends GraphQLResponseProjection {

    public UserEventCountResponseProjection() {
    }

    @Override
    public UserEventCountResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserEventCountResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UserEventCountResponseProjection.EventStatResponseProjection.stats", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserEventCountResponseProjection.EventStatResponseProjection.stats", projectionDepthOnFields.getOrDefault("UserEventCountResponseProjection.EventStatResponseProjection.stats", 0) + 1);
            this.stats(new EventStatResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserEventCountResponseProjection.EventStatResponseProjection.stats", 0)));
        }
        this.totalOfChangeRate();
        this.typename();
        return this;
    }

    public UserEventCountResponseProjection stats(EventStatResponseProjection subProjection) {
        return stats(null, subProjection);
    }

    public UserEventCountResponseProjection stats(String alias, EventStatResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("stats").alias(alias).projection(subProjection));
        return this;
    }

    public UserEventCountResponseProjection totalOfChangeRate() {
        return totalOfChangeRate(null);
    }

    public UserEventCountResponseProjection totalOfChangeRate(String alias) {
        fields.add(new GraphQLResponseField("totalOfChangeRate").alias(alias));
        return this;
    }

    public UserEventCountResponseProjection typename() {
        return typename(null);
    }

    public UserEventCountResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
