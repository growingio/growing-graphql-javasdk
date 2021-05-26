package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PreparedSegment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class PreparedSegmentResponseProjection extends GraphQLResponseProjection {

    public PreparedSegmentResponseProjection() {
    }

    @Override
    public PreparedSegmentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PreparedSegmentResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("PreparedSegmentResponseProjection.DetectorResponseProjection.detector", 0) <= maxDepth) {
            projectionDepthOnFields.put("PreparedSegmentResponseProjection.DetectorResponseProjection.detector", projectionDepthOnFields.getOrDefault("PreparedSegmentResponseProjection.DetectorResponseProjection.detector", 0) + 1);
            this.detector(new DetectorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PreparedSegmentResponseProjection.DetectorResponseProjection.detector", 0)));
        }
        this.typename();
        return this;
    }

    public PreparedSegmentResponseProjection id() {
        return id(null);
    }

    public PreparedSegmentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PreparedSegmentResponseProjection name() {
        return name(null);
    }

    public PreparedSegmentResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PreparedSegmentResponseProjection detector(DetectorResponseProjection subProjection) {
        return detector(null, subProjection);
    }

    public PreparedSegmentResponseProjection detector(String alias, DetectorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("detector").alias(alias).projection(subProjection));
        return this;
    }

    public PreparedSegmentResponseProjection typename() {
        return typename(null);
    }

    public PreparedSegmentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
