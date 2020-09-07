package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class CreateTunnelMutationResponse extends GraphQLResult<Map<String, TunnelDto>> {

    private static final String OPERATION_NAME = "createTunnel";

    public CreateTunnelMutationResponse() {
    }

    public TunnelDto createTunnel() {
        Map<String, TunnelDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
