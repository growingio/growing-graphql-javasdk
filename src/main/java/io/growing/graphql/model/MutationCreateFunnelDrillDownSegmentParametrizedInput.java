package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createFunnelDrillDownSegment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateFunnelDrillDownSegmentParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private FunnelDrillDownSegmentInputDto funnelDrillDownSegment;

    public MutationCreateFunnelDrillDownSegmentParametrizedInput() {
    }

    public MutationCreateFunnelDrillDownSegmentParametrizedInput(String projectId, FunnelDrillDownSegmentInputDto funnelDrillDownSegment) {
        this.projectId = projectId;
        this.funnelDrillDownSegment = funnelDrillDownSegment;
    }

    public MutationCreateFunnelDrillDownSegmentParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateFunnelDrillDownSegmentParametrizedInput funnelDrillDownSegment(FunnelDrillDownSegmentInputDto funnelDrillDownSegment) {
        this.funnelDrillDownSegment = funnelDrillDownSegment;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (funnelDrillDownSegment != null) {
            joiner.add("funnelDrillDownSegment: " + GraphQLRequestSerializer.getEntry(funnelDrillDownSegment));
        }
        return joiner.toString();
    }

}
