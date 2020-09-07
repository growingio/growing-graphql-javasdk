package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ObjectIdentity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class ObjectIdentityResponseProjection extends GraphQLResponseProjection {

    public ObjectIdentityResponseProjection() {
    }

    @Override
    public ObjectIdentityResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ObjectIdentityResponseProjection all$(int maxDepth) {
        this.resourceId();
        this.resourceType();
        this.typename();
        return this;
    }

    public ObjectIdentityResponseProjection resourceId() {
        return resourceId(null);
    }

    public ObjectIdentityResponseProjection resourceId(String alias) {
        fields.add(new GraphQLResponseField("resourceId").alias(alias));
        return this;
    }

    public ObjectIdentityResponseProjection resourceType() {
        return resourceType(null);
    }

    public ObjectIdentityResponseProjection resourceType(String alias) {
        fields.add(new GraphQLResponseField("resourceType").alias(alias));
        return this;
    }

    public ObjectIdentityResponseProjection typename() {
        return typename(null);
    }

    public ObjectIdentityResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
