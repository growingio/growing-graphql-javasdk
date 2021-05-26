package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SegmentSnapshot
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class SegmentSnapshotResponseProjection extends GraphQLResponseProjection {

    public SegmentSnapshotResponseProjection() {
    }

    @Override
    public SegmentSnapshotResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SegmentSnapshotResponseProjection all$(int maxDepth) {
        this.id();
        this.totalUsers();
        this.usersRatio();
        this.typename();
        return this;
    }

    public SegmentSnapshotResponseProjection id() {
        return id(null);
    }

    public SegmentSnapshotResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SegmentSnapshotResponseProjection totalUsers() {
        return totalUsers(null);
    }

    public SegmentSnapshotResponseProjection totalUsers(String alias) {
        fields.add(new GraphQLResponseField("totalUsers").alias(alias));
        return this;
    }

    public SegmentSnapshotResponseProjection usersRatio() {
        return usersRatio(null);
    }

    public SegmentSnapshotResponseProjection usersRatio(String alias) {
        fields.add(new GraphQLResponseField("usersRatio").alias(alias));
        return this;
    }

    public SegmentSnapshotResponseProjection typename() {
        return typename(null);
    }

    public SegmentSnapshotResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
