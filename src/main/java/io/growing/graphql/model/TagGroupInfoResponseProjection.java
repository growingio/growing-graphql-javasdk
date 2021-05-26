package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TagGroupInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TagGroupInfoResponseProjection extends GraphQLResponseProjection {

    public TagGroupInfoResponseProjection() {
    }

    @Override
    public TagGroupInfoResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TagGroupInfoResponseProjection all$(int maxDepth) {
        this.groupId();
        this.groupName();
        this.parentId();
        this.parentName();
        this.level();
        this.nodePath();
        if (projectionDepthOnFields.getOrDefault("TagGroupInfoResponseProjection.TagInfoResponseProjection.tags", 0) <= maxDepth) {
            projectionDepthOnFields.put("TagGroupInfoResponseProjection.TagInfoResponseProjection.tags", projectionDepthOnFields.getOrDefault("TagGroupInfoResponseProjection.TagInfoResponseProjection.tags", 0) + 1);
            this.tags(new TagInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TagGroupInfoResponseProjection.TagInfoResponseProjection.tags", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TagGroupInfoResponseProjection.UserCustomizedStrResponseProjection.userCustomizedStr", 0) <= maxDepth) {
            projectionDepthOnFields.put("TagGroupInfoResponseProjection.UserCustomizedStrResponseProjection.userCustomizedStr", projectionDepthOnFields.getOrDefault("TagGroupInfoResponseProjection.UserCustomizedStrResponseProjection.userCustomizedStr", 0) + 1);
            this.userCustomizedStr(new UserCustomizedStrResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TagGroupInfoResponseProjection.UserCustomizedStrResponseProjection.userCustomizedStr", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TagGroupInfoResponseProjection.TagGroupInfoResponseProjection.children", 0) <= maxDepth) {
            projectionDepthOnFields.put("TagGroupInfoResponseProjection.TagGroupInfoResponseProjection.children", projectionDepthOnFields.getOrDefault("TagGroupInfoResponseProjection.TagGroupInfoResponseProjection.children", 0) + 1);
            this.children(new TagGroupInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TagGroupInfoResponseProjection.TagGroupInfoResponseProjection.children", 0)));
        }
        this.typename();
        return this;
    }

    public TagGroupInfoResponseProjection groupId() {
        return groupId(null);
    }

    public TagGroupInfoResponseProjection groupId(String alias) {
        fields.add(new GraphQLResponseField("groupId").alias(alias));
        return this;
    }

    public TagGroupInfoResponseProjection groupName() {
        return groupName(null);
    }

    public TagGroupInfoResponseProjection groupName(String alias) {
        fields.add(new GraphQLResponseField("groupName").alias(alias));
        return this;
    }

    public TagGroupInfoResponseProjection parentId() {
        return parentId(null);
    }

    public TagGroupInfoResponseProjection parentId(String alias) {
        fields.add(new GraphQLResponseField("parentId").alias(alias));
        return this;
    }

    public TagGroupInfoResponseProjection parentName() {
        return parentName(null);
    }

    public TagGroupInfoResponseProjection parentName(String alias) {
        fields.add(new GraphQLResponseField("parentName").alias(alias));
        return this;
    }

    public TagGroupInfoResponseProjection level() {
        return level(null);
    }

    public TagGroupInfoResponseProjection level(String alias) {
        fields.add(new GraphQLResponseField("level").alias(alias));
        return this;
    }

    public TagGroupInfoResponseProjection nodePath() {
        return nodePath(null);
    }

    public TagGroupInfoResponseProjection nodePath(String alias) {
        fields.add(new GraphQLResponseField("nodePath").alias(alias));
        return this;
    }

    public TagGroupInfoResponseProjection tags(TagInfoResponseProjection subProjection) {
        return tags(null, subProjection);
    }

    public TagGroupInfoResponseProjection tags(String alias, TagInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tags").alias(alias).projection(subProjection));
        return this;
    }

    public TagGroupInfoResponseProjection userCustomizedStr(UserCustomizedStrResponseProjection subProjection) {
        return userCustomizedStr(null, subProjection);
    }

    public TagGroupInfoResponseProjection userCustomizedStr(String alias, UserCustomizedStrResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userCustomizedStr").alias(alias).projection(subProjection));
        return this;
    }

    public TagGroupInfoResponseProjection children(TagGroupInfoResponseProjection subProjection) {
        return children(null, subProjection);
    }

    public TagGroupInfoResponseProjection children(String alias, TagGroupInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("children").alias(alias).projection(subProjection));
        return this;
    }

    public TagGroupInfoResponseProjection typename() {
        return typename(null);
    }

    public TagGroupInfoResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
