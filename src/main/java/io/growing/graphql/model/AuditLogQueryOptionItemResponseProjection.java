package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AuditLogQueryOptionItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AuditLogQueryOptionItemResponseProjection extends GraphQLResponseProjection {

    public AuditLogQueryOptionItemResponseProjection() {
    }

    @Override
    public AuditLogQueryOptionItemResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AuditLogQueryOptionItemResponseProjection all$(int maxDepth) {
        this.label();
        this.value();
        this.category();
        this.typename();
        return this;
    }

    public AuditLogQueryOptionItemResponseProjection label() {
        return label(null);
    }

    public AuditLogQueryOptionItemResponseProjection label(String alias) {
        fields.add(new GraphQLResponseField("label").alias(alias));
        return this;
    }

    public AuditLogQueryOptionItemResponseProjection value() {
        return value(null);
    }

    public AuditLogQueryOptionItemResponseProjection value(String alias) {
        fields.add(new GraphQLResponseField("value").alias(alias));
        return this;
    }

    public AuditLogQueryOptionItemResponseProjection category() {
        return category(null);
    }

    public AuditLogQueryOptionItemResponseProjection category(String alias) {
        fields.add(new GraphQLResponseField("category").alias(alias));
        return this;
    }

    public AuditLogQueryOptionItemResponseProjection typename() {
        return typename(null);
    }

    public AuditLogQueryOptionItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
