package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CursorPagination
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class CursorPaginationResponseProjection extends GraphQLResponseProjection {

    public CursorPaginationResponseProjection() {
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
