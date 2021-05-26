package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AlertCharts
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AlertChartsResponseProjection extends GraphQLResponseProjection {

    public AlertChartsResponseProjection() {
    }

    @Override
    public AlertChartsResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AlertChartsResponseProjection all$(int maxDepth) {
        this.expression();
        if (projectionDepthOnFields.getOrDefault("AlertChartsResponseProjection.AlertMetricResponseProjection.alerts", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlertChartsResponseProjection.AlertMetricResponseProjection.alerts", projectionDepthOnFields.getOrDefault("AlertChartsResponseProjection.AlertMetricResponseProjection.alerts", 0) + 1);
            this.alerts(new AlertMetricResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlertChartsResponseProjection.AlertMetricResponseProjection.alerts", 0)));
        }
        this.typename();
        return this;
    }

    public AlertChartsResponseProjection expression() {
        return expression(null);
    }

    public AlertChartsResponseProjection expression(String alias) {
        fields.add(new GraphQLResponseField("expression").alias(alias));
        return this;
    }

    public AlertChartsResponseProjection alerts(AlertMetricResponseProjection subProjection) {
        return alerts(null, subProjection);
    }

    public AlertChartsResponseProjection alerts(String alias, AlertMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("alerts").alias(alias).projection(subProjection));
        return this;
    }

    public AlertChartsResponseProjection typename() {
        return typename(null);
    }

    public AlertChartsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
