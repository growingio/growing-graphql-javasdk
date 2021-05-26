package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updatePasswordRecoverySetting in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdatePasswordRecoverySettingParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private PasswordRecoverySettingInputDto input;

    public MutationUpdatePasswordRecoverySettingParametrizedInput() {
    }

    public MutationUpdatePasswordRecoverySettingParametrizedInput(PasswordRecoverySettingInputDto input) {
        this.input = input;
    }

    public MutationUpdatePasswordRecoverySettingParametrizedInput input(PasswordRecoverySettingInputDto input) {
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
