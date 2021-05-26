package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 通过 id 获取数据中心的用户变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterUserVariableQueryResolver {

    /**
     * 通过 id 获取数据中心的用户变量
     */
    UserVariableDto dataCenterUserVariable(String id) throws Exception;

}