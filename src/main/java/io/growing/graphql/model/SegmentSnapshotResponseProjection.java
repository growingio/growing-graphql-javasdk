package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SegmentSnapshot
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class SegmentSnapshotResponseProjection extends GraphQLResponseProjection {

    public SegmentSnapshotResponseProjection() {
    }

    public SegmentSnapshotResponseProjection id() {
        return id(null);
    }

    public SegmentSnapshotResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SegmentSnapshotResponseProjection projectId() {
        return projectId(null);
    }

    public SegmentSnapshotResponseProjection projectId(String alias) {
        fields.add(new GraphQLResponseField("projectId").alias(alias));
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
