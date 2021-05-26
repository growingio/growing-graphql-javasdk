package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateDataCenterResourceAcls in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdateDataCenterResourceAclsParametrizedInput implements GraphQLParametrizedInput {

    private String resourceType;
    @javax.validation.constraints.NotNull
    private String resourceId;
    private AccessEntryInputDto accessEntry;

    public MutationUpdateDataCenterResourceAclsParametrizedInput() {
    }

    public MutationUpdateDataCenterResourceAclsParametrizedInput(String resourceType, String resourceId, AccessEntryInputDto accessEntry) {
        this.resourceType = resourceType;
        this.resourceId = resourceId;
        this.accessEntry = accessEntry;
    }

    public MutationUpdateDataCenterResourceAclsParametrizedInput resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public MutationUpdateDataCenterResourceAclsParametrizedInput resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public MutationUpdateDataCenterResourceAclsParametrizedInput accessEntry(AccessEntryInputDto accessEntry) {
        this.accessEntry = accessEntry;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
        }
        if (resourceId != null) {
            joiner.add("resourceId: " + GraphQLRequestSerializer.getEntry(resourceId));
        }
        if (accessEntry != null) {
            joiner.add("accessEntry: " + GraphQLRequestSerializer.getEntry(accessEntry));
        }
        return joiner.toString();
    }

}
