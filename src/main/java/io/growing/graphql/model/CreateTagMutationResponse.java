package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class CreateTagMutationResponse extends GraphQLResult<Map<String, TagDto>> {

    private static final String OPERATION_NAME = "createTag";

    public CreateTagMutationResponse() {
    }

    public TagDto createTag() {
        Map<String, TagDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
