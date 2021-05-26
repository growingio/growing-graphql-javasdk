package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for JobResult
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class JobResultResponseProjection extends GraphQLResponseProjection {

    public JobResultResponseProjection() {
    }

    @Override
    public JobResultResponseProjection all$() {
        return all$(3);
    }

    @Override
    public JobResultResponseProjection all$(int maxDepth) {
        this.id();
        this.stage();
        this.uris();
        this.jsonData();
        this.typename();
        return this;
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

    public JobResultResponseProjection jsonData() {
        return jsonData(null);
    }

    public JobResultResponseProjection jsonData(String alias) {
        fields.add(new GraphQLResponseField("jsonData").alias(alias));
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
