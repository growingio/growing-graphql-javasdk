package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateResourceAcls in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class MutationUpdateResourceAclsParametrizedInput implements GraphQLParametrizedInput {

    private String resourceType;
    @javax.validation.constraints.NotNull
    private String resourceId;
    private AccessEntryInputDto accessEntry;

    public MutationUpdateResourceAclsParametrizedInput() {
    }

    public MutationUpdateResourceAclsParametrizedInput(String resourceType, String resourceId, AccessEntryInputDto accessEntry) {
        this.resourceType = resourceType;
        this.resourceId = resourceId;
        this.accessEntry = accessEntry;
    }

    public MutationUpdateResourceAclsParametrizedInput resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public MutationUpdateResourceAclsParametrizedInput resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public MutationUpdateResourceAclsParametrizedInput accessEntry(AccessEntryInputDto accessEntry) {
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
