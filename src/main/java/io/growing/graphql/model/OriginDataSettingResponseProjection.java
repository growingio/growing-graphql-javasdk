package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OriginDataSetting
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class OriginDataSettingResponseProjection extends GraphQLResponseProjection {

    public OriginDataSettingResponseProjection() {
    }

    public OriginDataSettingResponseProjection key() {
        return key(null);
    }

    public OriginDataSettingResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public OriginDataSettingResponseProjection dayTTL() {
        return dayTTL(null);
    }

    public OriginDataSettingResponseProjection dayTTL(String alias) {
        fields.add(new GraphQLResponseField("dayTTL").alias(alias));
        return this;
    }

    public OriginDataSettingResponseProjection typename() {
        return typename(null);
    }

    public OriginDataSettingResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
