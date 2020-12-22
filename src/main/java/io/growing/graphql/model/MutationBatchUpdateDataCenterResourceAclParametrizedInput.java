package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field batchUpdateDataCenterResourceAcl in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationBatchUpdateDataCenterResourceAclParametrizedInput implements GraphQLParametrizedInput {

    private String resourceType;
    @javax.validation.constraints.NotNull
    private java.util.List<String> resourceIds;
    @javax.validation.constraints.NotNull
    private java.util.List<String> readers;
    @javax.validation.constraints.NotNull
    private java.util.List<String> editors;
    private String projectId;

    public MutationBatchUpdateDataCenterResourceAclParametrizedInput() {
    }

    public MutationBatchUpdateDataCenterResourceAclParametrizedInput(String resourceType, java.util.List<String> resourceIds, java.util.List<String> readers, java.util.List<String> editors, String projectId) {
        this.resourceType = resourceType;
        this.resourceIds = resourceIds;
        this.readers = readers;
        this.editors = editors;
        this.projectId = projectId;
    }

    public MutationBatchUpdateDataCenterResourceAclParametrizedInput resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public MutationBatchUpdateDataCenterResourceAclParametrizedInput resourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public MutationBatchUpdateDataCenterResourceAclParametrizedInput readers(java.util.List<String> readers) {
        this.readers = readers;
        return this;
    }

    public MutationBatchUpdateDataCenterResourceAclParametrizedInput editors(java.util.List<String> editors) {
        this.editors = editors;
        return this;
    }

    public MutationBatchUpdateDataCenterResourceAclParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
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
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        return joiner.toString();
    }

}
