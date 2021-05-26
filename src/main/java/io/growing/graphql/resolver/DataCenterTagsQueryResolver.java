package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心标签列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public interface DataCenterTagsQueryResolver {

    /**
     * 数据中心标签列表
     */
    java.util.List<TagDto> dataCenterTags() throws Exception;

}