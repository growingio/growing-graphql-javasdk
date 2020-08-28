package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createFunnelDrillDownSegmentSnapshot in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class MutationCreateFunnelDrillDownSegmentSnapshotParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private FunnelDrillDownSegmentInputDto funnelDrillDownSegment;

    public MutationCreateFunnelDrillDownSegmentSnapshotParametrizedInput() {
    }

    public MutationCreateFunnelDrillDownSegmentSnapshotParametrizedInput(FunnelDrillDownSegmentInputDto funnelDrillDownSegment) {
        this.funnelDrillDownSegment = funnelDrillDownSegment;
    }

    public MutationCreateFunnelDrillDownSegmentSnapshotParametrizedInput funnelDrillDownSegment(FunnelDrillDownSegmentInputDto funnelDrillDownSegment) {
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
