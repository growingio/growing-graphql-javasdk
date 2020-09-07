package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PreparedDimension
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class PreparedDimensionResponseProjection extends GraphQLResponseProjection {

    public PreparedDimensionResponseProjection() {
    }

    @Override
    public PreparedDimensionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PreparedDimensionResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.platforms();
        this.description();
        this.example();
        this.typename();
        return this;
    }

    public PreparedDimensionResponseProjection id() {
        return id(null);
    }

    public PreparedDimensionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PreparedDimensionResponseProjection name() {
        return name(null);
    }

    public PreparedDimensionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PreparedDimensionResponseProjection platforms() {
        return platforms(null);
    }

    public PreparedDimensionResponseProjection platforms(String alias) {
        fields.add(new GraphQLResponseField("platforms").alias(alias));
        return this;
    }

    public PreparedDimensionResponseProjection description() {
        return description(null);
    }

    public PreparedDimensionResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public PreparedDimensionResponseProjection example() {
        return example(null);
    }

    public PreparedDimensionResponseProjection example(String alias) {
        fields.add(new GraphQLResponseField("example").alias(alias));
        return this;
    }

    public PreparedDimensionResponseProjection typename() {
        return typename(null);
    }

    public PreparedDimensionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
