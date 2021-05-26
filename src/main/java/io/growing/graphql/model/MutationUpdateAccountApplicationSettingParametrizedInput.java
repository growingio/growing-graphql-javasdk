package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateAccountApplicationSetting in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdateAccountApplicationSettingParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private AccountApplicationSettingInputDto input;

    public MutationUpdateAccountApplicationSettingParametrizedInput() {
    }

    public MutationUpdateAccountApplicationSettingParametrizedInput(AccountApplicationSettingInputDto input) {
        this.input = input;
    }

    public MutationUpdateAccountApplicationSettingParametrizedInput input(AccountApplicationSettingInputDto input) {
        this.input = input;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (input != null) {
            joiner.add("input: " + GraphQLRequestSerializer.getEntry(input));
        }
        return joiner.toString();
    }

}
