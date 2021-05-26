package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for NoticeInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class NoticeInfoResponseProjection extends GraphQLResponseProjection {

    public NoticeInfoResponseProjection() {
    }

    @Override
    public NoticeInfoResponseProjection all$() {
        return all$(3);
    }

    @Override
    public NoticeInfoResponseProjection all$(int maxDepth) {
        this.type();
        this.receivers();
        this.typename();
        return this;
    }

    public NoticeInfoResponseProjection type() {
        return type(null);
    }

    public NoticeInfoResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public NoticeInfoResponseProjection receivers() {
        return receivers(null);
    }

    public NoticeInfoResponseProjection receivers(String alias) {
        fields.add(new GraphQLResponseField("receivers").alias(alias));
        return this;
    }

    public NoticeInfoResponseProjection typename() {
        return typename(null);
    }

    public NoticeInfoResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
