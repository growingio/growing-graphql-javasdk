package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ChartNmae
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ChartNmaeResponseProjection extends GraphQLResponseProjection {

    public ChartNmaeResponseProjection() {
    }

    @Override
    public ChartNmaeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ChartNmaeResponseProjection all$(int maxDepth) {
        this.id();
        this.chartName();
        this.status();
        this.typename();
        return this;
    }

    public ChartNmaeResponseProjection id() {
        return id(null);
    }

    public ChartNmaeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ChartNmaeResponseProjection chartName() {
        return chartName(null);
    }

    public ChartNmaeResponseProjection chartName(String alias) {
        fields.add(new GraphQLResponseField("chartName").alias(alias));
        return this;
    }

    public ChartNmaeResponseProjection status() {
        return status(null);
    }

    public ChartNmaeResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public ChartNmaeResponseProjection typename() {
        return typename(null);
    }

    public ChartNmaeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
