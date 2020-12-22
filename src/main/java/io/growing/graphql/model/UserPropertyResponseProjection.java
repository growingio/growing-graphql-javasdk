package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserProperty
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class UserPropertyResponseProjection extends GraphQLResponseProjection {

    public UserPropertyResponseProjection() {
    }

    @Override
    public UserPropertyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserPropertyResponseProjection all$(int maxDepth) {
        this.id();
        this.key();
        this.name();
        this.platform();
        this.description();
        this.example();
        this.typename();
        return this;
    }

    public UserPropertyResponseProjection id() {
        return id(null);
    }

    public UserPropertyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserPropertyResponseProjection key() {
        return key(null);
    }

    public UserPropertyResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public UserPropertyResponseProjection name() {
        return name(null);
    }

    public UserPropertyResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public UserPropertyResponseProjection platform() {
        return platform(null);
    }

    public UserPropertyResponseProjection platform(String alias) {
        fields.add(new GraphQLResponseField("platform").alias(alias));
        return this;
    }

    public UserPropertyResponseProjection description() {
        return description(null);
    }

    public UserPropertyResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public UserPropertyResponseProjection example() {
        return example(null);
    }

    public UserPropertyResponseProjection example(String alias) {
        fields.add(new GraphQLResponseField("example").alias(alias));
        return this;
    }

    public UserPropertyResponseProjection typename() {
        return typename(null);
    }

    public UserPropertyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
