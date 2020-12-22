package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field circleQrcode in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QueryCircleQrcodeParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String productId;

    public QueryCircleQrcodeParametrizedInput() {
    }

    public QueryCircleQrcodeParametrizedInput(String productId) {
        this.productId = productId;
    }

    public QueryCircleQrcodeParametrizedInput productId(String productId) {
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
