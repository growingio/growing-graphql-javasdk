package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CustomEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class CustomEventResponseProjection extends GraphQLResponseProjection {

    public CustomEventResponseProjection() {
    }

    public CustomEventResponseProjection id() {
        return id(null);
    }

    public CustomEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CustomEventResponseProjection projectId() {
        return projectId(null);
    }

    public CustomEventResponseProjection projectId(String alias) {
        fields.add(new GraphQLResponseField("projectId").alias(alias));
        return this;
    }

    public CustomEventResponseProjection name() {
        return name(null);
    }

    public CustomEventResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CustomEventResponseProjection key() {
        return key(null);
    }

    public CustomEventResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public CustomEventResponseProjection description() {
        return description(null);
    }

    public CustomEventResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public CustomEventResponseProjection isSystem() {
        return isSystem(null);
    }

    public CustomEventResponseProjection isSystem(String alias) {
        fields.add(new GraphQLResponseField("isSystem").alias(alias));
        return this;
    }

    public CustomEventResponseProjection valueType() {
        return valueType(null);
    }

    public CustomEventResponseProjection valueType(String alias) {
        fields.add(new GraphQLResponseField("valueType").alias(alias));
        return this;
    }

    public CustomEventResponseProjection variables(EventVariableResponseProjection subProjection) {
        return variables(null, subProjection);
    }

    public CustomEventResponseProjection variables(String alias, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variables").alias(alias).projection(subProjection));
        return this;
    }

    public CustomEventResponseProjection attributes(CustomEventChildResponseProjection subProjection) {
        return attributes(null, subProjection);
    }

    public CustomEventResponseProjection attributes(String alias, CustomEventChildResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("attributes").alias(alias).projection(subProjection));
        return this;
    }

    public CustomEventResponseProjection itemModels(CustomEventChildResponseProjection subProjection) {
        return itemModels(null, subProjection);
    }

    public CustomEventResponseProjection itemModels(String alias, CustomEventChildResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemModels").alias(alias).projection(subProjection));
        return this;
    }

    public CustomEventResponseProjection creatorId() {
        return creatorId(null);
    }

    public CustomEventResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public CustomEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public CustomEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public CustomEventResponseProjection updaterId() {
        return updaterId(null);
    }

    public CustomEventResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public CustomEventResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public CustomEventResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public CustomEventResponseProjection creator() {
        return creator(null);
    }

    public CustomEventResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public CustomEventResponseProjection updater() {
        return updater(null);
    }

    public CustomEventResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public CustomEventResponseProjection typename() {
        return typename(null);
    }

    public CustomEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
