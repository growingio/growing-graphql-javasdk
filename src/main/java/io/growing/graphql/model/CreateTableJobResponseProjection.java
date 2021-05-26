package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreateTableJob
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CreateTableJobResponseProjection extends GraphQLResponseProjection {

    public CreateTableJobResponseProjection() {
    }

    @Override
    public CreateTableJobResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreateTableJobResponseProjection all$(int maxDepth) {
        this.id();
        this.stage();
        if (projectionDepthOnFields.getOrDefault("CreateTableJobResponseProjection.ErrorResponseProjection.error", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateTableJobResponseProjection.ErrorResponseProjection.error", projectionDepthOnFields.getOrDefault("CreateTableJobResponseProjection.ErrorResponseProjection.error", 0) + 1);
            this.error(new ErrorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateTableJobResponseProjection.ErrorResponseProjection.error", 0)));
        }
        this.typename();
        return this;
    }

    public CreateTableJobResponseProjection id() {
        return id(null);
    }

    public CreateTableJobResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CreateTableJobResponseProjection stage() {
        return stage(null);
    }

    public CreateTableJobResponseProjection stage(String alias) {
        fields.add(new GraphQLResponseField("stage").alias(alias));
        return this;
    }

    public CreateTableJobResponseProjection error(ErrorResponseProjection subProjection) {
        return error(null, subProjection);
    }

    public CreateTableJobResponseProjection error(String alias, ErrorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("error").alias(alias).projection(subProjection));
        return this;
    }

    public CreateTableJobResponseProjection typename() {
        return typename(null);
    }

    public CreateTableJobResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
