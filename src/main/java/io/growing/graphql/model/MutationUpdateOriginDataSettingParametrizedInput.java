package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateOriginDataSetting in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class MutationUpdateOriginDataSettingParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private java.util.List<OriginDataSettingInputDto> originDatas;

    public MutationUpdateOriginDataSettingParametrizedInput() {
    }

    public MutationUpdateOriginDataSettingParametrizedInput(java.util.List<OriginDataSettingInputDto> originDatas) {
        this.originDatas = originDatas;
    }

    public MutationUpdateOriginDataSettingParametrizedInput originDatas(java.util.List<OriginDataSettingInputDto> originDatas) {
        this.originDatas = originDatas;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (originDatas != null) {
            joiner.add("originDatas: " + GraphQLRequestSerializer.getEntry(originDatas));
        }
        return joiner.toString();
    }

}
