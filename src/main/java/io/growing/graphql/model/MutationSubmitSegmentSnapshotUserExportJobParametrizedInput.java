package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field submitSegmentSnapshotUserExportJob in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationSubmitSegmentSnapshotUserExportJobParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private java.util.List<String> tags;
    @javax.validation.constraints.NotNull
    private java.util.List<String> properties;
    private String charset;

    public MutationSubmitSegmentSnapshotUserExportJobParametrizedInput() {
    }

    public MutationSubmitSegmentSnapshotUserExportJobParametrizedInput(String projectId, String id, java.util.List<String> tags, java.util.List<String> properties, String charset) {
        this.projectId = projectId;
        this.id = id;
        this.tags = tags;
        this.properties = properties;
        this.charset = charset;
    }

    public MutationSubmitSegmentSnapshotUserExportJobParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationSubmitSegmentSnapshotUserExportJobParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationSubmitSegmentSnapshotUserExportJobParametrizedInput tags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public MutationSubmitSegmentSnapshotUserExportJobParametrizedInput properties(java.util.List<String> properties) {
        this.properties = properties;
        return this;
    }

    public MutationSubmitSegmentSnapshotUserExportJobParametrizedInput charset(String charset) {
        this.charset = charset;
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
        if (tags != null) {
            joiner.add("tags: " + GraphQLRequestSerializer.getEntry(tags));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (charset != null) {
            joiner.add("charset: " + GraphQLRequestSerializer.getEntry(charset));
        }
        return joiner.toString();
    }

}
