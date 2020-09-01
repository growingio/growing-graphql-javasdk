package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class OriginDataSettingsQueryResponse extends GraphQLResult<Map<String, java.util.List<OriginDataSettingDto>>> {

    private static final String OPERATION_NAME = "originDataSettings";

    public OriginDataSettingsQueryResponse() {
    }

    public java.util.List<OriginDataSettingDto> originDataSettings() {
        Map<String, java.util.List<OriginDataSettingDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
