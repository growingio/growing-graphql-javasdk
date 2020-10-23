package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DrillDownSegmentSnapshotReply
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class DrillDownSegmentSnapshotReplyResponseProjection extends GraphQLResponseProjection {

    public DrillDownSegmentSnapshotReplyResponseProjection() {
    }

    @Override
    public DrillDownSegmentSnapshotReplyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DrillDownSegmentSnapshotReplyResponseProjection all$(int maxDepth) {
        this.id();
        this.typename();
        return this;
    }

    public DrillDownSegmentSnapshotReplyResponseProjection id() {
        return id(null);
    }

    public DrillDownSegmentSnapshotReplyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DrillDownSegmentSnapshotReplyResponseProjection typename() {
        return typename(null);
    }

    public DrillDownSegmentSnapshotReplyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
