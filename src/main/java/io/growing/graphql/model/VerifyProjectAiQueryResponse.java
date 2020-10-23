package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 检验SDK安装匹配
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class VerifyProjectAiQueryResponse extends GraphQLResult<Map<String, Boolean>> {

    private static final String OPERATION_NAME = "verifyProjectAi";

    public VerifyProjectAiQueryResponse() {
    }

    /**
     * 检验SDK安装匹配
     */
    public Boolean verifyProjectAi() {
        Map<String, Boolean> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
