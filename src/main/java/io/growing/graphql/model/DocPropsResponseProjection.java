package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DocProps
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DocPropsResponseProjection extends GraphQLResponseProjection {

    public DocPropsResponseProjection() {
    }

    @Override
    public DocPropsResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DocPropsResponseProjection all$(int maxDepth) {
        this.domain();
        this.path();
        this.query();
        this.xpath();
        this.index();
        this.href();
        this.content();
        this.pg();
        this.contentType();
        this.urlScheme();
        this.typename();
        return this;
    }

    public DocPropsResponseProjection domain() {
        return domain(null);
    }

    public DocPropsResponseProjection domain(String alias) {
        fields.add(new GraphQLResponseField("domain").alias(alias));
        return this;
    }

    public DocPropsResponseProjection path() {
        return path(null);
    }

    public DocPropsResponseProjection path(String alias) {
        fields.add(new GraphQLResponseField("path").alias(alias));
        return this;
    }

    public DocPropsResponseProjection query() {
        return query(null);
    }

    public DocPropsResponseProjection query(String alias) {
        fields.add(new GraphQLResponseField("query").alias(alias));
        return this;
    }

    public DocPropsResponseProjection xpath() {
        return xpath(null);
    }

    public DocPropsResponseProjection xpath(String alias) {
        fields.add(new GraphQLResponseField("xpath").alias(alias));
        return this;
    }

    public DocPropsResponseProjection index() {
        return index(null);
    }

    public DocPropsResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public DocPropsResponseProjection href() {
        return href(null);
    }

    public DocPropsResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public DocPropsResponseProjection content() {
        return content(null);
    }

    public DocPropsResponseProjection content(String alias) {
        fields.add(new GraphQLResponseField("content").alias(alias));
        return this;
    }

    public DocPropsResponseProjection pg() {
        return pg(null);
    }

    public DocPropsResponseProjection pg(String alias) {
        fields.add(new GraphQLResponseField("pg").alias(alias));
        return this;
    }

    public DocPropsResponseProjection contentType() {
        return contentType(null);
    }

    public DocPropsResponseProjection contentType(String alias) {
        fields.add(new GraphQLResponseField("contentType").alias(alias));
        return this;
    }

    public DocPropsResponseProjection urlScheme() {
        return urlScheme(null);
    }

    public DocPropsResponseProjection urlScheme(String alias) {
        fields.add(new GraphQLResponseField("urlScheme").alias(alias));
        return this;
    }

    public DocPropsResponseProjection typename() {
        return typename(null);
    }

    public DocPropsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
