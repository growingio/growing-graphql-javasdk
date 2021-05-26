package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateTencentPortrait in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdateTencentPortraitParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private TencentPortraitInputDto tencentPortrait;

    public MutationUpdateTencentPortraitParametrizedInput() {
    }

    public MutationUpdateTencentPortraitParametrizedInput(String projectId, String id, TencentPortraitInputDto tencentPortrait) {
        this.projectId = projectId;
        this.id = id;
        this.tencentPortrait = tencentPortrait;
    }

    public MutationUpdateTencentPortraitParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationUpdateTencentPortraitParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateTencentPortraitParametrizedInput tencentPortrait(TencentPortraitInputDto tencentPortrait) {
        this.tencentPortrait = tencentPortrait;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (tencentPortrait != null) {
            joiner.add("tencentPortrait: " + GraphQLRequestSerializer.getEntry(tencentPortrait));
        }
        return joiner.toString();
    }

}
