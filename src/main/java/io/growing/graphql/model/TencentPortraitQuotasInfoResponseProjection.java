package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TencentPortraitQuotasInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TencentPortraitQuotasInfoResponseProjection extends GraphQLResponseProjection {

    public TencentPortraitQuotasInfoResponseProjection() {
    }

    @Override
    public TencentPortraitQuotasInfoResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TencentPortraitQuotasInfoResponseProjection all$(int maxDepth) {
        this.totalQuotas();
        this.remainingQuotas();
        this.typename();
        return this;
    }

    public TencentPortraitQuotasInfoResponseProjection totalQuotas() {
        return totalQuotas(null);
    }

    public TencentPortraitQuotasInfoResponseProjection totalQuotas(String alias) {
        fields.add(new GraphQLResponseField("totalQuotas").alias(alias));
        return this;
    }

    public TencentPortraitQuotasInfoResponseProjection remainingQuotas() {
        return remainingQuotas(null);
    }

    public TencentPortraitQuotasInfoResponseProjection remainingQuotas(String alias) {
        fields.add(new GraphQLResponseField("remainingQuotas").alias(alias));
        return this;
    }

    public TencentPortraitQuotasInfoResponseProjection typename() {
        return typename(null);
    }

    public TencentPortraitQuotasInfoResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
