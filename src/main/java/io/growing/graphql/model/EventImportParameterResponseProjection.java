package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for EventImportParameter
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class EventImportParameterResponseProjection extends GraphQLResponseProjection {

    public EventImportParameterResponseProjection() {
    }

    @Override
    public EventImportParameterResponseProjection all$() {
        return all$(3);
    }

    @Override
    public EventImportParameterResponseProjection all$(int maxDepth) {
        this.tunnelId();
        this.timeRange();
        this.typename();
        return this;
    }

    public EventImportParameterResponseProjection tunnelId() {
        return tunnelId(null);
    }

    public EventImportParameterResponseProjection tunnelId(String alias) {
        fields.add(new GraphQLResponseField("tunnelId").alias(alias));
        return this;
    }

    public EventImportParameterResponseProjection timeRange() {
        return timeRange(null);
    }

    public EventImportParameterResponseProjection timeRange(String alias) {
        fields.add(new GraphQLResponseField("timeRange").alias(alias));
        return this;
    }

    public EventImportParameterResponseProjection typename() {
        return typename(null);
    }

    public EventImportParameterResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
