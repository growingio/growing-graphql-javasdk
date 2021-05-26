package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 获取水印配置
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class WaterMarkSettingQueryResponse extends GraphQLResult<Map<String, WaterMarkSettingDto>> {

    private static final String OPERATION_NAME = "waterMarkSetting";

    public WaterMarkSettingQueryResponse() {
    }

    /**
     * 获取水印配置
     */
    public WaterMarkSettingDto waterMarkSetting() {
        Map<String, WaterMarkSettingDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
