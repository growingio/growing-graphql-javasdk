package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 通过 id 获取数据中心的用户变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface DataCenterUserVariableQueryResolver {

    /**
     * 通过 id 获取数据中心的用户变量
     */
    UserVariableDto dataCenterUserVariable(String id) throws Exception;

}