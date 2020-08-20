package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DrillDownSegmentReply
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class DrillDownSegmentReplyResponseProjection extends GraphQLResponseProjection {

    public DrillDownSegmentReplyResponseProjection() {
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
