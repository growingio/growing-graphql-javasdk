package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for WaterMarkSetting
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class WaterMarkSettingResponseProjection extends GraphQLResponseProjection {

    public WaterMarkSettingResponseProjection() {
    }

    @Override
    public WaterMarkSettingResponseProjection all$() {
        return all$(3);
    }

    @Override
    public WaterMarkSettingResponseProjection all$(int maxDepth) {
        this.enabled();
        this.typename();
        return this;
    }

    public WaterMarkSettingResponseProjection enabled() {
        return enabled(null);
    }

    public WaterMarkSettingResponseProjection enabled(String alias) {
        fields.add(new GraphQLResponseField("enabled").alias(alias));
        return this;
    }

    public WaterMarkSettingResponseProjection typename() {
        return typename(null);
    }

    public WaterMarkSettingResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
