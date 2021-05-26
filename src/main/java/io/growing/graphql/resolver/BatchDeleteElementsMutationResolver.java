package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 无埋点 批量删除元素
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface BatchDeleteElementsMutationResolver {

    /**
     * 无埋点 批量删除元素
     */
    Boolean batchDeleteElements(String projectId, java.util.List<String> ids) throws Exception;

}