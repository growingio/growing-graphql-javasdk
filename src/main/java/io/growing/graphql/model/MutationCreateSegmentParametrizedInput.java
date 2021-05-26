package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createSegment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateSegmentParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private SegmentInputDto segment;

    public MutationCreateSegmentParametrizedInput() {
    }

    public MutationCreateSegmentParametrizedInput(String projectId, SegmentInputDto segment) {
        this.projectId = projectId;
        this.segment = segment;
    }

    public MutationCreateSegmentParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateSegmentParametrizedInput segment(SegmentInputDto segment) {
        this.segment = segment;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (segment != null) {
            joiner.add("segment: " + GraphQLRequestSerializer.getEntry(segment));
        }
        return joiner.toString();
    }

}
