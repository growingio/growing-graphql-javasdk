package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field circleQrcode in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryCircleQrcodeParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String productId;

    public QueryCircleQrcodeParametrizedInput() {
    }

    public QueryCircleQrcodeParametrizedInput(String projectId, String productId) {
        this.projectId = projectId;
        this.productId = productId;
    }

    public QueryCircleQrcodeParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryCircleQrcodeParametrizedInput productId(String productId) {
        this.productId = productId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (productId != null) {
            joiner.add("productId: " + GraphQLRequestSerializer.getEntry(productId));
        }
        return joiner.toString();
    }

}
