package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field debuggerQrcode in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryDebuggerQrcodeParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String productId;

    public QueryDebuggerQrcodeParametrizedInput() {
    }

    public QueryDebuggerQrcodeParametrizedInput(String productId) {
        this.productId = productId;
    }

    public QueryDebuggerQrcodeParametrizedInput productId(String productId) {
        this.productId = productId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (productId != null) {
            joiner.add("productId: " + GraphQLRequestSerializer.getEntry(productId));
        }
        return joiner.toString();
    }

}
