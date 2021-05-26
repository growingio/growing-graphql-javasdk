package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心的用户变量数量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CountDataCenterUserVariablesQueryResponse extends GraphQLResult<Map<String, Integer>> {

    private static final String OPERATION_NAME = "countDataCenterUserVariables";

    public CountDataCenterUserVariablesQueryResponse() {
    }

    /**
     * 数据中心的用户变量数量
     */
    public Integer countDataCenterUserVariables() {
        Map<String, Integer> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
