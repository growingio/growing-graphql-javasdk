package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createItemModel in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationCreateItemModelParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private ItemModelInputDto itemModel;

    public MutationCreateItemModelParametrizedInput() {
    }

    public MutationCreateItemModelParametrizedInput(ItemModelInputDto itemModel) {
        this.itemModel = itemModel;
    }

    public MutationCreateItemModelParametrizedInput itemModel(ItemModelInputDto itemModel) {
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
