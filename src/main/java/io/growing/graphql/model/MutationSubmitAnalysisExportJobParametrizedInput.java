package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field submitAnalysisExportJob in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class MutationSubmitAnalysisExportJobParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private AnalysisExportJobParamDto param;
    private String charset;

    public MutationSubmitAnalysisExportJobParametrizedInput() {
    }

    public MutationSubmitAnalysisExportJobParametrizedInput(String id, AnalysisExportJobParamDto param, String charset) {
        this.id = id;
        this.param = param;
        this.charset = charset;
    }

    public MutationSubmitAnalysisExportJobParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationSubmitAnalysisExportJobParametrizedInput param(AnalysisExportJobParamDto param) {
        this.param = param;
        return this;
    }

    public MutationSubmitAnalysisExportJobParametrizedInput charset(String charset) {
        this.charset = charset;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (param != null) {
            joiner.add("param: " + GraphQLRequestSerializer.getEntry(param));
        }
        if (charset != null) {
            joiner.add("charset: " + GraphQLRequestSerializer.getEntry(charset));
        }
        return joiner.toString();
    }

}
