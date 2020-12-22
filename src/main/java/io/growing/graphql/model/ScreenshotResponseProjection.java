package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Screenshot
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class ScreenshotResponseProjection extends GraphQLResponseProjection {

    public ScreenshotResponseProjection() {
    }

    @Override
    public ScreenshotResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ScreenshotResponseProjection all$(int maxDepth) {
        this.target();
        this.viewport();
        this.typename();
        return this;
    }

    public ScreenshotResponseProjection target() {
        return target(null);
    }

    public ScreenshotResponseProjection target(String alias) {
        fields.add(new GraphQLResponseField("target").alias(alias));
        return this;
    }

    public ScreenshotResponseProjection viewport() {
        return viewport(null);
    }

    public ScreenshotResponseProjection viewport(String alias) {
        fields.add(new GraphQLResponseField("viewport").alias(alias));
        return this;
    }

    public ScreenshotResponseProjection typename() {
        return typename(null);
    }

    public ScreenshotResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
