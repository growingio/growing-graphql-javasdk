package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dataCenterAddItemModelAttribute in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationDataCenterAddItemModelAttributeParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private ItemVariableInputDto attribute;

    public MutationDataCenterAddItemModelAttributeParametrizedInput() {
    }

    public MutationDataCenterAddItemModelAttributeParametrizedInput(String id, ItemVariableInputDto attribute) {
        this.id = id;
        this.attribute = attribute;
    }

    public MutationDataCenterAddItemModelAttributeParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationDataCenterAddItemModelAttributeParametrizedInput attribute(ItemVariableInputDto attribute) {
        this.attribute = attribute;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (attribute != null) {
            joiner.add("attribute: " + GraphQLRequestSerializer.getEntry(attribute));
        }
        return joiner.toString();
    }

}
