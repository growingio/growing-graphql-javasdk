package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 单个用户变量详情
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface UserVariableQueryResolver {

    /**
     * 单个用户变量详情
     */
    UserVariableDto userVariable(String projectId, String id) throws Exception;

}