package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Expression
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ExpressionResponseProjection extends GraphQLResponseProjection {

    public ExpressionResponseProjection() {
    }

    @Override
    public ExpressionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ExpressionResponseProjection all$(int maxDepth) {
        this.op();
        if (projectionDepthOnFields.getOrDefault("ExpressionResponseProjection.ExpressionResponseProjection.exprs", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExpressionResponseProjection.ExpressionResponseProjection.exprs", projectionDepthOnFields.getOrDefault("ExpressionResponseProjection.ExpressionResponseProjection.exprs", 0) + 1);
            this.exprs(new ExpressionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExpressionResponseProjection.ExpressionResponseProjection.exprs", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ExpressionResponseProjection.MeasurementResponseProjection.measurements", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExpressionResponseProjection.MeasurementResponseProjection.measurements", projectionDepthOnFields.getOrDefault("ExpressionResponseProjection.MeasurementResponseProjection.measurements", 0) + 1);
            this.measurements(new MeasurementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExpressionResponseProjection.MeasurementResponseProjection.measurements", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ExpressionResponseProjection.OlapMetricResponseProjection.metrics", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExpressionResponseProjection.OlapMetricResponseProjection.metrics", projectionDepthOnFields.getOrDefault("ExpressionResponseProjection.OlapMetricResponseProjection.metrics", 0) + 1);
            this.metrics(new OlapMetricResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExpressionResponseProjection.OlapMetricResponseProjection.metrics", 0)));
        }
        this.expression();
        this.format();
        this.typename();
        return this;
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

    public ExpressionResponseProjection metrics(OlapMetricResponseProjection subProjection) {
        return metrics(null, subProjection);
    }

    public ExpressionResponseProjection metrics(String alias, OlapMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metrics").alias(alias).projection(subProjection));
        return this;
    }

    public ExpressionResponseProjection expression() {
        return expression(null);
    }

    public ExpressionResponseProjection expression(String alias) {
        fields.add(new GraphQLResponseField("expression").alias(alias));
        return this;
    }

    public ExpressionResponseProjection format() {
        return format(null);
    }

    public ExpressionResponseProjection format(String alias) {
        fields.add(new GraphQLResponseField("format").alias(alias));
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
