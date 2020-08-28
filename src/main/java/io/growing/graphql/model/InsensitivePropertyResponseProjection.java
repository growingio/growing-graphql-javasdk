package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for InsensitiveProperty
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class InsensitivePropertyResponseProjection extends GraphQLResponseProjection {

    public InsensitivePropertyResponseProjection() {
    }

    @Override
    public InsensitivePropertyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public InsensitivePropertyResponseProjection all$(int maxDepth) {
        this.key();
        this.name();
        this.value();
        this.typename();
        return this;
    }

    public InsensitivePropertyResponseProjection key() {
        return key(null);
    }

    public InsensitivePropertyResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public InsensitivePropertyResponseProjection name() {
        return name(null);
    }

    public InsensitivePropertyResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public InsensitivePropertyResponseProjection value() {
        return value(null);
    }

    public InsensitivePropertyResponseProjection value(String alias) {
        fields.add(new GraphQLResponseField("value").alias(alias));
        return this;
    }

    public InsensitivePropertyResponseProjection typename() {
        return typename(null);
    }

    public InsensitivePropertyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
