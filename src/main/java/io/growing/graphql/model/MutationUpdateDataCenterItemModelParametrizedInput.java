package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateDataCenterItemModel in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdateDataCenterItemModelParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private ItemModelInputDto itemModel;

    public MutationUpdateDataCenterItemModelParametrizedInput() {
    }

    public MutationUpdateDataCenterItemModelParametrizedInput(String id, ItemModelInputDto itemModel) {
        this.id = id;
        this.itemModel = itemModel;
    }

    public MutationUpdateDataCenterItemModelParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateDataCenterItemModelParametrizedInput itemModel(ItemModelInputDto itemModel) {
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
