package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreateAccountReply
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class CreateAccountReplyResponseProjection extends GraphQLResponseProjection {

    public CreateAccountReplyResponseProjection() {
    }

    public CreateAccountReplyResponseProjection account(MemberResponseProjection subProjection) {
        return account(null, subProjection);
    }

    public CreateAccountReplyResponseProjection account(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("account").alias(alias).projection(subProjection));
        return this;
    }

    public CreateAccountReplyResponseProjection passwordResetUri() {
        return passwordResetUri(null);
    }

    public CreateAccountReplyResponseProjection passwordResetUri(String alias) {
        fields.add(new GraphQLResponseField("passwordResetUri").alias(alias));
        return this;
    }

    public CreateAccountReplyResponseProjection typename() {
        return typename(null);
    }

    public CreateAccountReplyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
