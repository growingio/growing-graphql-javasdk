package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 无埋点 元素列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface ElementsQueryResolver {

    /**
     * 无埋点 元素列表
     */
    java.util.List<ElementDto> elements(String projectId) throws Exception;

}