package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field batchUpdateResourceAcl in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationBatchUpdateResourceAclParametrizedInput implements GraphQLParametrizedInput {

    private String resourceType;
    @javax.validation.constraints.NotNull
    private java.util.List<String> resourceIds;
    @javax.validation.constraints.NotNull
    private java.util.List<String> readers;
    @javax.validation.constraints.NotNull
    private java.util.List<String> editors;

    public MutationBatchUpdateResourceAclParametrizedInput() {
    }

    public MutationBatchUpdateResourceAclParametrizedInput(String resourceType, java.util.List<String> resourceIds, java.util.List<String> readers, java.util.List<String> editors) {
        this.resourceType = resourceType;
        this.resourceIds = resourceIds;
        this.readers = readers;
        this.editors = editors;
    }

    public MutationBatchUpdateResourceAclParametrizedInput resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public MutationBatchUpdateResourceAclParametrizedInput resourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public MutationBatchUpdateResourceAclParametrizedInput readers(java.util.List<String> readers) {
        this.readers = readers;
        return this;
    }

    public MutationBatchUpdateResourceAclParametrizedInput editors(java.util.List<String> editors) {
        this.editors = editors;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
        }
        if (resourceIds != null) {
            joiner.add("resourceIds: " + GraphQLRequestSerializer.getEntry(resourceIds));
        }
        if (readers != null) {
            joiner.add("readers: " + GraphQLRequestSerializer.getEntry(readers));
        }
        if (editors != null) {
            joiner.add("editors: " + GraphQLRequestSerializer.getEntry(editors));
        }
        return joiner.toString();
    }

}
