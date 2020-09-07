package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class SubmitTagUserExportJobMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "submitTagUserExportJob";

    private Map<String, Object> input = new LinkedHashMap<>();

    public SubmitTagUserExportJobMutationRequest() {
    }

    public void setTagId(String tagId) {
        this.input.put("tagId", tagId);
    }

    public void setProperties(java.util.List<String> properties) {
        this.input.put("properties", properties);
    }

    public void setCharset(String charset) {
        this.input.put("charset", charset);
    }

    public void setDetailExport(Boolean detailExport) {
        this.input.put("detailExport", detailExport);
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

        private String tagId;
        private java.util.List<String> properties;
        private String charset;
        private Boolean detailExport;

        public Builder() {
        }

        public Builder setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }

        public Builder setProperties(java.util.List<String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setCharset(String charset) {
            this.charset = charset;
            return this;
        }

        public Builder setDetailExport(Boolean detailExport) {
            this.detailExport = detailExport;
            return this;
        }


        public SubmitTagUserExportJobMutationRequest build() {
            SubmitTagUserExportJobMutationRequest obj = new SubmitTagUserExportJobMutationRequest();
            obj.setTagId(tagId);
            obj.setProperties(properties);
            obj.setCharset(charset);
            obj.setDetailExport(detailExport);
            return obj;
        }

    }
}
