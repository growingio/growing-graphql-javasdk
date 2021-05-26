package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ColumnInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ColumnInfoResponseProjection extends GraphQLResponseProjection {

    public ColumnInfoResponseProjection() {
    }

    @Override
    public ColumnInfoResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ColumnInfoResponseProjection all$(int maxDepth) {
        this.name();
        this.dataType();
        this.comment();
        this.typename();
        return this;
    }

    public ColumnInfoResponseProjection name() {
        return name(null);
    }

    public ColumnInfoResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ColumnInfoResponseProjection dataType() {
        return dataType(null);
    }

    public ColumnInfoResponseProjection dataType(String alias) {
        fields.add(new GraphQLResponseField("dataType").alias(alias));
        return this;
    }

    public ColumnInfoResponseProjection comment() {
        return comment(null);
    }

    public ColumnInfoResponseProjection comment(String alias) {
        fields.add(new GraphQLResponseField("comment").alias(alias));
        return this;
    }

    public ColumnInfoResponseProjection typename() {
        return typename(null);
    }

    public ColumnInfoResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
