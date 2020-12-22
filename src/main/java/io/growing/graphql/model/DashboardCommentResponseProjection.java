package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DashboardComment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class DashboardCommentResponseProjection extends GraphQLResponseProjection {

    public DashboardCommentResponseProjection() {
    }

    @Override
    public DashboardCommentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DashboardCommentResponseProjection all$(int maxDepth) {
        this.id();
        this.title();
        this.detail();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.typename();
        return this;
    }

    public DashboardCommentResponseProjection id() {
        return id(null);
    }

    public DashboardCommentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DashboardCommentResponseProjection title() {
        return title(null);
    }

    public DashboardCommentResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public DashboardCommentResponseProjection detail() {
        return detail(null);
    }

    public DashboardCommentResponseProjection detail(String alias) {
        fields.add(new GraphQLResponseField("detail").alias(alias));
        return this;
    }

    public DashboardCommentResponseProjection creatorId() {
        return creatorId(null);
    }

    public DashboardCommentResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public DashboardCommentResponseProjection createdAt() {
        return createdAt(null);
    }

    public DashboardCommentResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public DashboardCommentResponseProjection updaterId() {
        return updaterId(null);
    }

    public DashboardCommentResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public DashboardCommentResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public DashboardCommentResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public DashboardCommentResponseProjection typename() {
        return typename(null);
    }

    public DashboardCommentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
