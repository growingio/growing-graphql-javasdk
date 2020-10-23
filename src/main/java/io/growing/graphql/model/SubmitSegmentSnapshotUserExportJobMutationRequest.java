package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class SubmitSegmentSnapshotUserExportJobMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "submitSegmentSnapshotUserExportJob";

    private Map<String, Object> input = new LinkedHashMap<>();

    public SubmitSegmentSnapshotUserExportJobMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setProperties(java.util.List<String> properties) {
        this.input.put("properties", properties);
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

        private String id;
        private java.util.List<String> properties;
        private String charset;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
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


        public SubmitSegmentSnapshotUserExportJobMutationRequest build() {
            SubmitSegmentSnapshotUserExportJobMutationRequest obj = new SubmitSegmentSnapshotUserExportJobMutationRequest();
            obj.setId(id);
            obj.setProperties(properties);
            obj.setCharset(charset);
            return obj;
        }

    }
}
