package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心物品模型列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterItemModelsQueryResponse extends GraphQLResult<Map<String, java.util.List<ItemModelDto>>> {

    private static final String OPERATION_NAME = "dataCenterItemModels";

    public DataCenterItemModelsQueryResponse() {
    }

    /**
     * 数据中心物品模型列表
     */
    public java.util.List<ItemModelDto> dataCenterItemModels() {
        Map<String, java.util.List<ItemModelDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
