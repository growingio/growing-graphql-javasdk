package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心 更新物品模型
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateDataCenterItemModelMutationResponse extends GraphQLResult<Map<String, ItemModelDto>> {

    private static final String OPERATION_NAME = "updateDataCenterItemModel";

    public UpdateDataCenterItemModelMutationResponse() {
    }

    /**
     * 数据中心 更新物品模型
     */
    public ItemModelDto updateDataCenterItemModel() {
        Map<String, ItemModelDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
