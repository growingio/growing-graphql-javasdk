package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field passwordValidation in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryPasswordValidationParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String identity;
    @javax.validation.constraints.NotNull
    private String password;

    public QueryPasswordValidationParametrizedInput() {
    }

    public QueryPasswordValidationParametrizedInput(String identity, String password) {
        this.identity = identity;
        this.password = password;
    }

    public QueryPasswordValidationParametrizedInput identity(String identity) {
        this.identity = identity;
        return this;
    }

    public QueryPasswordValidationParametrizedInput password(String password) {
        this.password = password;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (identity != null) {
            joiner.add("identity: " + GraphQLRequestSerializer.getEntry(identity));
        }
        if (password != null) {
            joiner.add("password: " + GraphQLRequestSerializer.getEntry(password));
        }
        return joiner.toString();
    }

}
