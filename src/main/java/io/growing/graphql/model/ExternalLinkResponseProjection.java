package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ExternalLink
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ExternalLinkResponseProjection extends GraphQLResponseProjection {

    public ExternalLinkResponseProjection() {
    }

    @Override
    public ExternalLinkResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ExternalLinkResponseProjection all$(int maxDepth) {
        this.name();
        this.ref();
        this.position();
        this.typename();
        return this;
    }

    public ExternalLinkResponseProjection name() {
        return name(null);
    }

    public ExternalLinkResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ExternalLinkResponseProjection ref() {
        return ref(null);
    }

    public ExternalLinkResponseProjection ref(String alias) {
        fields.add(new GraphQLResponseField("ref").alias(alias));
        return this;
    }

    public ExternalLinkResponseProjection position() {
        return position(null);
    }

    public ExternalLinkResponseProjection position(String alias) {
        fields.add(new GraphQLResponseField("position").alias(alias));
        return this;
    }

    public ExternalLinkResponseProjection typename() {
        return typename(null);
    }

    public ExternalLinkResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
