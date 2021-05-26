package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TestWebHookQueryResponse extends GraphQLResult<Map<String, WebHookResponseDto>> {

    private static final String OPERATION_NAME = "testWebHook";

    public TestWebHookQueryResponse() {
    }

    public WebHookResponseDto testWebHook() {
        Map<String, WebHookResponseDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
