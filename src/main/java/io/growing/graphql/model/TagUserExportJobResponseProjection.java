package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TagUserExportJob
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class TagUserExportJobResponseProjection extends GraphQLResponseProjection {

    public TagUserExportJobResponseProjection() {
    }

    @Override
    public TagUserExportJobResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TagUserExportJobResponseProjection all$(int maxDepth) {
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
        if (projectionDepthOnFields.getOrDefault("TagUserExportJobResponseProjection.ErrorResponseProjection.error", 0) <= maxDepth) {
            projectionDepthOnFields.put("TagUserExportJobResponseProjection.ErrorResponseProjection.error", projectionDepthOnFields.getOrDefault("TagUserExportJobResponseProjection.ErrorResponseProjection.error", 0) + 1);
            this.error(new ErrorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TagUserExportJobResponseProjection.ErrorResponseProjection.error", 0)));
        }
        this.typename();
        return this;
    }

    public TagUserExportJobResponseProjection id() {
        return id(null);
    }

    public TagUserExportJobResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TagUserExportJobResponseProjection name() {
        return name(null);
    }

    public TagUserExportJobResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TagUserExportJobResponseProjection description() {
        return description(null);
    }

    public TagUserExportJobResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public TagUserExportJobResponseProjection stage() {
        return stage(null);
    }

    public TagUserExportJobResponseProjection stage(String alias) {
        fields.add(new GraphQLResponseField("stage").alias(alias));
        return this;
    }

    public TagUserExportJobResponseProjection creatorId() {
        return creatorId(null);
    }

    public TagUserExportJobResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public TagUserExportJobResponseProjection createdAt() {
        return createdAt(null);
    }

    public TagUserExportJobResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public TagUserExportJobResponseProjection updaterId() {
        return updaterId(null);
    }

    public TagUserExportJobResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public TagUserExportJobResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public TagUserExportJobResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public TagUserExportJobResponseProjection creator() {
        return creator(null);
    }

    public TagUserExportJobResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public TagUserExportJobResponseProjection updater() {
        return updater(null);
    }

    public TagUserExportJobResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public TagUserExportJobResponseProjection error(ErrorResponseProjection subProjection) {
        return error(null, subProjection);
    }

    public TagUserExportJobResponseProjection error(String alias, ErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("error").alias(alias).projection(subProjection));
        return this;
    }

    public TagUserExportJobResponseProjection typename() {
        return typename(null);
    }

    public TagUserExportJobResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
