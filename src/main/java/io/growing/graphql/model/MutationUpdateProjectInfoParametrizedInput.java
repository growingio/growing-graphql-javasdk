package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateProjectInfo in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class MutationUpdateProjectInfoParametrizedInput implements GraphQLParametrizedInput {

    private ProjectInfoInputDto projectInfo;

    public MutationUpdateProjectInfoParametrizedInput() {
    }

    public MutationUpdateProjectInfoParametrizedInput(ProjectInfoInputDto projectInfo) {
        this.projectInfo = projectInfo;
    }

    public MutationUpdateProjectInfoParametrizedInput projectInfo(ProjectInfoInputDto projectInfo) {
        this.projectInfo = projectInfo;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectInfo != null) {
            joiner.add("projectInfo: " + GraphQLRequestSerializer.getEntry(projectInfo));
        }
        return joiner.toString();
    }

}
