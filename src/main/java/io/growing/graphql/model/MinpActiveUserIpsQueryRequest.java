package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 获取IP，返回productId关联的，最多5个
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MinpActiveUserIpsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "minpActiveUserIps";

    private Map<String, Object> input = new LinkedHashMap<>();

    public MinpActiveUserIpsQueryRequest() {
    }

    public void setProductId(String productId) {
        this.input.put("productId", productId);
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

        private String productId;

        public Builder() {
        }

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }


        public MinpActiveUserIpsQueryRequest build() {
            MinpActiveUserIpsQueryRequest obj = new MinpActiveUserIpsQueryRequest();
            obj.setProductId(productId);
            return obj;
        }

    }
}
