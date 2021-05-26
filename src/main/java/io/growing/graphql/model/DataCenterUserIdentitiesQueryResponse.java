package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心的 用户ID - 所有属性均为预置的用户标识符
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterUserIdentitiesQueryResponse extends GraphQLResult<Map<String, java.util.List<UserIdentityDto>>> {

    private static final String OPERATION_NAME = "dataCenterUserIdentities";

    public DataCenterUserIdentitiesQueryResponse() {
    }

    /**
     * 数据中心的 用户ID - 所有属性均为预置的用户标识符
     */
    public java.util.List<UserIdentityDto> dataCenterUserIdentities() {
        Map<String, java.util.List<UserIdentityDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
