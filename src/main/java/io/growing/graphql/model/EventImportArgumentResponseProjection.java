package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for EventImportArgument
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class EventImportArgumentResponseProjection extends GraphQLResponseProjection {

    public EventImportArgumentResponseProjection() {
    }

    @Override
    public EventImportArgumentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public EventImportArgumentResponseProjection all$(int maxDepth) {
        this.timeRange();
        this.directory();
        this.typename();
        return this;
    }

    public EventImportArgumentResponseProjection timeRange() {
        return timeRange(null);
    }

    public EventImportArgumentResponseProjection timeRange(String alias) {
        fields.add(new GraphQLResponseField("timeRange").alias(alias));
        return this;
    }

    public EventImportArgumentResponseProjection directory() {
        return directory(null);
    }

    public EventImportArgumentResponseProjection directory(String alias) {
        fields.add(new GraphQLResponseField("directory").alias(alias));
        return this;
    }

    public EventImportArgumentResponseProjection typename() {
        return typename(null);
    }

    public EventImportArgumentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
