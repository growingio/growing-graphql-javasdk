package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class ToggleAccountApplicationSettingMutationResponse extends GraphQLResult<Map<String, AccountApplicationSettingDto>> {

    private static final String OPERATION_NAME = "toggleAccountApplicationSetting";

    public ToggleAccountApplicationSettingMutationResponse() {
    }

    public AccountApplicationSettingDto toggleAccountApplicationSetting() {
        Map<String, AccountApplicationSettingDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
