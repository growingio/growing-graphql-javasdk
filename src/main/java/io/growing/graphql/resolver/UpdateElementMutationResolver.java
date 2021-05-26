package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 无埋点 更新元素
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface UpdateElementMutationResolver {

    /**
     * 无埋点 更新元素
     */
    @javax.validation.constraints.NotNull
    ElementDto updateElement(String projectId, String id, ElementUpdateInputDto element) throws Exception;

}