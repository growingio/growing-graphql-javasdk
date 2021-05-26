package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * @param fieldValue：字段值  fieldType：字段类型（枚举值）
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CheckTagFieldExistenceQueryResponse extends GraphQLResult<Map<String, Boolean>> {

    private static final String OPERATION_NAME = "checkTagFieldExistence";

    public CheckTagFieldExistenceQueryResponse() {
    }

    /**
     * @param fieldValue：字段值  fieldType：字段类型（枚举值）
     */
    public Boolean checkTagFieldExistence() {
        Map<String, Boolean> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
