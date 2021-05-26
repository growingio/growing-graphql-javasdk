package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AlertDetails
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AlertDetailsResponseProjection extends GraphQLResponseProjection {

    public AlertDetailsResponseProjection() {
    }

    @Override
    public AlertDetailsResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AlertDetailsResponseProjection all$(int maxDepth) {
        this.op();
        this.values();
        this.alias();
        this.typename();
        return this;
    }

    public AlertDetailsResponseProjection op() {
        return op(null);
    }

    public AlertDetailsResponseProjection op(String alias) {
        fields.add(new GraphQLResponseField("op").alias(alias));
        return this;
    }

    public AlertDetailsResponseProjection values() {
        return values(null);
    }

    public AlertDetailsResponseProjection values(String alias) {
        fields.add(new GraphQLResponseField("values").alias(alias));
        return this;
    }

    public AlertDetailsResponseProjection alias() {
        return alias(null);
    }

    public AlertDetailsResponseProjection alias(String alias) {
        fields.add(new GraphQLResponseField("alias").alias(alias));
        return this;
    }

    public AlertDetailsResponseProjection typename() {
        return typename(null);
    }

    public AlertDetailsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
