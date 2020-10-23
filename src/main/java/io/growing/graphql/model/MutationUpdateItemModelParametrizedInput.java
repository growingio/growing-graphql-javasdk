package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateItemModel in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class MutationUpdateItemModelParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private ItemModelInputDto itemModel;

    public MutationUpdateItemModelParametrizedInput() {
    }

    public MutationUpdateItemModelParametrizedInput(String id, ItemModelInputDto itemModel) {
        this.id = id;
        this.itemModel = itemModel;
    }

    public MutationUpdateItemModelParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateItemModelParametrizedInput itemModel(ItemModelInputDto itemModel) {
        this.itemModel = itemModel;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (itemModel != null) {
            joiner.add("itemModel: " + GraphQLRequestSerializer.getEntry(itemModel));
        }
        return joiner.toString();
    }

}
