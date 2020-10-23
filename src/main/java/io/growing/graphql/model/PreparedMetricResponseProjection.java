package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PreparedMetric
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class PreparedMetricResponseProjection extends GraphQLResponseProjection {

    public PreparedMetricResponseProjection() {
    }

    @Override
    public PreparedMetricResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PreparedMetricResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        this.instruction();
        this.platforms();
        this.typename();
        return this;
    }

    public PreparedMetricResponseProjection id() {
        return id(null);
    }

    public PreparedMetricResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PreparedMetricResponseProjection name() {
        return name(null);
    }

    public PreparedMetricResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PreparedMetricResponseProjection description() {
        return description(null);
    }

    public PreparedMetricResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public PreparedMetricResponseProjection instruction() {
        return instruction(null);
    }

    public PreparedMetricResponseProjection instruction(String alias) {
        fields.add(new GraphQLResponseField("instruction").alias(alias));
        return this;
    }

    public PreparedMetricResponseProjection platforms() {
        return platforms(null);
    }

    public PreparedMetricResponseProjection platforms(String alias) {
        fields.add(new GraphQLResponseField("platforms").alias(alias));
        return this;
    }

    public PreparedMetricResponseProjection typename() {
        return typename(null);
    }

    public PreparedMetricResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
