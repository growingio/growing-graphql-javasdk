package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserCustomizedStr
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UserCustomizedStrResponseProjection extends GraphQLResponseProjection {

    public UserCustomizedStrResponseProjection() {
    }

    @Override
    public UserCustomizedStrResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserCustomizedStrResponseProjection all$(int maxDepth) {
        this.tagId();
        this.tagValue();
        this.compareType();
        this.tagIds();
        this.typename();
        return this;
    }

    public UserCustomizedStrResponseProjection tagId() {
        return tagId(null);
    }

    public UserCustomizedStrResponseProjection tagId(String alias) {
        fields.add(new GraphQLResponseField("tagId").alias(alias));
        return this;
    }

    public UserCustomizedStrResponseProjection tagValue() {
        return tagValue(null);
    }

    public UserCustomizedStrResponseProjection tagValue(String alias) {
        fields.add(new GraphQLResponseField("tagValue").alias(alias));
        return this;
    }

    public UserCustomizedStrResponseProjection compareType() {
        return compareType(null);
    }

    public UserCustomizedStrResponseProjection compareType(String alias) {
        fields.add(new GraphQLResponseField("compareType").alias(alias));
        return this;
    }

    public UserCustomizedStrResponseProjection tagIds() {
        return tagIds(null);
    }

    public UserCustomizedStrResponseProjection tagIds(String alias) {
        fields.add(new GraphQLResponseField("tagIds").alias(alias));
        return this;
    }

    public UserCustomizedStrResponseProjection typename() {
        return typename(null);
    }

    public UserCustomizedStrResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
