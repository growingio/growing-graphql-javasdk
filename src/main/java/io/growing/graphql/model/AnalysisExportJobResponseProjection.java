package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AnalysisExportJob
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class AnalysisExportJobResponseProjection extends GraphQLResponseProjection {

    public AnalysisExportJobResponseProjection() {
    }

    @Override
    public AnalysisExportJobResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AnalysisExportJobResponseProjection all$(int maxDepth) {
        this.id();
        this.stage();
        if (projectionDepthOnFields.getOrDefault("AnalysisExportJobResponseProjection.ErrorResponseProjection.error", 0) <= maxDepth) {
            projectionDepthOnFields.put("AnalysisExportJobResponseProjection.ErrorResponseProjection.error", projectionDepthOnFields.getOrDefault("AnalysisExportJobResponseProjection.ErrorResponseProjection.error", 0) + 1);
            this.error(new ErrorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AnalysisExportJobResponseProjection.ErrorResponseProjection.error", 0)));
        }
        this.typename();
        return this;
    }

    public AnalysisExportJobResponseProjection id() {
        return id(null);
    }

    public AnalysisExportJobResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public AnalysisExportJobResponseProjection stage() {
        return stage(null);
    }

    public AnalysisExportJobResponseProjection stage(String alias) {
        fields.add(new GraphQLResponseField("stage").alias(alias));
        return this;
    }

    public AnalysisExportJobResponseProjection error(ErrorResponseProjection subProjection) {
        return error(null, subProjection);
    }

    public AnalysisExportJobResponseProjection error(String alias, ErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("error").alias(alias).projection(subProjection));
        return this;
    }

    public AnalysisExportJobResponseProjection typename() {
        return typename(null);
    }

    public AnalysisExportJobResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
