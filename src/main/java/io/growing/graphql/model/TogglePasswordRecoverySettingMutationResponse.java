package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class TogglePasswordRecoverySettingMutationResponse extends GraphQLResult<Map<String, PasswordRecoverySettingDto>> {

    private static final String OPERATION_NAME = "togglePasswordRecoverySetting";

    public TogglePasswordRecoverySettingMutationResponse() {
    }

    public PasswordRecoverySettingDto togglePasswordRecoverySetting() {
        Map<String, PasswordRecoverySettingDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
