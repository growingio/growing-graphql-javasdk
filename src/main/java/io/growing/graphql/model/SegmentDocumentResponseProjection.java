package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SegmentDocument
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class SegmentDocumentResponseProjection extends GraphQLResponseProjection {

    public SegmentDocumentResponseProjection() {
    }

    @Override
    public SegmentDocumentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SegmentDocumentResponseProjection all$(int maxDepth) {
        this.id();
        this.fileName();
        this.sourceType();
        this.typename();
        return this;
    }

    public SegmentDocumentResponseProjection id() {
        return id(null);
    }

    public SegmentDocumentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SegmentDocumentResponseProjection fileName() {
        return fileName(null);
    }

    public SegmentDocumentResponseProjection fileName(String alias) {
        fields.add(new GraphQLResponseField("fileName").alias(alias));
        return this;
    }

    public SegmentDocumentResponseProjection sourceType() {
        return sourceType(null);
    }

    public SegmentDocumentResponseProjection sourceType(String alias) {
        fields.add(new GraphQLResponseField("sourceType").alias(alias));
        return this;
    }

    public SegmentDocumentResponseProjection typename() {
        return typename(null);
    }

    public SegmentDocumentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
