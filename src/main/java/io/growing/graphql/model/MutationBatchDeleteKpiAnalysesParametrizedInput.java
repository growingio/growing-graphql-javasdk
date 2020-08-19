package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field batchDeleteKpiAnalyses in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationBatchDeleteKpiAnalysesParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private java.util.List<String> ids;

    public MutationBatchDeleteKpiAnalysesParametrizedInput() {
    }

    public MutationBatchDeleteKpiAnalysesParametrizedInput(java.util.List<String> ids) {
        this.ids = ids;
    }

    public MutationBatchDeleteKpiAnalysesParametrizedInput ids(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (ids != null) {
            joiner.add("ids: " + GraphQLRequestSerializer.getEntry(ids));
        }
        return joiner.toString();
    }

}
