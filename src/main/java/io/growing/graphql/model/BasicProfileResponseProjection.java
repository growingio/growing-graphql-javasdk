package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for BasicProfile
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class BasicProfileResponseProjection extends GraphQLResponseProjection {

    public BasicProfileResponseProjection() {
    }

    @Override
    public BasicProfileResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BasicProfileResponseProjection all$(int maxDepth) {
        this.id();
        this.userId();
        this.name();
        this.email();
        this.avatar();
        this.mobile();
        this.createdAt();
        this.wechatOpenId();
        if (projectionDepthOnFields.getOrDefault("BasicProfileResponseProjection.PropertyResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("BasicProfileResponseProjection.PropertyResponseProjection.properties", projectionDepthOnFields.getOrDefault("BasicProfileResponseProjection.PropertyResponseProjection.properties", 0) + 1);
            this.properties(new PropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BasicProfileResponseProjection.PropertyResponseProjection.properties", 0)));
        }
        this.typename();
        return this;
    }

    public BasicProfileResponseProjection id() {
        return id(null);
    }

    public BasicProfileResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public BasicProfileResponseProjection userId() {
        return userId(null);
    }

    public BasicProfileResponseProjection userId(String alias) {
        fields.add(new GraphQLResponseField("userId").alias(alias));
        return this;
    }

    public BasicProfileResponseProjection name() {
        return name(null);
    }

    public BasicProfileResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public BasicProfileResponseProjection email() {
        return email(null);
    }

    public BasicProfileResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public BasicProfileResponseProjection avatar() {
        return avatar(null);
    }

    public BasicProfileResponseProjection avatar(String alias) {
        fields.add(new GraphQLResponseField("avatar").alias(alias));
        return this;
    }

    public BasicProfileResponseProjection mobile() {
        return mobile(null);
    }

    public BasicProfileResponseProjection mobile(String alias) {
        fields.add(new GraphQLResponseField("mobile").alias(alias));
        return this;
    }

    public BasicProfileResponseProjection createdAt() {
        return createdAt(null);
    }

    public BasicProfileResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public BasicProfileResponseProjection wechatOpenId() {
        return wechatOpenId(null);
    }

    public BasicProfileResponseProjection wechatOpenId(String alias) {
        fields.add(new GraphQLResponseField("wechatOpenId").alias(alias));
        return this;
    }

    public BasicProfileResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public BasicProfileResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public BasicProfileResponseProjection typename() {
        return typename(null);
    }

    public BasicProfileResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
