package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TGIStatisticData
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TGIStatisticDataResponseProjection extends GraphQLResponseProjection {

    public TGIStatisticDataResponseProjection() {
    }

    @Override
    public TGIStatisticDataResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TGIStatisticDataResponseProjection all$(int maxDepth) {
        this.infoType();
        this.totalNum();
        this.validNum();
        this.ratio();
        this.distinctNum();
        this.typename();
        return this;
    }

    public TGIStatisticDataResponseProjection infoType() {
        return infoType(null);
    }

    public TGIStatisticDataResponseProjection infoType(String alias) {
        fields.add(new GraphQLResponseField("infoType").alias(alias));
        return this;
    }

    public TGIStatisticDataResponseProjection totalNum() {
        return totalNum(null);
    }

    public TGIStatisticDataResponseProjection totalNum(String alias) {
        fields.add(new GraphQLResponseField("totalNum").alias(alias));
        return this;
    }

    public TGIStatisticDataResponseProjection validNum() {
        return validNum(null);
    }

    public TGIStatisticDataResponseProjection validNum(String alias) {
        fields.add(new GraphQLResponseField("validNum").alias(alias));
        return this;
    }

    public TGIStatisticDataResponseProjection ratio() {
        return ratio(null);
    }

    public TGIStatisticDataResponseProjection ratio(String alias) {
        fields.add(new GraphQLResponseField("ratio").alias(alias));
        return this;
    }

    public TGIStatisticDataResponseProjection distinctNum() {
        return distinctNum(null);
    }

    public TGIStatisticDataResponseProjection distinctNum(String alias) {
        fields.add(new GraphQLResponseField("distinctNum").alias(alias));
        return this;
    }

    public TGIStatisticDataResponseProjection typename() {
        return typename(null);
    }

    public TGIStatisticDataResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
