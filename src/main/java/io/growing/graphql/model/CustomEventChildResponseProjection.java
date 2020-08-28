package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CustomEventChild
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class CustomEventChildResponseProjection extends GraphQLResponseProjection {

    public CustomEventChildResponseProjection() {
    }

    @Override
    public CustomEventChildResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CustomEventChildResponseProjection all$(int maxDepth) {
        this.id();
        this.key();
        this.name();
        this.valueType();
        this.associatedAt();
        this.typename();
        return this;
    }

    public CustomEventChildResponseProjection id() {
        return id(null);
    }

    public CustomEventChildResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CustomEventChildResponseProjection key() {
        return key(null);
    }

    public CustomEventChildResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public CustomEventChildResponseProjection name() {
        return name(null);
    }

    public CustomEventChildResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CustomEventChildResponseProjection valueType() {
        return valueType(null);
    }

    public CustomEventChildResponseProjection valueType(String alias) {
        fields.add(new GraphQLResponseField("valueType").alias(alias));
        return this;
    }

    public CustomEventChildResponseProjection associatedAt() {
        return associatedAt(null);
    }

    public CustomEventChildResponseProjection associatedAt(String alias) {
        fields.add(new GraphQLResponseField("associatedAt").alias(alias));
        return this;
    }

    public CustomEventChildResponseProjection typename() {
        return typename(null);
    }

    public CustomEventChildResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
