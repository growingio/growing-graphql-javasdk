package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 获取IP，返回productId关联的，最多5个
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class MinpActiveUserIpsQueryResponse extends GraphQLResult<Map<String, java.util.List<String>>> {

    private static final String OPERATION_NAME = "minpActiveUserIps";

    public MinpActiveUserIpsQueryResponse() {
    }

    /**
     * 获取IP，返回productId关联的，最多5个
     */
    public java.util.List<String> minpActiveUserIps() {
        Map<String, java.util.List<String>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
