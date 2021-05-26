package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TencentPortrait
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TencentPortraitResponseProjection extends GraphQLResponseProjection {

    public TencentPortraitResponseProjection() {
    }

    @Override
    public TencentPortraitResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TencentPortraitResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        this.segmentId();
        this.segmentName();
        this.tencentTags();
        this.tencentTagNames();
        this.jobId();
        if (projectionDepthOnFields.getOrDefault("TencentPortraitResponseProjection.DetectorResponseProjection.detector", 0) <= maxDepth) {
            projectionDepthOnFields.put("TencentPortraitResponseProjection.DetectorResponseProjection.detector", projectionDepthOnFields.getOrDefault("TencentPortraitResponseProjection.DetectorResponseProjection.detector", 0) + 1);
            this.detector(new DetectorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TencentPortraitResponseProjection.DetectorResponseProjection.detector", 0)));
        }
        this.mode();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.typename();
        return this;
    }

    public TencentPortraitResponseProjection id() {
        return id(null);
    }

    public TencentPortraitResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection name() {
        return name(null);
    }

    public TencentPortraitResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection description() {
        return description(null);
    }

    public TencentPortraitResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection segmentId() {
        return segmentId(null);
    }

    public TencentPortraitResponseProjection segmentId(String alias) {
        fields.add(new GraphQLResponseField("segmentId").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection segmentName() {
        return segmentName(null);
    }

    public TencentPortraitResponseProjection segmentName(String alias) {
        fields.add(new GraphQLResponseField("segmentName").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection tencentTags() {
        return tencentTags(null);
    }

    public TencentPortraitResponseProjection tencentTags(String alias) {
        fields.add(new GraphQLResponseField("tencentTags").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection tencentTagNames() {
        return tencentTagNames(null);
    }

    public TencentPortraitResponseProjection tencentTagNames(String alias) {
        fields.add(new GraphQLResponseField("tencentTagNames").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection jobId() {
        return jobId(null);
    }

    public TencentPortraitResponseProjection jobId(String alias) {
        fields.add(new GraphQLResponseField("jobId").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection detector(DetectorResponseProjection subProjection) {
        return detector(null, subProjection);
    }

    public TencentPortraitResponseProjection detector(String alias, DetectorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("detector").alias(alias).projection(subProjection));
        return this;
    }

    public TencentPortraitResponseProjection mode() {
        return mode(null);
    }

    public TencentPortraitResponseProjection mode(String alias) {
        fields.add(new GraphQLResponseField("mode").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection creatorId() {
        return creatorId(null);
    }

    public TencentPortraitResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection createdAt() {
        return createdAt(null);
    }

    public TencentPortraitResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection updaterId() {
        return updaterId(null);
    }

    public TencentPortraitResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public TencentPortraitResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection creator() {
        return creator(null);
    }

    public TencentPortraitResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection updater() {
        return updater(null);
    }

    public TencentPortraitResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public TencentPortraitResponseProjection typename() {
        return typename(null);
    }

    public TencentPortraitResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
