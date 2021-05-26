package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ComputeDefinition
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ComputeDefinitionResponseProjection extends GraphQLResponseProjection {

    public ComputeDefinitionResponseProjection() {
    }

    @Override
    public ComputeDefinitionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ComputeDefinitionResponseProjection all$(int maxDepth) {
        this.name();
        this.expression();
        if (projectionDepthOnFields.getOrDefault("ComputeDefinitionResponseProjection.ComputeDirectiveResponseProjection.directives", 0) <= maxDepth) {
            projectionDepthOnFields.put("ComputeDefinitionResponseProjection.ComputeDirectiveResponseProjection.directives", projectionDepthOnFields.getOrDefault("ComputeDefinitionResponseProjection.ComputeDirectiveResponseProjection.directives", 0) + 1);
            this.directives(new ComputeDirectiveResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ComputeDefinitionResponseProjection.ComputeDirectiveResponseProjection.directives", 0)));
        }
        this.drillDownAttrs();
        this.sql();
        this.dataUri();
        this.typename();
        return this;
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

    public ComputeDefinitionResponseProjection sql() {
        return sql(null);
    }

    public ComputeDefinitionResponseProjection sql(String alias) {
        fields.add(new GraphQLResponseField("sql").alias(alias));
        return this;
    }

    public ComputeDefinitionResponseProjection dataUri() {
        return dataUri(null);
    }

    public ComputeDefinitionResponseProjection dataUri(String alias) {
        fields.add(new GraphQLResponseField("dataUri").alias(alias));
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
