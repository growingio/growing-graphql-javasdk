package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TagInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TagInfoResponseProjection extends GraphQLResponseProjection {

    public TagInfoResponseProjection() {
    }

    @Override
    public TagInfoResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TagInfoResponseProjection all$(int maxDepth) {
        this.tagId();
        this.tagValue();
        this.typename();
        return this;
    }

    public TagInfoResponseProjection tagId() {
        return tagId(null);
    }

    public TagInfoResponseProjection tagId(String alias) {
        fields.add(new GraphQLResponseField("tagId").alias(alias));
        return this;
    }

    public TagInfoResponseProjection tagValue() {
        return tagValue(null);
    }

    public TagInfoResponseProjection tagValue(String alias) {
        fields.add(new GraphQLResponseField("tagValue").alias(alias));
        return this;
    }

    public TagInfoResponseProjection typename() {
        return typename(null);
    }

    public TagInfoResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
