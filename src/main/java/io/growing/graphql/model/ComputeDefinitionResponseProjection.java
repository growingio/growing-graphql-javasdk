package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ComputeDefinition
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class ComputeDefinitionResponseProjection extends GraphQLResponseProjection {

    public ComputeDefinitionResponseProjection() {
    }

    public ComputeDefinitionResponseProjection name() {
        return name(null);
    }

    public ComputeDefinitionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ComputeDefinitionResponseProjection expression() {
        return expression(null);
    }

    public ComputeDefinitionResponseProjection expression(String alias) {
        fields.add(new GraphQLResponseField("expression").alias(alias));
        return this;
    }

    public ComputeDefinitionResponseProjection directives(ComputeDirectiveResponseProjection subProjection) {
        return directives(null, subProjection);
    }

    public ComputeDefinitionResponseProjection directives(String alias, ComputeDirectiveResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("directives").alias(alias).projection(subProjection));
        return this;
    }

    public ComputeDefinitionResponseProjection drillDownAttrs() {
        return drillDownAttrs(null);
    }

    public ComputeDefinitionResponseProjection drillDownAttrs(String alias) {
        fields.add(new GraphQLResponseField("drillDownAttrs").alias(alias));
        return this;
    }

    public ComputeDefinitionResponseProjection typename() {
        return typename(null);
    }

    public ComputeDefinitionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
