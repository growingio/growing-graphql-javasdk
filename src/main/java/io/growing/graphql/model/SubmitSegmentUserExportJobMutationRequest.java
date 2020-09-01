package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class SubmitSegmentUserExportJobMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "submitSegmentUserExportJob";

    private Map<String, Object> input = new LinkedHashMap<>();

    public SubmitSegmentUserExportJobMutationRequest() {
    }

    public void setSegmentId(String segmentId) {
        this.input.put("segmentId", segmentId);
    }

    public void setTags(java.util.List<String> tags) {
        this.input.put("tags", tags);
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

        private String segmentId;
        private java.util.List<String> tags;
        private java.util.List<String> properties;
        private String charset;

        public Builder() {
        }

        public Builder setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }

        public Builder setTags(java.util.List<String> tags) {
            this.tags = tags;
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


        public SubmitSegmentUserExportJobMutationRequest build() {
            SubmitSegmentUserExportJobMutationRequest obj = new SubmitSegmentUserExportJobMutationRequest();
            obj.setSegmentId(segmentId);
            obj.setTags(tags);
            obj.setProperties(properties);
            obj.setCharset(charset);
            return obj;
        }

    }
}
