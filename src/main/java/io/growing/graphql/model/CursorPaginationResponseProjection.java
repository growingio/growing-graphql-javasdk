package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CursorPagination
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class CursorPaginationResponseProjection extends GraphQLResponseProjection {

    public CursorPaginationResponseProjection() {
    }

    @Override
    public CursorPaginationResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CursorPaginationResponseProjection all$(int maxDepth) {
        this.totalCount();
        this.startCursor();
        this.endCursor();
        this.hasNextPage();
        this.hasPreviousPage();
        if (projectionDepthOnFields.getOrDefault("CursorPaginationResponseProjection.EntityResponseProjection.values", 0) <= maxDepth) {
            projectionDepthOnFields.put("CursorPaginationResponseProjection.EntityResponseProjection.values", projectionDepthOnFields.getOrDefault("CursorPaginationResponseProjection.EntityResponseProjection.values", 0) + 1);
            this.values(new EntityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CursorPaginationResponseProjection.EntityResponseProjection.values", 0)));
        }
        this.typename();
        return this;
    }

    public CursorPaginationResponseProjection totalCount() {
        return totalCount(null);
    }

    public CursorPaginationResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CursorPaginationResponseProjection startCursor() {
        return startCursor(null);
    }

    public CursorPaginationResponseProjection startCursor(String alias) {
        fields.add(new GraphQLResponseField("startCursor").alias(alias));
        return this;
    }

    public CursorPaginationResponseProjection endCursor() {
        return endCursor(null);
    }

    public CursorPaginationResponseProjection endCursor(String alias) {
        fields.add(new GraphQLResponseField("endCursor").alias(alias));
        return this;
    }

    public CursorPaginationResponseProjection hasNextPage() {
        return hasNextPage(null);
    }

    public CursorPaginationResponseProjection hasNextPage(String alias) {
        fields.add(new GraphQLResponseField("hasNextPage").alias(alias));
        return this;
    }

    public CursorPaginationResponseProjection hasPreviousPage() {
        return hasPreviousPage(null);
    }

    public CursorPaginationResponseProjection hasPreviousPage(String alias) {
        fields.add(new GraphQLResponseField("hasPreviousPage").alias(alias));
        return this;
    }

    public CursorPaginationResponseProjection values(EntityResponseProjection subProjection) {
        return values(null, subProjection);
    }

    public CursorPaginationResponseProjection values(String alias, EntityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("values").alias(alias).projection(subProjection));
        return this;
    }

    public CursorPaginationResponseProjection typename() {
        return typename(null);
    }

    public CursorPaginationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
