package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field acceptAccountApplication in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationAcceptAccountApplicationParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    private AccountApplicationInputDto input;

    public MutationAcceptAccountApplicationParametrizedInput() {
    }

    public MutationAcceptAccountApplicationParametrizedInput(String id, AccountApplicationInputDto input) {
        this.id = id;
        this.input = input;
    }

    public MutationAcceptAccountApplicationParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationAcceptAccountApplicationParametrizedInput input(AccountApplicationInputDto input) {
        this.input = input;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (input != null) {
            joiner.add("input: " + GraphQLRequestSerializer.getEntry(input));
        }
        return joiner.toString();
    }

}
