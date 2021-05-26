package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AccountApplicationProfile
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationProfileResponseProjection extends GraphQLResponseProjection {

    public AccountApplicationProfileResponseProjection() {
    }

    @Override
    public AccountApplicationProfileResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AccountApplicationProfileResponseProjection all$(int maxDepth) {
        this.email();
        this.phone();
        this.department();
        this.explain();
        this.typename();
        return this;
    }

    public AccountApplicationProfileResponseProjection email() {
        return email(null);
    }

    public AccountApplicationProfileResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public AccountApplicationProfileResponseProjection phone() {
        return phone(null);
    }

    public AccountApplicationProfileResponseProjection phone(String alias) {
        fields.add(new GraphQLResponseField("phone").alias(alias));
        return this;
    }

    public AccountApplicationProfileResponseProjection department() {
        return department(null);
    }

    public AccountApplicationProfileResponseProjection department(String alias) {
        fields.add(new GraphQLResponseField("department").alias(alias));
        return this;
    }

    public AccountApplicationProfileResponseProjection explain() {
        return explain(null);
    }

    public AccountApplicationProfileResponseProjection explain(String alias) {
        fields.add(new GraphQLResponseField("explain").alias(alias));
        return this;
    }

    public AccountApplicationProfileResponseProjection typename() {
        return typename(null);
    }

    public AccountApplicationProfileResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
