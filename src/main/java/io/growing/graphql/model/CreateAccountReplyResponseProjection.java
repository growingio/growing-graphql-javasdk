package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreateAccountReply
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class CreateAccountReplyResponseProjection extends GraphQLResponseProjection {

    public CreateAccountReplyResponseProjection() {
    }

    @Override
    public CreateAccountReplyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreateAccountReplyResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CreateAccountReplyResponseProjection.MemberResponseProjection.account", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateAccountReplyResponseProjection.MemberResponseProjection.account", projectionDepthOnFields.getOrDefault("CreateAccountReplyResponseProjection.MemberResponseProjection.account", 0) + 1);
            this.account(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateAccountReplyResponseProjection.MemberResponseProjection.account", 0)));
        }
        this.passwordResetUri();
        this.typename();
        return this;
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
