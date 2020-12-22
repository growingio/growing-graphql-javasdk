package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class SubmitAnalysisExportJobMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "submitAnalysisExportJob";

    private Map<String, Object> input = new LinkedHashMap<>();

    public SubmitAnalysisExportJobMutationRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setParam(AnalysisExportJobParamDto param) {
        this.input.put("param", param);
    }

    public void setCharset(String charset) {
        this.input.put("charset", charset);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String projectId;
        private String id;
        private AnalysisExportJobParamDto param;
        private String charset;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setParam(AnalysisExportJobParamDto param) {
            this.param = param;
            return this;
        }

        public Builder setCharset(String charset) {
            this.charset = charset;
            return this;
        }


        public SubmitAnalysisExportJobMutationRequest build() {
            SubmitAnalysisExportJobMutationRequest obj = new SubmitAnalysisExportJobMutationRequest();
            obj.setProjectId(projectId);
            obj.setId(id);
            obj.setParam(param);
            obj.setCharset(charset);
            return obj;
        }

    }
}
