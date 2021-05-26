package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for EventStat
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class EventStatResponseProjection extends GraphQLResponseProjection {

    public EventStatResponseProjection() {
    }

    @Override
    public EventStatResponseProjection all$() {
        return all$(3);
    }

    @Override
    public EventStatResponseProjection all$(int maxDepth) {
        this.name();
        this.type();
        this.key();
        this.count();
        this.typename();
        return this;
    }

    public EventStatResponseProjection name() {
        return name(null);
    }

    public EventStatResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EventStatResponseProjection type() {
        return type(null);
    }

    public EventStatResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public EventStatResponseProjection key() {
        return key(null);
    }

    public EventStatResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public EventStatResponseProjection count() {
        return count(null);
    }

    public EventStatResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }

    public EventStatResponseProjection typename() {
        return typename(null);
    }

    public EventStatResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
