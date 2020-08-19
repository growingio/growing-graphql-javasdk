package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TargetUser
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class TargetUserResponseProjection extends GraphQLResponseProjection {

    public TargetUserResponseProjection() {
    }

    public TargetUserResponseProjection id() {
        return id(null);
    }

    public TargetUserResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TargetUserResponseProjection name() {
        return name(null);
    }

    public TargetUserResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TargetUserResponseProjection typename() {
        return typename(null);
    }

    public TargetUserResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
