package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 无埋点 创建元素
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CreateElementMutationResolver {

    /**
     * 无埋点 创建元素
     */
    @javax.validation.constraints.NotNull
    ElementDto createElement(String projectId, ElementInputDto element) throws Exception;

}