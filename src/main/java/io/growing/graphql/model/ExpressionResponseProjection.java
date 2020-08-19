package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Expression
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class ExpressionResponseProjection extends GraphQLResponseProjection {

    public ExpressionResponseProjection() {
    }

    public ExpressionResponseProjection op() {
        return op(null);
    }

    public ExpressionResponseProjection op(String alias) {
        fields.add(new GraphQLResponseField("op").alias(alias));
        return this;
    }

    public ExpressionResponseProjection exprs(ExpressionResponseProjection subProjection) {
        return exprs(null, subProjection);
    }

    public ExpressionResponseProjection exprs(String alias, ExpressionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("exprs").alias(alias).projection(subProjection));
        return this;
    }

    public ExpressionResponseProjection measurements(MeasurementResponseProjection subProjection) {
        return measurements(null, subProjection);
    }

    public ExpressionResponseProjection measurements(String alias, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("measurements").alias(alias).projection(subProjection));
        return this;
    }

    public ExpressionResponseProjection typename() {
        return typename(null);
    }

    public ExpressionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
