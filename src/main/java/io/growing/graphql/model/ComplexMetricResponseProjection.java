package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ComplexMetric
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class ComplexMetricResponseProjection extends GraphQLResponseProjection {

    public ComplexMetricResponseProjection() {
    }

    @Override
    public ComplexMetricResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ComplexMetricResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("ComplexMetricResponseProjection.ExpressionResponseProjection.expression", 0) <= maxDepth) {
            projectionDepthOnFields.put("ComplexMetricResponseProjection.ExpressionResponseProjection.expression", projectionDepthOnFields.getOrDefault("ComplexMetricResponseProjection.ExpressionResponseProjection.expression", 0) + 1);
            this.expression(new ExpressionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ComplexMetricResponseProjection.ExpressionResponseProjection.expression", 0)));
        }
        this.isSystem();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.typename();
        return this;
    }

    public ComplexMetricResponseProjection id() {
        return id(null);
    }

    public ComplexMetricResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ComplexMetricResponseProjection name() {
        return name(null);
    }

    public ComplexMetricResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ComplexMetricResponseProjection description() {
        return description(null);
    }

    public ComplexMetricResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ComplexMetricResponseProjection expression(ExpressionResponseProjection subProjection) {
        return expression(null, subProjection);
    }

    public ComplexMetricResponseProjection expression(String alias, ExpressionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("expression").alias(alias).projection(subProjection));
        return this;
    }

    public ComplexMetricResponseProjection isSystem() {
        return isSystem(null);
    }

    public ComplexMetricResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public ComplexMetricResponseProjection creatorId() {
        return creatorId(null);
    }

    public ComplexMetricResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public ComplexMetricResponseProjection createdAt() {
        return createdAt(null);
    }

    public ComplexMetricResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ComplexMetricResponseProjection updaterId() {
        return updaterId(null);
    }

    public ComplexMetricResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public ComplexMetricResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public ComplexMetricResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public ComplexMetricResponseProjection creator() {
        return creator(null);
    }

    public ComplexMetricResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public ComplexMetricResponseProjection updater() {
        return updater(null);
    }

    public ComplexMetricResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public ComplexMetricResponseProjection typename() {
        return typename(null);
    }

    public ComplexMetricResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
