package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * * 通过id查询分组信息
* @param ids id列表
* @return 对应id的标签分组信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface QueryGroupByIdsQueryResolver {

    /**
     * * 通过id查询分组信息
* @param ids id列表
* @return 对应id的标签分组信息
     */
    @javax.validation.constraints.NotNull
    java.util.List<TagGroupInfoDto> queryGroupByIds(java.util.List<String> ids) throws Exception;

}