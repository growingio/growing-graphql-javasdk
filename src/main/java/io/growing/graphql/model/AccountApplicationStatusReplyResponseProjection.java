package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AccountApplicationStatusReply
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationStatusReplyResponseProjection extends GraphQLResponseProjection {

    public AccountApplicationStatusReplyResponseProjection() {
    }

    @Override
    public AccountApplicationStatusReplyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AccountApplicationStatusReplyResponseProjection all$(int maxDepth) {
        this.status();
        this.typename();
        return this;
    }

    public AccountApplicationStatusReplyResponseProjection status() {
        return status(null);
    }

    public AccountApplicationStatusReplyResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public AccountApplicationStatusReplyResponseProjection typename() {
        return typename(null);
    }

    public AccountApplicationStatusReplyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
