package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 如果userId在数据端为无效或不存在，则返回空
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public interface DataCenterUserProfileQueryResolver {

    /**
     * 如果userId在数据端为无效或不存在，则返回空
     */
    UserProfileDto dataCenterUserProfile(String userId, java.util.List<String> tags, java.util.List<String> properties) throws Exception;

}