package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateSegment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class MutationUpdateSegmentParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private SegmentInputDto segment;

    public MutationUpdateSegmentParametrizedInput() {
    }

    public MutationUpdateSegmentParametrizedInput(String id, SegmentInputDto segment) {
        this.id = id;
        this.segment = segment;
    }

    public MutationUpdateSegmentParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateSegmentParametrizedInput segment(SegmentInputDto segment) {
        this.segment = segment;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (segment != null) {
            joiner.add("segment: " + GraphQLRequestSerializer.getEntry(segment));
        }
        return joiner.toString();
    }

}
