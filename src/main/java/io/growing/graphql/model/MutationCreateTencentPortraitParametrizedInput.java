package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createTencentPortrait in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateTencentPortraitParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private TencentPortraitInputDto tencentPortrait;

    public MutationCreateTencentPortraitParametrizedInput() {
    }

    public MutationCreateTencentPortraitParametrizedInput(String projectId, TencentPortraitInputDto tencentPortrait) {
        this.projectId = projectId;
        this.tencentPortrait = tencentPortrait;
    }

    public MutationCreateTencentPortraitParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateTencentPortraitParametrizedInput tencentPortrait(TencentPortraitInputDto tencentPortrait) {
        this.tencentPortrait = tencentPortrait;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (tencentPortrait != null) {
            joiner.add("tencentPortrait: " + GraphQLRequestSerializer.getEntry(tencentPortrait));
        }
        return joiner.toString();
    }

}
