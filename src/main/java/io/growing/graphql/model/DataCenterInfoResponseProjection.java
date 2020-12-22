package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DataCenterInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class DataCenterInfoResponseProjection extends GraphQLResponseProjection {

    public DataCenterInfoResponseProjection() {
    }

    @Override
    public DataCenterInfoResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DataCenterInfoResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.logo();
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("DataCenterInfoResponseProjection.MemberResponseProjection.members", 0) <= maxDepth) {
            projectionDepthOnFields.put("DataCenterInfoResponseProjection.MemberResponseProjection.members", projectionDepthOnFields.getOrDefault("DataCenterInfoResponseProjection.MemberResponseProjection.members", 0) + 1);
            this.members(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DataCenterInfoResponseProjection.MemberResponseProjection.members", 0)));
        }
        this.tunnelCount();
        this.projectCount();
        this.deployVersion();
        this.typename();
        return this;
    }

    public DataCenterInfoResponseProjection id() {
        return id(null);
    }

    public DataCenterInfoResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DataCenterInfoResponseProjection name() {
        return name(null);
    }

    public DataCenterInfoResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public DataCenterInfoResponseProjection logo() {
        return logo(null);
    }

    public DataCenterInfoResponseProjection logo(String alias) {
        fields.add(new GraphQLResponseField("logo").alias(alias));
        return this;
    }

    public DataCenterInfoResponseProjection createdAt() {
        return createdAt(null);
    }

    public DataCenterInfoResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public DataCenterInfoResponseProjection members(MemberResponseProjection subProjection) {
        return members(null, subProjection);
    }

    public DataCenterInfoResponseProjection members(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("members").alias(alias).projection(subProjection));
        return this;
    }

    public DataCenterInfoResponseProjection tunnelCount() {
        return tunnelCount(null);
    }

    public DataCenterInfoResponseProjection tunnelCount(String alias) {
        fields.add(new GraphQLResponseField("tunnelCount").alias(alias));
        return this;
    }

    public DataCenterInfoResponseProjection projectCount() {
        return projectCount(null);
    }

    public DataCenterInfoResponseProjection projectCount(String alias) {
        fields.add(new GraphQLResponseField("projectCount").alias(alias));
        return this;
    }

    public DataCenterInfoResponseProjection deployVersion() {
        return deployVersion(null);
    }

    public DataCenterInfoResponseProjection deployVersion(String alias) {
        fields.add(new GraphQLResponseField("deployVersion").alias(alias));
        return this;
    }

    public DataCenterInfoResponseProjection typename() {
        return typename(null);
    }

    public DataCenterInfoResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
