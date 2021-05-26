package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Feature
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class FeatureResponseProjection extends GraphQLResponseProjection {

    public FeatureResponseProjection() {
    }

    @Override
    public FeatureResponseProjection all$() {
        return all$(3);
    }

    @Override
    public FeatureResponseProjection all$(int maxDepth) {
        this.id();
        this.label();
        this.entry();
        this.description();
        this.typename();
        return this;
    }

    public FeatureResponseProjection id() {
        return id(null);
    }

    public FeatureResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FeatureResponseProjection label() {
        return label(null);
    }

    public FeatureResponseProjection label(String alias) {
        fields.add(new GraphQLResponseField("label").alias(alias));
        return this;
    }

    public FeatureResponseProjection entry() {
        return entry(null);
    }

    public FeatureResponseProjection entry(String alias) {
        fields.add(new GraphQLResponseField("entry").alias(alias));
        return this;
    }

    public FeatureResponseProjection description() {
        return description(null);
    }

    public FeatureResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public FeatureResponseProjection typename() {
        return typename(null);
    }

    public FeatureResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
