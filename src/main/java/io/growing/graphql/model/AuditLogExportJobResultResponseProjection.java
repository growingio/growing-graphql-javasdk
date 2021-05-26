package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AuditLogExportJobResult
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AuditLogExportJobResultResponseProjection extends GraphQLResponseProjection {

    public AuditLogExportJobResultResponseProjection() {
    }

    @Override
    public AuditLogExportJobResultResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AuditLogExportJobResultResponseProjection all$(int maxDepth) {
        this.stage();
        this.uri();
        this.typename();
        return this;
    }

    public AuditLogExportJobResultResponseProjection stage() {
        return stage(null);
    }

    public AuditLogExportJobResultResponseProjection stage(String alias) {
        fields.add(new GraphQLResponseField("stage").alias(alias));
        return this;
    }

    public AuditLogExportJobResultResponseProjection uri() {
        return uri(null);
    }

    public AuditLogExportJobResultResponseProjection uri(String alias) {
        fields.add(new GraphQLResponseField("uri").alias(alias));
        return this;
    }

    public AuditLogExportJobResultResponseProjection typename() {
        return typename(null);
    }

    public AuditLogExportJobResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
