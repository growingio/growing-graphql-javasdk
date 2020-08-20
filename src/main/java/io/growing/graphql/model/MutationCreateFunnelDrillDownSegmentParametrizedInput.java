package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createFunnelDrillDownSegment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class MutationCreateFunnelDrillDownSegmentParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private FunnelDrillDownSegmentInputDto funnelDrillDownSegment;

    public MutationCreateFunnelDrillDownSegmentParametrizedInput() {
    }

    public MutationCreateFunnelDrillDownSegmentParametrizedInput(FunnelDrillDownSegmentInputDto funnelDrillDownSegment) {
        this.funnelDrillDownSegment = funnelDrillDownSegment;
    }

    public MutationCreateFunnelDrillDownSegmentParametrizedInput funnelDrillDownSegment(FunnelDrillDownSegmentInputDto funnelDrillDownSegment) {
        this.funnelDrillDownSegment = funnelDrillDownSegment;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (funnelDrillDownSegment != null) {
            joiner.add("funnelDrillDownSegment: " + GraphQLRequestSerializer.getEntry(funnelDrillDownSegment));
        }
        return joiner.toString();
    }

}
