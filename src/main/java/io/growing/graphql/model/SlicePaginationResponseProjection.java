package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SlicePagination
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class SlicePaginationResponseProjection extends GraphQLResponseProjection {

    public SlicePaginationResponseProjection() {
    }

    public SlicePaginationResponseProjection offset() {
        return offset(null);
    }

    public SlicePaginationResponseProjection offset(String alias) {
        fields.add(new GraphQLResponseField("offset").alias(alias));
        return this;
    }

    public SlicePaginationResponseProjection limit() {
        return limit(null);
    }

    public SlicePaginationResponseProjection limit(String alias) {
        fields.add(new GraphQLResponseField("limit").alias(alias));
        return this;
    }

    public SlicePaginationResponseProjection totalCount() {
        return totalCount(null);
    }

    public SlicePaginationResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public SlicePaginationResponseProjection hasNextPage() {
        return hasNextPage(null);
    }

    public SlicePaginationResponseProjection hasNextPage(String alias) {
        fields.add(new GraphQLResponseField("hasNextPage").alias(alias));
        return this;
    }

    public SlicePaginationResponseProjection hasPreviousPage() {
        return hasPreviousPage(null);
    }

    public SlicePaginationResponseProjection hasPreviousPage(String alias) {
        fields.add(new GraphQLResponseField("hasPreviousPage").alias(alias));
        return this;
    }

    public SlicePaginationResponseProjection values(EntityResponseProjection subProjection) {
        return values(null, subProjection);
    }

    public SlicePaginationResponseProjection values(String alias, EntityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("values").alias(alias).projection(subProjection));
        return this;
    }

    public SlicePaginationResponseProjection typename() {
        return typename(null);
    }

    public SlicePaginationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
