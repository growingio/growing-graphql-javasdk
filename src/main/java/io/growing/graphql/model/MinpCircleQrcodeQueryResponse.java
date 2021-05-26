package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 获取二维码长链
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MinpCircleQrcodeQueryResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "minpCircleQrcode";

    public MinpCircleQrcodeQueryResponse() {
    }

    /**
     * 获取二维码长链
     */
    public String minpCircleQrcode() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
