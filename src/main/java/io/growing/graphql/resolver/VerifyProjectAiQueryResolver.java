package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 检验SDK安装匹配
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public interface VerifyProjectAiQueryResolver {

    /**
     * 检验SDK安装匹配
     */
    @javax.validation.constraints.NotNull
    Boolean verifyProjectAi(String ai) throws Exception;

}