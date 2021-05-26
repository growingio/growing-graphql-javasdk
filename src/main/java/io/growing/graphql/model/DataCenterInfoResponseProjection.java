package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DataCenterInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
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
        this.accountGrantType();
        this.enableWatermark();
        this.memberCount();
        if (projectionDepthOnFields.getOrDefault("DataCenterInfoResponseProjection.MemberResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields.put("DataCenterInfoResponseProjection.MemberResponseProjection.owner", projectionDepthOnFields.getOrDefault("DataCenterInfoResponseProjection.MemberResponseProjection.owner", 0) + 1);
            this.owner(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DataCenterInfoResponseProjection.MemberResponseProjection.owner", 0)));
        }
        this.departmentCount();
        this.pendingApplicationCount();
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

    public DataCenterInfoResponseProjection accountGrantType() {
        return accountGrantType(null);
    }

    public DataCenterInfoResponseProjection accountGrantType(String alias) {
        fields.add(new GraphQLResponseField("accountGrantType").alias(alias));
        return this;
    }

    public DataCenterInfoResponseProjection enableWatermark() {
        return enableWatermark(null);
    }

    public DataCenterInfoResponseProjection enableWatermark(String alias) {
        fields.add(new GraphQLResponseField("enableWatermark").alias(alias));
        return this;
    }

    public DataCenterInfoResponseProjection memberCount() {
        return memberCount(null);
    }

    public DataCenterInfoResponseProjection memberCount(String alias) {
        fields.add(new GraphQLResponseField("memberCount").alias(alias));
        return this;
    }

    public DataCenterInfoResponseProjection owner(MemberResponseProjection subProjection) {
        return owner(null, subProjection);
    }

    public DataCenterInfoResponseProjection owner(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection));
        return this;
    }

    public DataCenterInfoResponseProjection departmentCount() {
        return departmentCount(null);
    }

    public DataCenterInfoResponseProjection departmentCount(String alias) {
        fields.add(new GraphQLResponseField("departmentCount").alias(alias));
        return this;
    }

    public DataCenterInfoResponseProjection pendingApplicationCount() {
        return pendingApplicationCount(null);
    }

    public DataCenterInfoResponseProjection pendingApplicationCount(String alias) {
        fields.add(new GraphQLResponseField("pendingApplicationCount").alias(alias));
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
