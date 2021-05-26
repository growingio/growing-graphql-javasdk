package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class HubbleQueryResponse extends GraphQLResult<Map<String, HubbleInfoDto>> {

    private static final String OPERATION_NAME = "hubble";

    public HubbleQueryResponse() {
    }

    public HubbleInfoDto hubble() {
        Map<String, HubbleInfoDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
