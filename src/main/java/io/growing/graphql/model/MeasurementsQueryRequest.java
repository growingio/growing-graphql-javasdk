package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MeasurementsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "measurements";

    private Map<String, Object> input = new LinkedHashMap<>();

    public MeasurementsQueryRequest() {
    }

    public void setT(java.util.List<String> t) {
        this.input.put("t", t);
    }

    public void setQ(String q) {
        this.input.put("q", q);
    }

    public void setC(String c) {
        this.input.put("c", c);
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

        private java.util.List<String> t;
        private String q;
        private String c;

        public Builder() {
        }

        public Builder setT(java.util.List<String> t) {
            this.t = t;
            return this;
        }

        public Builder setQ(String q) {
            this.q = q;
            return this;
        }

        public Builder setC(String c) {
            this.c = c;
            return this;
        }


        public MeasurementsQueryRequest build() {
            MeasurementsQueryRequest obj = new MeasurementsQueryRequest();
            obj.setT(t);
            obj.setQ(q);
            obj.setC(c);
            return obj;
        }

    }
}
