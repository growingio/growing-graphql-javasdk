package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for JobResult
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class JobResultResponseProjection extends GraphQLResponseProjection {

    public JobResultResponseProjection() {
    }

    public JobResultResponseProjection id() {
        return id(null);
    }

    public JobResultResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public JobResultResponseProjection stage() {
        return stage(null);
    }

    public JobResultResponseProjection stage(String alias) {
        fields.add(new GraphQLResponseField("stage").alias(alias));
        return this;
    }

    public JobResultResponseProjection uris() {
        return uris(null);
    }

    public JobResultResponseProjection uris(String alias) {
        fields.add(new GraphQLResponseField("uris").alias(alias));
        return this;
    }

    public JobResultResponseProjection typename() {
        return typename(null);
    }

    public JobResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
