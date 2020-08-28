package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class UserEventResponseProjection extends GraphQLResponseProjection {

    public UserEventResponseProjection() {
    }

    @Override
    public UserEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserEventResponseProjection all$(int maxDepth) {
        this.name();
        this.type();
        this.key();
        this.timestamp();
        if (projectionDepthOnFields.getOrDefault("UserEventResponseProjection.PropertyResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserEventResponseProjection.PropertyResponseProjection.properties", projectionDepthOnFields.getOrDefault("UserEventResponseProjection.PropertyResponseProjection.properties", 0) + 1);
            this.properties(new PropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserEventResponseProjection.PropertyResponseProjection.properties", 0)));
        }
        this.typename();
        return this;
    }

    public UserEventResponseProjection name() {
        return name(null);
    }

    public UserEventResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public UserEventResponseProjection type() {
        return type(null);
    }

    public UserEventResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public UserEventResponseProjection key() {
        return key(null);
    }

    public UserEventResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public UserEventResponseProjection timestamp() {
        return timestamp(null);
    }

    public UserEventResponseProjection timestamp(String alias) {
        fields.add(new GraphQLResponseField("timestamp").alias(alias));
        return this;
    }

    public UserEventResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public UserEventResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public UserEventResponseProjection typename() {
        return typename(null);
    }

    public UserEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
