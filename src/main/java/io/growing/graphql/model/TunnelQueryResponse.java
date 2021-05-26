package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TunnelQueryResponse extends GraphQLResult<Map<String, TunnelDto>> {

    private static final String OPERATION_NAME = "tunnel";

    public TunnelQueryResponse() {
    }

    public TunnelDto tunnel() {
        Map<String, TunnelDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
