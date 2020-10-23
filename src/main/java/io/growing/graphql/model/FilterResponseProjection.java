package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Filter
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class FilterResponseProjection extends GraphQLResponseProjection {

    public FilterResponseProjection() {
    }

    @Override
    public FilterResponseProjection all$() {
        return all$(3);
    }

    @Override
    public FilterResponseProjection all$(int maxDepth) {
        this.key();
        this.op();
        this.name();
        this.values();
        if (projectionDepthOnFields.getOrDefault("FilterResponseProjection.FilterResponseProjection.exprs", 0) <= maxDepth) {
            projectionDepthOnFields.put("FilterResponseProjection.FilterResponseProjection.exprs", projectionDepthOnFields.getOrDefault("FilterResponseProjection.FilterResponseProjection.exprs", 0) + 1);
            this.exprs(new FilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FilterResponseProjection.FilterResponseProjection.exprs", 0)));
        }
        this.valueType();
        this.typename();
        return this;
    }

    public FilterResponseProjection key() {
        return key(null);
    }

    public FilterResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public FilterResponseProjection op() {
        return op(null);
    }

    public FilterResponseProjection op(String alias) {
        fields.add(new GraphQLResponseField("op").alias(alias));
        return this;
    }

    public FilterResponseProjection name() {
        return name(null);
    }

    public FilterResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FilterResponseProjection values() {
        return values(null);
    }

    public FilterResponseProjection values(String alias) {
        fields.add(new GraphQLResponseField("values").alias(alias));
        return this;
    }

    public FilterResponseProjection exprs(FilterResponseProjection subProjection) {
        return exprs(null, subProjection);
    }

    public FilterResponseProjection exprs(String alias, FilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("exprs").alias(alias).projection(subProjection));
        return this;
    }

    public FilterResponseProjection valueType() {
        return valueType(null);
    }

    public FilterResponseProjection valueType(String alias) {
        fields.add(new GraphQLResponseField("valueType").alias(alias));
        return this;
    }

    public FilterResponseProjection typename() {
        return typename(null);
    }

    public FilterResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
