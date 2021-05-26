package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TencentPortraitJob
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TencentPortraitJobResponseProjection extends GraphQLResponseProjection {

    public TencentPortraitJobResponseProjection() {
    }

    @Override
    public TencentPortraitJobResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TencentPortraitJobResponseProjection all$(int maxDepth) {
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
        if (projectionDepthOnFields.getOrDefault("TencentPortraitJobResponseProjection.ErrorResponseProjection.error", 0) <= maxDepth) {
            projectionDepthOnFields.put("TencentPortraitJobResponseProjection.ErrorResponseProjection.error", projectionDepthOnFields.getOrDefault("TencentPortraitJobResponseProjection.ErrorResponseProjection.error", 0) + 1);
            this.error(new ErrorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TencentPortraitJobResponseProjection.ErrorResponseProjection.error", 0)));
        }
        this.typename();
        return this;
    }

    public TencentPortraitJobResponseProjection id() {
        return id(null);
    }

    public TencentPortraitJobResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TencentPortraitJobResponseProjection name() {
        return name(null);
    }

    public TencentPortraitJobResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TencentPortraitJobResponseProjection description() {
        return description(null);
    }

    public TencentPortraitJobResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public TencentPortraitJobResponseProjection stage() {
        return stage(null);
    }

    public TencentPortraitJobResponseProjection stage(String alias) {
        fields.add(new GraphQLResponseField("stage").alias(alias));
        return this;
    }

    public TencentPortraitJobResponseProjection creatorId() {
        return creatorId(null);
    }

    public TencentPortraitJobResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public TencentPortraitJobResponseProjection createdAt() {
        return createdAt(null);
    }

    public TencentPortraitJobResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public TencentPortraitJobResponseProjection updaterId() {
        return updaterId(null);
    }

    public TencentPortraitJobResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public TencentPortraitJobResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public TencentPortraitJobResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public TencentPortraitJobResponseProjection creator() {
        return creator(null);
    }

    public TencentPortraitJobResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public TencentPortraitJobResponseProjection updater() {
        return updater(null);
    }

    public TencentPortraitJobResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public TencentPortraitJobResponseProjection error(ErrorResponseProjection subProjection) {
        return error(null, subProjection);
    }

    public TencentPortraitJobResponseProjection error(String alias, ErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("error").alias(alias).projection(subProjection));
        return this;
    }

    public TencentPortraitJobResponseProjection typename() {
        return typename(null);
    }

    public TencentPortraitJobResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
