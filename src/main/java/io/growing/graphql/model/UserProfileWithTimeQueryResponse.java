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
public class UserProfileWithTimeQueryResponse extends GraphQLResult<Map<String, java.util.List<TimeUserProfileDto>>> {

    private static final String OPERATION_NAME = "userProfileWithTime";

    public UserProfileWithTimeQueryResponse() {
    }

    /**
     * 如果userId在数据端为无效或不存在，则返回空
     */
    public java.util.List<TimeUserProfileDto> userProfileWithTime() {
        Map<String, java.util.List<TimeUserProfileDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
