package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心 更新用户属性
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateDataCenterUserVariableMutationResponse extends GraphQLResult<Map<String, UserVariableDto>> {

    private static final String OPERATION_NAME = "updateDataCenterUserVariable";

    public UpdateDataCenterUserVariableMutationResponse() {
    }

    /**
     * 数据中心 更新用户属性
     */
    public UserVariableDto updateDataCenterUserVariable() {
        Map<String, UserVariableDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
