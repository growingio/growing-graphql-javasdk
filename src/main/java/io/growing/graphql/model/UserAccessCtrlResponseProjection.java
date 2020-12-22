package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserAccessCtrl
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class UserAccessCtrlResponseProjection extends GraphQLResponseProjection {

    public UserAccessCtrlResponseProjection() {
    }

    @Override
    public UserAccessCtrlResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserAccessCtrlResponseProjection all$(int maxDepth) {
        this.resourceId();
        this.resourceType();
        this.memberId();
        this.actions();
        this.typename();
        return this;
    }

    public UserAccessCtrlResponseProjection resourceId() {
        return resourceId(null);
    }

    public UserAccessCtrlResponseProjection resourceId(String alias) {
        fields.add(new GraphQLResponseField("resourceId").alias(alias));
        return this;
    }

    public UserAccessCtrlResponseProjection resourceType() {
        return resourceType(null);
    }

    public UserAccessCtrlResponseProjection resourceType(String alias) {
        fields.add(new GraphQLResponseField("resourceType").alias(alias));
        return this;
    }

    public UserAccessCtrlResponseProjection memberId() {
        return memberId(null);
    }

    public UserAccessCtrlResponseProjection memberId(String alias) {
        fields.add(new GraphQLResponseField("memberId").alias(alias));
        return this;
    }

    public UserAccessCtrlResponseProjection actions() {
        return actions(null);
    }

    public UserAccessCtrlResponseProjection actions(String alias) {
        fields.add(new GraphQLResponseField("actions").alias(alias));
        return this;
    }

    public UserAccessCtrlResponseProjection typename() {
        return typename(null);
    }

    public UserAccessCtrlResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
