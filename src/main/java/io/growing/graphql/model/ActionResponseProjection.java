package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Action
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class ActionResponseProjection extends GraphQLResponseProjection {

    public ActionResponseProjection() {
    }

    @Override
    public ActionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ActionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ActionResponseProjection.MeasurementResponseProjection.measurement", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionResponseProjection.MeasurementResponseProjection.measurement", projectionDepthOnFields.getOrDefault("ActionResponseProjection.MeasurementResponseProjection.measurement", 0) + 1);
            this.measurement(new MeasurementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionResponseProjection.MeasurementResponseProjection.measurement", 0)));
        }
        this.excluded();
        this.eventType();
        this.typename();
        return this;
    }

    public ActionResponseProjection measurement(MeasurementResponseProjection subProjection) {
        return measurement(null, subProjection);
    }

    public ActionResponseProjection measurement(String alias, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("measurement").alias(alias).projection(subProjection));
        return this;
    }

    public ActionResponseProjection excluded() {
        return excluded(null);
    }

    public ActionResponseProjection excluded(String alias) {
        fields.add(new GraphQLResponseField("excluded").alias(alias));
        return this;
    }

    public ActionResponseProjection eventType() {
        return eventType(null);
    }

    public ActionResponseProjection eventType(String alias) {
        fields.add(new GraphQLResponseField("eventType").alias(alias));
        return this;
    }

    public ActionResponseProjection typename() {
        return typename(null);
    }

    public ActionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
