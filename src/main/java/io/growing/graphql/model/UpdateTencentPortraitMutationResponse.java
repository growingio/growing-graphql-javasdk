package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateTencentPortraitMutationResponse extends GraphQLResult<Map<String, TencentPortraitDto>> {

    private static final String OPERATION_NAME = "updateTencentPortrait";

    public UpdateTencentPortraitMutationResponse() {
    }

    public TencentPortraitDto updateTencentPortrait() {
        Map<String, TencentPortraitDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
