package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AccountApplicationSetting
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationSettingResponseProjection extends GraphQLResponseProjection {

    public AccountApplicationSettingResponseProjection() {
    }

    @Override
    public AccountApplicationSettingResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AccountApplicationSettingResponseProjection all$(int maxDepth) {
        this.enabled();
        if (projectionDepthOnFields.getOrDefault("AccountApplicationSettingResponseProjection.AccountApplicationFormFieldResponseProjection.accountApplicationFormFields", 0) <= maxDepth) {
            projectionDepthOnFields.put("AccountApplicationSettingResponseProjection.AccountApplicationFormFieldResponseProjection.accountApplicationFormFields", projectionDepthOnFields.getOrDefault("AccountApplicationSettingResponseProjection.AccountApplicationFormFieldResponseProjection.accountApplicationFormFields", 0) + 1);
            this.accountApplicationFormFields(new AccountApplicationFormFieldResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AccountApplicationSettingResponseProjection.AccountApplicationFormFieldResponseProjection.accountApplicationFormFields", 0)));
        }
        this.typename();
        return this;
    }

    public AccountApplicationSettingResponseProjection enabled() {
        return enabled(null);
    }

    public AccountApplicationSettingResponseProjection enabled(String alias) {
        fields.add(new GraphQLResponseField("enabled").alias(alias));
        return this;
    }

    public AccountApplicationSettingResponseProjection accountApplicationFormFields(AccountApplicationFormFieldResponseProjection subProjection) {
        return accountApplicationFormFields(null, subProjection);
    }

    public AccountApplicationSettingResponseProjection accountApplicationFormFields(String alias, AccountApplicationFormFieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("accountApplicationFormFields").alias(alias).projection(subProjection));
        return this;
    }

    public AccountApplicationSettingResponseProjection typename() {
        return typename(null);
    }

    public AccountApplicationSettingResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
