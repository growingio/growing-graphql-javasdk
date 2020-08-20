package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Detector
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class DetectorResponseProjection extends GraphQLResponseProjection {

    public DetectorResponseProjection() {
    }

    public DetectorResponseProjection stage() {
        return stage(null);
    }

    public DetectorResponseProjection stage(String alias) {
        fields.add(new GraphQLResponseField("stage").alias(alias));
        return this;
    }

    public DetectorResponseProjection description() {
        return description(null);
    }

    public DetectorResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public DetectorResponseProjection detectedAt() {
        return detectedAt(null);
    }

    public DetectorResponseProjection detectedAt(String alias) {
        fields.add(new GraphQLResponseField("detectedAt").alias(alias));
        return this;
    }

    public DetectorResponseProjection totalUsers() {
        return totalUsers(null);
    }

    public DetectorResponseProjection totalUsers(String alias) {
        fields.add(new GraphQLResponseField("totalUsers").alias(alias));
        return this;
    }

    public DetectorResponseProjection usersRatio() {
        return usersRatio(null);
    }

    public DetectorResponseProjection usersRatio(String alias) {
        fields.add(new GraphQLResponseField("usersRatio").alias(alias));
        return this;
    }

    public DetectorResponseProjection typename() {
        return typename(null);
    }

    public DetectorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
