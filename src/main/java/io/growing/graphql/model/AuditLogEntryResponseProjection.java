package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AuditLogEntry
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AuditLogEntryResponseProjection extends GraphQLResponseProjection {

    public AuditLogEntryResponseProjection() {
    }

    @Override
    public AuditLogEntryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AuditLogEntryResponseProjection all$(int maxDepth) {
        this.projectId();
        this.operatedAt();
        this.operator();
        this.operatorId();
        this.ip();
        this.businessType();
        this.operationType();
        this.operand();
        this.description();
        this.typename();
        return this;
    }

    public AuditLogEntryResponseProjection projectId() {
        return projectId(null);
    }

    public AuditLogEntryResponseProjection projectId(String alias) {
        fields.add(new GraphQLResponseField("projectId").alias(alias));
        return this;
    }

    public AuditLogEntryResponseProjection operatedAt() {
        return operatedAt(null);
    }

    public AuditLogEntryResponseProjection operatedAt(String alias) {
        fields.add(new GraphQLResponseField("operatedAt").alias(alias));
        return this;
    }

    public AuditLogEntryResponseProjection operator() {
        return operator(null);
    }

    public AuditLogEntryResponseProjection operator(String alias) {
        fields.add(new GraphQLResponseField("operator").alias(alias));
        return this;
    }

    public AuditLogEntryResponseProjection operatorId() {
        return operatorId(null);
    }

    public AuditLogEntryResponseProjection operatorId(String alias) {
        fields.add(new GraphQLResponseField("operatorId").alias(alias));
        return this;
    }

    public AuditLogEntryResponseProjection ip() {
        return ip(null);
    }

    public AuditLogEntryResponseProjection ip(String alias) {
        fields.add(new GraphQLResponseField("ip").alias(alias));
        return this;
    }

    public AuditLogEntryResponseProjection businessType() {
        return businessType(null);
    }

    public AuditLogEntryResponseProjection businessType(String alias) {
        fields.add(new GraphQLResponseField("businessType").alias(alias));
        return this;
    }

    public AuditLogEntryResponseProjection operationType() {
        return operationType(null);
    }

    public AuditLogEntryResponseProjection operationType(String alias) {
        fields.add(new GraphQLResponseField("operationType").alias(alias));
        return this;
    }

    public AuditLogEntryResponseProjection operand() {
        return operand(null);
    }

    public AuditLogEntryResponseProjection operand(String alias) {
        fields.add(new GraphQLResponseField("operand").alias(alias));
        return this;
    }

    public AuditLogEntryResponseProjection description() {
        return description(null);
    }

    public AuditLogEntryResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public AuditLogEntryResponseProjection typename() {
        return typename(null);
    }

    public AuditLogEntryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
