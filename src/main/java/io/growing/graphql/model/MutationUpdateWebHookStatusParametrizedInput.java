package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateWebHookStatus in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdateWebHookStatusParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String status;

    public MutationUpdateWebHookStatusParametrizedInput() {
    }

    public MutationUpdateWebHookStatusParametrizedInput(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public MutationUpdateWebHookStatusParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateWebHookStatusParametrizedInput status(String status) {
        this.status = status;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        return joiner.toString();
    }

}
