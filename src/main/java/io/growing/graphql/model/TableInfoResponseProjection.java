package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TableInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TableInfoResponseProjection extends GraphQLResponseProjection {

    public TableInfoResponseProjection() {
    }

    @Override
    public TableInfoResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TableInfoResponseProjection all$(int maxDepth) {
        this.name();
        if (projectionDepthOnFields.getOrDefault("TableInfoResponseProjection.ColumnInfoResponseProjection.simpleColumns", 0) <= maxDepth) {
            projectionDepthOnFields.put("TableInfoResponseProjection.ColumnInfoResponseProjection.simpleColumns", projectionDepthOnFields.getOrDefault("TableInfoResponseProjection.ColumnInfoResponseProjection.simpleColumns", 0) + 1);
            this.simpleColumns(new ColumnInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TableInfoResponseProjection.ColumnInfoResponseProjection.simpleColumns", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TableInfoResponseProjection.ColumnInfoResponseProjection.partitionsColumns", 0) <= maxDepth) {
            projectionDepthOnFields.put("TableInfoResponseProjection.ColumnInfoResponseProjection.partitionsColumns", projectionDepthOnFields.getOrDefault("TableInfoResponseProjection.ColumnInfoResponseProjection.partitionsColumns", 0) + 1);
            this.partitionsColumns(new ColumnInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TableInfoResponseProjection.ColumnInfoResponseProjection.partitionsColumns", 0)));
        }
        this.typename();
        return this;
    }

    public TableInfoResponseProjection name() {
        return name(null);
    }

    public TableInfoResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TableInfoResponseProjection simpleColumns(ColumnInfoResponseProjection subProjection) {
        return simpleColumns(null, subProjection);
    }

    public TableInfoResponseProjection simpleColumns(String alias, ColumnInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("simpleColumns").alias(alias).projection(subProjection));
        return this;
    }

    public TableInfoResponseProjection partitionsColumns(ColumnInfoResponseProjection subProjection) {
        return partitionsColumns(null, subProjection);
    }

    public TableInfoResponseProjection partitionsColumns(String alias, ColumnInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("partitionsColumns").alias(alias).projection(subProjection));
        return this;
    }

    public TableInfoResponseProjection typename() {
        return typename(null);
    }

    public TableInfoResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
