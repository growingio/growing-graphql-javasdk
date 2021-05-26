package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 如果userId在数据端为无效或不存在，则返回空
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UserProfileQueryResponse extends GraphQLResult<Map<String, UserProfileDto>> {

    private static final String OPERATION_NAME = "userProfile";

    public UserProfileQueryResponse() {
    }

    /**
     * 如果userId在数据端为无效或不存在，则返回空
     */
    public UserProfileDto userProfile() {
        Map<String, UserProfileDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
