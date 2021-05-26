package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field getTGIStatisticData in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryGetTGIStatisticDataParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String segmentId;

    public QueryGetTGIStatisticDataParametrizedInput() {
    }

    public QueryGetTGIStatisticDataParametrizedInput(String projectId, String segmentId) {
        this.projectId = projectId;
        this.segmentId = segmentId;
    }

    public QueryGetTGIStatisticDataParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryGetTGIStatisticDataParametrizedInput segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (segmentId != null) {
            joiner.add("segmentId: " + GraphQLRequestSerializer.getEntry(segmentId));
        }
        return joiner.toString();
    }

}
