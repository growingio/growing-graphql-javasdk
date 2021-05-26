package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createDataCenterItemModel in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateDataCenterItemModelParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private ItemModelInputDto itemModel;

    public MutationCreateDataCenterItemModelParametrizedInput() {
    }

    public MutationCreateDataCenterItemModelParametrizedInput(ItemModelInputDto itemModel) {
        this.itemModel = itemModel;
    }

    public MutationCreateDataCenterItemModelParametrizedInput itemModel(ItemModelInputDto itemModel) {
        this.itemModel = itemModel;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (itemModel != null) {
            joiner.add("itemModel: " + GraphQLRequestSerializer.getEntry(itemModel));
        }
        return joiner.toString();
    }

}
