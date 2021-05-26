package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for WebHookResponse
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class WebHookResponseResponseProjection extends GraphQLResponseProjection {

    public WebHookResponseResponseProjection() {
    }

    @Override
    public WebHookResponseResponseProjection all$() {
        return all$(3);
    }

    @Override
    public WebHookResponseResponseProjection all$(int maxDepth) {
        this.code();
        this.message();
        this.typename();
        return this;
    }

    public WebHookResponseResponseProjection code() {
        return code(null);
    }

    public WebHookResponseResponseProjection code(String alias) {
        fields.add(new GraphQLResponseField("code").alias(alias));
        return this;
    }

    public WebHookResponseResponseProjection message() {
        return message(null);
    }

    public WebHookResponseResponseProjection message(String alias) {
        fields.add(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public WebHookResponseResponseProjection typename() {
        return typename(null);
    }

    public WebHookResponseResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
