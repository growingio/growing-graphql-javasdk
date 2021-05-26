package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AuditLogExportJob
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AuditLogExportJobResponseProjection extends GraphQLResponseProjection {

    public AuditLogExportJobResponseProjection() {
    }

    @Override
    public AuditLogExportJobResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AuditLogExportJobResponseProjection all$(int maxDepth) {
        this.id();
        this.stage();
        this.typename();
        return this;
    }

    public AuditLogExportJobResponseProjection id() {
        return id(null);
    }

    public AuditLogExportJobResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public AuditLogExportJobResponseProjection stage() {
        return stage(null);
    }

    public AuditLogExportJobResponseProjection stage(String alias) {
        fields.add(new GraphQLResponseField("stage").alias(alias));
        return this;
    }

    public AuditLogExportJobResponseProjection typename() {
        return typename(null);
    }

    public AuditLogExportJobResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
