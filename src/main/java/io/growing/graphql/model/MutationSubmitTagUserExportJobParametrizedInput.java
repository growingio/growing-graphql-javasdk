package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field submitTagUserExportJob in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class MutationSubmitTagUserExportJobParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String tagId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> properties;
    private String charset;

    public MutationSubmitTagUserExportJobParametrizedInput() {
    }

    public MutationSubmitTagUserExportJobParametrizedInput(String tagId, java.util.List<String> properties, String charset) {
        this.tagId = tagId;
        this.properties = properties;
        this.charset = charset;
    }

    public MutationSubmitTagUserExportJobParametrizedInput tagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    public MutationSubmitTagUserExportJobParametrizedInput properties(java.util.List<String> properties) {
        this.properties = properties;
        return this;
    }

    public MutationSubmitTagUserExportJobParametrizedInput charset(String charset) {
        this.charset = charset;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (tagId != null) {
            joiner.add("tagId: " + GraphQLRequestSerializer.getEntry(tagId));
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
