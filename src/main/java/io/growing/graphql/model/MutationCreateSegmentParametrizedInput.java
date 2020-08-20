package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createSegment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class MutationCreateSegmentParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private SegmentInputDto segment;

    public MutationCreateSegmentParametrizedInput() {
    }

    public MutationCreateSegmentParametrizedInput(SegmentInputDto segment) {
        this.segment = segment;
    }

    public MutationCreateSegmentParametrizedInput segment(SegmentInputDto segment) {
        this.segment = segment;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (segment != null) {
            joiner.add("segment: " + GraphQLRequestSerializer.getEntry(segment));
        }
        return joiner.toString();
    }

}
