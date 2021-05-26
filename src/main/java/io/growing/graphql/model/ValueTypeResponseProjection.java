package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ValueType
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ValueTypeResponseProjection extends GraphQLResponseProjection {

    public ValueTypeResponseProjection() {
    }

    @Override
    public ValueTypeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ValueTypeResponseProjection all$(int maxDepth) {
        this.type();
        this.unit();
        this.isArray();
        this.typename();
        return this;
    }

    public ValueTypeResponseProjection type() {
        return type(null);
    }

    public ValueTypeResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public ValueTypeResponseProjection unit() {
        return unit(null);
    }

    public ValueTypeResponseProjection unit(String alias) {
        fields.add(new GraphQLResponseField("unit").alias(alias));
        return this;
    }

    public ValueTypeResponseProjection isArray() {
        return isArray(null);
    }

    public ValueTypeResponseProjection isArray(String alias) {
        fields.add(new GraphQLResponseField("isArray").alias(alias));
        return this;
    }

    public ValueTypeResponseProjection typename() {
        return typename(null);
    }

    public ValueTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
