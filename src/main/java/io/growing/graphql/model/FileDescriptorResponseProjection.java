package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for FileDescriptor
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class FileDescriptorResponseProjection extends GraphQLResponseProjection {

    public FileDescriptorResponseProjection() {
    }

    @Override
    public FileDescriptorResponseProjection all$() {
        return all$(3);
    }

    @Override
    public FileDescriptorResponseProjection all$(int maxDepth) {
        this.name();
        this.owner();
        this.size();
        this.checksum();
        this.lastModified();
        this.typename();
        return this;
    }

    public FileDescriptorResponseProjection name() {
        return name(null);
    }

    public FileDescriptorResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FileDescriptorResponseProjection owner() {
        return owner(null);
    }

    public FileDescriptorResponseProjection owner(String alias) {
        fields.add(new GraphQLResponseField("owner").alias(alias));
        return this;
    }

    public FileDescriptorResponseProjection size() {
        return size(null);
    }

    public FileDescriptorResponseProjection size(String alias) {
        fields.add(new GraphQLResponseField("size").alias(alias));
        return this;
    }

    public FileDescriptorResponseProjection checksum() {
        return checksum(null);
    }

    public FileDescriptorResponseProjection checksum(String alias) {
        fields.add(new GraphQLResponseField("checksum").alias(alias));
        return this;
    }

    public FileDescriptorResponseProjection lastModified() {
        return lastModified(null);
    }

    public FileDescriptorResponseProjection lastModified(String alias) {
        fields.add(new GraphQLResponseField("lastModified").alias(alias));
        return this;
    }

    public FileDescriptorResponseProjection typename() {
        return typename(null);
    }

    public FileDescriptorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
