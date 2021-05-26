package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 单个用户变量详情
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UserVariableQueryResponse extends GraphQLResult<Map<String, UserVariableDto>> {

    private static final String OPERATION_NAME = "userVariable";

    public UserVariableQueryResponse() {
    }

    /**
     * 单个用户变量详情
     */
    public UserVariableDto userVariable() {
        Map<String, UserVariableDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
