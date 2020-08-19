package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class CreateTunnelMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createTunnel";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateTunnelMutationRequest() {
    }

    public void setTunnel(TunnelInputDto tunnel) {
        this.input.put("tunnel", tunnel);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private TunnelInputDto tunnel;

        public Builder() {
        }

        public Builder setTunnel(TunnelInputDto tunnel) {
            this.tunnel = tunnel;
            return this;
        }


        public CreateTunnelMutationRequest build() {
            CreateTunnelMutationRequest obj = new CreateTunnelMutationRequest();
            obj.setTunnel(tunnel);
            return obj;
        }

    }
}
