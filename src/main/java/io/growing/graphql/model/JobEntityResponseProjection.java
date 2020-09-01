package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for JobEntity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class JobEntityResponseProjection extends GraphQLResponseProjection {

    public JobEntityResponseProjection() {
    }

    @Override
    public JobEntityResponseProjection all$() {
        return all$(3);
    }

    @Override
    public JobEntityResponseProjection all$(int maxDepth) {
        this.id();
        this.stage();
        if (projectionDepthOnFields.getOrDefault("JobEntityResponseProjection.ErrorResponseProjection.error", 0) <= maxDepth) {
            projectionDepthOnFields.put("JobEntityResponseProjection.ErrorResponseProjection.error", projectionDepthOnFields.getOrDefault("JobEntityResponseProjection.ErrorResponseProjection.error", 0) + 1);
            this.error(new ErrorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("JobEntityResponseProjection.ErrorResponseProjection.error", 0)));
        }
        this.typename();
        return this;
    }

    public JobEntityResponseProjection id() {
        return id(null);
    }

    public JobEntityResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public JobEntityResponseProjection stage() {
        return stage(null);
    }

    public JobEntityResponseProjection stage(String alias) {
        fields.add(new GraphQLResponseField("stage").alias(alias));
        return this;
    }

    public JobEntityResponseProjection error(ErrorResponseProjection subProjection) {
        return error(null, subProjection);
    }

    public JobEntityResponseProjection error(String alias, ErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("error").alias(alias).projection(subProjection));
        return this;
    }

    public JobEntityResponseProjection onAnalysisExportJob(AnalysisExportJobResponseProjection subProjection) {
        return onAnalysisExportJob(null, subProjection);
    }

    public JobEntityResponseProjection onAnalysisExportJob(String alias, AnalysisExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AnalysisExportJob").alias(alias).projection(subProjection));
        return this;
    }

    public JobEntityResponseProjection onTagUserExportJob(TagUserExportJobResponseProjection subProjection) {
        return onTagUserExportJob(null, subProjection);
    }

    public JobEntityResponseProjection onTagUserExportJob(String alias, TagUserExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on TagUserExportJob").alias(alias).projection(subProjection));
        return this;
    }

    public JobEntityResponseProjection onSegmentUserExportJob(SegmentUserExportJobResponseProjection subProjection) {
        return onSegmentUserExportJob(null, subProjection);
    }

    public JobEntityResponseProjection onSegmentUserExportJob(String alias, SegmentUserExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SegmentUserExportJob").alias(alias).projection(subProjection));
        return this;
    }

    public JobEntityResponseProjection typename() {
        return typename(null);
    }

    public JobEntityResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
