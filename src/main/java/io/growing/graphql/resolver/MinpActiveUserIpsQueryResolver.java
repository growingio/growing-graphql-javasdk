package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 获取IP，返回productId关联的，最多5个
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface MinpActiveUserIpsQueryResolver {

    /**
     * 获取IP，返回productId关联的，最多5个
     */
    @javax.validation.constraints.NotNull
    java.util.List<String> minpActiveUserIps(String productId) throws Exception;

}