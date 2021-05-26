package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Element
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ElementResponseProjection extends GraphQLResponseProjection {

    public ElementResponseProjection() {
    }

    @Override
    public ElementResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ElementResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.actions();
        if (projectionDepthOnFields.getOrDefault("ElementResponseProjection.DocPropsResponseProjection.attrs", 0) <= maxDepth) {
            projectionDepthOnFields.put("ElementResponseProjection.DocPropsResponseProjection.attrs", projectionDepthOnFields.getOrDefault("ElementResponseProjection.DocPropsResponseProjection.attrs", 0) + 1);
            this.attrs(new DocPropsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ElementResponseProjection.DocPropsResponseProjection.attrs", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ElementResponseProjection.DocPropsResponseProjection.definition", 0) <= maxDepth) {
            projectionDepthOnFields.put("ElementResponseProjection.DocPropsResponseProjection.definition", projectionDepthOnFields.getOrDefault("ElementResponseProjection.DocPropsResponseProjection.definition", 0) + 1);
            this.definition(new DocPropsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ElementResponseProjection.DocPropsResponseProjection.definition", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ElementResponseProjection.ScreenshotResponseProjection.screenshot", 0) <= maxDepth) {
            projectionDepthOnFields.put("ElementResponseProjection.ScreenshotResponseProjection.screenshot", projectionDepthOnFields.getOrDefault("ElementResponseProjection.ScreenshotResponseProjection.screenshot", 0) + 1);
            this.screenshot(new ScreenshotResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ElementResponseProjection.ScreenshotResponseProjection.screenshot", 0)));
        }
        this.platforms();
        this.docType();
        this.description();
        this.businessType();
        this.isSystem();
        this.createdAt();
        this.updatedAt();
        this.creatorId();
        this.updaterId();
        this.creator();
        this.updater();
        this.patternMatched();
        this.appVersion();
        this.sdkVersion();
        this.ownerId();
        this.typename();
        return this;
    }

    public ElementResponseProjection id() {
        return id(null);
    }

    public ElementResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ElementResponseProjection name() {
        return name(null);
    }

    public ElementResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ElementResponseProjection actions() {
        return actions(null);
    }

    public ElementResponseProjection actions(String alias) {
        fields.add(new GraphQLResponseField("actions").alias(alias));
        return this;
    }

    public ElementResponseProjection attrs(DocPropsResponseProjection subProjection) {
        return attrs(null, subProjection);
    }

    public ElementResponseProjection attrs(String alias, DocPropsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("attrs").alias(alias).projection(subProjection));
        return this;
    }

    public ElementResponseProjection definition(DocPropsResponseProjection subProjection) {
        return definition(null, subProjection);
    }

    public ElementResponseProjection definition(String alias, DocPropsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("definition").alias(alias).projection(subProjection));
        return this;
    }

    public ElementResponseProjection screenshot(ScreenshotResponseProjection subProjection) {
        return screenshot(null, subProjection);
    }

    public ElementResponseProjection screenshot(String alias, ScreenshotResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("screenshot").alias(alias).projection(subProjection));
        return this;
    }

    public ElementResponseProjection platforms() {
        return platforms(null);
    }

    public ElementResponseProjection platforms(String alias) {
        fields.add(new GraphQLResponseField("platforms").alias(alias));
        return this;
    }

    public ElementResponseProjection docType() {
        return docType(null);
    }

    public ElementResponseProjection docType(String alias) {
        fields.add(new GraphQLResponseField("docType").alias(alias));
        return this;
    }

    public ElementResponseProjection description() {
        return description(null);
    }

    public ElementResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ElementResponseProjection businessType() {
        return businessType(null);
    }

    public ElementResponseProjection businessType(String alias) {
        fields.add(new GraphQLResponseField("businessType").alias(alias));
        return this;
    }

    public ElementResponseProjection isSystem() {
        return isSystem(null);
    }

    public ElementResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public ElementResponseProjection createdAt() {
        return createdAt(null);
    }

    public ElementResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ElementResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public ElementResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public ElementResponseProjection creatorId() {
        return creatorId(null);
    }

    public ElementResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public ElementResponseProjection updaterId() {
        return updaterId(null);
    }

    public ElementResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public ElementResponseProjection creator() {
        return creator(null);
    }

    public ElementResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public ElementResponseProjection updater() {
        return updater(null);
    }

    public ElementResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public ElementResponseProjection patternMatched() {
        return patternMatched(null);
    }

    public ElementResponseProjection patternMatched(String alias) {
        fields.add(new GraphQLResponseField("patternMatched").alias(alias));
        return this;
    }

    public ElementResponseProjection appVersion() {
        return appVersion(null);
    }

    public ElementResponseProjection appVersion(String alias) {
        fields.add(new GraphQLResponseField("appVersion").alias(alias));
        return this;
    }

    public ElementResponseProjection sdkVersion() {
        return sdkVersion(null);
    }

    public ElementResponseProjection sdkVersion(String alias) {
        fields.add(new GraphQLResponseField("sdkVersion").alias(alias));
        return this;
    }

    public ElementResponseProjection ownerId() {
        return ownerId(null);
    }

    public ElementResponseProjection ownerId(String alias) {
        fields.add(new GraphQLResponseField("ownerId").alias(alias));
        return this;
    }

    public ElementResponseProjection typename() {
        return typename(null);
    }

    public ElementResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
