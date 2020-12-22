package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CrystalBallPropertyCategory
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class CrystalBallPropertyCategoryResponseProjection extends GraphQLResponseProjection {

    public CrystalBallPropertyCategoryResponseProjection() {
    }

    @Override
    public CrystalBallPropertyCategoryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CrystalBallPropertyCategoryResponseProjection all$(int maxDepth) {
        this.title();
        this.properties();
        this.tags();
        this.typename();
        return this;
    }

    public CrystalBallPropertyCategoryResponseProjection title() {
        return title(null);
    }

    public CrystalBallPropertyCategoryResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public CrystalBallPropertyCategoryResponseProjection properties() {
        return properties(null);
    }

    public CrystalBallPropertyCategoryResponseProjection properties(String alias) {
        fields.add(new GraphQLResponseField("properties").alias(alias));
        return this;
    }

    public CrystalBallPropertyCategoryResponseProjection tags() {
        return tags(null);
    }

    public CrystalBallPropertyCategoryResponseProjection tags(String alias) {
        fields.add(new GraphQLResponseField("tags").alias(alias));
        return this;
    }

    public CrystalBallPropertyCategoryResponseProjection typename() {
        return typename(null);
    }

    public CrystalBallPropertyCategoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
