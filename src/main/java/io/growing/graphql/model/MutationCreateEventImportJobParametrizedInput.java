package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createEventImportJob in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class MutationCreateEventImportJobParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String tunnelId;
    private String timeRange;

    public MutationCreateEventImportJobParametrizedInput() {
    }

    public MutationCreateEventImportJobParametrizedInput(String tunnelId, String timeRange) {
        this.tunnelId = tunnelId;
        this.timeRange = timeRange;
    }

    public MutationCreateEventImportJobParametrizedInput tunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }

    public MutationCreateEventImportJobParametrizedInput timeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (tunnelId != null) {
            joiner.add("tunnelId: " + GraphQLRequestSerializer.getEntry(tunnelId));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        return joiner.toString();
    }

}
