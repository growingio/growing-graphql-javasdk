package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SegmentUserExportJob
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class SegmentUserExportJobResponseProjection extends GraphQLResponseProjection {

    public SegmentUserExportJobResponseProjection() {
    }

    @Override
    public SegmentUserExportJobResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SegmentUserExportJobResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        this.stage();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        if (projectionDepthOnFields.getOrDefault("SegmentUserExportJobResponseProjection.ErrorResponseProjection.error", 0) <= maxDepth) {
            projectionDepthOnFields.put("SegmentUserExportJobResponseProjection.ErrorResponseProjection.error", projectionDepthOnFields.getOrDefault("SegmentUserExportJobResponseProjection.ErrorResponseProjection.error", 0) + 1);
            this.error(new ErrorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SegmentUserExportJobResponseProjection.ErrorResponseProjection.error", 0)));
        }
        this.typename();
        return this;
    }

    public SegmentUserExportJobResponseProjection id() {
        return id(null);
    }

    public SegmentUserExportJobResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SegmentUserExportJobResponseProjection name() {
        return name(null);
    }

    public SegmentUserExportJobResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public SegmentUserExportJobResponseProjection description() {
        return description(null);
    }

    public SegmentUserExportJobResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public SegmentUserExportJobResponseProjection stage() {
        return stage(null);
    }

    public SegmentUserExportJobResponseProjection stage(String alias) {
        fields.add(new GraphQLResponseField("stage").alias(alias));
        return this;
    }

    public SegmentUserExportJobResponseProjection creatorId() {
        return creatorId(null);
    }

    public SegmentUserExportJobResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public SegmentUserExportJobResponseProjection createdAt() {
        return createdAt(null);
    }

    public SegmentUserExportJobResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public SegmentUserExportJobResponseProjection updaterId() {
        return updaterId(null);
    }

    public SegmentUserExportJobResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public SegmentUserExportJobResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public SegmentUserExportJobResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public SegmentUserExportJobResponseProjection creator() {
        return creator(null);
    }

    public SegmentUserExportJobResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public SegmentUserExportJobResponseProjection updater() {
        return updater(null);
    }

    public SegmentUserExportJobResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public SegmentUserExportJobResponseProjection error(ErrorResponseProjection subProjection) {
        return error(null, subProjection);
    }

    public SegmentUserExportJobResponseProjection error(String alias, ErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("error").alias(alias).projection(subProjection));
        return this;
    }

    public SegmentUserExportJobResponseProjection typename() {
        return typename(null);
    }

    public SegmentUserExportJobResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
