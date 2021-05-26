package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateDataCenterInfo in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdateDataCenterInfoParametrizedInput implements GraphQLParametrizedInput {

    private DataCenterInfoInputDto dataCenterInfo;

    public MutationUpdateDataCenterInfoParametrizedInput() {
    }

    public MutationUpdateDataCenterInfoParametrizedInput(DataCenterInfoInputDto dataCenterInfo) {
        this.dataCenterInfo = dataCenterInfo;
    }

    public MutationUpdateDataCenterInfoParametrizedInput dataCenterInfo(DataCenterInfoInputDto dataCenterInfo) {
        this.dataCenterInfo = dataCenterInfo;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (dataCenterInfo != null) {
            joiner.add("dataCenterInfo: " + GraphQLRequestSerializer.getEntry(dataCenterInfo));
        }
        return joiner.toString();
    }

}
