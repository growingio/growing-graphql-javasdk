package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 获取二维码长链
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface MinpCircleQrcodeQueryResolver {

    /**
     * 获取二维码长链
     */
    @javax.validation.constraints.NotNull
    String minpCircleQrcode(String productId) throws Exception;

}