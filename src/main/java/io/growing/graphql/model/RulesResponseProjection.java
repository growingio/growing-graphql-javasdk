package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Rules
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class RulesResponseProjection extends GraphQLResponseProjection {

    public RulesResponseProjection() {
    }

    @Override
    public RulesResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RulesResponseProjection all$(int maxDepth) {
        this.expression();
        if (projectionDepthOnFields.getOrDefault("RulesResponseProjection.AlertDetailsResponseProjection.details", 0) <= maxDepth) {
            projectionDepthOnFields.put("RulesResponseProjection.AlertDetailsResponseProjection.details", projectionDepthOnFields.getOrDefault("RulesResponseProjection.AlertDetailsResponseProjection.details", 0) + 1);
            this.details(new AlertDetailsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RulesResponseProjection.AlertDetailsResponseProjection.details", 0)));
        }
        this.typename();
        return this;
    }

    public RulesResponseProjection expression() {
        return expression(null);
    }

    public RulesResponseProjection expression(String alias) {
        fields.add(new GraphQLResponseField("expression").alias(alias));
        return this;
    }

    public RulesResponseProjection details(AlertDetailsResponseProjection subProjection) {
        return details(null, subProjection);
    }

    public RulesResponseProjection details(String alias, AlertDetailsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("details").alias(alias).projection(subProjection));
        return this;
    }

    public RulesResponseProjection typename() {
        return typename(null);
    }

    public RulesResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
