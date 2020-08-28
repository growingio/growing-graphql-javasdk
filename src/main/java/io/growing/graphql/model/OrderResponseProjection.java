package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Order
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class OrderResponseProjection extends GraphQLResponseProjection {

    public OrderResponseProjection() {
    }

    @Override
    public OrderResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrderResponseProjection all$(int maxDepth) {
        this.id();
        this.isDim();
        this.index();
        this.valueIndex();
        this.orderType();
        this.typename();
        return this;
    }

    public OrderResponseProjection id() {
        return id(null);
    }

    public OrderResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public OrderResponseProjection isDim() {
        return isDim(null);
    }

    public OrderResponseProjection isDim(String alias) {
        fields.add(new GraphQLResponseField("isDim").alias(alias));
        return this;
    }

    public OrderResponseProjection index() {
        return index(null);
    }

    public OrderResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public OrderResponseProjection valueIndex() {
        return valueIndex(null);
    }

    public OrderResponseProjection valueIndex(String alias) {
        fields.add(new GraphQLResponseField("valueIndex").alias(alias));
        return this;
    }

    public OrderResponseProjection orderType() {
        return orderType(null);
    }

    public OrderResponseProjection orderType(String alias) {
        fields.add(new GraphQLResponseField("orderType").alias(alias));
        return this;
    }

    public OrderResponseProjection typename() {
        return typename(null);
    }

    public OrderResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
