package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DebuggerQrcode
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DebuggerQrcodeResponseProjection extends GraphQLResponseProjection {

    public DebuggerQrcodeResponseProjection() {
    }

    @Override
    public DebuggerQrcodeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DebuggerQrcodeResponseProjection all$(int maxDepth) {
        this.qrcodeUrl();
        this.wsUrl();
        this.typename();
        return this;
    }

    public DebuggerQrcodeResponseProjection qrcodeUrl() {
        return qrcodeUrl(null);
    }

    public DebuggerQrcodeResponseProjection qrcodeUrl(String alias) {
        fields.add(new GraphQLResponseField("qrcodeUrl").alias(alias));
        return this;
    }

    public DebuggerQrcodeResponseProjection wsUrl() {
        return wsUrl(null);
    }

    public DebuggerQrcodeResponseProjection wsUrl(String alias) {
        fields.add(new GraphQLResponseField("wsUrl").alias(alias));
        return this;
    }

    public DebuggerQrcodeResponseProjection typename() {
        return typename(null);
    }

    public DebuggerQrcodeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
