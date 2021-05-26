package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AuditLogQueryOption
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AuditLogQueryOptionResponseProjection extends GraphQLResponseProjection {

    public AuditLogQueryOptionResponseProjection() {
    }

    @Override
    public AuditLogQueryOptionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AuditLogQueryOptionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AuditLogQueryOptionResponseProjection.AuditLogQueryOptionItemResponseProjection.businessTypeOptions", 0) <= maxDepth) {
            projectionDepthOnFields.put("AuditLogQueryOptionResponseProjection.AuditLogQueryOptionItemResponseProjection.businessTypeOptions", projectionDepthOnFields.getOrDefault("AuditLogQueryOptionResponseProjection.AuditLogQueryOptionItemResponseProjection.businessTypeOptions", 0) + 1);
            this.businessTypeOptions(new AuditLogQueryOptionItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AuditLogQueryOptionResponseProjection.AuditLogQueryOptionItemResponseProjection.businessTypeOptions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AuditLogQueryOptionResponseProjection.AuditLogQueryOptionItemResponseProjection.operationTypeOptions", 0) <= maxDepth) {
            projectionDepthOnFields.put("AuditLogQueryOptionResponseProjection.AuditLogQueryOptionItemResponseProjection.operationTypeOptions", projectionDepthOnFields.getOrDefault("AuditLogQueryOptionResponseProjection.AuditLogQueryOptionItemResponseProjection.operationTypeOptions", 0) + 1);
            this.operationTypeOptions(new AuditLogQueryOptionItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AuditLogQueryOptionResponseProjection.AuditLogQueryOptionItemResponseProjection.operationTypeOptions", 0)));
        }
        this.typename();
        return this;
    }

    public AuditLogQueryOptionResponseProjection businessTypeOptions(AuditLogQueryOptionItemResponseProjection subProjection) {
        return businessTypeOptions(null, subProjection);
    }

    public AuditLogQueryOptionResponseProjection businessTypeOptions(String alias, AuditLogQueryOptionItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("businessTypeOptions").alias(alias).projection(subProjection));
        return this;
    }

    public AuditLogQueryOptionResponseProjection operationTypeOptions(AuditLogQueryOptionItemResponseProjection subProjection) {
        return operationTypeOptions(null, subProjection);
    }

    public AuditLogQueryOptionResponseProjection operationTypeOptions(String alias, AuditLogQueryOptionItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("operationTypeOptions").alias(alias).projection(subProjection));
        return this;
    }

    public AuditLogQueryOptionResponseProjection typename() {
        return typename(null);
    }

    public AuditLogQueryOptionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
