package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class AnalysisExportJobParamDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private AnalysisResourceTypeDto analysisType;

    public AnalysisExportJobParamDto() {
    }

    public AnalysisExportJobParamDto(AnalysisResourceTypeDto analysisType) {
        this.analysisType = analysisType;
    }

    public AnalysisResourceTypeDto getAnalysisType() {
        return analysisType;
    }
    public void setAnalysisType(AnalysisResourceTypeDto analysisType) {
        this.analysisType = analysisType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (analysisType != null) {
            joiner.add("analysisType: " + GraphQLRequestSerializer.getEntry(analysisType));
        }
        return joiner.toString();
    }

    public static AnalysisExportJobParamDto.Builder builder() {
        return new AnalysisExportJobParamDto.Builder();
    }

    public static class Builder {

        private AnalysisResourceTypeDto analysisType;

        public Builder() {
        }

        public Builder setAnalysisType(AnalysisResourceTypeDto analysisType) {
            this.analysisType = analysisType;
            return this;
        }


        public AnalysisExportJobParamDto build() {
            return new AnalysisExportJobParamDto(analysisType);
        }

    }
}
