package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CircleQrcode
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class CircleQrcodeResponseProjection extends GraphQLResponseProjection {

    public CircleQrcodeResponseProjection() {
    }

    @Override
    public CircleQrcodeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CircleQrcodeResponseProjection all$(int maxDepth) {
        this.qrcodeUrl();
        this.wsUrl();
        this.typename();
        return this;
    }

    public CircleQrcodeResponseProjection qrcodeUrl() {
        return qrcodeUrl(null);
    }

    public CircleQrcodeResponseProjection qrcodeUrl(String alias) {
        fields.add(new GraphQLResponseField("qrcodeUrl").alias(alias));
        return this;
    }

    public CircleQrcodeResponseProjection wsUrl() {
        return wsUrl(null);
    }

    public CircleQrcodeResponseProjection wsUrl(String alias) {
        fields.add(new GraphQLResponseField("wsUrl").alias(alias));
        return this;
    }

    public CircleQrcodeResponseProjection typename() {
        return typename(null);
    }

    public CircleQrcodeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
