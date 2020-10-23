package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateElement in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class MutationUpdateElementParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private ElementUpdateInputDto element;

    public MutationUpdateElementParametrizedInput() {
    }

    public MutationUpdateElementParametrizedInput(String id, ElementUpdateInputDto element) {
        this.id = id;
        this.element = element;
    }

    public MutationUpdateElementParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateElementParametrizedInput element(ElementUpdateInputDto element) {
        this.element = element;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (element != null) {
            joiner.add("element: " + GraphQLRequestSerializer.getEntry(element));
        }
        return joiner.toString();
    }

}
