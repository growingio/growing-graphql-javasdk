package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 通过 id 获取数据中心的用户变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterUserVariableQueryResponse extends GraphQLResult<Map<String, UserVariableDto>> {

    private static final String OPERATION_NAME = "dataCenterUserVariable";

    public DataCenterUserVariableQueryResponse() {
    }

    /**
     * 通过 id 获取数据中心的用户变量
     */
    public UserVariableDto dataCenterUserVariable() {
        Map<String, UserVariableDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
