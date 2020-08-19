package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for EventImportParameter
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class EventImportParameterResponseProjection extends GraphQLResponseProjection {

    public EventImportParameterResponseProjection() {
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
