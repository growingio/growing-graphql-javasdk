package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CrystalBallUserInfoPanel
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class CrystalBallUserInfoPanelResponseProjection extends GraphQLResponseProjection {

    public CrystalBallUserInfoPanelResponseProjection() {
    }

    @Override
    public CrystalBallUserInfoPanelResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CrystalBallUserInfoPanelResponseProjection all$(int maxDepth) {
        this.name();
        if (projectionDepthOnFields.getOrDefault("CrystalBallUserInfoPanelResponseProjection.CrystalBallPropertyCategoryResponseProjection.categories", 0) <= maxDepth) {
            projectionDepthOnFields.put("CrystalBallUserInfoPanelResponseProjection.CrystalBallPropertyCategoryResponseProjection.categories", projectionDepthOnFields.getOrDefault("CrystalBallUserInfoPanelResponseProjection.CrystalBallPropertyCategoryResponseProjection.categories", 0) + 1);
            this.categories(new CrystalBallPropertyCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CrystalBallUserInfoPanelResponseProjection.CrystalBallPropertyCategoryResponseProjection.categories", 0)));
        }
        this.typename();
        return this;
    }

    public CrystalBallUserInfoPanelResponseProjection name() {
        return name(null);
    }

    public CrystalBallUserInfoPanelResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CrystalBallUserInfoPanelResponseProjection categories(CrystalBallPropertyCategoryResponseProjection subProjection) {
        return categories(null, subProjection);
    }

    public CrystalBallUserInfoPanelResponseProjection categories(String alias, CrystalBallPropertyCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("categories").alias(alias).projection(subProjection));
        return this;
    }

    public CrystalBallUserInfoPanelResponseProjection typename() {
        return typename(null);
    }

    public CrystalBallUserInfoPanelResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
