package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Tag
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class TagResponseProjection extends GraphQLResponseProjection {

    public TagResponseProjection() {
    }

    public TagResponseProjection id() {
        return id(null);
    }

    public TagResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TagResponseProjection projectId() {
        return projectId(null);
    }

    public TagResponseProjection projectId(String alias) {
        fields.add(new GraphQLResponseField("projectId").alias(alias));
        return this;
    }

    public TagResponseProjection name() {
        return name(null);
    }

    public TagResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TagResponseProjection type() {
        return type(null);
    }

    public TagResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public TagResponseProjection description() {
        return description(null);
    }

    public TagResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public TagResponseProjection computes(ComputeDefinitionResponseProjection subProjection) {
        return computes(null, subProjection);
    }

    public TagResponseProjection computes(String alias, ComputeDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("computes").alias(alias).projection(subProjection));
        return this;
    }

    public TagResponseProjection creatorId() {
        return creatorId(null);
    }

    public TagResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public TagResponseProjection createdAt() {
        return createdAt(null);
    }

    public TagResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public TagResponseProjection updaterId() {
        return updaterId(null);
    }

    public TagResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public TagResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public TagResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public TagResponseProjection creator() {
        return creator(null);
    }

    public TagResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public TagResponseProjection updater() {
        return updater(null);
    }

    public TagResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public TagResponseProjection valueType(ValueTypeResponseProjection subProjection) {
        return valueType(null, subProjection);
    }

    public TagResponseProjection valueType(String alias, ValueTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("valueType").alias(alias).projection(subProjection));
        return this;
    }

    public TagResponseProjection detector(DetectorResponseProjection subProjection) {
        return detector(null, subProjection);
    }

    public TagResponseProjection detector(String alias, DetectorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("detector").alias(alias).projection(subProjection));
        return this;
    }

    public TagResponseProjection typename() {
        return typename(null);
    }

    public TagResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
