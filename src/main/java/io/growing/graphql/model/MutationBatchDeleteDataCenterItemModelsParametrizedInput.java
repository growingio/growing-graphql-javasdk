package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field batchDeleteDataCenterItemModels in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationBatchDeleteDataCenterItemModelsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private java.util.List<String> ids;

    public MutationBatchDeleteDataCenterItemModelsParametrizedInput() {
    }

    public MutationBatchDeleteDataCenterItemModelsParametrizedInput(java.util.List<String> ids) {
        this.ids = ids;
    }

    public MutationBatchDeleteDataCenterItemModelsParametrizedInput ids(java.util.List<String> ids) {
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
