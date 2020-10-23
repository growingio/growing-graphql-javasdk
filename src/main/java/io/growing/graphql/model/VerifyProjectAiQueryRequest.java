package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 检验SDK安装匹配
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class VerifyProjectAiQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "verifyProjectAi";

    private Map<String, Object> input = new LinkedHashMap<>();

    public VerifyProjectAiQueryRequest() {
    }

    public void setAi(String ai) {
        this.input.put("ai", ai);
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

        private String ai;

        public Builder() {
        }

        public Builder setAi(String ai) {
            this.ai = ai;
            return this;
        }


        public VerifyProjectAiQueryRequest build() {
            VerifyProjectAiQueryRequest obj = new VerifyProjectAiQueryRequest();
            obj.setAi(ai);
            return obj;
        }

    }
}
