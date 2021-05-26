package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class GetTunnelEventsTrendQueryResponse extends GraphQLResult<Map<String, TunnelEventsTrendDto>> {

    private static final String OPERATION_NAME = "getTunnelEventsTrend";

    public GetTunnelEventsTrendQueryResponse() {
    }

    public TunnelEventsTrendDto getTunnelEventsTrend() {
        Map<String, TunnelEventsTrendDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
