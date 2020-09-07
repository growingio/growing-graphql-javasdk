package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field addItemModelAttribute in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class MutationAddItemModelAttributeParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private ItemVariableInputDto attribute;

    public MutationAddItemModelAttributeParametrizedInput() {
    }

    public MutationAddItemModelAttributeParametrizedInput(String id, ItemVariableInputDto attribute) {
        this.id = id;
        this.attribute = attribute;
    }

    public MutationAddItemModelAttributeParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationAddItemModelAttributeParametrizedInput attribute(ItemVariableInputDto attribute) {
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
