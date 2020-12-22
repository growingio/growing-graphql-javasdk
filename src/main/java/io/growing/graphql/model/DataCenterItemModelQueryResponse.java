package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 通过 id 获取数据中心的物品模型
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterItemModelQueryResponse extends GraphQLResult<Map<String, ItemModelDto>> {

    private static final String OPERATION_NAME = "dataCenterItemModel";

    public DataCenterItemModelQueryResponse() {
    }

    /**
     * 通过 id 获取数据中心的物品模型
     */
    public ItemModelDto dataCenterItemModel() {
        Map<String, ItemModelDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
