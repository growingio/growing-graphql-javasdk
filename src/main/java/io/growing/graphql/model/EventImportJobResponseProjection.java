package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for EventImportJob
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class EventImportJobResponseProjection extends GraphQLResponseProjection {

    public EventImportJobResponseProjection() {
    }

    public EventImportJobResponseProjection id() {
        return id(null);
    }

    public EventImportJobResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EventImportJobResponseProjection name() {
        return name(null);
    }

    public EventImportJobResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EventImportJobResponseProjection type() {
        return type(null);
    }

    public EventImportJobResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public EventImportJobResponseProjection description() {
        return description(null);
    }

    public EventImportJobResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public EventImportJobResponseProjection parameter(EventImportParameterResponseProjection subProjection) {
        return parameter(null, subProjection);
    }

    public EventImportJobResponseProjection parameter(String alias, EventImportParameterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parameter").alias(alias).projection(subProjection));
        return this;
    }

    public EventImportJobResponseProjection argument(EventImportArgumentResponseProjection subProjection) {
        return argument(null, subProjection);
    }

    public EventImportJobResponseProjection argument(String alias, EventImportArgumentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("argument").alias(alias).projection(subProjection));
        return this;
    }

    public EventImportJobResponseProjection stage() {
        return stage(null);
    }

    public EventImportJobResponseProjection stage(String alias) {
        fields.add(new GraphQLResponseField("stage").alias(alias));
        return this;
    }

    public EventImportJobResponseProjection creatorId() {
        return creatorId(null);
    }

    public EventImportJobResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public EventImportJobResponseProjection createdAt() {
        return createdAt(null);
    }

    public EventImportJobResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public EventImportJobResponseProjection updaterId() {
        return updaterId(null);
    }

    public EventImportJobResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public EventImportJobResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public EventImportJobResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public EventImportJobResponseProjection creator() {
        return creator(null);
    }

    public EventImportJobResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public EventImportJobResponseProjection updater() {
        return updater(null);
    }

    public EventImportJobResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public EventImportJobResponseProjection error(ErrorResponseProjection subProjection) {
        return error(null, subProjection);
    }

    public EventImportJobResponseProjection error(String alias, ErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("error").alias(alias).projection(subProjection));
        return this;
    }

    public EventImportJobResponseProjection typename() {
        return typename(null);
    }

    public EventImportJobResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
