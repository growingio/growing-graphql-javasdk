package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AccountApplicationFormField
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationFormFieldResponseProjection extends GraphQLResponseProjection {

    public AccountApplicationFormFieldResponseProjection() {
    }

    @Override
    public AccountApplicationFormFieldResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AccountApplicationFormFieldResponseProjection all$(int maxDepth) {
        this.name();
        this.key();
        this.enabled();
        this.optional();
        this.typename();
        return this;
    }

    public AccountApplicationFormFieldResponseProjection name() {
        return name(null);
    }

    public AccountApplicationFormFieldResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public AccountApplicationFormFieldResponseProjection key() {
        return key(null);
    }

    public AccountApplicationFormFieldResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public AccountApplicationFormFieldResponseProjection enabled() {
        return enabled(null);
    }

    public AccountApplicationFormFieldResponseProjection enabled(String alias) {
        fields.add(new GraphQLResponseField("enabled").alias(alias));
        return this;
    }

    public AccountApplicationFormFieldResponseProjection optional() {
        return optional(null);
    }

    public AccountApplicationFormFieldResponseProjection optional(String alias) {
        fields.add(new GraphQLResponseField("optional").alias(alias));
        return this;
    }

    public AccountApplicationFormFieldResponseProjection typename() {
        return typename(null);
    }

    public AccountApplicationFormFieldResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
