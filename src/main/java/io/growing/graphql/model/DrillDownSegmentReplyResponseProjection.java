package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DrillDownSegmentReply
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class DrillDownSegmentReplyResponseProjection extends GraphQLResponseProjection {

    public DrillDownSegmentReplyResponseProjection() {
    }

    @Override
    public DrillDownSegmentReplyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DrillDownSegmentReplyResponseProjection all$(int maxDepth) {
        this.id();
        this.typename();
        return this;
    }

    public DrillDownSegmentReplyResponseProjection id() {
        return id(null);
    }

    public DrillDownSegmentReplyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DrillDownSegmentReplyResponseProjection typename() {
        return typename(null);
    }

    public DrillDownSegmentReplyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
