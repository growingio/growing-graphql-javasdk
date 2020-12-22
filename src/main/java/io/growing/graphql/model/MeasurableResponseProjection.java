package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Measurable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MeasurableResponseProjection extends GraphQLResponseProjection {

    public MeasurableResponseProjection() {
    }

    @Override
    public MeasurableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MeasurableResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.type();
        this.action();
        this.elementId();
        this.valueType();
        this.platforms();
        if (projectionDepthOnFields.getOrDefault("MeasurableResponseProjection.MeasurableAttributeResponseProjection.attributes", 0) <= maxDepth) {
            projectionDepthOnFields.put("MeasurableResponseProjection.MeasurableAttributeResponseProjection.attributes", projectionDepthOnFields.getOrDefault("MeasurableResponseProjection.MeasurableAttributeResponseProjection.attributes", 0) + 1);
            this.attributes(new MeasurableAttributeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MeasurableResponseProjection.MeasurableAttributeResponseProjection.attributes", 0)));
        }
        this.labels();
        this.favorites();
        this.isComplexDistinct();
        this.typename();
        return this;
    }

    public MeasurableResponseProjection id() {
        return id(null);
    }

    public MeasurableResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MeasurableResponseProjection name() {
        return name(null);
    }

    public MeasurableResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public MeasurableResponseProjection type() {
        return type(null);
    }

    public MeasurableResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public MeasurableResponseProjection action() {
        return action(null);
    }

    public MeasurableResponseProjection action(String alias) {
        fields.add(new GraphQLResponseField("action").alias(alias));
        return this;
    }

    public MeasurableResponseProjection elementId() {
        return elementId(null);
    }

    public MeasurableResponseProjection elementId(String alias) {
        fields.add(new GraphQLResponseField("elementId").alias(alias));
        return this;
    }

    public MeasurableResponseProjection valueType() {
        return valueType(null);
    }

    public MeasurableResponseProjection valueType(String alias) {
        fields.add(new GraphQLResponseField("valueType").alias(alias));
        return this;
    }

    public MeasurableResponseProjection platforms() {
        return platforms(null);
    }

    public MeasurableResponseProjection platforms(String alias) {
        fields.add(new GraphQLResponseField("platforms").alias(alias));
        return this;
    }

    public MeasurableResponseProjection attributes(MeasurableAttributeResponseProjection subProjection) {
        return attributes(null, subProjection);
    }

    public MeasurableResponseProjection attributes(String alias, MeasurableAttributeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("attributes").alias(alias).projection(subProjection));
        return this;
    }

    public MeasurableResponseProjection labels() {
        return labels(null);
    }

    public MeasurableResponseProjection labels(String alias) {
        fields.add(new GraphQLResponseField("labels").alias(alias));
        return this;
    }

    public MeasurableResponseProjection favorites() {
        return favorites(null);
    }

    public MeasurableResponseProjection favorites(String alias) {
        fields.add(new GraphQLResponseField("favorites").alias(alias));
        return this;
    }

    public MeasurableResponseProjection isComplexDistinct() {
        return isComplexDistinct(null);
    }

    public MeasurableResponseProjection isComplexDistinct(String alias) {
        fields.add(new GraphQLResponseField("isComplexDistinct").alias(alias));
        return this;
    }

    public MeasurableResponseProjection typename() {
        return typename(null);
    }

    public MeasurableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
