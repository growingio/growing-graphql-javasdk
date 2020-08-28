package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Property
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class PropertyResponseProjection extends GraphQLResponseProjection {

    public PropertyResponseProjection() {
    }

    @Override
    public PropertyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PropertyResponseProjection all$(int maxDepth) {
        this.key();
        this.name();
        this.value();
        this.typename();
        return this;
    }

    public PropertyResponseProjection key() {
        return key(null);
    }

    public PropertyResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public PropertyResponseProjection name() {
        return name(null);
    }

    public PropertyResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PropertyResponseProjection value() {
        return value(null);
    }

    public PropertyResponseProjection value(String alias) {
        fields.add(new GraphQLResponseField("value").alias(alias));
        return this;
    }

    public PropertyResponseProjection typename() {
        return typename(null);
    }

    public PropertyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
