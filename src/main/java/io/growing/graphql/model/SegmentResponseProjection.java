package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Segment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class SegmentResponseProjection extends GraphQLResponseProjection {

    public SegmentResponseProjection() {
    }

    @Override
    public SegmentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SegmentResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("SegmentResponseProjection.ComputeDefinitionResponseProjection.compute", 0) <= maxDepth) {
            projectionDepthOnFields.put("SegmentResponseProjection.ComputeDefinitionResponseProjection.compute", projectionDepthOnFields.getOrDefault("SegmentResponseProjection.ComputeDefinitionResponseProjection.compute", 0) + 1);
            this.compute(new ComputeDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SegmentResponseProjection.ComputeDefinitionResponseProjection.compute", 0)));
        }
        this.scheduler();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.createdBy();
        if (projectionDepthOnFields.getOrDefault("SegmentResponseProjection.DetectorResponseProjection.detector", 0) <= maxDepth) {
            projectionDepthOnFields.put("SegmentResponseProjection.DetectorResponseProjection.detector", projectionDepthOnFields.getOrDefault("SegmentResponseProjection.DetectorResponseProjection.detector", 0) + 1);
            this.detector(new DetectorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SegmentResponseProjection.DetectorResponseProjection.detector", 0)));
        }
        this.ownerId();
        this.typename();
        return this;
    }

    public SegmentResponseProjection id() {
        return id(null);
    }

    public SegmentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SegmentResponseProjection name() {
        return name(null);
    }

    public SegmentResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public SegmentResponseProjection description() {
        return description(null);
    }

    public SegmentResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public SegmentResponseProjection compute(ComputeDefinitionResponseProjection subProjection) {
        return compute(null, subProjection);
    }

    public SegmentResponseProjection compute(String alias, ComputeDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("compute").alias(alias).projection(subProjection));
        return this;
    }

    public SegmentResponseProjection scheduler() {
        return scheduler(null);
    }

    public SegmentResponseProjection scheduler(String alias) {
        fields.add(new GraphQLResponseField("scheduler").alias(alias));
        return this;
    }

    public SegmentResponseProjection creatorId() {
        return creatorId(null);
    }

    public SegmentResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public SegmentResponseProjection createdAt() {
        return createdAt(null);
    }

    public SegmentResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public SegmentResponseProjection updaterId() {
        return updaterId(null);
    }

    public SegmentResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public SegmentResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public SegmentResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public SegmentResponseProjection creator() {
        return creator(null);
    }

    public SegmentResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public SegmentResponseProjection updater() {
        return updater(null);
    }

    public SegmentResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public SegmentResponseProjection createdBy() {
        return createdBy(null);
    }

    public SegmentResponseProjection createdBy(String alias) {
        fields.add(new GraphQLResponseField("createdBy").alias(alias));
        return this;
    }

    public SegmentResponseProjection detector(DetectorResponseProjection subProjection) {
        return detector(null, subProjection);
    }

    public SegmentResponseProjection detector(String alias, DetectorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("detector").alias(alias).projection(subProjection));
        return this;
    }

    public SegmentResponseProjection ownerId() {
        return ownerId(null);
    }

    public SegmentResponseProjection ownerId(String alias) {
        fields.add(new GraphQLResponseField("ownerId").alias(alias));
        return this;
    }

    public SegmentResponseProjection typename() {
        return typename(null);
    }

    public SegmentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
